package com.rahul;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Take the input until user does not enter x or X.
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true){
            System.out.println();
            System.out.print("Enter operator: ");
            char ch = sc.next().trim().charAt(0);


        if (ch == '+' || ch == '-' || ch == '*' ||ch == '/' || ch == '%' ) {
            System.out.print("Enter number 1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = sc.nextInt();

            if (ch == '+'){
                ans = num1+num2;
            }

            if (ch == '-'){
                ans = num1-num2;
            }

            if (ch == '*'){
                ans = num1*num2;
            }

            if (ch == '/'){
                if (num2 != 0){
                    ans = num1/num2;
                }
                else {
                    System.out.println("Invalid division");
                }
            }
            if (ch == '%'){
                ans = num1 % num2;
            }
        } else if (ch == 'x' || ch == 'X') {
            break;
        } else {
            System.out.println("Operation failed!");
        }
            System.out.println("The ans is: " + ans);
        }

    }
}
