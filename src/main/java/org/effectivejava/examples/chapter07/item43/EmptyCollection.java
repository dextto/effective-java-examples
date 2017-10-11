package org.effectivejava.examples.chapter07.item43;

import java.util.ArrayList;
import java.util.List;

public class EmptyCollection {
    private static final List<Cheese> cheeseInStock = new ArrayList<>();
    private static Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

    public static Cheese[] getCheeses() {
        return cheeseInStock.toArray(EMPTY_CHEESE_ARRAY);
    }

    public static void main(String[] args) {
        printAllCheese(EmptyCollection.getCheeses());

        cheeseInStock.add(Cheese.STILTON);
        cheeseInStock.add(Cheese.GORGONZOLA);
        printAllCheese(EmptyCollection.getCheeses());
    }

    private static void printAllCheese(Cheese[] cheese) {
        for (Cheese c : cheese) {
            System.out.println(c.name());
        }
        System.out.println("--------------------------");
    }
}

enum Cheese {
    STILTON, GORGONZOLA
}