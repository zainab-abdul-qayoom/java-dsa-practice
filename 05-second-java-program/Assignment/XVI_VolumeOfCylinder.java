package com.rahul;

import java.util.Scanner;

public class XVI_VolumeOfCylinder {
    static void main(String[] args) {
//         16. Volume Of Cylinder
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Cylinder: ");
        float r = sc.nextFloat();
        System.out.print("Enter height of cylinder: ");
        float h = sc.nextFloat();

        double volume = Math.PI*r*r*h;
        System.out.println("The volume of Cylinder is: " + volume);
    }
}
