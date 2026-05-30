package com.rahul;

import java.util.Scanner;

public class ReverseSeries {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter series to reverse: ");
        int n = sc.nextInt();
        int copy = n;
        int rev = 0;
        int digit = 0;

        while (n > 0){
            digit = n%10;
           rev = rev*10+digit;
            n /= 10;

        }
        System.out.println("The reverse of " + copy + " is " + rev);
    }
}
