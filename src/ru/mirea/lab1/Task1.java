/* 3. Написать программу, в результате которой массив чисел создается с
помощью инициализации (как в Си) вводится и считается в цикле сумма
элементов целочисленного массива, а также среднее арифметическое его
элементов результат выводится на экран. Использовать цикл for.
*/

package ru.mirea.lab1;

import java.util.*;


public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=0, suma=0;
        double media;

        System.out.print("vector numbers: ");

        n= sc.nextInt();
        int vector[] = new int[n];

        for (int i = 0; i<n; i++){

            System.out.printf((i+1)+" : ");
            vector[i] = sc.nextInt();

            suma = suma+vector[i];
        }
        media = suma/n;

        System.out.print(media);



    }

}