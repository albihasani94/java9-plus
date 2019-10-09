package com.jdk.java9plus.stream;

import java.util.stream.Stream;

import static com.jdk.java9plus.stream.Book.getBook;

public class OfNullable {

    public static void main(String[] args) {

        long zero = Stream.ofNullable(null).count();
        long one = Stream.ofNullable(getBook()).count();

        System.out.printf("zero: %d, one: %d", zero, one);

        // Before ofNullable
        Book book = getPossiblyNull(true);
        Stream<String> authors = book == null ? Stream.empty() : book.getAuthors().stream();
        authors.forEach(System.out::println);

        // With ofNullable
        Stream.ofNullable(getPossiblyNull(false))
                .flatMap(anotherBook -> anotherBook.getAuthors().stream())
                .forEach(System.out::println);

    }

    private static Book getPossiblyNull(boolean isNull) {
        return isNull ? null : getBook();
    }

}
