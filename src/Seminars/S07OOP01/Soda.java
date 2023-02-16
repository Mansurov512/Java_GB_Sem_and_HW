package Seminars.S07OOP01;

public class Soda extends Produkt{
    private String flavor;

    public Soda(String name, int cost, String flavor) {
        super(name, cost);
        this.flavor = flavor;
    }
}
