package com.cesarpacode.java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIMain {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> s = values.stream();
        s.forEach(System.out::println);
        // the Stream cannot be reused
        values.stream().filter(i -> {
            System.out.println("hi" + i);
            return true;
        }).findFirst();


    }

}
