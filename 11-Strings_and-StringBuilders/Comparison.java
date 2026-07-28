package com.kunal;

public class Comparison {
    static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";

        String e = a;

        System.out.println(e == a);
        System.out.println(a == b);

        String c = new String("Kunal");
        String d = new String("Kunal");

        System.out.println(c == d);

        System.out.println(c.equals(d));

        // access the character
        System.out.println(a.charAt(0)); // print K
    }
}
