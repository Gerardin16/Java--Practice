package com.company;

import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        ArrayList primeNumbers=new ArrayList();
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {


                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers.add(num);
            }
        }
        System.out.println(primeNumbers);
    }
}
