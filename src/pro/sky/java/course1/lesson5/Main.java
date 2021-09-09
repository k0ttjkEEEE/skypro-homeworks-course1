package pro.sky.java.course1.lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();

        task2();

        task3();

        task4();

//        task5();

    }

    private static void task1() {
        int[] daysInMonth = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            sum += daysInMonth[i];
        }
        System.out.println("Общая сумма составляет " + sum + " рублей");
    }

    private static void task2() {
        int[] daysInMonth = generateRandomArray();
        int sum = 0;
        for (int j : daysInMonth) {
            sum += j;
        }
        System.out.println("Средняя сумма ежемесячных затрат составляет " + sum / 30 + " рублей");
    }

    private static void task3() {
        int[] daysInMonth = generateRandomArray();
        int sum = 0;
        int maxSum = 99_000;
        int minSum = 201_000;
        for (int j : daysInMonth) {
            if (j > maxSum) {
                maxSum = j;
            } else if (j < minSum) {
                minSum = j;
            }
        }
        System.out.println("Максимальная сумма затрат " + maxSum + " рублей");
        System.out.println("Минимальная сумма затрат " + minSum + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
        System.out.println();
    }

//    public static void task5() {
//        int[][] gameField = new int[3][3];
//        for (int[] row : gameField) {
//            for (int column : row) {
//                gameField[0][0] = 3;
//                gameField[0][2] = 3;
//                gameField[1][1] = 3;
//                gameField[2][2] = 3;
//                gameField[2][0] = 3;
//                System.out.print(column + " ");
//            }
//            System.out.println();
        }










