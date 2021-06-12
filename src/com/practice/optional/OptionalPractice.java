package com.practice.optional;

import java.util.Optional;

public class OptionalPractice {
    public static Optional<String> getName(){
        String name = " Manjeet Kumar singh ";
        return Optional.ofNullable(name);
    }
    public static void main(String[] args) {

        Optional valuesWeGot = getName();

        System.out.println(valuesWeGot.orElse("Name does not exist"));

    }
}
