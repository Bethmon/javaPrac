/* 7. Написать программу, которая с помощью метода класса, вычисляет
факториал числа (использовать управляющую конструкцию цикла), проверить
работу метода. */

package ru.mirea.lab1;

import java.util.*;
public class Task5 {
    public static void main(String[] args){
        System.out.print(get_factorial(10));
    }

    public static int get_factorial(int f){
        int factorial_result = 1;
        for (int i = 1; i <= f; i++) {

            factorial_result *= i;
        }
        return factorial_result;
    }
}
