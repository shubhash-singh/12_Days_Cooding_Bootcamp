package com.ragnar;

public class KeyGeneration {
    public static void main(String[] args) {
        int a = 1245;
        int b = 8569;
        int c = 1573;

        int key = getSmallestDigit(a) + getSmallestDigit(b) + getSmallestDigit(c);
        key += getLargestDigit(a) + getLargestDigit(b) + getLargestDigit(c);
        System.out.printf(key + "\n");
    }


    private static int getSmallestDigit(int n){
        int smallestDigit = 9;
        while(n > 0){
            int digit = n % 10;
            n /= 10;
            if(smallestDigit > digit){
                smallestDigit = digit;
            }
        }
        return smallestDigit;
    }
    private static int getLargestDigit(int n){
        int largestDigit = 0;
        while(n > 0){
            int digit = n % 10;
            n /= 10;
            if(digit > largestDigit){
                largestDigit = digit;
            }
        }
        return largestDigit;
    }
}
