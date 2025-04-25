package com.ragnar;

import java.util.*;

public class NumberGuessProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of player 1: ");
        String player1 = sc.nextLine();
        System.out.print("Enter the name of player 2: ");
        String player2 = sc.nextLine();

        System.out.println("Hello "+ player1+" and "+player2);

        ArrayList<Integer> computerNumber = generateRamdomNumber(5);
        // for (Integer integer : computerNumber) {
        //     System.out.print(integer+ " ");
        // }

        System.out.println("Computer has fixed 5 number of integer in its mind.");
        System.out.println("You both have three  turns each to guess it.");
        System.out.println("Ready for game........");
        ArrayList<Integer> chosenNumber1 = new ArrayList<>();
        ArrayList<Integer> chosenNubmer2 = new ArrayList<>();

        int point1 = 0;
        int point2 = 0;

        for(int i=0;i<=5;i++){
            if(i%2 ==0){
                System.out.print(player1 +" guess the number->");
                int guess = sc.nextInt();
                while(chosenNumber1.contains(guess) || chosenNubmer2.contains(guess)){
                    System.out.print("Number is already choosen choose another number: ");
                    guess = sc.nextInt();
                }
                if (computerNumber.contains(guess)) {
                    point1 ++;
                    chosenNubmer2.add(guess);
                    chosenNumber1.add(guess);
                    System.out.println("CORRECT........");
                }
                else{
                    System.out.println("WRONG.........");
                }
            }
            else{
                System.out.print(player2 +" guess the number->");
                int guess = sc.nextInt();
                while(chosenNumber1.contains(guess) || chosenNubmer2.contains(guess)){
                    System.out.print("Number is already choosen choose another number: ");
                    guess = sc.nextInt();
                }
                if (computerNumber.contains(guess)) {
                    point2 ++;
                    chosenNubmer2.add(guess);
                    chosenNumber1.add(guess);
                    System.out.println("CORRECT........");
                }
                else{
                    System.out.println("WRONG.........");
                }
            }
        }


        if (point1 > point2) {
            System.out.println(player1 +" is the winner with "+point1+" points.");
            System.out.println(player2 +" is the loses with "+point2+" points.");
        }
        else if(point1 == point2){
            System.out.println("Game Draw......");
            System.out.println(player1 +" with "+point1+" points.");
            
        }
        else{
            System.out.println(player2 +" is the winner with "+point2+" points.");
            System.out.println(player1 +" is the loses with "+point1+" points.");
        }


        sc.close();
    }
    private static ArrayList<Integer> generateRamdomNumber(int n){
        ArrayList<Integer> res = new ArrayList<>();
        
        while(res.size() < n) {
            int number = (int)(Math.random() * 10) + 1;
            if (res.contains(number)) {
                continue;
            }
            else{
                res.add(number);
            }
        }
        return res;
        
    }
}