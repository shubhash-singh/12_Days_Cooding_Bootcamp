package com.ragnar;

public class PrimeFactorRecursion {

    public static void main(String[] args) {
        findPrimeFactors(25);
    }

    public static void findPrimeFactors(int n) {
        if (n <= 1) {
            return;
        }
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 ) {
                System.out.print(i + " ");
                findPrimeFactors(n / i);
                break;
            }
        }
    }
    public void primeFactor(int n, int a) {
        if (n <= 1) {
            return;
        }
        int i = 2;
        while(n%i != 0){
            i++;
        }
        System.out.print(i + " ");
        primeFactor(n, a);
    }
}
