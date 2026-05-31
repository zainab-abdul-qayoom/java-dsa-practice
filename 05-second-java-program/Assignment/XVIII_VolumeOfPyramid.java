package com.rahul;

import java.util.Scanner;

public class XVIII_VolumeOfPyramid {
    static void main(String[] args) {
//      18. Volume Of Pyramid
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of pyramid: ");
        float l = in.nextFloat();
        System.out.print("Enter width of pyramid: ");
        float w = in.nextFloat();
        System.out.print("Enter height of pyramid: ");
        float h = in.nextFloat();

        double volume = (l*w*h)/3.0;
        System.out.println("The Volume of Pyramid is: " + volume);

    }
}
