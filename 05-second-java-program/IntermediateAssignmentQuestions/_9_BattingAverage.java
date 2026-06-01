package com.rahul.rana;

import java.util.Scanner;

public class _9_BattingAverage {
    static void main(String[] args) {
//        9. Calculate Batting Average
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Runs Scored: ");
        double runs = sc.nextDouble();

        System.out.print("Enter Numbers of Time Out: ");
        int outs = sc.nextInt();

        if (outs <= 0){
            System.out.println("Invalid number of times out. It must be greater than 0. ");
        }

        else {


            double avgBatting = runs / outs;
            System.out.println("The Average Batting is " + avgBatting);
        }
    }
}
