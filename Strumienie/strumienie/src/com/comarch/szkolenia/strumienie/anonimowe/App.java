package com.comarch.szkolenia.strumienie.anonimowe;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota","Corrolla",3333));
        cars.add(new Car("Volvo","V70",333553));
        cars.add(new Car("Suzuki","2",33433));

        Collections.sort(cars, new Comparator<Car>(){ //Klasa anonimowa
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        Collections.sort(cars,(c1,c2)->c1.getPrice() - c2.getPrice()); //Wyrazenie lambda

        //Interfejs funkcyjny - interfejs posiadajacy tylko jedną metode.

        Collections.sort(cars, new PorownywaczPoMarceRosnaco());

       JakisMojInterfejs interfejs = () -> System.out.println("fff");
       interfejs.cos();


        System.out.println(cars);
        
    }
}
