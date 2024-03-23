public class Main {
    public static void checkLeapYear(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
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
    }
}