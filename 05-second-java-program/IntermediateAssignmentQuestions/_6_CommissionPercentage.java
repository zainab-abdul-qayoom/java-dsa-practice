package com.rahul.rana;

import java.util.Scanner;

public class _6_CommissionPercentage {
    static void main(String[] args) {
//        6. Calculate Commission Percentage

        Scanner sc = new Scanner(System.in);

        System.out.print("Commission Earned: ");
        double comEar = sc.nextDouble();

        System.out.print("Total Sales: ");
        double totSales = sc.nextDouble();

        if (totSales <= 0){
            System.out.println("Invalid Total Sales!");
        } else if (comEar < 0) {
            System.out.println("Commission cannot be negative!");
        } else {
            double comPer = (comEar / totSales) * 100;
            System.out.println("The Commission Percentage is: " + comPer + "%");
        }
    }
}



