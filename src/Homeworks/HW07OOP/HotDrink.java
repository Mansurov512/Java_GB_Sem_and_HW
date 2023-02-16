// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
//и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
//В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
//Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
package Homeworks.HW07OOP;

// Как я понял нужно сделать абстрактный класс Горячий Напиток и от него сделать наследника, например чай или кофе доп полем температуры.
//
//
// .

public class HotDrink
{
    private String name;
    private int volume;
    
    public HotDrink(String name, int volume)
    {
        this.name = name;
        this.volume = volume;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }
}
