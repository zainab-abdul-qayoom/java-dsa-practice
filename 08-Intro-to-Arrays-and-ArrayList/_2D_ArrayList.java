package com.kunal;

import java.util.ArrayList;
import java.util.Scanner;

public class _2D_ArrayList {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initializing of ArrayList
        for (int i = 0; i < 3; i++){ // 3 array
            list.add(new ArrayList<>());
        }

        // add elements
        for (int row = 0; row < 3; row++) { // 3 rows
            for (int col = 0; col < 3; col++) { // 3 columns in each row
                list.get(row).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
