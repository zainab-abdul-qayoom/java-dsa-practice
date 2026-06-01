package com.rahul.rana;

import java.util.Scanner;

public class _3_AvgOfN {
    static void main(String[] args) {
//        3. Calculate Average Of N Numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int N = sc.nextInt();
        float sum = 0;
        float avg;
        float n;

        for (int i = 1; i<= N; i++){
            System.out.print("Enter num " +i + " : ");
             n = sc.nextFloat();
            sum = sum+n;
        }
        avg = sum/N;
        System.out.println("The Average is: " + avg);
    }
}
