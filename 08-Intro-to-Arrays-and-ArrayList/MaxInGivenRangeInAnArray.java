package com.kunal;

public class MaxInGivenRangeInAnArray {
    static void main(String[] args) {
        int[] arr = {23, 67, 4, 2, 5, 76, 22, 12, 11};
        System.out.println("Max Value in Range = " + maxRange(arr, 2, 7));

    }

    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end){

        if (end > start){
            return -1;
        }

        if (arr == null){
            return -1;
        }
        int maxValue = arr[start];
        for (int i = start; i <= end; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
