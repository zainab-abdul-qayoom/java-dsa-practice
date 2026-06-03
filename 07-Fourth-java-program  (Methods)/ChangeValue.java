package com.kunal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    static void main(String[] args) {
        int [] arr = {2,5,45,67,87,4,3};
         change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0] = 7; // modify the value of array at index 0. If u make a change to an object via this reference
                            // variable, same object will be changed.
    }
}
