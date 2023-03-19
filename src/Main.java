public class Main {
    public static void main(String[] args) {
        int year = 2021;
        printMessage(year);
        printLink(1,2018);
        printDeliveryDays(95);

    }

    private static void printMessage(int year) {
        if (isYearLeap(year)) {
            System.out.println(year+ " год - является високосным");
        } else {
            System.out.println(year+ " год - является невисокосным");
        }
    }



    public static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void printLink(int os, int year) {
        if (os == 0) {
            if (year >= 2015) {
                System.out.println("Обычное приложение для iOs");
            } else {
                System.out.println("Облегченное приложение для iOs");
            }
        } else {
            if (year >= 2015) {
                System.out.println("Обычное приложение для Android");
            } else {
                System.out.println("Облегченное приложение для Android");
            }
        }
    }

    private static void printDeliveryDays(int distance) {
        int deliveryDistance = delivery(distance);
        if (deliveryDistance < 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDistance + " срок доставки.");

        }
    }

    private static int delivery(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance < 100) {
            return 3;
        } else {
            return -1;
        }
    }
}
