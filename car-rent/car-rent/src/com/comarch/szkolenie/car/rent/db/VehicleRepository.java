package com.comarch.szkolenie.car.rent.db;

import com.comarch.szkolenie.car.rent.model.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    private final Map<String, Vehicle> vehicles = new HashMap<>();


    public VehicleRepository() {
        this.vehicles.put("KR113S",new Car("BMW","3",300.0,"KR113S"));
        this.vehicles.put("NO324R", new Car("Kia","3dg",200.0,"NO324R"));
        this.vehicles.put("KR23S", new Car("Volvo","V70",344.0,"KR23S"));
        this.vehicles.put("KR2132", new Car("Mercedes","3dg",200.0,"KR2132"));
        this.vehicles.put("KR23S12", new Car("Audi","V70",344.0,"KR23S12"));
        this.vehicles.put("NO34243", new Bus("Solaris","Super",700,"NO34243",60));
        this.vehicles.put("NO1234", new Truck("Scania", "Jakas", 900.0,"NO1234",13));
        this.vehicles.put("KL221", new Motorcycle("Suzuki","32l",234, "KL221",true));

    }

    public boolean rent(String plate){
        //Szukamy samochodu (Metoda findCar)
        //Sprawdzamy czy jest wolny
        //jeśli tak wypożyczamy.
        Vehicle vehicle = this.vehicles.get(plate);
        if (vehicle != null && !vehicle.isRent()){
            vehicle.setRent(true);
            return true;
        }
        return false;
    }

    public boolean resumption(String plate){
        //szukamy samochodu
        //sprawdzamy czy jest wolny
        //jeśli tak wypożyczam
        Vehicle vehicle = this.vehicles.get(plate);
        if(vehicle != null && vehicle.isRent()){
            vehicle.setRent(false);
            return true;
        }
        return false;
    }

    public Collection<Vehicle> getVehicles(){
        return this.vehicles.values();
    }


}
