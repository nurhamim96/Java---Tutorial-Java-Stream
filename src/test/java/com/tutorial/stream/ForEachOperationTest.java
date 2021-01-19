package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testPeekBefore() {
        List.of("ibad", "nurhamim").stream()
                .map(name -> {
                    System.out.println("Before Change Name to Upper : " + name);
                    var upper = name.toUpperCase();
                    System.out.println("Change Name to Upper : " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final Name : " + name));
    }

    @Test
    void testPeekAfter() {
        List.of("ibad", "nurhamim").stream()
                .peek(name -> System.out.println("Before Change Name to Upper : " + name))
                .map(String::toUpperCase)
                .peek(upper -> System.out.println("Change Name to Upper : " + upper))
                .forEach(name -> System.out.println("Final Name : " + name));
    }
}

/*
* NOTE :
*
* forEach() -> Melakukan iterasi satu per satu data di Stream. Ini adalah terminal operation.
* peek() -> Melakukan iterasi satu per satu data di Stream, namun mengembalikan Stream lagi, dan bukan terminal operation.
*
* */
