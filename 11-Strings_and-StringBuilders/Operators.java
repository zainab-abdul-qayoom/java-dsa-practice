package com.kunal;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Operators {
    static void main(String[] args) {
        System.out.println('a' + 'b');  // add the integers values of both
        System.out.println("a" + "b"); // merge them ab
        System.out.println('a' + 3); // a + 3 = d
        // so
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // this is same as a few steps: "a" + "1"
        // Integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new CopyOnWriteArrayList<>());
        System.out.println("Kunal" + new Integer(67));


        // note: We can use + operator in complex expression but the condition is that we
        // must have to use a String once

        // like this is wrong
//        String a = new Integer(56) + new ArrayList<>();

        // but this is correct
        String b = new Integer(56) + " " + new ArrayList<>();

    }
}
