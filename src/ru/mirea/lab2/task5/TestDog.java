package ru.mirea.lab2.task5;

public class TestDog {
    public static void main(String[] args) {
        int human = 0;
        Dog d1 = new Dog("Lissy", 5);
        int ah = d1.ageHuman();
        System.out.println(d1);
        System.out.println(ah);
    }
}
