package com.cesarpacode.java8.streamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MainSteamAPI {
    // focus: what to do
    // not focus:  how to do things
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
        // External Iterations: you fetch the data from the source Examples: fori iterator foreachloop
        // externalIterations(values);

        // Internal Iterations: manage the iterations in the background, can use with StreamAPI
        values.forEach(i -> System.out.println(i));

        // lambda expression
        Consumer<Integer> consumerInterface = (Integer i) -> System.out.println(i);

        values.forEach(consumerInterface);

    }

    public static void externalIterations(List<Integer> values){
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
