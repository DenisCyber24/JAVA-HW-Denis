package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        System.out.println("Do you need a loan");
        // Print prompt for user to answer if they need a loan
        boolean needsLoan = input.nextBoolean();
        // Capture the loan requirement input
        if (needsLoan) {
            System.out.println("What's yur credit score");
        }
        int creditScore = input.nextInt();
        if (creditScore < 600) {
            System.out.println("Not eligible.");
        }
        if (creditScore > 600 || creditScore == 700) {
            System.out.println("The eligibility is Maybe eligible.");
        }
        if (creditScore > 700 || creditScore == 800) {
            System.out.println("Eligible");
        }
        if (creditScore > 800) {
            System.out.println("Definitely eligible");
        } else {
            System.out.println("The eligibility is unknown");
        }


        // Check if the user needs a loan

        // Step 1: Create a Scanner Object


    }
    }
