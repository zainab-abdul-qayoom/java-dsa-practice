package com.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    static void main(String[] args) {

        // Array of primitives
        int[] arr = new int[5];

        arr[0] = 23;
        arr[1] = 87;
        arr[2] = 780;
        arr[3] = 876;
        arr[4] = 924;
       // [23, 87, 780, 876, 924]
//        System.out.println(arr[3]);

        // easiest way to print an array
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);

        // input using for loop as the upper one is too repetitive
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // or we can use for each loop instead

        for (int num: arr){ // for every element in array, print the element
            System.out.print(num + " "); // here num represents element of an array
        }

//        System.out.println(arr[5]); // index out of bound error
    }
}
