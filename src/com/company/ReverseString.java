package com.company;
import java.util.*;
import java.lang.*;

public class ReverseString {

    public static void main(String[] args) {
        // reverse a string
        String word="Jerwin";
        String reverseWord="";
        StringBuilder givenInput=new StringBuilder();
        givenInput.append(word);
        reverseWord=String.valueOf(reverse(givenInput));
        System.out.println(reverseWord);
//        Get input from user use below
//        System.out.print("Enter the word:");
//        Scanner scanner=new Scanner(System.in);
//        word = scanner.nextLine();
//        givenInput.append(word);
//        reverseWord=reverse(givenInput);
//        System.out.println("The reversed word is:" + reverseWord);
    }

    private static String reverse(StringBuilder input) {

        StringBuilder result= new StringBuilder();
        result=input.reverse();
        return String.valueOf(result);


    }
}
