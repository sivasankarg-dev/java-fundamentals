package com.practice.algorithms.searching;

import java.util.Arrays;


/**
 * 
 * Time complexity - 
 * Best case - O(1) If the target is placed in First index.
 * Worst case - O(N) If the target value is placed in last index or the value is not presented in the array
 * 
 * LinearSearch
 */
public class LinearSearch {
    public static void main(String[] args) {
        // int[] arr = {1,3,5,6,7,8};
        // System.out.println(findIndex(arr,5));
        // System.out.println(findIndex(arr,56));

        // System.out.println(contains(arr,5));
        // System.out.println(contains(arr,56));


        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(findIndex(matrix, 6)));

        String string = "Leo";
        char ch = 's';

        System.out.println(chatAtIndex(string, ch));
        System.out.println(contains(string, ch));
       
        
    }

    public static int chatAtIndex(String str,char ch){
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == ch){
                return i;
            }
        }

        return -1;
    }

    public static boolean contains(String str, char ch){
        char[] arr = str.toCharArray();
        for(char c : arr){
            if(c == ch){
                return true;
            }
        }
        return false;
    }
    public static int findIndex(int[] arr, int target){
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(int[] arr,int target){

        for(int val : arr){
            if(val == target){
                return true;
            }
        }
        return false;
    }


    public static int[] findIndex(int[][] arr, int target){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
