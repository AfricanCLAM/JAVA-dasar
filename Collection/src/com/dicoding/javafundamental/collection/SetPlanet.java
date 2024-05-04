package com.dicoding.javafundamental.collection;

import java.util.*;

public class SetPlanet {
    public static void main (String [] args) {
        Set<String> planets = new HashSet<>();

        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("earth");
        planets.add("earth");
        planets.add("mars");

        System.out.println("set planet awal: (size = " + planets.size() +")");
         for (String planet : planets) {
             System.out.println("\t " + planet);
         }

         planets.remove("venus");

        //method size untuk mendapat ukuran set
        System.out.println("set planet akhir: (size = " + planets.size() +")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        }
    }
}
