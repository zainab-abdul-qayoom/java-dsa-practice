package com.rahul.rana;

import java.util.Scanner;

public class _4_DiscountOfProduct {
    static void main(String[] args) {
//        4. Calculate Discount Of Product
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of product: ");
        float price = sc.nextFloat();
        System.out.print("Enter discount %: ");
        float discountPercent = sc.nextFloat();

        float calDis = (price * discountPercent)/ 100;
        float finalPrice = price - calDis;
        System.out.println("Your final price with discount is: " + finalPrice);

    }
}
