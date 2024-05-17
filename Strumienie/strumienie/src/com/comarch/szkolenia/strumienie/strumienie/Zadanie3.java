package com.comarch.szkolenia.strumienie.strumienie;

import java.util.List;
import java.util.OptionalDouble;

public class Zadanie3 {
    public static void main(String[] args) {
        //mamy tabliece integere  policz srednia tylko parzystych liczb
        List<Integer> list = List.of(123,213213,15442,213,123123,2355,87,696,68,67,9);

        OptionalDouble avgbox = list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(i -> i)
                .average();
        System.out.println((int) avgbox.getAsDouble() * 100 / 100.00);
        System.out.println(Math.round(avgbox.getAsDouble()));
    }
}
