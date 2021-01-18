package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Ibad");
        builder.add("Nurhamim").add("Sedang").add("Belajar").add("Java").add("Stream");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder()
                .add("Ibad").add("Nurhamim").add("Sedang").add("Belajar").add("Java").add("Stream").build();
        stream.forEach(System.out::println);
    }
}
