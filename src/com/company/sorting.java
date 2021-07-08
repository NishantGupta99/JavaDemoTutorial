package com.company;
import java.util.Arrays;
import java.util.Collections; // to use the decending order
import java.util.LinkedHashSet;
import java.util.List;
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
        Collections.sort(numbersList);

//Print list to confirm
        //System.out.println(numbersList);

        //System.out.println(Arrays.toString(numbers)); // to print the array

        HashSet<Integer> numbersHashSet = new LinkedHashSet<>(
                Arrays.asList(15, 11, 9, 55, 47, 18, 1123, 520, 366, 420) );






    }
}
