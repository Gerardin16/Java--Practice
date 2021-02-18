package com.company;

import java.util.Scanner;
class CalculateTax {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();

        double tax = 0.0;
        double tax1=0.0,tax2=0.0,tax3=0.0;
        if(income > 250000 && income <500000)
            if(income>250000 && income <300000 && age<60 )
              tax1=0.1*income;
            else if(income>300001 && income <500000 && age<80)
                tax1=0.1*income;
            else
                tax1=0;
        else if(income > 500001 && income <1000000  )
            tax2=0.2*income;
        else if(income >1000000)
            tax3=0.3*income;
        else
            tax=0;
        tax=tax1+tax2+tax3;
            System.out.print(tax);
        scan.close();
    }
}