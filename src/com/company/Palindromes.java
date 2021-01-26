package com.company;
import java.util.*;
import java.lang.*;


public class Palindromes {

    public static void main(String[] args) {

        // reverse a string
        String word="";
        String reverseWord="";
        StringBuilder givenInput=new StringBuilder();
        System.out.print("Enter the word:");
        Scanner scanner=new Scanner(System.in);
        word = scanner.nextLine();
        givenInput.append(word);
        reverseWord=reverse(givenInput);
        if(reverseWord.equals(word.toLowerCase()))
            System.out.println("The word is a palindrome");
        else
            System.out.println("The word is not a palindrome");
    }

    private static String reverse(StringBuilder input) {

        StringBuilder result= new StringBuilder();
        result=input.reverse();
        return String.valueOf(result).toLowerCase();


    }
}


