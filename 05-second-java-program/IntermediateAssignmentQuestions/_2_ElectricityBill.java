package com.rahul.rana;

import java.util.Scanner;

public class _2_ElectricityBill {
    static void main(String[] args) {
//        2. Calculate Electricity Bill
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Watt: ");
        float watt = sc.nextFloat();

        System.out.print("Enter Hour used: ");
        float hr = sc.nextFloat();

        System.out.print("Enter cost per unit: ");
        float cost = sc.nextFloat();

        double kwh = (watt * hr)/1000;

        double bill = kwh * cost;
        System.out.println("The Electricity Bill is: " + bill);

    }
}
