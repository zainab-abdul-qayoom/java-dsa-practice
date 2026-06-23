package com.kunal;

public class OrderAgnostic_BinarySearch {

    // in this program we will find target element index in an sorted array also we have to find that
    // the arary is sorted in which order either ascending or descending tehn we will find the target element index


    static void main(String[] args) {
//        int[] arr = {-76, -34, -2, 0,  2, 5, 7, 8, 9, 12, 15, 17, 19, 45, 67, 89, 90}; // ascending order
          int[] arr = {89, 67, 34, 33, 31, 29, 27, 25, 20, 17, 15, 14, 10, 8, 7, 5, 4, 3, 2, 1}; // descending order
//        int target = 45;
        int target = 17;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // check whether the array is sorted in ascending or in descending order
        boolean isAscending = arr[end] > arr[start];


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }



        return -1;
    }
}
