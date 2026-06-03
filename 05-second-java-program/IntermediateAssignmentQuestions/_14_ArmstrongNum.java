package com.rahul.rana;

import java.util.Scanner;

public class _14_ArmstrongNum {
    static void main(String[] args) {
        // 14. Armstrong Number In Java
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;


        while (num > 0) {
            int lastDigit = num % 10;
            sum += (lastDigit * lastDigit * lastDigit);
            num /= 10;
        }

        if (sum == original) {
            System.out.print("Armstrong number!");
        } else {
            System.out.println("Not an Armstrong number!");
        }
    }
}
