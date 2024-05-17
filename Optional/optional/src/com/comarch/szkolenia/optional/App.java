package com.comarch.szkolenia.optional;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<String> stringBox = find(4);
        if (stringBox.isPresent())
            if (stringBox.get().equals("Test")) {
                System.out.println("Udało się");
            } else {
                System.out.println("Nie udało się:(");
            }

        stringBox.orElse("default");//Jeżeli w pudelku jest string to go wyciąga jeżeli nie do wyrzuca default
    }

    public static Optional<String> find(int x) {
        if (x == 5) {
            return Optional.of("Test");
        } else {
            return Optional.empty();
        }
    }
}
