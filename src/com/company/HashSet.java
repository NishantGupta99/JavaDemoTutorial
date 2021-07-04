package com.company;

import java.util.HashMap;

public class HashSet {
    public static void main(String[] args) {
        //using hash sets for the first time
        HashMap<String, Integer> DataBase = new HashMap<>();

        DataBase.put("Nishant", 99); // unline array here put is used instead of add
        DataBase.put("Pratirath", 100);

        //System.out.println(DataBase); // will print the entire database
        //System.out.println((DataBase.size())); // will print the size of the data base

        // changing variable in hashmap

        HashMap<Integer , String> Menu = new HashMap<>();

        Menu.put(1,"Chicken");
        Menu.put(2,"soup");
        Menu.put(3,"pasta");
        System.out.println(Menu);

        //Menu.put(2,"Steak"); // enter the value using the same serial number for the reference

        //System.out.println(Menu);

        Menu.remove(3);

        System.out.println(Menu);

    }
}
