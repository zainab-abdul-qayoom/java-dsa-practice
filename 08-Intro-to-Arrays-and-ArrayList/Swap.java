package com.kunal;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    static void main(String[] args) {
        int[] nums = {2, 5, 89, 45, 32, 9};

        swap(nums, 0, 3); // swap 2 at index 0 and 45 at index 3
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
