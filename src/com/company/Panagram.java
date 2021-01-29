package com.company;

import java.util.Scanner;

public class Panagram {

    public static void main(String[] args) {
        char [] alphabets="abcdefghijklmnopqrstuvwxyz".toCharArray();
        String givenText;
        boolean isPanagram;
        System.out.println("Please provide the sentence (or) word: ");
        Scanner input=new Scanner(System.in);
        givenText=input.nextLine();
        isPanagram=CheckPanagram(givenText,alphabets);
        if(isPanagram)
            System.out.println("The given sentence/word is a Panagram");
        else
            System.out.println("The given sentence/word is not a Panagram");

    }

    private static boolean CheckPanagram(String givenText, char[] alphabets) {
        
        int charIndex;
        String toLower=givenText.toLowerCase();
        //for(datatype variable_name:array or string)--syntax
        for (char letterInSentence:alphabets)
        {
            charIndex=toLower.indexOf(letterInSentence);
            if(charIndex == -1)
                return false;
        }
        return true;
    }


}
