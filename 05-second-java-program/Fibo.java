package com.rahul;

import java.util.Scanner;

public class Fibo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = 0;
        int b= 1;
        int count = 2;
        while (count <= n){
            int temp = b; // stores b previous value temp = 1
            b = b+a; //b stores new value of series
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
