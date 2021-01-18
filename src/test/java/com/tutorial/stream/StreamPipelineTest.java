package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateStreamPipeline() {

        // JARANG DIGUNAKAN CARA SEPERTI INI
        List<String> list = List.of("Ibad", "Nurhamim");

        Stream<String> stream = list.stream();

        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());

        Stream<String> streamMr = streamUpper.map(upper -> "Mr." + upper);

        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipelineOk() {

        // STREAM PIPELINE
        List<String> list = List.of("Ibad", "Nurhamim");

        list.stream()
                .map(String::toUpperCase)
                .map(upper -> "Mr." + upper)
                .forEach(System.out::println);
    }
}
