package ru.mirea.lab3.Task2;

public class Circle extends Point{
    private double radius = 1;
    Circle(double radius, double x, double y) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public void setX(double x) {
        super.setX(x);
    }

    @Override
    public double getY() {
        return super.getY();
    }

    @Override
    public void setY(double y) {
        super.setY(y);
    }

    @Override
    public String toString() {
        return "Circle { x = " + getX() + ", y = " + getY() + ", radius = " + radius + " }";
    }
}
