package com.comarch.szkolenia.strumienie.strumienie;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> lista =
                List.of(1, 24321, 324324, 23, 342, 23, 552, 435);//Metoda fabrykujaca tworzy liste z zawartoscia
        //System.out.println(lista);
        Stream<Integer> stream = lista.stream(); //Zamiana na strumien zwraca strumien danego typu

        lista.forEach(i -> System.out.println(i));
        Optional<Integer> intBox = lista.stream().findFirst();
        if (intBox.isPresent()) {
            System.out.println(intBox.get());
        } else {
            System.out.println("Pusto");
        }


//Optional<Integer> count = lista.stream().max((i1,i2) -> i1 - i2);
        //  Optional<Integer> count1 = stream.allMatch(i -> i == 5);

        List<Integer> list2 = lista.stream()
                .map(i -> "Liczba: " + i)
                .map(s -> s.length())
                .toList();

        //  System.out.println(list2);

        List<Integer> lista3 = lista.stream().filter(i -> i > 5).toList();
        System.out.println(lista3);

        List<Integer> lista4 = lista.stream()
                .peek(i -> System.out.println(i))
                .toList();

        List<Integer> lista8 = lista.stream()
                .peek(i -> System.out.println(i))
                .toList();


        List<Integer> lista5 = lista.stream()
                .skip(5)//Pomija 5 obiektów
                .toList();

        List<Integer> lista6 = lista.stream()
                .limit(5)//Pobiera tylko  5 obiektów
                .toList();
        List<Integer> lista7 = lista.stream()
                .distinct()//usuwa duplikaty
                .toList();


    }
}
