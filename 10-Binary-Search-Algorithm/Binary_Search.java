package com.kunal;

public class Binary_Search {
    static void main(String[] args) {
        int[] arr = {-76, -34, -2, 0,  2, 5, 7, 8, 9, 12, 15, 17, 19, 45, 67, 89, 90};
        int target = 45;
        int ans = binarySearch(arr, target);
        System.out.println("The " + target + " element is at index number " + ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {  // go to right hand side
                start = mid + 1; // end will same at right side

            } else if (target < arr[mid]) { // go to left hand side
                end = mid - 1; // start will same and end change

            } else { // the middle element is equal to target element
                return mid;
            }
        }
        return -1;
    }
}
