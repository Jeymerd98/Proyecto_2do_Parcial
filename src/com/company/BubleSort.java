package com.company;

public class BubleSort {

    public int[] BubleSort(int[] arr){

        int temp;
        for (int i = 0; i < arr.length ; i++){
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        return arr;
        }

    public static void main(String[] args)
    {

        int[] arreglo= {2, 4, 7, 13, 9, 27, 6, 25, 11, 18, 1, 8};

        for(int i=0; i < arreglo.length; i++)
        {
            System.out.print(arreglo[i]+",");
        }
        BubleSort a = new BubleSort();
        a.BubleSort(arreglo);
        System.out.println("\nArreglo ordenado: ");

        for (int i=0; i<arreglo.length; i++)
        {
            System.out.print(arreglo[i]+",");
        }

    }

}