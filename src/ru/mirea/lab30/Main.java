package ru.mirea.lab30;

import java.util.Scanner;

public class Main {


    private static Scanner str;
    private static Scanner num;
    private static Scanner dou;
    private static Scanner cha;

    public static Order Inet() {
        System.out.print("Введите имя: ");
        String nameO = str.nextLine();
        System.out.print("Введите фамилию: ");
        String nameT = str.nextLine();
        System.out.print("Введите возраст: ");
        int age = num.nextInt();
        System.out.print("Введите город: ");
        String city = str.nextLine();
        System.out.print("Введите индекс: ");
        int index = num.nextInt();
        System.out.print("Введите название улицы: ");
        String street = str.nextLine();
        System.out.print("Введите номер дома: ");
        int home = num.nextInt();
        System.out.print("Введите корпус дома(N - если корпус отсутствует): ");
        char homeL = cha.next().charAt(0);
        System.out.print("Введите номер квартиры: ");
        int homeK = num.nextInt();
        Address adr1 = new Address(city, index, street, home, homeL, homeK);
        System.out.println(adr1.toString());
        Customer customer = new Customer(nameO, nameT, age, adr1);
        int buf;
        Order internetOrder = new InternetOrder(customer);
        MenuItem bufItem;
        boolean end = false;
        boolean ret = true;
        int price;
        String name;
        String description;
        double pr = 0;
        DrinkTypeEnum drinkTypeEnum;
        boolean check;


        System.out.println();
        do {
            System.out.println("1. Добавить еду в заказ");
            System.out.println("2. Добавить напиток в заказ");
            System.out.println("3. Удалить позицию из заказа");
            System.out.println("4. Создать заказ");
            System.out.println("5. Отменить заказ");
            System.out.println("6. Посмотреть позиции");
            System.out.print("Ввод: ");
            buf = num.nextInt();
            if (buf == 1) {
                System.out.print("Введите название: ");
                name = str.nextLine();
                System.out.print("Введите описание: ");
                description = str.nextLine();
                System.out.print("Введите цену: ");
                price = num.nextInt();
                bufItem = new Dish(price, name, description);
                check = internetOrder.add(bufItem);
                if (check == true) {
                    System.out.println("Еда добавлена");
                } else {
                    System.out.println("Ошибка! Еда не добавлена!");
                }
            }
            else if (buf == 2) {
                System.out.println(DrinkTypeEnum.list());
                do {
                    System.out.print("Введите номер напитка: ");
                    buf = num.nextInt();
                    drinkTypeEnum = DrinkTypeEnum.get(buf);
                } while ((buf <= 0) || (17 < buf) || (Drink.isAlcoholicDrink(drinkTypeEnum) == true && customer.getAge() < 18));
                System.out.print("Введите название: ");
                name = str.nextLine();
                System.out.print("Введите описание: ");
                description = str.nextLine();
                if (Drink.isAlcoholicDrink(drinkTypeEnum) == true)
                {
                    System.out.print("Введите % напитка: ");
                    pr = dou.nextDouble();
                }
                System.out.print("Введите цену: ");
                price = num.nextInt();
                if (Drink.isAlcoholicDrink(drinkTypeEnum) == true)
                {
                    bufItem = new Drink(price, name, description, pr, drinkTypeEnum);
                }
                else
                {
                    bufItem = new Drink(price, name, description, drinkTypeEnum);
                }
                check = internetOrder.add(bufItem);
                if (check == true) {
                    System.out.println("Напиток добавлен");
                } else {
                    System.out.println("Ошибка! Напиток не добавлен!");
                }
            }
            else if (buf == 3 && internetOrder.itemsQuantity() != 0) {
                System.out.println(internetOrder.toString());
                System.out.print("Ввведите номер: ");
                buf = num.nextInt();
                check = internetOrder.remove(internetOrder.get(buf - 1));
                if (check == true) {
                    System.out.println("Позиция удаоена");
                } else {
                    System.out.println("Ошибка! Позиция не удалена!");
                }
            }
            else if (buf == 4) {
                end = true;
            }
            else if (buf == 5) {
                ret = false;
                end = true;
            }
            else if (buf == 6) {
                System.out.println(internetOrder.toString());
            }
        } while (end == false);
        if (ret == true)
        {
            return internetOrder;
        }
        else
        {
            return null;
        }
    }

