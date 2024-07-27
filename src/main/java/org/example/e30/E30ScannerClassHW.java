package org.example.e30;

import java.util.Scanner;

public class E30ScannerClassHW {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month number");

        String monthNumber = input.next();
        if (monthNumber.equalsIgnoreCase("1")) {
            System.out.println("January");

        } else if (monthNumber.equalsIgnoreCase("2")) {
            System.out.println("February");
        } else if (monthNumber.equalsIgnoreCase("3")) {
            System.out.println("March");
        } else if (monthNumber.equalsIgnoreCase("4")) {
            System.out.println("April");
        } else if (monthNumber.equalsIgnoreCase("5")) {
            System.out.println("May");
        } else if (monthNumber.equalsIgnoreCase("6")) {
            System.out.println("June");
        } else if (monthNumber.equalsIgnoreCase("7")) {
            System.out.println("July");
        } else if (monthNumber.equalsIgnoreCase("8")) {
            System.out.println("August");
        } else if (monthNumber.equalsIgnoreCase("9")) {
            System.out.println("September");
        } else if (monthNumber.equalsIgnoreCase("10")) {
            System.out.println("October");
        } else if (monthNumber.equalsIgnoreCase("11")) {
            System.out.println("November");
        } else if (monthNumber.equalsIgnoreCase("12")) {
            System.out.println("December");
        } else   {
            System.out.println("Invalid input");
        }
    }
}
