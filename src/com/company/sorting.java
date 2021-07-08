package com.company;
import java.util.*;
import java.util.HashSet;

public class sorting {
    public static void main(String[] args) {

        // in this file we will learn about soring of arrays
        Integer[] numbers = new Integer[] { 15, 11, 9, 55, 47, 18, 520, 1123, 366, 420 }; // the array that we will be sorting

       // Arrays.sort(numbers); // the command to sort the following code



        // now lets try to sort the array into decending order


        //Arrays.sort(numbers, Collections.reverseOrder()); // we are revesing the collections


        //sorting the following array withing a range

       // Arrays.sort(numbers, 2,4); // this command will sort the integers only within the index range
        List<Integer> numbersList = Arrays.asList(numbers);

//Sort the list
       // Collections.sort(numbersList);

//Print list to confirm
        //System.out.println(numbersList);

        //System.out.println(Arrays.toString(numbers)); // to print the array

        // sorting of a set There is no direct support for sorting the sets in Java. To sort a set, follow these steps:
        //
        //Convert set to list.
        //Sort list using Collections.sort() API.
        //Convert list back to set.

        HashSet<Integer> numbersSet= new LinkedHashSet<Integer>(Arrays.asList(78,54,65,85,21,265,259,457,856,123,548,698,697,412,577,32));
        List<Integer> numberList = new ArrayList<>(numbersSet);// converting a set into a list

        Collections.sort(numbersList);
       numbersSet = new LinkedHashSet<>(numbersList); // converting a list back to set

        System.out.println(numbersSet);








    }
}
