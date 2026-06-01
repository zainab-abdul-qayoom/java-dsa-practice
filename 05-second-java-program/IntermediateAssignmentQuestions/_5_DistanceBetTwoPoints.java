package com.rahul.rana;

import java.util.Scanner;

public class _5_DistanceBetTwoPoints {
    static void main(String[] args) {
//        5. Calculate Distance Between Two Points
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X^1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter X^2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter Y^1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter Y^2: ");
        double y2 = sc.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;

        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        System.out.println("The Distance between two points is " + distance);

    }
}
