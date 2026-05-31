package com.kunal;

import java.util.Scanner;

public class NestedSwitch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee id: ");
        int empID = sc.nextInt();
        String dept = sc.next();

        switch (empID){
            case 1:
                System.out.println("Kunal kushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Employee number 3");

                switch (dept) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department found!");
                }
              break;
            default:
                System.out.println("No employee found!");
        }

        // better way to write (enhanced switch)

        switch (empID) {
            case 1 -> System.out.println("Kunal kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Employee number 3");

                switch (dept) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department found!");
                }
            }
            default -> System.out.println("No employee found!");
        }

    }
}
