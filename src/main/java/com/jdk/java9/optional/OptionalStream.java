package com.jdk.java9.optional;

import com.jdk.java9.stream.Book;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class OptionalStream {

    public static void main(String[] args) {

        Stream<Optional<Integer>> optionals = Stream.of(Optional.of(1), Optional.empty(), Optional.of(2));
        optionals.flatMap(Optional::stream).forEach(System.out::println); // remove the empty optional stream

        Set<String> authors = Book.getBooks()
                .map(book -> book.getAuthors().stream().findFirst())
                .flatMap(Optional::stream) // return the value of optional as a stream if it is present
                .collect(toSet());
        System.out.println(authors);

    }

}
