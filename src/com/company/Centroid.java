package com.company;
import java.util.*;
import java.lang.*;


public class Centroid {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x1,y1,x2,y2,x3,y3;
        float X=0.1f;
        float Y=0.0f;
        x1=input.nextInt();
        y1=input.nextInt();
        x2=input.nextInt();
        y2=input.nextInt();
        x3=input.nextInt();
        y3=input.nextInt();
         X=(float)(x1+x2+x3)/3;
        Y=(float)(y1+y2+y3)/3;
        String formattedX= String.format("%.1f", X);
        String formattedY= String.format("%.1f", Y);
        System.out.printf("Dinesh's house is located at (" + formattedX+","+formattedY+")");
    }




}
