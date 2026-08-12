package com.practice.starpattern;

public class StarPattern {

    public static void main(String[] args) {

//        printSquareOrRectangle(2,5);
//        System.out.println();
//        printSquareOrRectangle(5,5);
//        System.out.println();
        //printLeftHalfPyramid(5);
       // printInvertedLeftHalfPyramid(5);
        //printRightHalfPyramid(5);
        printInvertedRightHalfPyramid(5);
    }

    public static void printSquareOrRectangle(int row,int column){
        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= column ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printLeftHalfPyramid(int height){
        for(int i = 1; i <= height ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printInvertedLeftHalfPyramid(int height){
        for(int i = height;i >= 1; i--){
            for(int j = i ; j >=1 ;j--  ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printRightHalfPyramid(int height){
        for(int row = 1; row <= height ; row++){

            for(int space = 1; space <= height -row;space++){
                System.out.print(" ");
            }

            for(int col = 1 ; col <= row; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void printInvertedRightHalfPyramid(int height){
        for(int row = height; row >= 1 ; row--){
            for(int space = 1 ; space <= height - row; space++) {
                System.out.print(" ");
            }
            for(int col = row ; col >= 1 ; col--){
                System.out.print("*");
            }


            System.out.println();
        }
    }

    



}

