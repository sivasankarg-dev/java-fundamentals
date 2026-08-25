package com.practice.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {


    /**
     * 
     * Time complexity - O(n^2)
     * 
     * It's check every index even the array is sorted
     * 
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    /**
     * Time complexity - O(N^2 / 2)
     * 
     * It's check only non sorted  index and after every pass the sorted portion will be ignored.
     * so we added n-1 for outer loop and n-i-1 for inner loop.
     * 
     * @return
     */
    public static int[] bubbleSortOptimized(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n -1; i++ ){
            for(int j = 0; j < n-i-1 ; j++ ){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }


    /**
     *  The time complexity will be O(N) in bubble sort even the array is sorted .
     * This is the optimized and best case of time complexity in bubble sort .
     *
     * @param arr
     * @return
     */
    public static int[] bubbleSortWithOofN(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n -1; i++){
            boolean isSwapped = false;
            for(int j = 0 ; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }


            }
            if(!isSwapped){
                return arr;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        System.out.println(Arrays.toString(bubbleSortWithOofN(arr)));
    }
}
