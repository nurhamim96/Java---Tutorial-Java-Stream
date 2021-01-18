package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {

    private static boolean test(Integer number) {
        return number % 2 == 0;
    }

    @Test
    void testFilter() {
        List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream").stream()
                .filter(value -> value.length() > 4)
                .forEach(System.out::println);

        List.of(1,2,3,4,5,6,7,8,9,10).stream()
                .filter(FilteringOperationTest::test)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Lagi", "Belajar", "Java", "Stream").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
