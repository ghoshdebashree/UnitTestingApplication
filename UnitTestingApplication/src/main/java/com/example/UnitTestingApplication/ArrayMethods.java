package com.example.UnitTestingApplication;

public class ArrayMethods {
    public int findIndex(int[] arr, int num){
       int index = -1;
       for(int i =0; i < arr.length; i++){
           if(arr[i] == num){
               index = i;
           }
       }
       return index;
    }
    public boolean searchForNumber(int[] arr, int num){
        boolean found = false;
        for(Integer i : arr){
            if(arr[i] == num){
                found = true;
            }
        }
        return found;
    }
    public void printArray(int[] arr, int index){
        //for(Integer i: arr){
            System.out.println(arr[index]);
        //}
    }
    //unimplemented method
    int[] sortArray(int[] numbers) {
        //implement sort
        return new int[] {};
    }
}
