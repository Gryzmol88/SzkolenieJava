package com.comarch.szkolenia.dziedziczenie;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Reksio");
        dog.setBreed("Kundel");

        Cat cat = new Cat();
        cat.setName("Puszek");
        cat.setBreed("Dachowiec");
        cat.setAge(20);

        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
        System.out.println(cat.getName());
        System.out.println(cat.getBreed());

        Snake snake = new Snake();
        //snake.walk();


        Mammal mammal = new Snake(); //Polimorfizm
        if(mammal instanceof Snake){
            Snake snake2 = (Snake) mammal; //Rzutowniae
            snake2.walk();
            snake2.getBreed();
        }


    } tablice typu object
}
