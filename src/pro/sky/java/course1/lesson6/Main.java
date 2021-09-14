package pro.sky.java.course1.lesson6;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
//        task6();
//        String phone = "9267711381";
//        phone = phone.replace("-", "");
//        phone = phone.replace(" ", "");
//        phone = phone.replace("+", "");
//        phone = phone.replace("(", "");
//        phone = phone.replace(")", "");
//        if (phone.length() < 10) {
//            throw new RuntimeException("Phone is too short");
//        }
//        if (phone.length() > 11) {
//            throw new RuntimeException("Phone is too long");
//        }
//        if (phone.length() == 11 && phone.charAt(0) != '7') {
//            throw new RuntimeException("Impostor among us");
//        }
//        if (phone.length() == 10) {
//            phone = "7" + phone;
//        }
//        System.out.println("phone = " + phone);
//        String expectedPhone = "79267711381";
//        if (phone.equals(expectedPhone)) {
//            System.out.println("succes");
//        } else {
//            System.out.println("failure");
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника " + fullName);
    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО для заполнения отчета " + fullName);
    }

    public static void task3() {
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.replace(" ", ";");
        System.out.println("Данные ФИО для административного отдела " + fullName);
    }

    public static void task4() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replaceAll("ё", "е");
        System.out.println(fullName);
//        Открыл подсказку когда уже решил, надеюсь так тоже можно было.
    }

    public static void task5() {
        String fullName = "Джавинский Программист Разработчикович";
        String lastName = fullName.substring(0, fullName.indexOf(" "));
        String firstName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
        String middleName = fullName.substring(fullName.lastIndexOf(" "), fullName.lastIndexOf(""));
        System.out.println(lastName + firstName + middleName);
    }

//    public static void task6() {
//        String fullName = "ivanov ivan ivanovich";
//        char[] nameIs = fullName.toCharArray();
//        for (int i = 0; i < nameIs.length; i++) {
//            System.out.println("Element " + i + nameIs[i]);
//    дальше не соображу...
}




