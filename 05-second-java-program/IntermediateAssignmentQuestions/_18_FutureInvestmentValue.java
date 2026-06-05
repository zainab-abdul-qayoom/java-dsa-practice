package com.rahul.rana;

import java.util.Scanner;

public class _18_FutureInvestmentValue {
    static void main(String[] args) {
//      18.  Future Investment Value
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Present Value (your initial, up-front investment): ");
        float pv = sc.nextFloat();

        System.out.print("Enter Annual rate of return (interest), expressed as a decimal: ");
        float r = sc.nextFloat();

        System.out.print("Enter Time, which represents the total number of years the money is invested: ");
        float t = sc.nextFloat();

        double base = (1 + r);
        double  growthFactor = Math.pow(base, t);
        double futureValue = pv * growthFactor;

        System.out.println("The Future Value (the projected total worth of the investment) is " + futureValue);
    }
}
