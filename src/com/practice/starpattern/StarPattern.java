package com.practice.starpattern;

public class StarPattern {

    public static void main(String[] args) {
        printSquare(5,5);
    }

    public static void printSquare(int row,int column){
        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= column ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


