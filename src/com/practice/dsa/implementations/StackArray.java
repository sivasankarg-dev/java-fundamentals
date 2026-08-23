package com.practice.dsa.implementations;

public class StackArray {

    int[] stack;
    int size;
    int top = -1; //It's always point last element of the array.
    
    StackArray(){
        size = 100;
        stack = new int[size];

    }

    void push(int data){
        if(top == size -1){
            throw new StackOverflowError("Stack is full");
        }

        stack[++top] = data;

    }

    int pop(){
        if(top == -1){
            throw new IllegalArgumentException("Stack under flow");
        }
        return stack[top--];
    }

    int peek(){
        if(top == -1){
            throw new IllegalArgumentException("Stack under flow");
        }
        return stack[top];
    }

    boolean isEmpty(){
        return top == -1;
    }

    void display(){
        for(int i = 0; i <= top;i++){
            System.out.println(stack[i]);
        }
    }


    public static void main(String[] args) {
        
        StackArray stackArray = new StackArray();
        stackArray.push(10);
        stackArray.push(20);
        stackArray.push(30);
        stackArray.push(40);

        
        System.out.println(stackArray.isEmpty());
        System.out.println(stackArray.peek());

        stackArray.display();



    }
}
