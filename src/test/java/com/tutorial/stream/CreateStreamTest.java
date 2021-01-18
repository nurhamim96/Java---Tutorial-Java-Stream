package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();

        emptyStream.forEach(data -> System.out.println(data));

        Stream<String> oneStream = Stream.of("Ibad Nurhamim");
        oneStream.forEach(System.out::println);

        String data = "Ada datanya";
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromArray() {

        Stream<String> arrayStream = Stream.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream");
        arrayStream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        integerStream.forEach(System.out::println);

        String[] array = new String[] {
            "Ibad", "Nurhamim"
        };

        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {

        Collection<String> collection = List.of("Ibad", "Nurhamim");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);

        // bikin ulang stream, karena stream hanya bisa digunakan 1 kali
        Stream<String> stringStream2 = collection.stream();
        stringStream2.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Java Stream");
//        stream.forEach(System.out::println); // Infinite loop

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
//        iterate.forEach(System.out::println); // Infinite loop
    }
}


// NOTE : Berbeda dengan Collection, Stream hanya bisa digunakan 1 kali