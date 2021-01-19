package com.tutorial.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {

    @Test
    void testGroupingBy() {
        Map<String, List<Integer>> collect = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .collect(Collectors.groupingBy(number -> {
                    if (number > 5) {
                        return "Besar";
                    } else {
                        return "Kecil";
                    }
                }));

        System.out.println(collect);
    }

    @Test
    void testGroupingBy2() {
        Map<String, List<String>> map = Stream.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream")
                .collect(Collectors.groupingBy(name -> name.length() > 4 ? "Panjang" : "Pendek"));

        System.out.println(map);
    }

    @Test
    void testPartitioningBy() {
        Map<Boolean, List<Integer>> collect = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .collect(Collectors.groupingBy(number -> {
                  return number > 5;
                }));

        System.out.println(collect);
    }

    @Test
    void testPartitioningBy2() {
        Map<Boolean, List<String>> map = Stream.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Stream")
                .collect(Collectors.groupingBy(name -> name.length() > 4 ));

        System.out.println(map);
    }
}

/*
*
* NOTE :
*
* Selain grouping by, Collectors juga bisa digunakan untuk partitioning by
* Hanya saja hasil dari partitioning by hanyalah 2 buah group boolean(true, false)
* Hal ini berarti partitioning by hanya akan menghasilkan Map<Boolean, List<Value>>.
*
* */