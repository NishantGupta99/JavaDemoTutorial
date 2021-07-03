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

    }
}
