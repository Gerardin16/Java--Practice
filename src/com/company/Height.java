package com.company;

public class Height {
    private int feet;
   private int inches;

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }

    public static Height addHeight(Height h1, Height h2) {
        Height h3=new Height();
        int x;
        int y;
        x=h1.feet+h2.feet;
        y=h1.inches+h2.inches;
        if(y>12)
        {
            x=x+1;
            y=y-1;
        }
        h3.setFeet(x);
        h3.setInches(y);
        return  h3;


    }


    public void display() {
        System.out.println("The sum of two height objects are:"+getFeet()+" feet "+getInches()+" inches");
    }
}