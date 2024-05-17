package com.comarch.szkolenie.car.rent.gui;

import com.comarch.szkolenie.car.rent.model.Vehicle;

import java.util.Collection;
import java.util.Scanner;

public class Gui {
    private static final Scanner scanner = new Scanner(System.in);

    public static String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Return car");
        System.out.println("4. Exit");
        return scanner.nextLine();

    }

    public static void listVehicle(Collection<Vehicle> vehicles) {
        System.out.println("Listowanie");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }

    public static String readPlate() {
        System.out.println("Podaj numer rejestracycjny: ");
        return scanner.nextLine();

    }

    public static void showResult(boolean result) {
        if (result) {
            System.out.println("Success !!");
        } else {
            System.out.println("Failed !!!");
        }
    }

    public static void showWrongChoose(){
        System.out.println("Wrong Choose! Try again!");
    }

}
