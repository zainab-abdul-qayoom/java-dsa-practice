package com.kunal;

public class Performance {
    static void main(String[] args) {
        String s = " ";

        for (int i = 0; i < 26; i++) {
            char Ch = (char)('a' + i);
            System.out.print(Ch + " ");

            s = s + Ch;
        }
        System.out.println(s);
    }
}
