package Seminars.S07OOP;
// Реализуйте класс Товар, содержащий данные о товаре,
// и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
// сохраняющий в себе список исходных продуктов и getProduct(String name)
// Реализовать конструкторы, get/set методы, построить логику ТорговогоАвтомата
// на основе кода сделанного в задании 1.2
// : Сделать класс Товар абстрактным, создать нескольких наследников
// (к примеру: БутылкаВоды), сделать интерфейсом ТорговыйАвтомат и реализовать
// класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат

public class Produkt
{
    private String name;
    private int cost;

    public Produkt(String name, int cost)
    {
        this.name = name;
        this.cost = cost;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return String.format("Наименование товара - %s. Цена товара - %d", name, cost);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getCost()
    {
        return cost;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }
}
