package ru.mirea.lab3;

import java.util.Scanner;
import java.util.Random;
import java.lang.*;

public class Task4 {
    public static int[] append(int Arr[], int n){
        int[] newArr = new int[Arr.length+1];

        for(int i=0; i<Arr.length; i++){
            newArr[i] = Arr[i];
        }
        newArr[Arr.length] = n;

        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while(true){
            System.out.println("Enter an integer that is higher than 0:");
            n = sc.nextInt();
            if(n > 0){
                break;
            }
        }

        Random rand = new Random();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = rand.nextInt(0, n);
        }

        System.out.println("arr:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

        int[] evenArr = new int[0];

        for(int i=0; i<n; i++){
            if(arr[i]%2 == 0){
                evenArr = append(evenArr, arr[i]);
            }
        }

        if(evenArr.length > 0) {
            System.out.println("Even arr:");

            for (int i = 0; i < evenArr.length; i++) {
                System.out.println(evenArr[i]);
            }
        }
        else{
            System.out.println("arr doesn't have even numbers");
        }
    }
}
