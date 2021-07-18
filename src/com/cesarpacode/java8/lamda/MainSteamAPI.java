package com.cesarpacode.java8.lamda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MainSteamAPI {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
        // Internal Iterations: manage the iterations in the background, can use with StreamAPI
        // focus: what to do
        // lambda expression
        values.forEach(i -> System.out.println(i));

        values.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
                values.size();
            }
        });

        values.forEach(
                (Integer i) -> {
                    System.out.println(i);
                }
        );
    }

    public static void externalIterations(List<Integer> values) {
        // External Iterations: you fetch the data from the source Examples: fori iterator foreachloop

        // focus:  how to do things
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (int value : values) {
            System.out.println(value);
        }
    }
}
