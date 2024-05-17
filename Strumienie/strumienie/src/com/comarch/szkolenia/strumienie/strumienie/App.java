package com.comarch.szkolenia.strumienie.strumienie;

import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> lista =
                List.of(1,24321,324324,23,342,23,552,435);//Metoda fabrykujaca tworzy liste z zawartoscia
        System.out.println(lista);
        Stream<Integer> stream = lista.stream(); //Zamiana na strumien zwraca strumien danego typu
        stream.
    }
}
