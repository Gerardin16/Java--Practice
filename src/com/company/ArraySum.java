package com.company;

import java.util.Scanner;

public class ArraySum {

    public static void main(String args[] ) throws Exception {

        Scanner input=new Scanner(System.in);
        long result=0;
        int size=input.nextInt();
        long [] numberArray=new long[size];
        for(int i=0;i<size;i++){
            numberArray[i]=input.nextLong();
        }
        for(int i=0;i<size;i++){
            result+=numberArray[i];
        }
        System.out.println(result);
    }
}
