package ru.mirea.lab3.Task2;

import java.util.Scanner;
import java.util.Random;

public class Tester {
    public static void showCirclesArr(Circle circles[]) {
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }
    }

    public static Circle MinCircle(Circle[] circles) {
        Circle minCircle = circles[0];
        for(int i = 0; i < circles.length; i++) {
            if (circles[i].getRadius() < minCircle.getRadius()) {
                minCircle  = circles[i];
            }
        }
        return minCircle;
    }

    public static Circle MaxCircle(Circle[] circles) {
        Circle maxCircle = circles[0];
        for(int i = 0; i < circles.length; i++) {
            if (circles[i].getRadius() > maxCircle.getRadius()) {
                maxCircle  = circles[i];
            }
        }
        return maxCircle;
    }

    public static Circle[] sortCircles(Circle[] circles) {
        for(int i = 0; i < circles.length - 1; i++) {
            for(int j = i; j < circles.length - 1; j++) {
                if (circles[j].getRadius() > circles[j + 1].getRadius()) {
                    Circle temp = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = temp;
                }
            }
        }
        return circles;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxRadius = 100;
        int maxCoord = 100;

        Point p0 = new Point(rand.nextInt(maxCoord), rand.nextInt(maxCoord));
        Point p1 = new Point(rand.nextInt(maxCoord), rand.nextInt(maxCoord));
        Point p2 = new Point(rand.nextInt(maxCoord), rand.nextInt(maxCoord));

        Circle[] circles = new Circle[3];
        circles[0] = new Circle(rand.nextInt(maxRadius), p0.getX(), p0.getY());
        circles[1] = new Circle(rand.nextInt(maxRadius), p1.getX(), p1.getY());
        circles[2] = new Circle(rand.nextInt(maxRadius), p2.getX(), p2.getY());
        int circlesLen = circles.length;

        Circle minCircle = MinCircle(circles);
        Circle maxCircle = MaxCircle(circles);
        System.out.println("Min radius: " + minCircle);
        System.out.println("Max radius: " + maxCircle);
        System.out.println("Sorted circles:");
        for (int i=0; i < circlesLen; i++){
            System.out.println(sortCircles(circles)[i]);
        }
    }
}
