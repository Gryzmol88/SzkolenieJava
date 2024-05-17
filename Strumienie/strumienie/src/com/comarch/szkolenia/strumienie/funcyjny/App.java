package com.comarch.szkolenia.strumienie.funcyjny;

import com.comarch.szkolenia.strumienie.anonimowe.Car;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> funkcja = i -> i + "";//Funkcja
        String s1 = funkcja.apply(5);
        String s2 = funkcja.apply(10);

        System.out.println(s1);
        System.out.println(s2);

        UnaryOperator<Integer> unary = x -> x*55; //Operator unarny przyjmuje i zwraca ten sam typ obiektu
        BiFunction<String, Integer, Boolean> bi = (x,y) -> x.length() > y; //Bifunkcja przyjmuje dwa argumenty
        BiFunction<String, Integer, Boolean> bi2 = (x,y) -> {
            if(x.length() > y){
                return true;
            }else{
                return false;
            }
        }; //Bifunkcja przyjmuje dwa argumenty


       Predicate<String> pre = s-> s.length() < 10; //predykat przyjmuje dowolny argument zwraca boolen

        Supplier<Car> defaultCarSuplier = ()->new Car("Default","22",233);//Suplier brak argumentu zwraca obiekt
      Consumer<Car> consumer = c -> System.out.println(c);//Konsumer dostaje obiekt nic nie zwraca


        consumer.accept(new Car("wewe","ddd",2232323));
        consumer.accept(defaultCarSuplier.get());

    }
}
