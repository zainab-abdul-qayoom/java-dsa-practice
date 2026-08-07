package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bufferReaderAndScannerClass {
    static void main(String[] args) throws IOException {

        // Two methods to take input

//       1st Method: by user BUfferReader (oldest way)

        System.out.println("Enter a number: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

        bf.close();

//        2nd Method: by using Scanner object (latest version)

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1);

        sc.close();

    }
}
