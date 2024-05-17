package com.comarch.szkolenie.car.rent.model;

public class Vehicle {
    private String brand;
    private String model;
    private double price;
    private String plate;
    private boolean rent;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, double price, String plate, boolean rent) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.plate = plate;
        this.rent = rent;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return
                "Marka: '" + brand + '\'' +
                ", Model:'" + model + '\'' +
                ", Cena: " + price +
                ", Rejestracja: " + plate + '\'' +
                ", Wynajęty: " + (this.rent ? "Tak":"Nie");

    }
}
