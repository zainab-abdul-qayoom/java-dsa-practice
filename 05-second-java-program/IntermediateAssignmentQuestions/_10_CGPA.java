package com.rahul.rana;

import java.util.Scanner;

public class _10_CGPA {
    static void main(String[] args) {
//        10. Calculate CGPA Java Program
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects (N): ");
        int N = sc.nextInt();
        float marks;
        int gradePoint;
        float total = 0;

        for (int i=1; i<=N; i++){
            System.out.print("Enter " + i + " Subject Marks: ");
            marks = sc.nextFloat();

            if (marks >= 90){
                gradePoint = 9;
            } else if (marks >= 80) {
                gradePoint = 8;
            } else if (marks >= 70) {
                gradePoint = 7;
            } else if (marks >= 60) {
                gradePoint = 6;
            } else if (marks >= 50) {
                gradePoint = 5;
            } else if (marks >= 40) {
                gradePoint = 4;
            } else  {
                gradePoint = 0;
            }

           total += gradePoint;
        }
        float cgpa = total/N;
        System.out.println("CGPA = " + cgpa);
    }
}
