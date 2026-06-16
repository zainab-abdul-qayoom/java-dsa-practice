package com.kunal;

import java.util.Arrays;

import static java.lang.Integer.MIN_VALUE;

public class Find_Max_in_2D_Array {
    static void main(String[] args) {
        int[][] arr = {
            {1, 4, 7, 89, 4}, {34, 6, 98, 78, 1}, {23, 74, 90, 28}
        };

        int ans = findMax(arr);
        System.out.println((ans));
    }

    static int findMax(int[][] arr){
     //   int max = arr[0][0]; or:
        int max = MIN_VALUE;
       for (int row=0; row<arr.length;row++){
           for (int col = 0; col < arr[row].length; col++) {
                if (max < arr[row][col]){
                    max = arr[row][col];
                }
           }

       }
       return max;
    }
}
