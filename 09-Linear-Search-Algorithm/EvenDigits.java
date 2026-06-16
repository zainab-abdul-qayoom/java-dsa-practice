package com.kunal;

public class EvenDigits {
    static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};

        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int digit = 0;
            int number = arr[i];
            while (number > 0) {
                digit++;
                number /= 10;
            }

            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
