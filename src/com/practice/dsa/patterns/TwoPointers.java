package com.practice.dsa.patterns;

import java.util.Arrays;


/**
 * 
 * TwoPointer means using two indices to move through data instead of repeatly checking the same elements
 * Two pointer = Two indicies + smart movements + avoided repeated work.
 */

public class TwoPointers {
    public static void main(String[] args) {
        
    }

    /**
     * Why does two pointer exist?
     * 
     * Suppose you want to find the two numbers whose sum is 18. Using brute force it check every pair.
     * So Time complexity is o(n^2)
     * If the array is sorted , using the two pointer the time complexity is o(n).
     * To eliminate unnecessary repeated comparisons so the two pointer is exist.
     * @return
     */


    public static int[] bruteForce(){
        int[] arr = {1,2,4,5,6,7,9,12};
        int target = 18;
        for(int i = 0; i < arr.length ;i++){
            for(int j = i+1; j < arr.length ;j++ ){
                int sum = arr[i] + arr[j];
                if(sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {0,0};

    }

    /**
     * This is the implementation of two pointer.
     * Here the important part is not syntax.
     * Why I am moving left and why I am moving right. That is the actual Two Pointer skill.
     * 
     * 
     * 1. Opposite direction - Pointers starting from opponent ends.Move towards each other.
     * 
     * Used for :
     * 1.Two sum in the Sorted array.
     * 2.Palindrome.
     * 3.Reverse a array or string
     * 4.Container with most water.
     * 5.Pair problems.
     * 6.Sorted array problems.
     * 
     * Complexity :
     * Time - o(n)
     * Space - o(1)
     * 
     * Opposite ends → come together
     * 
     * @return
     */
    public static int[] oppositeDirection(){
        int[] arr = {1,2,4,5,6,7,9,12};
        int target = 18;
        int left = 0;
        int right = arr.length -1 ;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[]{left,right};
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{0,0};
    }



    /**
     * Same Direction - Both pointers starting from 0 
     * Slow , Fast = 0
     * But they move at different speed or perform difference jobs
     * 
     * 
     * Used for: 
     *          1. Remove duplicates
     *          2. Move zeros.
     *          3. Remove elements
     *          4. Partioning
     *          5. In place array modification
     *          6. Linked List slow and fast problems
     * 
     * 
     * Here , Fast -> searches , Slow -> Places
     * Both starts from left side
     * Fast move every iteration
     * Slow move only when we find something
     * 
     * 
     * fast → READ (Using for find elements)
        slow → WRITE (store validate elements)


     */

    public static void sameDirection(){
        int[] arr = {0,0,2,0,3};
        int slow = 0;
        for(int fast = 0; fast < arr.length ; fast++){
            if(arr[fast] != 0){
                arr[slow] = arr[fast];
                slow++;
            }
        }

        while (slow < arr.length) {
            arr[slow] = 0;
            slow++;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 3.Fast and Slow pointers
     * 
     * This is a special form of same direction pointers.
     * 
     * Slow -> One step
     * Fast -> Two step
     * 
     * Used for :
     *  Detect linked list cycle
     *  Find the middle linked list
     *  Cycle detection
     * Find certain position in linked list.
     *     
     * Time complexity - O(n)
     * Space complexity - O(1)
     * 
     * Slow walks, fast jumps.
     * 
     * 
     */









}
