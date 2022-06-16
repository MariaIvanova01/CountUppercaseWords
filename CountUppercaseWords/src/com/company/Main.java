package com.company;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Predicate<String> startsWithUppercase = w -> Character.isUpperCase(w.charAt(0));

        String input = scan.nextLine();

        List<String> uppercaseWords = Arrays.stream(input.split(" "))
                .filter(startsWithUppercase)
                .collect(Collectors.toList());

        System.out.println(uppercaseWords.size());
        uppercaseWords.forEach(System.out::println);
    }
}
