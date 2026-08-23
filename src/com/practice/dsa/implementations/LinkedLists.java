package com.practice.dsa.implementations;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

/**
 * 
 * LinkedLists
 */
public class LinkedLists {

    Node head = null; //Head node is the first node;

    void insertBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data){
        if(head == null){
            insertBeginning(data);
        }
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;

    }

    void insertIndex(int index,int data){
        if(index < 0){
            System.out.println("Invalid index");
            return;
        }
        Node temp = head;
        for(int i = 0 ; i < index -1;i++){
            temp = temp.next;

        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    void delete(int data){
        Node temp = head;
        
    }

    void display(){
        Node temp = head; // We should always took a copy while using head.
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        
        LinkedLists linkedLists = new LinkedLists();
        linkedLists.insertBeginning(10);
        linkedLists.insertBeginning(20);
        linkedLists.insertBeginning(30);

        linkedLists.insertEnd(50);
        linkedLists.insertIndex(1, 100);

        linkedLists.display();



    }
}
