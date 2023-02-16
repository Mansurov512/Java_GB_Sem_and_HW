package Homeworks.HW07OOP;

public class VendingHotDrinks implements VendingMachine
{
    public void getProduct(String name, int volume, int temperature)
    {
        System.out.printf("Ваш %s объёмом %d и температурой %d готов\n", name, volume, temperature);
    }
    public void getProduct(String name, int volume)
    {
        System.out.printf("Ваш %s объёмом %d готов\n", name, volume);
    }
}
