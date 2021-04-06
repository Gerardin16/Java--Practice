package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Rotation {
 public static void main (String [] args){
     Scanner s = new Scanner(System.in);
     int testcase=s.nextInt();
     int arraySize=s.nextInt();
     int noOfRotations=s.nextInt();
     int [] intArray=new int[arraySize];
     int [] copyArray=new int[noOfRotations];
     for(int i=0;i<arraySize;i++){
         intArray[i]=s.nextInt();
     }
     for(int j=0;j< copyArray.length;j++){
         copyArray[j]=intArray[noOfRotations+j+1];
     }

     for(int i=noOfRotations;i>=0;i--){
         intArray[noOfRotations+i]=intArray[i];
     }
     for(int k=0;k< copyArray.length;k++){
         intArray[k]=copyArray[k];
     }

     System.out.println(Arrays.toString(intArray));
 }
}
