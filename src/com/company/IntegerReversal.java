package com.company;
import java.util.Scanner;
import java.lang.*;

import static java.lang.Integer.valueOf;

public class IntegerReversal {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        int givenNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
//        givenNumber = input.nextInt();
         r.setNumber(input.nextInt());;
            r.ReverseInt();
        System.out.println("The reversed number is: " + r.getReverse());

    }


}






