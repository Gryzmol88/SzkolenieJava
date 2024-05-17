package com.comarch.szkolenia.dziedziczenie;

public class Snake extends Mammal{
    public Snake(){
        System.out.println("KONSTRUKTOR WEZA");
    }

    @Override //Adnotacja. (funkcyjne i informacyjne)
    public void walk(){ //PRzesłanianie metod ta sama metoda w klasie dziedziczącej
        System.out.println("Pełzne");
    }

    public void setName(String name){
        System.out.println("Ustawienie imie !!");
        super.setName(name);
    }
}


