package com.practice.algorithms.sorting;


import java.util.Arrays;


/**
 * Time complexity - O(N^2/2) is equal to O(N)
 * 
 * 
 * 
 * SelectionSort
 */
public class SelectionSort {


    public static int[] selectionSort(int[] arr){
        if(arr == null){
            throw new IllegalArgumentException("Array shouldn't be null");
        }
        
        for(int i = 0; i < arr.length ; i++){
            int minIndex = i;
            for(int j = i + 1 ;j < arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }

            }
            if(i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;   
            }
            
            
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,1,3,0,-1,2,9};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }
}
