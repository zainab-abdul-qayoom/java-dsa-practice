package com.rahul;

import java.util.Scanner;

public class XV_VolumeOfPrism {
    static void main(String[] args) {
//        15. Volume Of Prism
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        float b = sc.nextFloat();
        System.out.print("Enter height: ");
        float h = sc.nextFloat();

        double volume = b*h;
        System.out.println("The volume of prism is: " + volume);
    }
}
