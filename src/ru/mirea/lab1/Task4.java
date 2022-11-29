/* 6. Написать программу, в результате работы которой выводятся на экран
первые 10 чисел гармонического ряда (форматировать вывод). */

package ru.mirea.lab1;

import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        int num = 10; // number of values we want in a series
        double result = 0.0;
        System.out.print("3) The harmonic series is: ");
        while (num > 0) {
            result = result + (double)1 / num;
            num--;
            System.out.printf("%f, ", result);
        }
    }
}
