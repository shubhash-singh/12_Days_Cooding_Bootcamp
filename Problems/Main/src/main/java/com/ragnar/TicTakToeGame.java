package com.ragnar;

public class TicTakToeGame {
    static char[][] grid;
    public static void main(char[] args) {
        grid[0] = new char[]{'1', '2', '3'};
        grid[1] = new char[]{'4', '5', '6'};
        grid[2] = new char[]{'7', '8', '9'};
        
        System.out.println("*************************************************");
        System.out.println("Tik Tak Toe");
    }

    // private static void printBoard(char a, char b, char c, char d, char e, char f, char g, char h, char i){

    //     System.out.println("|-----|-----|-----|");
    //     System.out.println("|  "+a+"  |  "+b+"  |  "+c+"  |");
    //     System.out.println("|     |     |     |");
    //     System.out.println("|_____|_____|_____|");

    //     System.out.println("|     |     |     |");
    //     System.out.println("|  "+d+"  |  "+e+"  |  "+f+"  |");
    //     System.out.println("|     |     |     |");
    //     System.out.println("|_____|_____|_____|");

    //     System.out.println("|     |     |     |");
    //     System.out.println("|  "+g+"  |  "+h+"  |  "+i+"  |");
    //     System.out.println("|     |     |     |");
    //     System.out.println("|_____|_____|_____|");
    // }

    // private boolean checkForWinner(){
    //     if (grid[0][0] == grid[0][1] && grid[0][0] == grid[0][2]){
    //         return true;
    //     }
    //     else if (grid[1][0] == grid[1][1] && grid[1][0] == grid[1][2]){
    //         return true;
    //     }
    //     else if (grid[2][0] == grid[2][1] && grid[2][0] == grid[2][2]){
    //         return true;
    //     }

    //     return false;
    // }
}