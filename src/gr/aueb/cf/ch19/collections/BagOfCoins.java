package gr.aueb.cf.ch19.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BagOfCoins {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>(List.of("Athens", "London", "Paris", "Paris"));

        /* bag.add("Athens");
        bag.add("Athens");
        bag.add("Paris");
        bag.add("London");

        bag.remove("London");*/

        bag.forEach(System.out::println);
    }
}
