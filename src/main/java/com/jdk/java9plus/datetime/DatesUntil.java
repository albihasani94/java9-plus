package com.jdk.java9plus.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.stream.Stream;

public class DatesUntil {

    public static void main(String... args) {
        LocalDate start = LocalDate.of(2019, 11, 12);
        Stream<LocalDate> dates = start.datesUntil(start.plusDays(7));
        dates.forEach(System.out::println);

        LocalDate birthday = LocalDate.of(1994, 4, 24);

        long leapYears = birthday
                .datesUntil(LocalDate.now(), Period.ofYears(1)) // returns a stream of dates from/to with period. Nice!
                .map(date -> Year.of(date.getYear()))
                .filter(Year::isLeap)
                .count();

        System.out.printf("%d leap years since I was born on %s", leapYears, birthday);
    }

}
