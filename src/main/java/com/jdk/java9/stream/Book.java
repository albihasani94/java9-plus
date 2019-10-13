package com.jdk.java9.stream;

import java.util.Set;
import java.util.stream.Stream;

public class Book {

    private final String title;
    private final Set<String> authors;
    private final double price;

    public Book(String title, Set<String> authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Set<String> getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", price=" + price +
                '}';
    }

    public static Stream<Book> getBooks() {
        return Stream.of(new Book("Never Split the Difference", Set.of("Chris Voss", "Tahl Raz"), 7.19),
                new Book("Willpower", Set.of("Roy F. Baumeister", "John Tierney"), 7.19),
                new Book("Art of War", Set.of("Sun Tzu"), 2.99));
    }

    public static Book getBook() {
        return getBooks().findFirst().get();
    }

}