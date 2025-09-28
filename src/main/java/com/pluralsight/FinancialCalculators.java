package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // application for a financial organization
        // create set of financial calculators
        // prompt user to select which calculator

        System.out.println("What type of calculation would you like to make?\n\nPlease select one using the keyboard: \n(A)Mortgage Calculator \n(S)Future Value of Deposit \n(D)Present Value of Ordinary Annuity");
        String calculatorType = scanner.nextLine().toUpperCase();
        switch (calculatorType) {
            case "A":
                // mortgage calc
                mortgageCalculator();
            case "S":
                // future value of deposit
            case "D":
                // present value of annuity
        }


        // future value of deposit considering interest
        // present value of ordinary annuity
    }

    public static void mortgageCalculator() {
        // mortgage calculator (minus taxes and insurance)
        System.out.print("Principal amount(money borrowed): ");
        int principal = Integer.parseInt(scanner.nextLine());
        System.out.println("$" + principal + "\n");

        System.out.print("Interest rate: ");
        int interestRate = Integer.parseInt(scanner.nextLine());
        System.out.println(interestRate + "% \n");

        System.out.print("Loan length in years: ");
        int loanLength = Integer.parseInt(scanner.nextLine());
        System.out.println(loanLength);

        //double mortgage = principal * (interestRate * (1 + interestRate))
        System.out.println("Your monthly mortgage is $");
    }
}
