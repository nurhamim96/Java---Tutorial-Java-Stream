package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation() {

        List<String> names = List.of("Ibad", "Nur", "Hamim");

        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(value -> value.toUpperCase());

        streamUpper.forEach(System.out::println);

        names.forEach(System.out::println);
    }

    @Test
    void testStramOperationSimplify() {
        List<String> names = List.of("Ibad", "Nur", "Hamim");

        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

/*
* NOTE :
*
* Stream Operations tidak akan memodifkasi data aslinya, melainkan hasil dari Stream Operations adalah sebuah Stream baru.
* */
