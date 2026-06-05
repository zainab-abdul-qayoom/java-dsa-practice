package com.rahul.rana;

import java.util.Scanner;

public class _21_VowelOrConsonant {
    static void main(String[] args) {
//        21. Java Program Vowel Or Consonant
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Alphabet letter: ");
       String letter = sc.next().toLowerCase();
       char ch = letter.charAt(0);

       if (ch >= 'a' && ch <= 'z') {
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
               System.out.println("Vowel!");
           } else {
               System.out.println("Consonant!");
           }
       }

       else {
           System.out.println("Invalid input!");
       }
    }
}
