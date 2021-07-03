package com.company;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Byte months = 12;

        System.out.print("Principal Amount: ");
        int Principal = scanner.nextInt();

        System.out.print("Intrest Rate : ");
        float annualIntrest = scanner.nextFloat();
        float monthlyIntrest = annualIntrest / 100 / months;

        System.out.print("Years: ");
        int years = scanner.nextInt();
        int noOfPayments = 12 * years;

        double mortgage = Principal
                * (monthlyIntrest* Math.pow( 1+ monthlyIntrest , noOfPayments)) /
                Math.pow( 1+ monthlyIntrest , noOfPayments)-1;
       // String formattedMortgage = NumberFormat.getCurrencyInstance();
       // System.out.println("your monthly mortgage is :" +formattedMortgage);


    }
}