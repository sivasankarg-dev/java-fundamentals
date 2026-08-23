package com.practice.dsa.implementations;

import java.util.Stack;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {
    
    Node top = null;

    void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            return;
        }

        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if(top == null){
            throw new IllegalArgumentException("Stack under flow");
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    int peek(){
        if(top == null){
            throw new IllegalArgumentException("Stack under flow");
        }
        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }

    

    void display(){
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        
        // StackLinkedList stack = new StackLinkedList();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.push(40);

       
      

        // stack.display();

         String string = "{[()]}";
        String string2 = "{[(])}";
        String string3 = "(a*b)+(a+b)()()";
        String string4 = "())";


        // System.out.println(checkParantheis(string));
        //  System.out.println(checkParantheis(string2));
        //  System.out.println(checkParantheis(string3));
         System.out.println(checkParantheis(string4));


        

        }

    public static boolean checkParantheis(String string){
       

        Stack<Character> stack = new Stack<>();
        char[] arr = string.toCharArray();
        for (char ch : arr) {
            if(ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
            }
            else if(ch == '}' || ch == ')' || ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char sym = stack.pop();
                if(sym == '{' && ch != '}' || sym == '(' && ch != ')' || sym == '[' && ch != ']'){
                    return false;
                }
            }

           
        }

         if(stack.empty()){
                return true;
            }
        return false;
    }


}
