package Homeworks.HW07OOP01;

public class main
{
    public static void main(String[] args)
    {
        Coffee coffee01 = new Coffee("coffee",  1,  50);
        HotDrink hotWater = new HotDrink("water", 1);
        VendingHotDrinks something = new VendingHotDrinks();
        something.getProduct("Чай", 1, 90);
        something.getProduct("Black Tea", 2);

    }
}
