import java.util.Scanner;

public class Input3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input: Ask user for income and expense categories
        System.out.print("Enter your monthly income: ");
        double income = scanner.nextDouble();

        System.out.print("Enter your rent expense: ");
        double rent = scanner.nextDouble();

        System.out.print("Enter your food expense: ");
        double food = scanner.nextDouble();

        System.out.print("Enter your transport expense: ");
        double transport = scanner.nextDouble();

        // Calculate total expenses and savings
        double totalExpenses = rent + food + transport;
        double savings = income - totalExpenses;

        // Output: Display savings report
        System.out.println("Monthly Savings Report ---");
        System.out.println("Income: GMD" + income);
        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Savings: " + savings);

// Close the scanner
        scanner.close();

    }

}
