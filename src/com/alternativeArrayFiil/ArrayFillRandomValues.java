package com.alternativeArrayFiil;
public class ArrayFillRandomValues {
    public static void main(String[] args) {
        double [] arr = new double[5];
        for(int i = 0; i<arr.length;i++){
            arr[i] = Math.random();
            System.out.println(Math.round(Math.random()));
        }
    }
}
