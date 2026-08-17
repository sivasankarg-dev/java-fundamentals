package com.practice.algorithms.searching;

import java.util.Arrays;

public class SearchAlgorithms {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        

        System.out.println(Arrays.toString(linearSearchInTwoDimensionalArray(arr,23)));
    }


    /**
     * Linear search
     * Search every element in the array until end.
     * Time complexity - o(n)
     * Space complexity - o(1)
     * @param arr
     * @param target
     */
    public static int linearSearchOneDimensionalArray(int[] arr,int target){
        if(arr == null){
            throw new IllegalArgumentException("Array can't be null");
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }



    /**
     * Linear search on 2D Array
     * Time complexity - o(n^2)
     * Space complexity - o(1)
     * 
     * @param arr
     * @param target
     * @return
     */
    public static int[] linearSearchInTwoDimensionalArray(int[][] arr,int target){
        if(arr == null){
            throw new IllegalArgumentException("Array can't be null");
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <arr[i].length; j++ ){
               if(arr[i][j] == target){
                    return new int[]{i,j};
               }
            }
        }

        
        return new int[0];



    }

   


}

class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(binarySearchOn1DArray(arr,9));

    }


    /**
     * Binary search - It's only working on Sorted arrays
     * 
     * Time complexity - o(log n)
     * Space complexity - 
     * 
     * 
     * @param arr
     * @param target
     * @return
     */

    public static int binarySearchOn1DArray(int[] arr, int target){
        if(arr == null){
            throw new IllegalArgumentException("Array can't be null");
        }
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/ 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                low = mid +1;
            }
            else{
                high = mid;
            }
        }
        return -1;
    }

    


}

/**
 * It's working on only in jump search
 * JumpSearch
 */
class JumpSearch{
    public static void main(String[] args) {
        
    }

    
}