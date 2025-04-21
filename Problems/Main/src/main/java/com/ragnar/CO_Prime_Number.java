package com.ragnar;

public class CO_Prime_Number {
    public static void main(String[] args) {
        int a = 100;
        for (int i = 5; i < a; i++) {
            for (int j = 4; j < i; j++) {
                for (int k = 3; k < j; k++) {
                    if (k*k + j*j == i*i) {
                        if (isCoPrime(i, j, k)) {
                            System.out.println(k + " " + j + " " + i);
                        }
                    }
                }
            }
        }
    }

    private static boolean isCoPrime(int num1, int num2, int num3) {
        for(int i = 2; i <= num1; i++) {
            if(num1%i == 0 && num2%i == 0 && num3%i == 0) {
                return false;
            }
        }
        return true;
    }
}
