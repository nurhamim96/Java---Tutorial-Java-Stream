package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;


public class OrderingOperationTest {

    @Test
    void testSorted() {
        List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream").stream()
                .sorted()
                .forEach(System.out::println);

    }

    @Test
    void testSortedWithComparator() {

        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}

/*
* NOTE :
*
* Java Stream juga mendukung operasi untuk melakukan pengurutan data Streamnya.
* Secara default, data akan diurutkan mengikuti Comparablenya yang terdapat di data yang ada di Stream.
* Jika kita ingin mengurutkan secara manual, kita bisa menggunakan Comparator sendiri.
*
* */
