package com.cesarpacode.java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapReduce {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        Stream<Integer> s = values.stream();
        s.forEach(System.out::println);
        // the Stream cannot be reused
        values.stream().filter(i -> {
            System.out.println("hi" + i);
            return true;
        }).findFirst();

        // stream map reduce
        System.out.println(values.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));

        // Step by Step
        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            public Integer apply(Integer i, Integer j) {
                return i + j;
            }
        };
        Stream<Integer> s1 = values.stream();
        Function<Integer, Integer> f = (i -> i * 2);
        Stream<Integer> s2 = s1.map(f);
        Integer result = (Integer) s2.reduce(0, b);
        System.out.println(result);

        // stream map reduce Completly reduced
        System.out.println(values.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
    }

}
