package com.company;

public class Main {

    public static void main(String[] args) {
        int numero[] = new int[7];
        for (int i = 0; i < numero.length ; i++) {
            numero[i] = (int) (Math.random() * 6 + 1);
            System.out.println(" " + numero[i]);
        }
        for (int i = 0; i < numero.length; i++) {
        }
    }
}
