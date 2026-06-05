package com.rahul.rana;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class _20__LCMOfTwoNumbers {
    static void main(String[] args) {
//        20. LCM Of Two Numbers
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int lcm = 0;

        for (int i=max(num1, num2); ; i++){
            if (i %  num1 == 0 && i % num2 == 0){
                lcm = i; // // First common multiple found is the LCM
                break;

            }
        }
        System.out.println("The LCM is: " + lcm);

        }
    }


