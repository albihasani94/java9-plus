package com.jdk.java9plus.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {

    public static void main(String[] args) {

        List<String> immutableBooks = List.of("Art of War", "Willpower", "Never Split the Difference");
        System.out.println(immutableBooks.getClass());

        try {
            immutableBooks.add("Soft Skills");
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }

        Set<Integer> immutableIntegers = Set.of(1, 2);
        System.out.println(immutableIntegers.getClass());

        Map<String, Integer> bookRatings = Map.of("Art of War", 6, "Willpower", 8, "Never Split the Difference", 10);
        System.out.println(bookRatings.getClass());

    }

}
