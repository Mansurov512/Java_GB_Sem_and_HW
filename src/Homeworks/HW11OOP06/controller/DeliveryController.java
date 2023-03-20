package Homeworks.HW11OOP06.controller;

import Homeworks.HW11OOP06.model.*;
import Homeworks.HW11OOP06.service.DelivetyEnum;

public class DeliveryController {
    private DeliveryAction action;
    public void delivery(DelivetyEnum type){
        action = DeliveryBuild.getTransport(type);
    }
    public String getTransport(){
        return action.getTransport();
    }
    public String receivingAnOrder(){
        return action.receivingAnOrder();
    }
    public String deliveryOrder(){
        return action.deliveryOrder();
    }
    public String deliveryComplite(){
        return "Доставка выполнена";
    }
}
