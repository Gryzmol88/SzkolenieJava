package com.comarch.szkolenie.kolekcje.zbiory;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();//Brak indeksów w zbiorach, Nie posiadaja duplikatów

        set.add("Janusz");
        set.add("Tomek");
        set.add("Karol");

        System.out.println(set);

        set.add("Karol");
        System.out.println(set);
    }
}
