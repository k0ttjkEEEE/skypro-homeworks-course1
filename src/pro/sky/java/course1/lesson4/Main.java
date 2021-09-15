package pro.sky.java.course1.lesson4;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        int a = 0;
        while (a < 10) {
            a += 1;
            System.out.println(a);
        }
        int b = 11;
        while (b > 1) {
            b -= 1;
            System.out.println(b);

        }


    }

    public static void task2() {
        for (int i = 7; i < 31; i = i + 7) {
            System.out.println("Сегодня пятница " + i + " число, пора сдать отчет");
        }
    }

    public static void task3() {
        int now = 2021;
        for (int i = 1821; i < 2121; i++) {
            if (i % 79 == 0)
                System.out.println("В этот год комета пролетит " + i);

        }
    }

    public static void task4() {
        for (int i = 1; i <= 30; i++) {
            boolean three = i % 3 == 0;
            boolean five = i % 5 == 0;
            boolean threeFive = (i % 3 == 0 && i % 5 == 0);
            if (threeFive) {
                System.out.println(i + ": ping pong");
            } else if (three) {
                System.out.println(i + ": ping");
            } else if (five) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void task5() {
        int a = 0;
        int b = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print(a + " " + b + " ");
            a += b;
            b += a;

        }
    }
}
