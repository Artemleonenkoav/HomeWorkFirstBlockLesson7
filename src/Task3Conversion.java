//Используя IntelliJ IDEA, создайте класс Conversion.
//Напишите программу, которая будет выполнять конвертирование валют.
//Пользователь вводит:
//сумму денег в определенной валюте,
//курс для конвертации в другую валюту.
//Организуйте вывод результата операции конвертирования валюты на экран.

import java.util.Scanner;

public class Task3Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter amount UAH ");
        double resaltAfter = sum(scanner.nextInt() / 40f);
        System.out.println( + resaltAfter + " USD conversion amount");
        System.out.println("Good Luck");
    }
    public static float sum (float value ){
        float result =  value;
        return result;
    }
}
