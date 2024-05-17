package com.comarch.szkolenie.car.rent.core;

import com.comarch.szkolenie.car.rent.db.VehicleRepository;
import com.comarch.szkolenie.car.rent.gui.Gui;

import java.util.Scanner;

public class Core {
    private final VehicleRepository vehicleRepository = new VehicleRepository();
    //private final Gui gui = new Gui();
    public void start() {
        boolean run = true; //flaga
        //Scanner scanner = new Scanner(System.in);

        mainloop:
        while (run) { //nazwa pętli i wtedy można przejśc do mainlloop break;


            switch (Gui.showMenuAndReadChoose()) {
                case "1":
                    Gui.listVehicle(vehicleRepository.getVehicles());
                    break;
                case "2":
                    Gui.showResult(vehicleRepository.rent(Gui.readPlate()));
                    break;
                case "3":
                    Gui.showResult(vehicleRepository.resumption(Gui.readPlate()));
                    break;
                case "4":
                    run = false;
                    //return; przerywanie natychmiastowow metodę main
                    //System.exit(0);
                    break;
                default:
                    Gui.showWrongChoose();
                    break;
            }
        }
    }
}
