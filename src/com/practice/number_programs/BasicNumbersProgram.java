package com.practice.number_programs;

import java.util.ArrayList;

public class BasicNumbersProgram {
    public static void main(String[] args) {
       neonNumber(9);
    }

    public static void automorphicNumber(int num){
        if(num < 0){
            num = num * -1;
        }

        int square = num * num;
        int digits = 0;
        int temp = num;

        while(temp > 0){
            digits++;
            temp /= 10;
        }
        
    }

    public static void neonNumber(int num){
        if(num == 0 || num == 1){
            System.out.println(true);
            return;
        }
        if(num < 0){
            num = num * -1;
        }
        int sqaure = num * num;
        int sum = 0;
        while(sqaure > 0){
            int reminder = sqaure % 10;
            sum += reminder;
            sqaure /= 10;
        }

        System.out.println(num == sum);

    }

    public static void sumOfEvenNumbers(int num){
        if(num == 0){
            System.out.println(0);
        }

        if(num < 0){
            num = num * -1;
        }
        int sum = 0;
        while(num > 0){
            int reminder = num % 10;
            if(reminder % 2 == 0){
                sum+=reminder;
            }
            num /= 10;
        }
        System.out.println(sum);
    }


    public static void sumOfOddNumbers(int num){
        if(num == 0){
            System.out.println(0);
        }

        if(num < 0){
            num = num * -1;
        }
        int sum = 0;
        while(num > 0){
            int reminder = num % 10;
            if(reminder % 2 != 0){
                sum+=reminder;
            }
            num /= 10;
        }
        System.out.println(sum);
    }

    public static void countOddAndEven(int num){
        if(num == 0){
            System.out.println("Even");
            return;
        }
        if(num < 0){
            num = Math.abs(num);
        }

        int oddCount = 0;
        int evenCount = 0;

        while(num > 0){
            int reminder = num % 10;
            if(reminder % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            num /= 10;
        }

        System.out.println(oddCount);
        System.out.println(evenCount);
    }

    public static void swapTwoVariables(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static void basicMaths(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }

    public static void checkOddOrEven(int num){
        if(num % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }

    public static void checkPositiveOrNegativeOrZero(int num){
        if(num == 0){
            System.out.println("Zero");
        }

        else if(num > 0){
            System.out.println("Postive");
        }

        else{
            System.out.println("Negative");
        }
    }


    public static void findLargestNumberAmongThree(int a,int b,int c){
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }

    public static void findSquareAndCube(int num){
        System.out.println(Math.pow(num,2));//return double
        System.out.println(num*num);
        System.out.println(num*num*num);
    }

    public static void countOfTheDigit(int num){
        int count = 0;
        if(num < 0){
            String str = String.valueOf(num);
            num = Integer.valueOf(str.substring(1));
        }
        while(num > 0){
            count++;
            num /=10;
        }
        System.out.println(count);
    }

    public static void sumOfTheDigits(int num){
        if(num < 0){
            String str = String.valueOf(num);
            num = Integer.valueOf(str.substring(1));

        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);
    }

    public static void reverseNumber(int num){
         if(num < 0){
            String str = String.valueOf(num);
            num = Integer.valueOf(str.substring(1));

        }
        int reverse = 0;
        while(num > 0){
            int reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num /= 10;

        }

        System.out.println(reverse);
    }

    public static void palindromeNumber(int num){
        int reverse = 0;
        int original = num;
        while(num > 0){
            int reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num /= 10;
        }

        System.out.println(original == reverse);
    }

    public static void armstrongNumber(int num){
        int original = num;
        int count = 0;
        int temp = num;
        while(temp > 0){
            count++;
            temp /= 10;
        }

        int sum = 0;

        while(num > 0){
            int reminder = num % 10;
            sum+=Math.pow(reminder,count);
            num /= 10;
        }

        System.out.println(original == sum);

    }

    public static void factorialOfTheNumber(int num){
        int sum = 1;
        for(int i = 1; i <= num; i++){
            sum *= i;
        }

        System.out.println(sum);
    }

    public static void fibonacciSeries(int num){
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for(int i  = 3; i <= num;i++){
            int next = first + second;
            first = second;
            second = next;

            System.out.println(next);
        }


    }

    public static void checkPrimeNumber(int num){
        int count = 0;
        boolean isPrime = false;
        for(int i = 1;i <= num; i++){
            if(count > 2){
                isPrime = false;
                break;
            }
            if(num / i == num || num % i ==0){
                count++;
            }
        }

        System.out.println(count == 2 && !isPrime);

      
    }

    public static void printPrimeNumbersInRange(int start, int end){
        if(start == 0 || end==0){
            throw new IllegalArgumentException("Range should not be 0");
        }
        if (start == 1 && end == 1) {
            System.out.println(1);
        }
        for(int i = start ; i <= end; i++ ){
            int count = 0;
            boolean isPrime = true;
            for(int j = 1; j <= end; j++){
                if(count > 2){
                    isPrime = false;
                }
                if(i % 1 == i || i % j == 0){
                    count++;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }

    public static void sumOfNaturalNumbers(int num){
        if(num == 0){
            throw new IllegalArgumentException("Number can't be zero");
        }
        int sum = (num *(num + 1)) / 2;

        int sumViaLoop = 0;
        for(int i = 1 ; i <= num; i++){
            sumViaLoop+=i;
        }

        System.out.println(sum); 
        System.out.println(sumViaLoop);
    }

    public static void multiplicationTable(int num){
        if(num == 0){
            throw new IllegalArgumentException("Number can't be Zero");
        }

        for(int i = 1; i <= 10 ; i++){
            System.out.println(i +"*" + num +" = "+ i*num );
        }
    }

    public static void perfectNumber(int num){
        
        int sum = 0;
        for(int i = 1; i < num;i++){
            if(num % i == 0 || num % i == num){
                sum += i;
            }
        }
        if(num == 0 || num == 1){
            System.out.println(true);
        }
       else{
         System.out.println(num == sum);
       }
    }


}

