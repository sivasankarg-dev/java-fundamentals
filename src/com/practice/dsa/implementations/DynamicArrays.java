package com.practice.dsa.implementations;

/**
 * 
 * Java collections - ArrayList
 * 
 * create
 * insert - o(n) worst case
 * set (update) - o(1)
 * get = o(1)
 * display - o(n) iterate every element
 * search - o(n) worst case - If the element in last index
 * delete - o(n) worst case
 * 
 * DynamicArrays
 */
public class DynamicArrays {

    int[] arr;
    int capacity;
    int size;

    DynamicArrays(int capacity){
        arr = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    int get(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return -1;
        }
        return arr[index];
    }

    void set(int index,int value){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
        }
        arr[index] = value;
    }


    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i = 0; i < size;i++){
            if(i == size -1 ){
                str.append(arr[i]);
            }
            else{
                str.append(arr[i]+",");
            }

        }

        str.append("]");
        return new String(str);
    }

    void display(){
        for(int i = 0; i < size;i++){
            System.out.println(arr[i]);
        }
    }

    int search(int value){
        for(int i = 0; i < size ; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    void resize(){
        capacity = 2 * capacity;
        int[] newArr = new int[capacity];
        for(int i = 0; i < size ; i++){
            newArr[i] = arr[i];
        }
        arr = newArr; // While resizing the array we point the newArr to arr so the old reference will be removed by garbage collector.
    }


    boolean insert(int index, int value){
        if(index < 0 || index > size){
            System.out.println("Invalid index");
            return false;
        }
        if(size >= capacity){
            resize();
        }
        for(int i = size ; i < index ; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        size++;
        return true;
    }

    boolean delete(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return false;
        }

        for(int i = index; i < size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;

        return true;
    }











    public static void main(String[] args) {
        DynamicArrays arr = new DynamicArrays(4);
        arr.insert(0, 1);
        arr.insert(1, 2);
        arr.insert(2, 3);
        arr.insert(3, 4);
        arr.insert(4, 5);
        arr.insert(5, 6);

        arr.set(0, 100);
        arr.delete(1);
        System.out.println(arr.toString());
    
    
        

        




    }
}
