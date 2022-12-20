package ru.mirea.lab4;

public class SeasonsTester {
    public static void main(String[] args) {
        Seasons sus;
        sus = Seasons.Winter;
        System.out.println(sus.getAverageTemp());
        System.out.println(sus.getDescription());
        seasonDefine(Seasons.Autumn);
        for (Seasons i: Seasons.values()) {
            System.out.println(i.toString() + ", температура: " + i.getAverageTemp() +
                    ", описание: " + i.getDescription());
        }
    }
    public static void seasonDefine(Seasons sus) {
        switch (sus) {
            case Autumn -> {
                System.out.println(Seasons.Autumn);
                System.out.println("Я люблю осень");
            }
            case Winter -> {
                System.out.println(Seasons.Winter);
                System.out.println("Я люблю зиму");
            }
            case Summer -> {
                System.out.println(Seasons.Summer);
                System.out.println("Я люблю лето");
            }
            case Spring -> {
                System.out.println(Seasons.Spring);
                System.out.println("Я люблю весну");
            }
        }
    }
}