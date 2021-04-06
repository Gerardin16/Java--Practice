package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChunking {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int arraySize=input.nextInt();
        int chunksize= input.nextInt();
        int [] numberArray=new int[arraySize];
        for(int i=0;i<arraySize;i++)
        {
            numberArray[i]= input.nextInt();
        }
            chunkArray(numberArray,arraySize,chunksize);

    }

    private static void chunkArray(int[] numberArray, int arraySize, int chunksize) {
        int rowSize=arraySize-chunksize;
       int chunkedArray[][]=new int[rowSize][chunksize];
       int count=0;
       for(int i=0;i<rowSize;i++)
       {
           if(count!=arraySize) {
               for(int j=0;j<chunksize;j++){


                      chunkedArray[i][j] = numberArray[count];
                      count++;
                  }


               }
           else
             break;
           }

        for (int[] row : chunkedArray)
            System.out.println(Arrays.toString(row));
    }
}
