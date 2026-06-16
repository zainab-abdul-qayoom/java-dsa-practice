package com.kunal;

public class Intro_to_linear_search_algorithm {
    static void main(String[] args) {

        int[] arr = {12, 4, 77, 32, 9, 87, 23, 14, 65, 8};
        int target = 65;

        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }


    // search in the array: return the index if value found
    // otherwise if item not found return -1

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // check the targeted element so run a for-loop
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (element == target){
                return element;
            }
        }

        // if the targeted element doesn't found
        return -1; // bec -1 index does not exist
    }

    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // check the targeted element so run a for-loop
       for(int element: arr){
            if (element == target){
                return element;
            }
        }

        // if the targeted element doesn't found
        return -1;
    }

    // search the target and return true and false
    static boolean linearSearch3(int[] arr, int target) {
        // if target = -1 ? then we can return like this:

        if (arr.length == 0) {
            return false;
        }

        // check the targeted element so run a for-loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        // if the targeted element doesn't found
        return false;
    }
}
