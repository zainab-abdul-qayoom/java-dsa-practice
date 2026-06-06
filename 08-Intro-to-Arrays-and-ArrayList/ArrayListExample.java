package com.kunal;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // used when we don't know about what will be the size of array


        // syntax
        ArrayList<Integer> list = new ArrayList<>(5); // can add even more than initial capacity even

        list.add(23);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(89);
        list.add(54);
        list.add(21);

        System.out.println(list); // already toString builtin in class ArrayList
        System.out.println(list.contains(2)); // does the list contains 2 ? yes so print true!
        System.out.println(list.set(0, 99)); // update 23 at 0 index to 99
        System.out.println(list); // again print list
        System.out.println(list.remove(0)); // will remove 0th index element 99
        System.out.println(list); // will remove 99 and print rest of the list



        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); // pass index here, syntax index[i] will not work here!
        }

    }
}
