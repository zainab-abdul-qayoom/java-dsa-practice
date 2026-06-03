package com.kunal;

import java.util.Scanner;

public class ArmstrongNumberUsingMethods {
    static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number to know whether its Armstrong number or not: ");
//        int num = sc.nextInt();

//       boolean result = isArmstrong(num);
//        System.out.println(result);

        // print all 3 digits Armstrong numbers
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
       
    }

    static boolean isArmstrong(int n){
       int original = n;
        int sum = 0;
        
        while (n > 0) {
            int digit = n% 10; // takes the last digit
            sum = sum + (digit * digit * digit);
            n = n / 10; // removes last number
        }
               return sum == original; // will gives either true or false
    }


}
