package com.rahul;

import java.util.Scanner;

public class Loops {
    static void main(String[] args) {

        // for repetition/iteration

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // for-loop
//        for (int i = 1; i <= n ; i++) { // i++ or i += 1;
//            System.out.println(i);
//        }


        // while loop
//        int i =1;
//        while (i<=n){
//            System.out.println(i);
//            i++; }

        // do-while loop // at least once the loop will execute
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<=n);

    }
}
