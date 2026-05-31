package com.rahul;

import java.util.Scanner;

public class XXV_LargestNumUntilZero {
    static void main(String[] args) {
       // 25. Take integer inputs till the user enters 0 and print the largest number from all.

        Scanner sc = new Scanner(System.in);
        int larNum = 0;
        int num = 1;

        while (num != 0){
            System.out.print("Enter num: ");
            num = sc.nextInt();
            if (num < 0){
                System.out.println("Negative numbers are not allowed.");
            }
            if (num > larNum){
                larNum = num;
            }
        }
        System.out.println(larNum);
    }
}
