package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        double morningExpense=12.41;
        double afternoonExpense=26.79;
        double eveningExpense=37.05;
        double totalExpense=(morningExpense+afternoonExpense+eveningExpense);
        System.out.println("Your total daily expense is:" +" "+totalExpense);

        int budget=100;
        if(totalExpense<budget){
            System.out.println("You are within the budget");
        }else{
            System.out.println("You're broke");
        }











        // Assign values to daily expenses


        // Calculate total expense


        // Define a budget


        // Check if within budget


    }
}
