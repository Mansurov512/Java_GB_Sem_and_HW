package Seminars.S10OOP;
public class Animal extends AbstractBeh implements AnimalBehaiovur {
    protected int weight;
    protected Boolean mammal;
    protected String name;

    public Animal(int weight, Boolean mammal, String name) {
        this.weight = weight;
        this.mammal = mammal;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Boolean getMammal() {
        return mammal;
    }

    public void setMammal(Boolean mammal) {
        this.mammal = mammal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", mammal=" + mammal +
                ", name='" + name + '\'' +
                '}';
    }

    public void say() {
        System.out.println("meow");
    }

    public static void saySmth(){
        System.out.println("hi im abstract");
    }



}
