package com.jdk.java9.optional;

import com.jdk.java9.stream.Book;

import java.util.Optional;

public class OptionalIfPresentOrElse {

    public static void main(String[] args) {

        Optional<Book> full = Optional.of(Book.getBook());

        // Before ifPresentOrElse
        full.ifPresent(System.out::println);

        if (full.isPresent()) {
            System.out.println(full.get());
        } else {
            System.out.println("Nothing here"); // handle the optional empty case
        }

        // With ifPresentOrElse
        full.ifPresentOrElse(System.out::println, () -> System.out.println("Nothing here"));
        Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("Nothing here"));

    }

}
