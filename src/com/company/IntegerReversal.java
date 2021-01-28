package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.lang.*;

import static java.lang.Integer.valueOf;

public class IntegerReversal {
    public static void main(String[] args) {

        int givenNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        givenNumber = input.nextInt();
        Integer x = valueOf(givenNumber);
        Integer reversedNumber;
        Reverse r = new Reverse();
        reversedNumber = r.ReverseInt(x);
        if (givenNumber < 0) {

            System.out.println("The reversed integer is: " + reversedNumber + "-");

        } else {
            System.out.println("The reversed integer is: " + reversedNumber);


        }


    }

    static class Reverse {

        public static @NotNull
        Integer ReverseInt(Integer givenNumber) {

            StringBuilder reverseString = new StringBuilder(givenNumber.toString());
            if (givenNumber < 0) {
                reverseString.deleteCharAt(0);
            }
            String result = String.valueOf(reverseString.reverse());
            reverseString.deleteCharAt(0);
            return Integer.valueOf(result);
        }
    }
}




