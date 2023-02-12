package Seminars.S06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task02 {
    public static void main(String[] args) {
        Cat tom = new Cat(5, "Tom", 4, "Max", "dvoryinin", new HashSet<String>(Arrays.asList("sdf", "wer")));
        Cat red = new Cat(5, "Tom", 4, "Max", "dvoryinin", new HashSet<String>(Arrays.asList("sdf", "wer")));

        Cat barsik = new Cat();
        barsik.setName("barsik");
        barsik.setAge(2);
        barsik.setOwner("Max");
        barsik.setBreed("Stafard");
        barsik.setVaccinated(new HashSet<>(Arrays.asList("qwe", "tyu", "sputnik5")));
        barsik.setId(1);

        System.out.println(barsik.toString());
        System.out.println(tom.toString());
        Set<Cat> catMnogestvo = new HashSet<>(Arrays.asList(tom, barsik, red));
        System.out.println(catMnogestvo);
    }

}