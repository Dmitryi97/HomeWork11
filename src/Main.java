import java.time.LocalDate;

public class Main {
    //Метод_к_1_задаче
    static boolean isVerificationLeapYear(int year) {
        return year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    //Метод_к_2_задаче
    static void determineVersionApplication(int clientOS, int clientDeviceYear) {
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("ОС не определена");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        StringBuilder conclusion = new StringBuilder("Установите ");
        if (clientDeviceYear < currentYear) {
            conclusion.append("облегченную ");
        }
        conclusion.append("версию приложения для ");
        if (clientOS == 0) {
            conclusion.append("IOS");
        } else {
            conclusion.append("Android ");
        }
        System.out.println(conclusion);
    }

    //Метод_к_3_задаче
    static int determinуDaysDelivery(int deliveryDistance) {
        if (deliveryDistance < 20 && deliveryDistance > 0) {
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
        int year = 2024;
        if (isVerificationLeapYear(year)) {
            System.out.println(year + " год - високосный.");
        } else {
            System.out.println(year + " год - не високосный.");
        }

        //Задание2
        System.out.println("Задание2");
        //IOS=0
        //Android=1
        int clientOS = 1;
        int clientDeviceYear = 2024;
        determineVersionApplication(clientOS, clientDeviceYear);

        //Задание3
        System.out.println("Задание3");
        int deliveryDistance = 60;
        int deliveryDауs = determinуDaysDelivery(deliveryDistance);
        if (deliveryDауs != 0) {
            System.out.println("Колличество дней доставки: " + deliveryDауs);
        } else {
            System.out.println("Доставки нет!");
        }

    }
}