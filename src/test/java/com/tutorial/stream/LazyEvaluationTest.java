package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;


public class LazyEvaluationTest {

    @Test
    void testIntermediateOperation() {
        List<String> names = List.of("Ibad", "Nurhamim");

        // Nggak bakal di eksekusi kerena map adalah operation intermediate
        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                });
    }

    @Test
    void testTerminalOperation() {
        List<String> names = List.of("Ibad", "Nurhamim");

        // Nggak bakal di eksekusi kerena map adalah operation intermediate
        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Change " + upper + " to Mr.");
                    return "Mr." + upper;
                })
                .forEach(upper -> {
                    System.out.println(upper);
                });
    }
}

/*
* NOTE :
*
* Secara garis besar ada 2 jenis Stream Operation, yaitu Intermediate dan Terminal Operations.
* Intermediate Operations -> merupakan lazy operation, dimana stream tidak akan dieksekusi sampai memang dibutuhkan.
* Semua Intermediate Operation akan mengembalikan Stream lagi.
* Terminal Operations -> merupakan operasi yang mentrigger sebuah stream berjalan.
*
* */