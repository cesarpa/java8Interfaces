package com.cesarpacode.java8.streamApi;

import java.util.Arrays;
import java.util.List;

public class FilterReduce {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
        // sum all values % 5
        // filter is used to remove some values
        Integer result = values.stream().filter(i -> i % 5 == 0).reduce(0, (c, e) -> c + e);
        System.out.println(result);

        // step by step
        
    }
}
