package org.example.e27;

public class E27GradeCalculatorElseIf {
    public static void main(String[] args) {
        // Hint: Declare 'score' as an int and assign 85 to it
int score=85;
if(score<=100){
    System.out.println("Your grade is A");
}else if(score<=89){
    System.out.println("Your grade is B");
}else if(score<=79){
    System.out.println("your grade is C");
}else if(score<=69){
            System.out.println("Your score is D");
        }else if(score<=59){
    System.out.println("your grade is F");
        }
        // Hint: Use if-else if statements to check grades A, B, C, D, F in order
        // Hint: Print the grade using System.out.println()

        // Expected output: "Your grade is: B"
    }
}