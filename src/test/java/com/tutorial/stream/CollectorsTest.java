package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

    Stream<String> getStream() {
        return Stream.of("Ibad", "Nurhamim");
    }

    @Test
    void testCollection() {

        // To Set
        Set<String> set = getStream().collect(Collectors.toSet());
        System.out.println(set);
        Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(immutableSet);

        // To List
        List<String> list = getStream().collect(Collectors.toList());
        System.out.println(list);
        List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());
        System.out.println(immutableList);
    }

    @Test
    void testMap() {
        Map<String, Integer> map = getStream().collect(Collectors.toMap(
                name -> name, // ini Key nya
                name -> name.length() // ini Value nya
        ));

        System.out.println(map);
    }
 }

 /*
 *
 * NOTE :
 *
 * Stream memiliki sebuah operator bernama collect(Collector), function ini biasanya digunakan untuk meng-collect data Stream dan kita ubah menjadi struktur data yang kita inginkan,
   biasanya kebanyakan developer menggunakan operator collect() untuk mengubah Stream menjadi Collection.
 * Operator collect() membutuhkan parameter Collector, namun biasanya kita jarang sekali membuat implementasi interface Collector, karena terlalo kompleks.
 * Java Stream sudah menyediakan class helper untuk membuat Collector, bernama Collectors.
 * Collectors juga bisa digunakan untuk membuat Map dari Stream.
 * Yang membedakan dengan List dan Set, kita harus tentukan function untuk membentuk Key dan Valuenya untuk membuat Map.
 *
 * */