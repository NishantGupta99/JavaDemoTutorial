package com.company;
import java.util.*;
import java.util.HashMap;

public class DemoArrayList {
    public static void main(String[] args) {
       // ArrayList<String> names = new ArrayList<String>(Arrays.asList("Nishant ", "Ram", "sam")); // array list with string created by a single line
        //ArrayList<Integer> age = new ArrayList<Integer>(Arrays.asList(22, 45, 33, 23, 54)); // array list for integer created using new array list
        List<String> name = List.of("patrick", "steward"); // array list created using a List.of method
        List<Integer> ages = List.of(44, 55, 34, 56, 33, 11, 33, 54, 23, 6, 76, 23); // disadvantage of this is no value can be added afterwords

        //System.out.println(age);
        //System.out.println(ages);
        //System.out.println(names);
        //System.out.println(name);

        ArrayList<String> students = new ArrayList<>(); // array list to add elements one by one

//1. Add elements one by one
        students.add("alex");
        students.add("brian");
        students.add("charles");

        //System.out.println(students);

        // now lets create an array with no data type

        ArrayList Roll = new ArrayList();

        Roll.add(4); // an int value
        Roll.add("R1920723"); // an string value
        //System.out.println(Roll);

        // creating an array list of lists

        List<List<Integer>> marks = new ArrayList<>();
       // marks.add(Arrays.asList(78, 45, 78, 15, 97, 21));//added the marks as an list of arrays
        //marks.add(Arrays.asList(48, 14, 25, 96, 78, 45));
        //marks.add(Arrays.asList(87, 54, 78, 86, 75, 84)); // ask the problem with aslist with to uncle

        //System.out.println(marks);

        // adding two arrays using add all

        List<Integer> list1 = new ArrayList<>(); //created the first list in which i am going to add the second list
        list1.add(43);
        list1.add(32);
        list1.add(76);

        List<Integer> list2 = new ArrayList<>(); // the second list
        list2.add(52);

        list1.addAll(list2); // using add all to add the elements of list into list 1

        //System.out.println(list1);

        // cloning one array list into another array

        ArrayList<String> foods = new ArrayList<>();

        foods.add("chicken");
        foods.add("cheese");
        foods.add("pasta");

        ArrayList<String> menu = (ArrayList<String>) foods.clone();

        //System.out.println(menu);

        //using hash sets for the first time
        HashMap<String, Integer> DataBase = new HashMap<>();

        DataBase.put("Nishant", 99);
        DataBase.put("Pratirath", 100);

        System.out.println(DataBase); // will print the entire database
        System.out.println((DataBase.size())); // will print the size of the data base


    }
}
