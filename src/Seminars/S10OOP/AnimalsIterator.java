package Seminars.S10OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalsIterator<T extends Animal> implements Iterator<T> {
    int count;
    List<T> animals;

    public AnimalsIterator(List<T> animals) {
        this.animals = animals;
    }

    @Override
    public boolean hasNext() {
        return count < animals.size();
    }

    @Override
    public T next() {
        return (T) animals.get(count++);
    }
}
