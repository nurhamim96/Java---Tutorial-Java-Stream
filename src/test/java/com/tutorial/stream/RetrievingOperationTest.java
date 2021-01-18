package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testLimit() {
        List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream").stream()
                .limit(2) // ambil 2 data pertama
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream").stream()
                .skip(2) // lewati 2 data pertama
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream").stream()
                .takeWhile(name -> name.length() <= 4) // ketika ketemu false akan berhenti melakukan pengecekan datanya
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream").stream()
                .dropWhile(name -> name.length() <= 4) // kebalikan dari takeWhile() / ketika ketemu false akan memulai melakukan pengecekan datanya
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFirst() {
        Optional<String> optional = List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

}

/*
* NOTE :
*
* Stream juga memiliki kemampuan untuk mengambil 1 element saja
* Namun operasi jenis ini merupakan operasi terminal, sehingga akan secara otomatis akan menjalankan aliran data di Stream.
* Contoh methodnya : - findAny() -> Mengambil random satu element
*                    - findFirst() -> Mengambil element Pertama.
* */