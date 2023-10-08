package org.tax;

import java.util.Scanner;

public class TaxDeduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your weekly income: $");
        double income = input.nextDouble();


        double taxWithholding =0.0;
        if (income < 500) {
            taxWithholding = income * 0.10;
        } else if (income < 1500) {
            taxWithholding = income * 0.15;
        } else if (income < 2500) {
            taxWithholding = income * 0.20;
        } else {
            taxWithholding = income * 0.30;
        }

        System.out.printf("Your weekly average tax withholding is: $%.2f%n",taxWithholding);

        input.close();
    }
}
