import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2021;
        if (checkIfTheYearIsLeap(year)) {
            System.out.println(year + " год — високосный год");
        }
        else {
            System.out.println(year + " год — невисокосный год");
        }
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2023;
        chooseTheVersionOfApp(clientOS, clientDeviceYear);
        System.out.println("Задача 3");
        int deliveryDistance = 100;
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + calculateDeliveryDate(deliveryDistance));
        }
        else {
            System.out.println("Доставки нет");
        }
    }
    public static boolean checkIfTheYearIsLeap (int year) {
        if (year % 400 == 0) {
            return true;
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void chooseTheVersionOfApp(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int calculateDeliveryDate(int deliveryDistance) {
        int deliveryDate = 1;
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDate += 2;
            return deliveryDate;
        }
        else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryDate += 1;
            return deliveryDate;
        }
        else {
            return deliveryDate;
        }
    }
}