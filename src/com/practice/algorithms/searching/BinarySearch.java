package com.practice.algorithms.searching;

import java.util.Arrays;

/**
 * 
 * Binary search : For each iteration , we ignored the half the array . It's working when
 * the array is sorted either ascending or decending .
 * 
 * Order agnostic  using first and last index;
 * 
 *formula = (low + high) / 2 -> Can cause integer overflow issue.
 so safer formula is mid = low + (high - low) /2 ;

 * 
 * 
 * Time complexity - O(log n)
 * Space complexity - O(1)
 * 
 * BinarySearch
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        if(arr == null){
            throw new IllegalArgumentException("Array can't be null");
        }
        
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){ // To avoid ArrayIndexBoundException
            int mid = low + (high - low ) / 2;
            if(arr[mid] == target){
                return mid;
            }

            if(target > arr[mid]){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }

        }

        return -1;
    }


    public static int binarySearchCompatible(int[] arr, int target){
        if(arr == null){
            throw new IllegalArgumentException("Array can't be null");
        }

        int first = arr[0];
        int last = arr[arr.length - 1];

        boolean ascending = true;
        if(first > last){
            ascending = false;
        }

        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(target == arr[mid]){
                    return mid;
                }
            if(ascending){
                if(target > arr[mid]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            else{
                if(arr[mid] > target){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }

        }

        return -1;
    }

    public static int binarySearchOnRecursion(int[] arr, int target, int low, int high){
        if(arr == null){
            throw new IllegalArgumentException("Array can't be null");
        }
        if(low > high){
            return -1;
        }
        int mid = low + (high - low) /2 ;
        if(arr[mid] == target){
            return mid;
        }
        if(target > arr[mid]){
            return binarySearchOnRecursion(arr, target, mid +1 , high);
        }
        else{
             return binarySearchOnRecursion(arr, target, low, mid -1 );
        }

    }

    public static int binarySearchOnRecursionCompatible(int[] arr, int target, int low, int high,boolean isAscending){
        if(arr == null){
            throw new IllegalArgumentException("Array can't be null");
        }
        if(low > high){
            return -1;
        }
        int mid = low + (high - low) / 2;
        if(arr[mid] == target){
            return mid;
        } 
        if(isAscending){
            if(target > arr[mid]){
                return binarySearchOnRecursionCompatible(arr,target,mid + 1,high,isAscending);
            }
            else{
                return binarySearchOnRecursionCompatible(arr,target,low,mid -1,isAscending);
            }
        }

        else{
            if(arr[mid] > target){
                return binarySearchOnRecursionCompatible(arr,target,mid + 1,high,isAscending);
            }
            else{
                 return binarySearchOnRecursionCompatible(arr,target,low,mid -1,isAscending);
            }
        }

    }


    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 =  {7,6,5,4,3,2,1,0,-1,-2,-3};
        System.out.println(binarySearchOnRecursionCompatible(arr2,-1,0,arr.length-1,arr2[0] < arr2[arr2.length-1]));

    }
}
