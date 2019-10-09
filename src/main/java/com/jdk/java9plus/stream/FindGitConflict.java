package com.jdk.java9plus.stream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FindGitConflict {

    public static void main(String[] args) throws Exception {

        try (Stream<String> lines = Files.lines(Paths.get(FindGitConflict.class.getClassLoader().getResource("index.html").toURI()))) {
            lines.dropWhile(line -> !line.contains("<<<<<<<")) // drop any line until the git conflict starts
                    .skip(1) // skip the git conflict start
                    .takeWhile(line -> !line.contains(">>>>>>>")) // take any line until the git conflict ends
                    .forEach(System.out::println);
        }

    }

}
