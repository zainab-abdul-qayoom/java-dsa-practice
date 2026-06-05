package com.rahul.rana;

import java.util.Scanner;

public class _22_PerfectNumber {
    static void main(String[] args) {
        // 22. Perfect Number In Java ex 6: Divisors are (1, 2, 3). ((1 + 2 + 3 = 6))
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum= 0;

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            }
        }

        if (num == sum){
            System.out.println(num + " is a Perfect number!");
        }
        else {
            System.out.println(num + " is not perfect number!");
        }

    }
}
