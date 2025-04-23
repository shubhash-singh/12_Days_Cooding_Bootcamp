package com.ragnar;

public class PatternPrinting {

    public static void main(String[] args) {
        int n = 50000;
        int elem = 1;
        for(int i=1;i<=n;i++){
            if(i%2 != 0){ // odd number
                
                for(int j = 0;j<i-1;j++){
                    System.out.print(elem++ +"*");
                }
                System.out.println(elem++ );
                
            }else{
                // even number
                int end_val = elem;
                int j = elem + i - 1;
                for(;j>end_val;j--){
                    System.out.print(j + "*");
                    elem++;
                }
                System.out.println(j);
            }
        }
    }
}