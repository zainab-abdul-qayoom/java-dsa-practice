package com.rahul;

import java.util.Scanner;

public class CheckCase {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = in.next().trim().charAt(0); // trim means removes empty spaces.
//        System.out.println(ch);

         if (ch >= 'a' && ch <= 'z'){
             System.out.println("Lowercase!");
         } else {
             System.out.println("Uppercase!");
         }

//        String word = "hello";
//        System.out.println(word.charAt(0)); // prints h beac index starts from 0
    }
}
