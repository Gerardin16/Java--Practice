package com.company;
import java.util.*;
public class CalaculateHeight {
    public static void main(String[] args) {

        Scanner givenInput=new Scanner(System.in);
        Height H1=new Height();
        H1.setFeet(givenInput.nextInt());
        H1.setInches(givenInput.nextInt());

        Height H2=new Height();
        H2.setFeet(givenInput.nextInt());
        H2.setInches(givenInput.nextInt());

        Height H3=new Height();
        H3=H3.addHeight(H1,H2);
        H3.display();
//

    }
}
