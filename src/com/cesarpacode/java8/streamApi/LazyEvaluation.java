package com.cesarpacode.java8.streamApi;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluation {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

        System.out.println(values.stream()
                .filter(LazyEvaluation::isDivisibleByFive)
                .map(LazyEvaluation::mapDouble).findFirst().orElse(0));
    }

    public static boolean isDivisibleByFive(Integer i) {
        System.out.println("in isDiv " + i);
        return i % 5 == 0;
    }

    public static int mapDouble(Integer i) {
        System.out.println("in mapDouble " + i);
        return i * 2;
    }


}
