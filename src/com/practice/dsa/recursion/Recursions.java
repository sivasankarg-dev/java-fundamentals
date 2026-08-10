package com.practice.dsa.recursion;

public class Recursions {

    public static void main(String[] args) {
        System.out.println(isPalindrome("asba"));
    }

    public static void printNto1(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        printNto1(n-1);
    }


    public static void print1toN(int n){
        if(n == 0){
            return;
        }
        print1toN(n - 1);
        System.out.println(n);
    }

    public static int sumofTheNumbers(int num){
        if(num == 1){
            return 1;
        }

        return sumofTheNumbers(num - 1) + num;

    }

    public static int factorial(int num){
        if(num == 1){
            return 1;
        }

        return factorial(num - 1) * num;
    }


    public static int fibonacci(int num){
        if(num == 0 || num == 1){
            return  num;
        }

        return fibonacci(num - 2) + fibonacci(num -1);

    }

    public static int sumOfDigits(int num){
        if(num <= 0){
            return 0;
        }

        return num % 10 + sumOfDigits(num/10);
    }



    public static int pow(int num , int power){

        if(power == 0){
            return 1;
        }

        return num * pow(num,power -1);
    }

    public static int powOptimized(int num , int power){
        if(power == 0){
            return  1;
        }
        int val = powOptimized(num , power /2);
        int answer = val * val;
        if(power % 2 == 0){
            return answer;
        }
        return answer * num;

    }

    public static boolean isPalindrome(String name){

        boolean ispalindrome = palindrome(name,0,name.length()-1);
        return ispalindrome;

    }

    public static boolean palindrome(String name, int start, int end){
        if(start > end){
            return true;
        }

        if(name.charAt(start) != name.charAt(end)){
            return false;
        }
        else{
            return  palindrome(name,start+1,end-1);
        }



    }





}
