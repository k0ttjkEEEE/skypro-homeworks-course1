package pro.sky.java.course1.lesson5;

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

        task5();

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
        int[] expencesInMonth = generateRandomArray();
        int sum = 0;
        for (int j : expencesInMonth) {
            sum += j;
        }
        System.out.println("Средняя сумма ежемесячных затрат составляет " + sum / expencesInMonth.length + " рублей");
    }

    private static void task3() {
        int[] expencesInMonth = generateRandomArray();
        int max = expencesInMonth[0];
        int min = expencesInMonth[1];
        for (int j : expencesInMonth) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }
        System.out.println("Максимальная сумма затрат " + max + " рублей");
        System.out.println("Минимальная сумма затрат " + min + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
        System.out.println();
    }

    public static void task5() {
        int[][] gameField = new int[3][3];
        for (int i = 0; i < gameField.length; i++) {
            gameField[i][i] = 1;
            gameField[gameField.length - i - 1][i] = 1;
        }
        for (int[] row : gameField) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}













