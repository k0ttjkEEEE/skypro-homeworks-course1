package pro.sky.java.course1.lesson7;

import java.time.LocalDate;

public class Main {

    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

    }


    public static void isClOs(int date, int clOs) {
        if (clOs == 1 && date < 2019) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке");
        } else if (clOs == 1) {
            System.out.println("Установите приложение для iOS по ссылке");
        }
        if (clOs == 0 && date < 2019) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        } else if (clOs == 0) {
            System.out.println("Установите приложение для Android по ссылке");
        }
    }

    public static void isDeliveryTime(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        System.out.println("Доставка займет " + days + " суток");
    }

    public static void isSortWrong() {
        int[] arr = {3, 2, 1, 6, 5};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void isDoublesHere() {
        String forTask = "aabccddefgghiijjkk";
        char[] arr = forTask.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Найден дубль " + arr[i] + ", проверка остановлена.");
                    return;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        isLeapYear(2021);
    }

    public static void task2() {
        int currentYear = LocalDate.now().getYear();
        isClOs(currentYear, 0);
    }

    public static void task3() {
        isDeliveryTime(95);
    }

    public static void task4() {
        isSortWrong();
    }

    public static void task5() {
        isDoublesHere();
    }

}

