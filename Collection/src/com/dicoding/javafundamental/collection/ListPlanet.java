package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListPlanet {
    public static void main (String [] args) {
        String[] heroes = new String[2];

        heroes [0] = "Sven";
        heroes [1] = "juan";

        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("list planet awal: ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + "=" + planets.get(i));
        }

        planets.remove("venus"); //mengeluarkan objek dari list

        System.out.println("list planet akhir: ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + "=" + planets.get(i));
        }


    }
}
