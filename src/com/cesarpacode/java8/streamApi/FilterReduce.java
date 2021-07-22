package com.cesarpacode.java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterReduce {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
        // sum all values % 5
        // filter is used to remove some values
        Integer result = values.stream().filter(i -> i % 5 == 0).reduce(0, (c, e) -> c + e);
        System.out.println(result);

        // step by step
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 5 == 0;
            }
        };
        System.out.println(values.stream().filter(p).reduce(0, (c, e) -> c + e));
    }
}
