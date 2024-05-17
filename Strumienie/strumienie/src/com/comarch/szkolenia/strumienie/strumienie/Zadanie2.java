package com.comarch.szkolenia.strumienie.strumienie;

import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        //Posortowane małymi literami bez litery a

        List<String> names = List.of("Janusz", "Michał", "Adam");

        names.stream()
                .filter(imie -> !imie.startsWith("a"))
                .filter(imie -> !imie.startsWith("A"))
                .map(String::toLowerCase)// to samo co imie->imie.toLowerCase()
                .sorted()
                .forEach(System.out::println);


    }
}