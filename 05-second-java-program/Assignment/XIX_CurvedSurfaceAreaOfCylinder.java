package com.rahul;

import java.util.Scanner;

public class XIX_CurvedSurfaceAreaOfCylinder {
    static void main(String[] args) {
//        19. Curved Surface Area Of Cylinder
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = sc.nextFloat();
        System.out.print("Enter height: ");
        float h = sc.nextFloat();

        double csa = 2*Math.PI*r*h;
        System.out.println("Curved Surface Area Of Cylinder is: " + csa);
    }
}
