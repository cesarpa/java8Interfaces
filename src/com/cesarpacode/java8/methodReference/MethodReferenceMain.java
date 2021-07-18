package com.cesarpacode.java8.methodReference;

import com.cesarpacode.java8.lamda.MainSteamAPI;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceMain {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        values.forEach(System.out::println); // call by method reference

        values.forEach(MethodReferenceMain::tripleIt); // calling static method reference
    }

    public static void tripleIt(int i) {
        System.out.println(i*3);
    }
}
