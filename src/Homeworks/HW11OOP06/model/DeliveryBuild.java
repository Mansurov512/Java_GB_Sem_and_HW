package Homeworks.HW11OOP06.model;

import Homeworks.HW11OOP06.service.DelivetyEnum;

public class DeliveryBuild {
    public static DeliveryAction getTransport(DelivetyEnum type){
        DeliveryAction action = null;

        switch(type){
            case BIKE:
                action = new Bike();
                break;
            case ELECTRICSCOOTER:
                action = new ElectricScooter();
                break;
            case FOOTS:
                action = new Foots();
                break;
            case QUADCOPTER:
                action = new QuadCopter();
                break;
            default:
                break;
        }
        return action;
    }
}
