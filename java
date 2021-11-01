// This Java program calcuaties interest on investment amounts for up to 30 years.

import java.util.Scanner;

public class InvestApp {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 
    
final int NUMBER_OF_YEARS = 30;
    
// Prompt the user to enter the investment amount
System.out.print("\nEnter investment amount: ");
double investmentAmount = input.nextDouble();
    
// Prompt the user to enter the interest rate
System.out.print("Enter annual interest rate: ");
double annualInterestRate = input.nextDouble();

// Get monthly interest rate
double monthlyInterestRate = annualInterestRate / 1200;
    
// Print a table that displays future investment for years 1 to 30
System.out.println("Years   Future Value"); // Table header
    for (int years = 1; years <= NUMBER_OF_YEARS; years++) {
        
        System.out.printf("%-10d", years);
        
        System.out.printf("%11.2f\n",
            futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
    }
}
    
// Method
public static double futureInvestmentValue(
double investmentAmount, double monthlyInterestRate, int years) {

return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
    
