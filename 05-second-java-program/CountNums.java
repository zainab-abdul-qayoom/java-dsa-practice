package com.rahul;

import java.util.Scanner;

public class CountNums {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter series to find how many times 3 comes: ");
        int num = sc.nextInt();
//        int num = 1534983673;
        int count = 0;

        while (num > 0){
            int digit = num % 10; // gives last digit of the series to check is it == 3?
            if (digit == 3){
                count++; // if its == 3 so count will store it as 1 bec initially it was 0
            }
            num = num / 10; // as check last number so removes that to check rest of numbers
        }

        System.out.println("Total "+count + " threes found in series!");
    }
}
