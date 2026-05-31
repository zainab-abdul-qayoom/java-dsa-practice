package com.rahul;

import java.util.Scanner;

public class XXIII_Factors {
    static void main(String[] args) {
//        23. Input a number and print all the factors of that number (use loops).

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int f = sc.nextInt();

        for (int i = 1; i<=f; i++){
            if (f%i==0){
                System.out.print(i + " ");
            }
        }


    }
}

/*
What are factors?

Factors are numbers that divide a number completely (remainder = 0).

Example:

12

Factors of 12 are:

1 2 3 4 6 12

Because:

12 % 1 = 0
12 % 2 = 0
12 % 3 = 0
12 % 4 = 0
12 % 6 = 0
12 % 12 = 0
 */