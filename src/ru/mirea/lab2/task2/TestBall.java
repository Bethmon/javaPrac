package ru.mirea.lab2.task2;

import ru.mirea.lab2.task2.Ball;

public class TestBall {
    public static void main(String[] args){
        Ball a1 = new Ball(0, 0);
        System.out.print(a1);
        a1.move(1, 2);

        System.out.print(a1);
    }
}
