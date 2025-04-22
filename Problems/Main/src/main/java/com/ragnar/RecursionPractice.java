package com.ragnar;

public class RecursionPractice {
    public int abc(int a) {
        if (a == 1){
            return 2;
        }
        int b = abc(a-1);
        System.out.print("Hai ");
        return b+1;
    }

    public static void main(String[] args) {
        RecursionPractice r = new RecursionPractice();
        System.out.println(r.abc(5));

    }
}
