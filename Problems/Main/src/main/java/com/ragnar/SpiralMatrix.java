package com.ragnar;

public class SpiralMatrix {
    public static void main(String[] args) {


        int[][] spiral = spiralMatrix(new int[15][15]);
        for (int[] ints : spiral) {
            for (int j = 0; j < spiral[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] spiralMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        int elem = 0;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) { // for left -> right
//                on top row
                matrix[top][i] = ++elem;
            }
            top++;

            for (int i =top ;i<=bottom;i++) { // from top to bottom
//                on right col
                matrix[i][right] = ++elem;
            }
            right--;
            for(int i =right;i >= left;i--){ // from right to left
//              on bottom row
                matrix[bottom][i] = ++elem;
            }
            bottom--;
            for (int i =bottom ;i>=top;i--) { // from bottom to top
//              on left col
                matrix[i][left] = ++elem;
            }
            left++;

        }


        return matrix;
    }
}
