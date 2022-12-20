package ru.mirea.lab3;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] arr1 = new double[10];
        double[] arr2 = new double[10];
        for (int i=0; i<10; i++) {
            arr1[i] = rand.nextDouble();
            arr2[i] = Math.random();
        }
        System.out.println("arr1:");
        for (int i=0; i<10; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("\narr2:");
        for (int i=0; i<10; i++) {
            System.out.println(arr2[i]);
        }
        for (int i=0; i<10; i++) {
            for (int j=0; j<10-i-1; j++) {
                if (arr1[j] > arr1[j+1]) {
                    double buff = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = buff;
                }
                if (arr2[j] > arr2[j+1]) {
                    double buff = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = buff;
                }
            }
        }
        System.out.println("\narr1 sorted:");
        for (int i=0; i<10; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("\narr2 sorted:");
        for (int i=0; i<10; i++) {
            System.out.println(arr2[i]);
        }
    }
}
