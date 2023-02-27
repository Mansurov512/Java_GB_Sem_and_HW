package Homeworks.HW08OOP03;

public class Laptop
{
    Laptop(int valueRAM, int valueHDD, int sizeIches, double frequencyCPU, double price)
    {
        this.valueRAM = valueRAM;
        this.valueHDD = valueHDD;
        this.sizeIches = sizeIches;
        this.frequencyCPU = frequencyCPU;
        this.price = price;
    }
    private int valueRAM;
    private int valueHDD;
    private int sizeIches;
    private double frequencyCPU;
    private double price;

    public void TurnOn()
    {
        System.out.println("TurningOn...");
    }

    public void Work()
    {
        System.out.println("Working...");
    }

    public void TurnOff()
    {
        System.out.println("TurningOff...");
    }

    public int getValueRAM()
    {
        return valueRAM;
    }

    public void setValueRAM(int valueRAM)
    {
        this.valueRAM = valueRAM;
    }

    public int getValueHDD()
    {
        return valueHDD;
    }

    public void setValueHDD(int valueHDD)
    {
        this.valueHDD = valueHDD;
    }

    public int getSizeIches()
    {
        return sizeIches;
    }
    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setSizeIches(int sizeIches)
    {
        this.sizeIches = sizeIches;
    }

    public double getFrequencyCPU()
    {
        return frequencyCPU;
    }

    public void setFrequencyCPU(double frequencyCPU)
    {
        this.frequencyCPU = frequencyCPU;
    }

}