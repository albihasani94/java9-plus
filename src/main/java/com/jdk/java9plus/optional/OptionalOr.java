package com.jdk.java9plus.optional;

import com.jdk.java9plus.stream.Book;

import java.util.Optional;
import java.util.Set;

public class OptionalOr {

    public static void main(String[] args) {

        Optional<Book> localFallback = Optional.of(Book.getBook());

        // Before or
        Book bestBookBeforeOr = getBestOffer().orElse(getExternalOffer().orElse(localFallback.get())); // get is a problem on a null optional
        System.out.println(bestBookBeforeOr);

        // With or
        Optional<Book> bestBookWithOr = getBestOffer()
                .or(() -> getExternalOffer())
                .or(() -> localFallback); // will return an optional, making it safe even if the fallback is an empty optional
        System.out.println(bestBookWithOr);

    }

    private static Optional<Book> getBestOffer() {
        return Optional.empty();
    }

    private static Optional<Book> getExternalOffer() {
        return Optional.of(new Book("Java Module System", Set.of("Nicolai Parlog"), 21.99));
    }

}
