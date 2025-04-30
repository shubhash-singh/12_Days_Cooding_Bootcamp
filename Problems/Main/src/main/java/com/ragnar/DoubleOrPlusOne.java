// package com.ragnar;

public class DoubleOrPlusOne {

    public static void main(String[] args) {
        System.out.println(findMinimumPlusOne(98));
    }

    private static int findMinimumPlusOne(int num){
        int steps = 0;
        while(num > 1){
            if(num % 2 == 0){
                num /= 2;
            } else {
                num--;
                steps++;
            }

        }
        return steps;

    }
}