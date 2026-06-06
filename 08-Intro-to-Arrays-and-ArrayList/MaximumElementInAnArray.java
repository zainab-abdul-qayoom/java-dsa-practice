package com.kunal;

public class MaximumElementInAnArray {
    static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};

        System.out.println("Maximum value in an Array is = " + max(arr));
    }

    // imagine that arr is not empty
    static int max(int[] arr){
        if (arr == null){
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }

        return maxValue;
    }
}
