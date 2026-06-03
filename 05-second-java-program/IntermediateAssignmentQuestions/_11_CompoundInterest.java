package com.rahul.rana;

import java.util.Scanner;

public class _11_CompoundInterest {
    static void main(String[] args) {
        // 11. Compound Interest Java Program

        Scanner sc = new Scanner(System.in);

        System.out.print("The principal investment amount (the initial deposit or loan): ");
        double p = sc.nextDouble();

        System.out.print("The annual interest rate (expressed as a decimal): ");
        double r = sc.nextDouble();

        System.out.print("The number of times that interest is compounded per year: ");
        double n = sc.nextDouble();

        System.out.print("The time the money is invested or borrowed for, in years: ");
        double t = sc.nextDouble();

        // formula of compound interest A = P(1+r/n)^nt
        double base = (1 + r/n);
        double exponent = n*t;
        double powValue = Math.pow(base, exponent);
        double  futureValue = p * powValue;

        System.out.println("The future value of the investment/loan, including interest " + futureValue);
    }
}
