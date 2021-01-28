package com.company;
import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

//        int a = 5; int b = 4; int c = 3;
//
//        int z = a + b - c * a;

//        System.out.println(z);

//        double x = 2.5;
//
//        double y = 1.5;
//
//        double z = (int)x/(int)y;
//        System.out.println(z);

//        int a = 200;
//        double d = 420.4;
//
//        a = (int) d;
//        double b = (double) a;
//        System.out.println(a);
//        System.out.println(b);

//        int a=6;
//        double b=5.5;
//        int sum=a+(int) b;
//        System.out.println(sum);

        int myAge;
        int ageOfBrother;
        boolean isEligible;
        //Write your code here
        Scanner input =new Scanner(System.in);
        myAge=input.nextInt();
        ageOfBrother=input.nextInt();
        if(myAge <0 && ageOfBrother < 0)
            isEligible=false;
        else if(myAge < 25 && ageOfBrother < 25)
            isEligible=true;
        else
            isEligible=false;
        System.out.println(isEligible);
    }



}
