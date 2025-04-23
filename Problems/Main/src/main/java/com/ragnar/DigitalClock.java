package com.ragnar;



public class DigitalClock extends Thread{
    public static void main(String[] args) throws InterruptedException{
        int h=4,m=03,s = 0;
        while(true){
            System.out.printf("%2d : %2d : %2d \n", h,m,s);
            System.out.flush();
            Thread.sleep(1000);
            
            s++;
            if(s == 60){
                s=0;
                m++;
            }
            else if(m==60){
                s=0;
                m=0;
                h++;
            }
            else if(h==12){
                s=0;
                m=0;
                h=0;
            }
        }
        
    }
    
}
