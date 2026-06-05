package com.rahul.rana;

public class _25_Condition_1 {
    static void main(String[] args) {
//        25. Kunal is allowed to go out with his friends only on the even days of a given month.
//        Write a program to count the number of days he can go out in the month of August.

        int aug = 31;
        int count1 = 0;
        int count2 = 0;

        for (int i=1; i<= aug; i++){
            if (i % 2 == 0){
                count1++;
            }
        }
        System.out.println("Kunal can go " + count1 + " days out with his friends in august!");

        // or more optimization method would be:

        for (int j=2; j<=aug; j += 2){
            count2++;
        }

        System.out.println("Kunal can go " + count2 + " days out with his friends in august!");
    }
}
