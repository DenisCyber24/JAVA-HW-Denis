package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// Create a Scanner object to read input

        System.out.println("Please enter your gender:M or F");// Print prompt for user to enter gender
        String gender = input.next();// Capture the gender input
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if (gender.equalsIgnoreCase("M")) {
            if (age >= 26) {
                System.out.println("Man");
            } else if (age <=25) {
                System.out.println("Boy");
            }


            if (gender.equalsIgnoreCase("F")) {
                System.out.println("Woman");

                if (age < 25) {
                    System.out.println("Girl");


                }


                // Print prompt for user to enter age
                // Capture the age input

                // Classify based on gender and age


                // Create a Scanner object to read input from the console
            }
        }
    }
}
