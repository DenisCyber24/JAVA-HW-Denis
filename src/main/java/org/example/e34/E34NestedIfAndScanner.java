package org.example.e34;

import java.util.Scanner;

public class E34NestedIfAndScanner {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        // Create a Scanner object to read input
        System.out.println("Please enter 3 distinct numbers separated by space");
        // Print prompt for user to enter 3 distinct numbers separated by spaces
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        // Capture the three numbers input
if(num3>num2 & num3>num1){
    System.out.println("The largest number is 14");
}
        // Use nested if-else statements to find the largest number

    }
}
