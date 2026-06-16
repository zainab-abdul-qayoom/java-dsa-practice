package com.kunal;

public class FindMinimum {
    static void main(String[] args) {
//        int[] arr = {34, 67, 98, 43, 21, 56, 87, 34, 14, 23, -8};
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(findMinimum(arr));
    }

    static int findMinimum(int[] arr){
        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
