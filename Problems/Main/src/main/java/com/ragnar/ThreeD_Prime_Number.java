package com.ragnar;

import java.util.Scanner;

public class ThreeD_Prime_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 10; 
        while (count < n) {
            if (isPrime(num)) {
                if (isNumberOfDigitPrime(num) && isSumOfDigitPrime(num)) {
                    System.out.println(num);
                    count++;
                }
               
            }
            num++;
            
        }
        sc.close();
    
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumberOfDigitPrime(int n){
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return isPrime(count);
    }

    public static boolean isSumOfDigitPrime(int n){
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return isPrime(sum);

    }
}
