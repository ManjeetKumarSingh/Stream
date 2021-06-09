package com.manjeet.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {
    public static void main(String[] args) {
        List<Integer> numberlist = Arrays.asList(1,2,3,4,3,4,2,4);
        numberlist.stream()
                .filter(number -> number % 2 ==0)
//                .takeWhile(number -> number % 2 ==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("======================");

        List<Integer> takeWhileList = numberlist.stream().takeWhile(n -> n%2 == 0).collect(Collectors.toList());

        takeWhileList.stream().forEach(System.out::println);

        System.out.println("======================");

    }
}
