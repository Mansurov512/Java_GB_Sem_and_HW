package Seminars.S10OOP;
public class Capibara extends Animal{
    private Boolean funny;
    private Boolean wantToStroke;
    private int coatLength;

    public Capibara(int weight, Boolean mammal, String name, Boolean funny,
                    Boolean wantToStroke, int coatLength) {
        super(weight, mammal, name);
        this.funny = funny;
        this.wantToStroke = wantToStroke;
        this.coatLength = coatLength;
    }

    public Boolean getFunny() {
        return funny;
    }

    public void setFunny(Boolean funny) {
        this.funny = funny;
    }

    public Boolean getWantToStroke() {
        return wantToStroke;
    }

    public void setWantToStroke(Boolean wantToStroke) {
        this.wantToStroke = wantToStroke;
    }

    public int getCoatLength() {
        return coatLength;
    }

    public void setCoatLength(int coatLength) {
        this.coatLength = coatLength;
    }

    @Override
    public String toString() {
        return "Capibara{" +
                "weight=" + weight +
                ", funny=" + funny +
                ", wantToStroke=" + wantToStroke +
                ", coatLength=" + coatLength +
                '}';
    }
}
