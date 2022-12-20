package ru.mirea.lab3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random rand = new Random();

        for(int i = 0; i < 4; i++){
            arr[i] = rand.nextInt(10,99);
        }

        for(int i = 0; i < 4; i++){
            System.out.println(arr[i]);
        }

        boolean isIncreasing = true;

        for(int i = 1; i < 4; i++){
            if(arr[i-1] >= arr[i]){
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing){
            System.out.println("Strictly increasing sequence");
        }
        else {
            System.out.println("Not strictly increasing sequence");
        }
    }
}

