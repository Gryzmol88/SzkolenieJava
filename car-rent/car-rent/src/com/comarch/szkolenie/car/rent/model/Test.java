package com.comarch.szkolenie.car.rent.model;

public class Test {
    public static void main(String[] args) {
        final int JAKAS_STALA = 5;//Konwencja dodawania stałych wielkimi literami


        final Vehicle VECHICLE = new Vehicle(); //Mutacja typu obiektowego
        VECHICLE.setBrand("BMW");
        System.out.println(VECHICLE.toString());
        VECHICLE.setBrand("Audio");
        System.out.println(VECHICLE.toString());

    }
}
