package com.rahul.rana;

import java.util.Scanner;

public class _1_Factorial {
    static void main(String[] args) {


//    1. Factorial Program In Java
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++){
            System.out.print(a + " ");
            int c = a+b;
             a = b;
             b = c;
        }
    }
}
