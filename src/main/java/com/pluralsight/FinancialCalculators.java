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
                futureDepositValue();
            case "D":
                // present value of annuity
                annuityValue();
        }
    }

    public static void annuityValue() {
        // present value of ordinary annuity
        System.out.println("Monthly payout: ");
        double payout = Double.parseDouble(scanner.nextLine());

        System.out.println("Interest rate percentage: ");
        double interestRate = Double.parseDouble(scanner.nextLine());

        System.out.println("Years to pay out: ");
        double yearsToPayout = Double.parseDouble(scanner.nextLine());
    }

    public static void mortgageCalculator() {
        // mortgage calculator (minus taxes and insurance)
        System.out.print("Loan amount: ");
        double principal = Double.parseDouble(scanner.nextLine());
        System.out.println("$" + principal + "\n");

        System.out.print("Interest rate percentage: ");
        double interestRate = Double.parseDouble(scanner.nextLine());
        System.out.println(interestRate + "% \n");
        double rate = interestRate / 100;

        System.out.print("Loan length in years: ");
        double loanLength = Double.parseDouble(scanner.nextLine());
        System.out.println(loanLength);

        double n = loanLength * 12;
        double mortgage = principal * ((rate * Math.pow((1 + rate), n)) / (Math.pow((1 + rate), n) - 1));
        System.out.printf("Your monthly mortgage is $%.2f",mortgage/12);
    }

    public static void futureDepositValue() {
        // future value of deposit considering interest
        System.out.println("Deposit amount: ");
        double depositAmount = Double.parseDouble(scanner.nextLine());

        System.out.println("Interest rate percentage: ");
        double interestRate = Double.parseDouble(scanner.nextLine());

        System.out.println("Number of years: ");
        double years = Double.parseDouble(scanner.nextLine());

        double futureValue = depositAmount * (1 + Math.pow((interestRate/365),(365 * years)));
        System.out.println(futureValue);
    }
}
