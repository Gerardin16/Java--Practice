package com.company;

import com.company.sub.FindMaxChars;

import java.util.Scanner;

public class MaxChars {
    public static void main(String [] args)
    {

        Scanner input=new Scanner(System.in);
        String inputString= input.next();
        FindMaxChars maxchars=new FindMaxChars(inputString);
        maxchars.findMaxChar(maxchars.getSourceString());
        String result= (String) maxchars.maxChar(maxchars.getKeypair());
        System.out.println("The maximum character is "+result);
    }
}
