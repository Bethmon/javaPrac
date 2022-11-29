/*4. Написать программу, в результате которой массив чисел вводится
пользователем с клавиатуры считается сумма элементов целочисленного
массива с помощью циклов do while, while, также необходимо найти
максимальный и минимальный элемент в массиве, результат выводится на
экран.*/

package ru.mirea.lab1;

import java.util.*;
public class Task2 {

    public static void main(String[] args){
        Scanner sc2 = new Scanner(System.in);
        int n=0, suma=0, mayor=0, menor=0;

        do {
            System.out.print("vector numbers: ");
            n= sc2.nextInt();
            int vector2[] = new int[n];
            for (int i = 0; i<n; i++) {

                System.out.printf((i + 1) + " : ");
                vector2[i] = sc2.nextInt();

                suma = suma + vector2[i];

            }
            System.out.print(suma);

            for (int j = 0; j < vector2.length;j++ ){
                if(vector2[j]>mayor){
                    mayor = vector2[j];
                }
                if(vector2[j]<menor){
                    menor = vector2[j];
                }
            }
            System.out.print(mayor);
            System.out.print(menor);

        }while(sc2.nextInt() > 0);

    }
}
