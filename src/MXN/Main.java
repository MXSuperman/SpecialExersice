package MXN;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        // Задание 6

        int age = 19;
        int salary = 58_000;
        if (age <= 23 && salary >= 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.2 + " рублей");
        } else if (age > 23 && salary >= 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 1.2 + " рублей");
        } else if (age <= 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.5 + " рублей");
            if (age > 23 && salary >= 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 1.5 + " рублей");
            }
        }

// Задание 4 Циклы

        int power = 30;
        for (int i = 1; i <= power; i++) {
            System.out.println(i + ": ");
            if (i % 3 == 0) ;
            System.out.println(i + ": " + "ping ");
            if (i % 5 == 0)
                System.out.println(i + ": " + "pong ");
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + ": " + "ping pong ");
        }

        // Задание 5

        int number = 1;
        int number1 = 1;
        int number2;
        System.out.println(number1 + " ");
        for (int i = 3; i <= 11; i++) {
            number2 = number + number1;
            System.out.println(number2 + " ");
            number = number1;
            number1 = number2;
        }
        System.out.println();


        // Задание 7

        int old = 25;
        int money = 60_000;
        int wantedSum = 330_000;
        int dollarMonth;
        int maxMonthPayment = money / 2;
        double extraProc = 0.1;

        if (old < 23) {
            extraProc += 0.01;
            if (money >= 80_000) {
                extraProc -= 0.007;
            }
            dollarMonth = (int) (wantedSum * (extraProc + 1) / 12);
            if (dollarMonth > salary * 0.5) {
                System.out.println("Максимальный платеж при ЗП " + money + " равен " + maxMonthPayment + " рублей " + " Платеж по кредиту " + dollarMonth + " рублей. Отказано.");
            } else {
                System.out.println("Максимальный платеж при ЗП " + money + " равен " + dollarMonth + " рублей. " + " Платеж по кредиту " + maxMonthPayment + " рублей. Одобрено.");
            }
        }
        else if (23 <= old && old < 30) {
            extraProc += 0.005;
            if (money >= 80_000) {
                extraProc -= 0.007;
            }
            dollarMonth  = (int) (wantedSum * (extraProc + 1) / 12);
            if (dollarMonth > money * 0.5) {
                System.out.println("Максимальный платеж при ЗП " + money + " равен " + maxMonthPayment + " рублей. Платеж по кредиту " + dollarMonth + " рублей. Отказано.");
            } else {
                System.out.println("Максимальный платеж при ЗП " + money + " равен " + dollarMonth + " рублей. Платеж по кредиту " + maxMonthPayment + " рублей. Одобрено.");
            }
        }
            }
        }
