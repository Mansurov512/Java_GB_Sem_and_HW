package Seminars.S10OOP;
public class Pinguin extends Animal {
    private int beakLength;
    private Boolean flies;

    public Pinguin(int weight, Boolean mammal, String name, int beakLength, Boolean flies) {
        super(weight, mammal, name);
        this.beakLength = beakLength;
        this.flies = flies;
    }

    public int getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(int beakLength) {
        this.beakLength = beakLength;
    }

    public Boolean getFlies() {
        return flies;
    }

    public void setFlies(Boolean flies) {
        this.flies = flies;
    }

    @Override
    public String toString() {
        return "Pinguin{" +
                "weight=" + weight +
                ", beakLength=" + beakLength +
                ", flies=" + flies +
                '}';
    }
}
