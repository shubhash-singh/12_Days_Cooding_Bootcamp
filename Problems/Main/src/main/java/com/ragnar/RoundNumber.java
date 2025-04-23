package com.ragnar;

import java.util.ArrayList;

public class RoundNumber {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(roundNumber(10));
    }
    private static boolean roundNumber(int number) {
        
        ArrayList<Integer> arr = new ArrayList<>();

        while(number >= 0){
            
            if(arr.contains(number)) {
                return false;
            }
            if(number == 1) {
                return true;
            }
            arr.add(number);
            number = sumOfSquareOfDigit(number);
        }

        return false;
    }

    private static int sumOfSquareOfDigit(int number) {
        int sum = 0;
        while(number != 0) {
            int squaredDigit = number % 10;
            sum += squaredDigit * squaredDigit;
            number = number / 10;
        }
        return sum;
    }
}
