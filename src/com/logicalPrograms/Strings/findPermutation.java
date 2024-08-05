package com.logicalPrograms.Strings;

import java.util.Scanner;

public class findPermutation {
    public static void main(String[] args){
        Scanner inputString = new Scanner(System.in);

        String s;
        String result = "";

        System.out.println("Enter a String: ");
        s = inputString.next();
        System.out.println("All permutation of this string: ");
        Permutation(s,result);
    }

    private static void Permutation(String string, String answer){
        if (string.length() == 0){
            System.out.print(answer + " ");
        }

        for (int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            String rest = string.substring(0,i) + string.substring(i+1);
            Permutation(rest, answer + ch);
        }
    }
}

