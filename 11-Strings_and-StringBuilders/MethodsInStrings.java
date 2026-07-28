package com.kunal;

import java.util.Arrays;

public class MethodsInStrings {
    static void main(String[] args) {
        String name = "Kunal Kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name);

        System.out.println(name.toLowerCase());
        System.out.println(name);

        // get index of a particular character
        System.out.println(name.indexOf('a'));

        // removing extra spaces
        System.out.println("    kunal    ".strip());

        System.out.println(Arrays.toString(name.split(" "))); // ans = [Kunal, kushwaha]

    }
}
