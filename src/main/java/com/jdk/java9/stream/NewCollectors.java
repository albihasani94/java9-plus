package com.jdk.java9.stream;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class NewCollectors {

    public static void main(String[] args) {

        Stream<Book> books = Book.getBooks();

        Map<Set<String>, Set<Book>> booksByAuthors = books.collect(
                groupingBy(Book::getAuthors, // authors are not filtered :)
                        filtering(book -> book.getPrice() > 5, // filter books costing more than 5
                                toSet()))
        );
        System.out.println(booksByAuthors);

        books = Book.getBooks();

        Map<Double, Set<String>> authorsSellingForPrice = books.collect(
                groupingBy(Book::getPrice,
                        flatMapping(book -> book.getAuthors().stream(), // get all authors who sell at this price
                                toSet()))
        );
        System.out.println(authorsSellingForPrice);

    }

}
