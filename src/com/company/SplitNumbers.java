package com.company;
import java.lang.reflect.Array;
import java.util.*;
import java.math.*;

public class SplitNumbers {

    public static void main(String[] args) {

        int inputNumber;
        int digitOne = 0,digitTwo = 0,digitThree = 0,digitFour = 0,digitFive = 0;
        int digitArray [] = new int[5];
        int index=0;
        int count=0;
        System.out.print("Enter any five digit number:");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
        count = getCount(inputNumber, count);
        if (count>5)
            System.out.println("Please enter five digit number");
        else if(count<5)
            System.out.println("Please enter five digit number");
        else
            {
                SeparateDigits(inputNumber, digitArray, index);
                AssignValues(digitArray, digitOne, digitTwo, digitThree, digitFour, digitFive);
            }

    }

    private static int getCount(int inputNumber, int count) {
        while (inputNumber != 0) {
            // num = num/10
            inputNumber /= 10;
            ++count;
        }
        return count;
    }

    private static void SeparateDigits(int inputNumber, int[] digitArray, int index) {
        while (inputNumber > 0) {
            int digit = inputNumber % 10;
            digitArray[index]=digit;
            inputNumber = inputNumber / 10;
            index++;
        }
    }

    private static void AssignValues(int [] sampleArray, int num1,int num2,int num3,int num4,int num5) {

        num1=sampleArray[0];
        num2=sampleArray[1];
        num3=sampleArray[2] ;
        num4=sampleArray[3];
        num5=sampleArray[4];
        System.out.println("The given number at ones place "+ num1);
        System.out.println("The given number at tens place "+ num2);
        System.out.println("The given number at hundreds place "+ num3);
        System.out.println("The given number at thousands place "+ num4);
        System.out.println("The given number at ten thousands place "+ num5);

    }
}

