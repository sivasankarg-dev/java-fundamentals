package com.practice.starpattern;

/**
 * Patterns - Static patterns and Dynamic patterns
 * Indexing should be started from 1.
 * 
 * StarPatternPractice
 */

public class StarPatternPractice {
    public static void main(String[] args) {
       
        

        printLeftHalfPyramidUsingBinary(5);
    }


    /**
     * 
     * Static pattern
     * No of rows = Outer loop
     * No of columns = Inner loop
     * @param a
     * @param b
     */
    public static void printSquare(int row,int col){ 

       
        //Nested for loops
        for(int i = 1 ; i <= row; i++ ){ //Outer loop
            for(int j = 1 ; j <= col; j++){ //Inner loop
                System.out.print("* "); //Print the pattern inside the inner loop
            }

            System.out.println(); //For Next 
        }

        //Time complexity - o(n^2)
        //Space complexity - o(1)
    }

    public static void printNumbers(int row,int col){
        for(int i = 1;i <= row; i++){
            for(int j = 1; j <= col ; j++){
                System.out.print(i*j +"   "); //We printed the number count
            }
            System.out.println();
        }
    }


    //Dynamic pattern - Relate the row and column and create formula 
    //No of column = no of the row.
    public static void printLeftPyramid(int row){
        for(int i = 1; i <= row;i++){
            for(int j = 1; j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void printLeftHalfPyramidNumber(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void printLeftHalfPyramidNumberMultiply(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }

    public static void printLeftHalfPyramidUsingBinary(int row){
        int printValue = 1;
        for(int i = 1; i <= row; i++){
            printValue = i % 2 == 0 ? 0 : 1;
            for(int j = 1; j <= i;j++ ){
                System.out.print(printValue + " ");
                    printValue = printValue == 1 ? 0 : 1;
               
            }
            System.out.println();
        }
    }

    /**
     * Using reverse for loop for inverted pyramid
     * 
     * 
     * @param row
     */
    public static void printReverseLeftPyramid(int row){
        for(int i = row; i >=1 ; i--){
            for(int j = i ; j >=1 ;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void printRightPyramid(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row-i;j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

   

}
