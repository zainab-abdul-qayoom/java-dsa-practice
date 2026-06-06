package com.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class _2DArrays {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
                  1  2  3
                  4  5  6
                  7  8  9
         */

//        int [][] arr = new int[3][]; // 1st shows row 2nd is for column
        // notice: number of rows is mandatory to mention but number of columns are optional to mention

//        int[][] arr2 = {
//                {1, 2, 3}, // 0 index
//                {4, 5,}, // 1 index
//                {6, 7, 8, 9} // 2nd index --> arr2[2] = {6,7,8,9}
//        };

        // input
        int[][] arr3 = new int[3][3];
//        System.out.println(arr3.length); // prints the length of row only not column
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) { // in particular row what is the size of col?
                arr3[row][col] = sc.nextInt();
            }
        }

        // output
        System.out.println("Simplest way");
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) { // in particular row what is the size of col?
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();
        }

        // or more better
        System.out.println("Enhanced version");
        for (int row = 0; row < arr3.length; row++) {
            System.out.println(Arrays.toString(arr3[row]));
        }

        // or using for each loop
        System.out.println("Using for each loop");
        for(int[] a: arr3){
            System.out.println(Arrays.toString(a));
        }
    }
}