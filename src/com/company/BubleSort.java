package com.company;

public class BubleSort {

    public int[] BubleSort(int[] arr){
        for (int i = 0; i < arr.length ; i++){
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] > arr[j]){
                        int temp;
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        return arr;
        }
    }
