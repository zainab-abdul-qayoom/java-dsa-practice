package com.rahul;

import java.util.Scanner;

public class XXI_FibonacciSeries {
    static void main(String[] args) {
//        21. Fibonacci Series In Java Programs

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 1; i<=n;i++){
            System.out.print(a + " ");
            int c = a+b;
            a=b;
            b=c;

        }
    }
}
