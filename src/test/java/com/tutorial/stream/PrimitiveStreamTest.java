package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamTest {

    @Test
    void testCreate() {
        // int primitive
        IntStream intStream = IntStream.range(1, 100);
        intStream.forEach(System.out::println);

        // long primitive
        LongStream longStream = LongStream.of(1,2,3,4);
        longStream.forEach(System.out::println);

        // double primitive
        DoubleStream doubleStream = DoubleStream.builder().add(0.1).add(0.2).build();
        doubleStream.forEach(System.out::println);
    }

    @Test
    void testOperations() {
        IntStream intStream = IntStream.range(1, 100);

        OptionalDouble optionalDouble = intStream.average();
        optionalDouble.ifPresent(System.out::println);

        // konversi ke Object
        IntStream.range(1,100)
                .mapToObj(value -> "Number : " + value)
                .forEach(System.out::println);
    }
}

/*
* NOTE :
*
* Ada beberapa operator yang lebih sederhana, seperti untuk aggregate, kita tidak perlu menggunakan comparator
* bahkan ada operator avarage() untuk menghitung rata" di primitive stream.
* */