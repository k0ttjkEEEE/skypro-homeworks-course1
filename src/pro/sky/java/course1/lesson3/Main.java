package pro.sky.java.course1.lesson3;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        int clOs = 1;
        if (clOs == 1) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else {
            System.out.println("Установите приложения для Android по ссылке");
        }
    }

    public static void task2() {
        int ClOs = 1;
        int clientDY = 2016;
        if (ClOs == 1 && clientDY < 2019) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке");
        } else if (ClOs == 1 && clientDY >= 2019) {
            System.out.println("Установите приложение для iOS по ссылке");
        }
        if (ClOs == 0 && clientDY < 2019) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        } else if (ClOs == 0 && clientDY >= 2019) {
            System.out.println("Установите приложение для Android по ссылке");
        }

    }

    public static void task3() {
        int year = 2020;
        if (year % 100 == 0) {
            System.out.println("Каждый сотый год не високосный не смотря на правило");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        System.out.println("Доставка займет " + days + " суток");
    }

    public static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
        }

    }

    public static void task6() {
        int age = 19;
        int salary = 58_000;
        if (age < 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + salary * 2 + " рублей");
        } else if (age < 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + (salary * 2) * 1.2 + " рублей");
        } else if (age < 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + (salary * 2) * 1.5 + " рублей");
        } else if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + (salary * 3) * 1.2 + " рублей");
        } else if (age >= 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + (salary * 3) * 1.5 + " рублей");
        }
    }
}



