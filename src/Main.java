public class Main {
    public static void main(String[] args) {

        //Task 1.1
        System.out.println("Задание 1.1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Task 1.2
        System.out.println("Задание 1.2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Task 1.3
        System.out.println("Задание 1.3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        //Task 1.4
        System.out.println("Задание 1.4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Task 2.1
        System.out.println("Задание 2.1");
        for (int year = 1904; year <= 2096; year = year + 4) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }

        //Task 2.2
        System.out.println("Задание 2.2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Task 2.3
        System.out.println("Задание 2.3");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Task 3.1
        System.out.println("Задание 3.1");
        int monthlyFee = 29000;
        int total = 0;
        for (int i = 1; i <=12; i++) {
            total = total + monthlyFee;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        //Task 3.2
        System.out.println("Задание 3.2");
        total = 0;
        for (int i = 1; i <=12; i++) {
            total = total + total/100;
            total = total + monthlyFee;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}