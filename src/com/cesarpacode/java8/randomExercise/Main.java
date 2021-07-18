package com.cesarpacode.java8.randomExercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //  list of String "AD", "AWs", "awe" -> remove strings which contains upper case chars
    //   and return the rest using Java 8 streams.. expectedResult           -> "awe"
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AD", "AWs", "awe");
        removeUpperString(list).forEach(System.out::println);
    }

    private static List<String> removeUpperString(List<String> list) {
        return list.stream().filter(i -> i.toLowerCase().equals(i)).collect(Collectors.toList());
    }
}