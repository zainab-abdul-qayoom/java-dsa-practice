package com.kunal;

public class Syntax {
    static void main(String[] args) {
        // Q: store a roll no
        int rollno = 34;

        // Q: Stores a person name
        String name = "Kunal";

        //Q: Store 5 roll numbers of students
        int rno1 = 12;
        int rno2 = 89;
        int rno3 = 7;
        int rno4 = 4;
        int rno5 = 56;

        // Q: store the roll numbers of 500 students
        //  will we make 500 variables and write same repetitive pattern 500 times?
        // here we can use arrays

        // Arrays:
            // collection of same kind of datatypes either primitive or objects and even complex datatypes!

        // syntax:
        // datatype[] variable-name = new datatype[size];
        // store 5 roll nums
        int[] rnos = new int[5];
        // or can use directly as:
        int[] rnos2 = {12,44,67,53,7};

        System.out.println(rnos[1]); // prints 0 bec no value we give to rnos variable.

        String[] str = new String[4];
        System.out.println(str[3]); // prints null
    }
}
