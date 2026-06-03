package com.rahul.rana;

import java.util.Scanner;

public class _12_AverageMarks {
    static void main(String[] args) {
//      12.   Calculate Average Marks
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int sub = sc.nextInt();
        float sum = 0;

        if (sub == 0){
            System.out.println("Invalid input!");
        }

else {
            for (int i = 1; i <= sub; i++) {
                System.out.print("Enter " + i + " subject marks: ");
                float marks = sc.nextFloat();
                sum += marks;
            }
            float average = sum / sub;
            System.out.println("Average marks is " + average);
        }
    }
}
