package Homeworks.HW10OOP05;

public class Factory {
    public FactoryAction delivery(FactoryEnum type){
        FactoryAction action = FactoryBuild.getTransport(type);
        action.receivingAnOrder();
        action.deliveryOrder();
        System.out.println("Delivery Complite");
        return action;
    }
}
