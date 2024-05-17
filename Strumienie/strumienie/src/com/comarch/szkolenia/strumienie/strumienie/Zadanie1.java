package com.comarch.szkolenia.strumienie.strumienie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    //Chce dostać tylko liczby wieksze niż 3 mniejsze niż 7 nie chce duplikatów
    public static void main(String[] args) {


    List<Integer> lista = List.of(1,2,3,4,5,6,7,8,8,9,4,4,67,43,3,33);

    List<Integer> result1 = new ArrayList<>();
    for(int element : lista)

    {
        if (!result1.contains(element)) {
            if (element > 3 && element < 7) {
                result1.add(element);
            }
        }
    }
        System.out.println(result1);

        List<Integer> result2 = lista.stream().parallel()
                .distinct()
                .filter(i -> i >3)
                .filter(i -> i<7)
                .toList();


    }



}

