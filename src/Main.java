import java.time.LocalDate;

public class Main {
    //Метод_к_1_задаче
    public static void verificationLeapYear(int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }

    //Метод_к_2_задаче
    public static void determineVersionApplication(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear >= currentYear) {
            System.out.println(clientOS == 0 ? "Установиите версию приложения для IOS по ссылке." : "Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println(clientOS == 0 ? "Установиите облегченную версию приложения для IOS по ссылке." : "Установите облегченную версию приложения для Android по ссылке.");
        }
    }

    //Метод_к_3_задаче
    public static int determinationDaysDeliveryOfDistance(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задание1
        System.out.println("Задание1");
        int year = 2021;
        verificationLeapYear(year);

        //Задание2
        System.out.println("Задание2");
        //IOS=0
        //Android=1
        int clientOS = 0;
        int clientDeviceYear = 2015;
        determineVersionApplication(clientOS, clientDeviceYear);

        //Задание3
        System.out.println("Задание3");
        int deliveryDistance = 60;
        if (determinationDaysDeliveryOfDistance(deliveryDistance) == 1) {
            System.out.println("Потребуется дней: " + determinationDaysDeliveryOfDistance(deliveryDistance));
        } else if (determinationDaysDeliveryOfDistance(deliveryDistance) == 2) {
            System.out.println("Потребуется дней: " + determinationDaysDeliveryOfDistance(deliveryDistance));
        } else if (determinationDaysDeliveryOfDistance(deliveryDistance) == 3) {
            System.out.println("Потребуется дней: " + determinationDaysDeliveryOfDistance(deliveryDistance));
        } else if (determinationDaysDeliveryOfDistance(deliveryDistance) == 0) {
            System.out.println("Доставки нет.");
        }
    }
}