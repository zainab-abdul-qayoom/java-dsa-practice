package com.kunal;

import java.util.Scanner;

public class StringTypeMethod {
    static void main(String[] args) {
        greet();
        String msg = greet();
        System.out.println(msg);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = sc.nextLine();
        String personalized= greets(naam);
        System.out.println(personalized);

//        String personalized = greets("Kunal kushwaha");
//        System.out.println(personalized);

    }

     static String greets(String name){
        String h = "Hello " + name;
        return h;
     }

    // return the value
    static String greet(){
        String greeting = "Hello";
        return greeting;
    }
}
