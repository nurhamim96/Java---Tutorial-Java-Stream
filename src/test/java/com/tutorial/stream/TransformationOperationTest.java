package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testMap() {
        List.of("Ibad", "Nurhamim").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(System.out::println);
    }

    @Test
    void testFlatMap() {
        List.of("Ibad", "Nurhamim").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length())) // kalo pake flatMap return nya wajib Stream
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(System.out::println);
    }
}
