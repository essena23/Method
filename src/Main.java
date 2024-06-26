public class Main {
    public static void checkLeapYear(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static void installApp(int mobileYear, int OS) {
        if (OS == 0 && mobileYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (OS == 0 && mobileYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (OS == 1 && mobileYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (OS == 1 && mobileYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (OS < 0 || OS > 1) {
            System.out.println("Такого приложения у нас нет");
        }
    }

    public static int countDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        }
        if (distance > 20 && distance <= 60) {
            return 2;
        }
        if (distance > 60 && distance <= 100) {
            return 3;
        }
        return -1;
    }


    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        checkLeapYear(3568);
        checkLeapYear(1574);
        checkLeapYear(2000);
        checkLeapYear(20100);
        //task 2
        System.out.println("task 2");
        installApp(2016, 0);
        installApp(3210, 2);
        installApp(2013, 1);
        //task 3
        System.out.println("task 3");
        System.out.println("Потребуется дней: " + countDeliveryDays(100));

    }
}