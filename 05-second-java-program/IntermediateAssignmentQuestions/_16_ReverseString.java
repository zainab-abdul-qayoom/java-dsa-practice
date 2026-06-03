package com.rahul.rana;

import java.util.Scanner;

public class _16_ReverseString {
    static void main(String[] args) {
//        16. Reverse A String In Java
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine(); // Kunal
        String rev = "" ;

        for (int i = str.length() -1; i >= 0; i--){ // // Reverse loop: last index = length - 1
            rev =  rev + str.charAt(i);
        }

        System.out.println("Reverse String is " + rev);
    }
}
