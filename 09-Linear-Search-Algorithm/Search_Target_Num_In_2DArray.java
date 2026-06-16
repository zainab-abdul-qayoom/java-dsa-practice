package com.kunal;

import java.util.Arrays;

public class Search_Target_Num_In_2DArray {
    static void main(String[] args) {
        int[][] arr = {
                {12, 34, 56},
                {76, 98, 3, 8},
                {56, 32, 13, 43},
                {6, 4, 67},
        };

        int target = 4;
        int[] ans = search(arr, target); // format of return value {row, col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                int element = arr[row][col];
                if (target == element){
                    return new int[]{row, col};
                }
            }
        }
      return new int[]{-1, -1};
    }
}
