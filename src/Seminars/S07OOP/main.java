package Seminars.S07OOP;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Produkt cola = new Produkt("Cola", 23);
        Produkt mars = new Produkt("mars", 23);
        List<Produkt> mainGoods = new ArrayList<>();
        mainGoods.add(cola);
        mainGoods.add(mars);

//        VendingMachine box = new VendingMachine();
//        box.initProduct(mainGoods);
//        System.out.println(box.getGoods());
//        box.getProduct("cola");
    }


}
