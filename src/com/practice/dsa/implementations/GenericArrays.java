package com.practice.dsa.implementations;

public class GenericArrays<T> {

    Object[] arr;
    int capacity;
    int size;

    GenericArrays(int capacity){
        arr = new Object[capacity];
        this.capacity = capacity;
        size = 0;
    }

    @SuppressWarnings("unchecked")
    T get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Invalid Index");
        }
        return (T)arr[index];
    }

    void set(int index, T value){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Invalid Index");
        }
        arr[index] = value;
    }

    void display(){
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }

    boolean isEmpty(){
        return size == 0;
    }

    int search(T value){
        for(int i = 0; i < size; i++){
            if(arr[i] == value){
                return i;
            }
        }

        return -1;
    }

    void resize(){
        capacity = capacity * 2;
        Object[] newArr = new Object[capacity];
        for(int i = 0; i < size ; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;

    }

    boolean insert(int index, T value){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Invalid Index");
        }
        if(size >= capacity){
            resize();
        }
        for(int i = size; i < index;i--){
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

    int getSize(){
        return size;
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
    
    public static void main(String[] args) {
        GenericArrays<String> arr = new GenericArrays<>(3);
        arr.insert(0, "Siva");
        arr.insert(1, "Mari");
        arr.insert(2, "Vignesh");

        System.out.println(arr.toString());
    }
}
