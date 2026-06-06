package com.kunal;

import java.util.Arrays;

public class PassingInValue {
    static void main(String[] args) {

        // all explanation available on notes!

        int[] nums = {2, 4, 5, 7,8};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums)); // change 4 to 99
    }

    static void change(int[] arr){
        arr[1] = 99;
    }
}
