package com.rahul;

public class Conditionals {
    static void main(String[] args) {
        /*
        syntax of if statements:
        if(boolean expression T OR F){
        //body
        } else{
        // do this
        }
         */

        int salary = 24500;
//        if (salary > 10000){
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
//        System.out.println(salary);

        if (salary > 20000){
            salary += 3000;
        } else if (salary > 10000) {
            salary += 2000;
        } else salary += 1000;

        System.out.println(salary);
    }
}
