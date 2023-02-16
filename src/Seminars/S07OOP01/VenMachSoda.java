package Seminars.S07OOP01;

import java.util.ArrayList;
import java.util.List;

public class VenMachSoda extends VendingMachine {
    private List<Soda> sodas = new ArrayList<>();
    @Override
    public void initProduct(List<Soda> soda) {
        for (Soda item: soda) {
            sodas.add(item);
        }
    }
    @Override
    public List<Soda> getGoods() {
        return sodas;
    }
    @Override
    public void getProduct(String name) {
        for (Soda item: sodas) {
            if(item.getName().equals(name)) {
                System.out.println(item.getCost());
            }
        }
    }
}