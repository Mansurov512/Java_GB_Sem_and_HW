package Seminars.S10OOP;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalBehaiovur animal = new Animal(10, true, "Vasya");
        animal.say();
        AnimalBehaiovur.sayLikeHuman();

        List<Animal> animals = new ArrayList<>();
        Capibara sasy = new Capibara(10, false, "'sasy", true, true, 10);
        Pinguin dasy = new Pinguin(10, false, "'sasy", 10, true);
        Animal fet = new Pinguin(10, true, "'rt", 11, false);
        Animal rty = new Animal(10, false, "'sasy");

        animals.add(sasy);
        animals.add(dasy);
        animals.add(fet);
        animals.add(rty);



        AnimalsIterator asa = new AnimalsIterator(animals);
        while (asa.hasNext()){
            System.out.println(asa.next());
        }
    }
}
