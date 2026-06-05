package com.rahul.rana;

import java.util.Scanner;

public class _17_PalindromeOrNot {
    static void main(String[] args) {
        // Find if a number is palindrome or not
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        int original = num;

          while (num > 0){
            int lastDigit = num % 10; // 1
            rev = (rev * 10) + lastDigit;  // rev = 0+1 = rev
            num = num / 10;
        }
        if (original == rev){
            System.out.println("Palindrome!");
        }

        else {
            System.out.println("Not palindrome!");
        }
    }

}