    public static Order Table()
    {
        System.out.print("Введите возраст: ");
        int age = num.nextInt();
        Customer customer = new Customer(age);
        int buf;
        Order tableOrder = new TableOrder(customer);
        MenuItem bufItem;
        boolean end = false;
        boolean ret = true;
        int price;
        String name;
        String description;
        double pr = 0;
        DrinkTypeEnum drinkTypeEnum;
        boolean check;


        System.out.println();
        do {
            System.out.println("1. Добавить еду в заказ");
            System.out.println("2. Добавить напиток в заказ");
            System.out.println("3. Удалить позицию из заказа");
            System.out.println("4. Создать заказ");
            System.out.println("5. Отменить заказ");
            System.out.println("6. Посмотреть позиции");
            System.out.print("Ввод: ");
            buf = num.nextInt();
            if (buf == 1) {
                System.out.print("Введите название: ");
                name = str.nextLine();
                System.out.print("Введите описание: ");
                description = str.nextLine();
                System.out.print("Введите цену: ");
                price = num.nextInt();
                bufItem = new Dish(price, name, description);
                check = tableOrder.add(bufItem);
                if (check == true)
                {
                    System.out.println("Еда добавлена");
                }
                else
                {
                    System.out.println("Ошибка! Еда не добавлена!");
                }
            }
            else if (buf == 2) {
                System.out.println(DrinkTypeEnum.list());
                do {
                    System.out.print("Введите номер напитка: ");
                    buf = num.nextInt();
                    drinkTypeEnum = DrinkTypeEnum.get(buf);
                } while ((buf <= 0) || (17 < buf) || (Drink.isAlcoholicDrink(drinkTypeEnum) == true && customer.getAge() < 18));
                System.out.print("Введите название: ");
                name = str.nextLine();
                System.out.print("Введите описание: ");
                description = str.nextLine();
                if (Drink.isAlcoholicDrink(drinkTypeEnum) == true)
                {
                    System.out.print("Введите % напитка: ");
                    pr = dou.nextDouble();
                }
                System.out.print("Введите цену: ");
                price = num.nextInt();
                if (Drink.isAlcoholicDrink(drinkTypeEnum) == true)
                {
                    bufItem = new Drink(price, name, description, pr, drinkTypeEnum);
                }
                else
                {
                    bufItem = new Drink(price, name, description, drinkTypeEnum);
                }
                check = tableOrder.add(bufItem);
                if (check == true) {
                    System.out.println("Напиток добавлен");
                } else {
                    System.out.println("Ошибка! Напиток не добавлен!");
                }
            }
            else if (buf == 3 && tableOrder.itemsQuantity() != 0) {
                System.out.println(tableOrder.toString());
                System.out.print("Ввведите номер: ");
                buf = num.nextInt();
                check = tableOrder.remove(tableOrder.get(buf - 1));
                if (check == true) {
                    System.out.println("Позиция удаоена");
                } else {
                    System.out.println("Ошибка! Позиция не удалена!");
                }
            }
            else if (buf == 4) {
                end = true;
            }
            else if (buf == 5) {
                ret = false;
                end = true;
            }
            else if (buf == 6) {
                System.out.println(tableOrder.toString());
            }
        } while (end == false);
        if (ret == true)
        {
            return tableOrder;
        }
        else
        {
            return null;
        }
    }



    public static void main(String[] args)
    {
        str = new Scanner(System.in);
        num = new Scanner(System.in);
        dou = new Scanner(System.in);
        cha = new Scanner(System.in);
        int bufINT;
        boolean error;
        InternetOrdersManager internetOrdersManager = new InternetOrdersManager();
        System.out.print("Введите количество столов: ");
        bufINT = num.nextInt();
        TableOrdersManager tableOrdersManager = new TableOrdersManager(bufINT);
        boolean end = false;
        do {
            System.out.println("1. Посмотреть интернет заказы");
            System.out.println("2. Посмотреть кафе заказы");
            System.out.println("3. Добавить интернет заказ");
            System.out.println("4. Добавить кафе заказ");
            System.out.println("5. Удалить/Закрыть интернет заказы");
            System.out.println("6. Удалить/Закрыть кафе заказы");
            System.out.println("7. Кол-во столов");
            System.out.println("0. Выйти");
            System.out.print("Ввод: ");
            bufINT = num.nextInt();
            if (bufINT == 1)
            {
                System.out.println(internetOrdersManager.toString());
            }
            else if(bufINT == 2)
            {
                System.out.println(tableOrdersManager.toString());
            }
            else if(bufINT == 3)
            {
                internetOrdersManager.add(Inet());
            }
            else if(bufINT == 4)
            {
                tableOrdersManager.add(Table());
            }
            else if(bufINT == 5)
            {
                System.out.println(internetOrdersManager.toString());
                System.out.print("Ввод: ");
                bufINT = num.nextInt();
                if (bufINT < internetOrdersManager.ordersQuantity())
                {
                    internetOrdersManager.remove(bufINT-1);
                }
                else
                {
                    System.out.println("Ошибка");
                }
            }
            else if(bufINT == 6)
            {
                System.out.println(tableOrdersManager.toString());
                System.out.print("Ввод: ");
                bufINT = num.nextInt();
                if (bufINT <= tableOrdersManager.ordersQuantity())
                {
                    tableOrdersManager.remove(bufINT-1);
                }
                else
                {
                    System.out.println("Ошибка");
                }
            }
            else if (bufINT == 7)
            {
                System.out.println("Всего столов: " + tableOrdersManager.AllTableNumber());
                System.out.println("Свободных столов всего: " + tableOrdersManager.freeTableNumber());
                System.out.print("Стол ");
                int[] bufmass = tableOrdersManager.freeTableNumbers();
                for (int j = 0; j < tableOrdersManager.freeTableNumber(); ++j)
                {
                    System.out.print("№" + (bufmass[j]) + " ");
                }
                System.out.println("свободен.");
            }
            else if(bufINT == 0)
            {
                end = true;
            }
        }while (end == false);
    }
}
