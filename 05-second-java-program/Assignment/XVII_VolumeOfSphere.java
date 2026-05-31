package com.rahul;

import java.util.Scanner;

public class XVII_VolumeOfSphere {
    static void main(String[] args) {
//        17. Volume Of Sphere
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of sphere: ");
        float r = in.nextFloat();

        double volume = 4/3.0*Math.PI*r*r*r;
        System.out.println("The volume of Sphere is: " + volume);
    }
}
