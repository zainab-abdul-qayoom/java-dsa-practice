package com.rahul;

import java.util.Scanner;

public class XIV_VolumeOfCone {
    static void main(String[] args) {
//        14. Volume Of Cone Java Program

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cone: ");
        float r = sc.nextFloat();
        System.out.print("Enter height of cone: ");
        float h = sc.nextFloat();

        double volume = Math.PI*r*r*h/3;
        System.out.println("The volume of cone is: " + volume);
    }
}
