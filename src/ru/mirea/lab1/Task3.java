/*5. Написать программу, в результате которой выводятся на экран
аргументы командной строки в цикле for.*/

package ru.mirea.lab1;

import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
}
