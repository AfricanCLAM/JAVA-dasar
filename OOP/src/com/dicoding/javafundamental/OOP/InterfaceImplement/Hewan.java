package com.dicoding.javafundamental.OOP.InterfaceImplement;

public class Hewan {
    public interface Hewan {
        String RESPIRASI = "oksigen";

        public void makan() {
            System.out.println("Memakan daging, tumbuhan, atau segalanya.");
        }
    }
}
