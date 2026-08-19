package com.practice.dsa.implementations;


/**
 * 
 * create
 * insert - o(n) worst case
 * set (update) - o(1)
 * get = o(1)
 * display - o(n) iterate every element
 * search - o(n) worst case - If the element in last index
 * delete - o(n) worst case
 * 
 * 
 * 

 * Arrays - Implementation of Array
 */
public class Arrays {
    int[] arr;
    int size; // How many elements are occuiped in array ?
    int capacity; // Capacity of the array
    Arrays(int capacity){
        arr = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }


    boolean insert(int i,int element){
        if(i < 0 || i > size || size >= capacity){
            System.out.println("Invalid Index");
            return false;
        }
        for(int j = size ; j > i; j--){
            arr[j] = arr[j-1];
        }
        arr[i] = element;
        size++;
        return true;
    }

    int get(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return -1;
        }
        return arr[index];
    }

    void set(int index, int element){
         if(index < 0 || index >= size){
            System.out.println("Invalid index");
        }
        arr[index] = element;
    }

    void display(){
        for(int i = 0; i < size;i++){
            System.out.println(arr[i]);
        }
    }

    int search(int element){
        for(int i = 0; i < size;i++){
            if(arr[i] == element){
                return i;
            }
        }

        return -1;
    }

    boolean delete(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return false;
        }
        for(int i = index; i < size-1 ; i++){
            arr[i] = arr[i+1];
        }
        size--;
        return true;

    }

    public String toString(){
        StringBuilder str = new StringBuilder("[");
        for(int i = 0; i < size; i++){
            if(i == size-1){
                str.append(arr[i]);
            }
            else{
                str.append(arr[i]+",");
            }
        }
        str.append("]");

        return new String(str);
    }




    public static void main(String[] args) {
        Arrays arr = new Arrays(3); // Once create the object 

        arr.insert(0, 18);
        arr.insert(1, 17);
        arr.insert(2, 93);
        

        arr.set(2,45);
        System.out.println(arr.toString());
        System.out.println(arr.search(18));
        arr.delete(0);
        System.out.println(arr.toString());


    

    

    }




}
