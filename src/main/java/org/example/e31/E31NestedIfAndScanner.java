package org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Create a Scanner object to read input
        boolean isSunny = true;
        // Declare a boolean variable isSunny
        System.out.println("Is it sunny outside?");
        // Print "Is it sunny outside? (true/false)"
        isSunny = input.nextBoolean();
        // Capture the user's input and store it in isSunny
        int temperature = 77;
        // Declare an integer variable temperature
        if (isSunny = true) {
            System.out.println("it's sunny day ,I should go somewhere");
            {
                System.out.println("Whats the temp?");
            }
            temperature = input.nextInt();

            if (temperature > 85) {
                System.out.println("I'm going to the beach");
            } else {
                System.out.println("I will stay home");
            }
            // Use an if-else statement to check if it is sunny


        }
    }
}