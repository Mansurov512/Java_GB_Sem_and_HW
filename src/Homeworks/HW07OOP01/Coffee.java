package Homeworks.HW07OOP01;

public class Coffee extends HotDrink
{
    private int temperature;

    public Coffee(String name, int volume, int temperature)
    {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature()
    {
        return temperature;
    }

    public void setTemperature(int temperature)
    {
        this.temperature = temperature;
    }
}
