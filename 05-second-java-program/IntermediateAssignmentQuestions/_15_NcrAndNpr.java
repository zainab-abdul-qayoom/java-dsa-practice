package com.rahul.rana;

import java.util.Scanner;

public class _15_NcrAndNpr {
    static void main(String[] args) {
        // 15. Find Ncr & Npr
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of items: ");
        int n = sc.nextInt();

        int factorialN = 1;
        int factorialR = 1;
        int factorialD = 1;


        System.out.print("number of items to choose: ");
        int r = sc.nextInt();

        int diffrence =  n - r;

        for (int i = 1; i <= n; i++){
            factorialN *= i ;
        }

        for (int i = 1; i <= r; i++){
            factorialR *= i;
        }

        for (int i = 1; i<= diffrence;  i++){
            factorialD *= i;
        }

        int ncr = factorialN / (factorialR * (factorialD)) ;
        int npr = factorialN / (factorialD);

        System.out.println("The Ncr is: " + ncr);
        System.out.println("The Npr is: " + npr);
    }
}
