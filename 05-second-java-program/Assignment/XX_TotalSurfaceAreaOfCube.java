package com.rahul;

import java.util.Scanner;

public class XX_TotalSurfaceAreaOfCube {
    static void main(String[] args) {
//        20. Total Surface Area Of Cube
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of one side (edge) of the cube: ");
        float a = sc.nextFloat();

        double TSA = 6*a*a;
        System.out.println("Total Surface Area Of Cube is: " + TSA);
    }
}
