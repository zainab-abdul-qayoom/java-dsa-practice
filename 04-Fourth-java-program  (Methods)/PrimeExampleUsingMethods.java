package com.kunal;

import java.util.Scanner;

public class PrimeExampleUsingMethods {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt(); // num = 17
        boolean ans = isPrime(num);
        System.out.println(ans);

    }
    static boolean isPrime(int n){ // n = 17
        if (n <= 1){ // 17 <= 1; No
            return false;
        }
        int c = 2;
        while (c*c <= n){ //  2*2 = 4<= 17  --> 3*3 = 9<= 17 --> 4*4 = 16 <= 17 --> 5*5 = 25 <= 17
            if (n % c == 0){ // 17 % 4 == 0 no --> 17 % 9 = 0 no --> 17 % 16 == 0
                return false;
            }
            c++; // c = 3 // c = 4 // c = 5
        }
        if (c*c > n){ // 5*5 = 25 > 17
            return true; // return true
        }
        return false;
    }
}
