package com.kunal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInStrings {
    static void main(String[] args) {

        String name = "Kunal";
        char target = 'u';

        System.out.println(search(name, target));

        // for converting String name "kunal" into character array
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    // using for loop
    static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }

    // by using for-each loop

    static boolean search2(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        for(char ch:  str.toCharArray()){
            if(target == ch){
                return true;
            }
        }

        return false;
    }
}
