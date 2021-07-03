package com.company;
import java.util.*;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Nishant ", "Ram", "sam")); // array list with string created by a single line
        ArrayList<Integer> age = new ArrayList<Integer>(Arrays.asList(22,45,33,23,54)); // array list for integer created using new array list
        List<String> name = List.of("patrick", "steward"); // array list created using a List.of method
        List<Integer> ages =List.of(44,55,34,56,33,11,33,54,23,6,76,23); // disadvantage of this is no value can be added afterwords

        System.out.println(age);
        System.out.println(ages);
        System.out.println(names);
        System.out.println(name);

    }
}
