package com.comarch.szkolenie.kolekcje.listy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List lista = new LinkedList();
        List<String> lista1 = new ArrayList<>();

        System.out.println(lista.size());
        lista.add("Janusz");
        lista.add("Karol");
        lista.add(2, "Karol");
        lista.add(6);
        lista.add(true);
        lista.add(4.4);
        System.out.println(lista.size());
        lista.remove(0);
        lista.addAll(lista1);//Dodaje wszystkie elementy z innej listy
        lista.contains("Karol");//sprawdza czy dany obiekt pojawia się na liście

        ((ArrayList<String>) lista1).trimToSize(); //usuniecie pustych komórk
    }
}
