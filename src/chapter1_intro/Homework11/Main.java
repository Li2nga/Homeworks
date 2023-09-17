package chapter1_intro.Homework11;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printIsLeapYear(int year) {
        int yearException = 400;
        int yearException2 = 100;
        int yearException3 = 4;

        if (year % yearException == 0) {
            System.out.println("год  является високосным");
        } else if (year % yearException3 == 0 && year % yearException2 != 0) {
            System.out.println("год  является  високосным");
        } else {
            System.out.println("год не является  високосным");
        }
    }

    public static void printApplicationVersion(int clientOS, int clientDeviceYear) {

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для для Android по ссылке");
            }
        } else System.out.println("Операционная система не определена");
    }

    public static int printNumberDeliveryDays(int deliveryDistance) {

        int deliveryTime = 0;
        deliveryTime++;

        if (deliveryDistance >= 20) {
            deliveryTime++;
        }
        if (deliveryDistance >= 60) {
            deliveryTime++;
        }
        if (deliveryDistance > 100) {
            deliveryTime = -1;
        }
        return deliveryTime;
    }

    public static void task1() {
        System.out.println("Задача 1");
        printIsLeapYear(2021);
    }

    public static void task2() {
        System.out.println("Задача 2");
        printApplicationVersion(1, 2012);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int a = 1000;
        if (printNumberDeliveryDays(a) == -1) {
            System.out.println("доставки нет");
        } else {
            System.out.println("printNumberDeliveryDays(" + a + ") = " + printNumberDeliveryDays(a));
        }
    }
}