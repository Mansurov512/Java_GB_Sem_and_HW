package Seminars.S07OOP;

import java.util.ArrayList;
import java.util.List;

public abstract class VendingMachine {
    private static List<Produkt> goods = new ArrayList<>();
    public void initProduct(List<Soda> produkts){
        for (Produkt item: produkts) {
            goods.add(item);
        }
    }

    public abstract List<Soda> getGoods();

    public void getProduct(String name) {
        for (Produkt item: goods) {
           if(item.getName().equals(name)) {
               System.out.println(item.getCost());
           }
        }
    }

}
