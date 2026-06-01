package com.rahul.rana;

import java.util.Scanner;

public class _7_Power {
    static void main(String[] args) {
//        7. Power In Java
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int p = sc.nextInt();

        double power = Math.pow(base, p);
        System.out.println("The power is: " + power);
    }
}
