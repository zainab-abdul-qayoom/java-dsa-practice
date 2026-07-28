package com.kunal;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {

        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
         str = sc.nextLine();

        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String s){

        if(s.length() == 0 || s == null){
            return true;
        }
        for(int i = 0; i <= s.length() / 2; i++){
        s =  s.toLowerCase();
        int start = s.charAt(i) ;
        int end = s.charAt(s.length() -1 -i);

        if (start != end) {
            return false;
        }
        }

        return true;
    }
}
