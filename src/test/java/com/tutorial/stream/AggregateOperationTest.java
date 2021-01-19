package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {

    @Test
    void testMax() {
        List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);

    }

    @Test
    void testMin() {
        List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);

    }

    @Test
    void testLong() {
        Long count = List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream").stream()
                .count();

        System.out.println(count);

    }

    @Test
    void testSum() {
        var result = List.of(1,2,3,4,5).stream()
                .reduce(0, (value, item) -> value + item);

        System.out.println(result);

        // 0
        // 1. value=0 item=1 = 1
        // 2. value=1 item=2 = 3
        // 3. value=3 item=3 = 6
        // 4. value=6 item=4 = 10
        // 5. value=10 item=5 = 15
    }

    @Test
    void testFactorial() {
        var factorial = List.of(1,2,3,4,5).stream()
                .reduce(1, (value, item) -> value * item);

        System.out.println(factorial);

        // 1
        // 1. value=1 item=1 = 1
        // 2. value=1 item=2 = 2
        // 3. value=2 item=3 = 6
        // 4. value=6 item=4 = 24
        // 5. value=24 item=5 = 120
    }
}

/*
* NOTE :
*
* Java Stream juga menyediakan sebuah operasi yang bernama reduce.
* Reduce bisa digunakan untuk melakukan proses aggregate secara manual.
* Misal kita ingin menjumlahkan seluruh angka yang terdapat di Stream, kita bisa melakukan ini menggunakan reduce operator.
*
* */