package com.comarch.szkolenie.kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(2,"Michał");
        mapa.put(30, "Mateusz");

        System.out.println(mapa.get(2));

    }
}
