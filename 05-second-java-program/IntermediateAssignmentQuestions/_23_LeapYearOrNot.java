package com.rahul.rana;

import java.util.Scanner;

public class _23_LeapYearOrNot {
    static void main(String[] args) {
//        23. Check Leap Year Or Not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0){
            System.out.println(year + " is a leap year!");
        }

        else {
            System.out.println(year + " is not a leap year!");
        }
    }
}
