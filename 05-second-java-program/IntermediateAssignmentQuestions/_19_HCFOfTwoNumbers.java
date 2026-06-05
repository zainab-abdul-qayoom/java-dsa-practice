package com.rahul.rana;

import java.util.Scanner;

import static java.lang.Math.min;

public class _19_HCFOfTwoNumbers {
    static void main(String[] args) {
//         19. HCF Of Two Numbers Program
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        int HCF = 0;

        for (int i = 1; i <= min(num1, num2); i++){
            if (num1 % i == 0 && num2 % i == 0){
                HCF = i;  // // Store the latest common factor; the last one found will be the HCF
            }
        }

        System.out.println("The highest common factor is: " + HCF);

    }
}
