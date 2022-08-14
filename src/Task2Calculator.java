//Используя IntelliJ IDEA, создайте класс Arithmetics.
//Создайте четыре метода для выполнения арифметических операций, с именами: add – сложение, sub –
//вычитание, mul – умножение, div – деление. Каждый метод должен принимать два целочисленных
//аргумента и выводить на экран результат выполнения арифметической операции соответствующей
//имени метода. Метод деления div, должен выполнять проверку попытки деления на ноль.
//Требуется предоставить пользователю возможность вводить с клавиатуры значения операндов и знак
//арифметической операции, для выполнения вычислений.

import java.util.Scanner;

// Ввод чисел с возможностью ввода знака арифметического.
public class Task2Calculator {
    public static void main(String[] args) {
        
        double ans;
        char op;
        int value = 5;
        int secondvalue = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers ");
        value = scanner.nextInt();
        secondvalue = scanner.nextInt();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = scanner.next().charAt(0);
        switch (op) {
            case '+':
                ans = value + secondvalue;
                break;
            case '-':
                ans = value - secondvalue;
                break;
            case '*':
                ans = value * secondvalue;
                break;
            case '/':
                ans = value / secondvalue;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(value + " " + op + " " + secondvalue + " = " + ans);
    }


//// Ввод чисел без возможности ввода знака арифметического.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter two numbers ");
//        float resultAfter = add(scanner.nextFloat(), scanner.nextFloat());
//        System.out.println("Result is " + resultAfter);
//    }

// СЛОЖЕНИЕ

    public static float add(float value, float secondvalue) {
        float result = value + secondvalue;
        return result;


    }
}

//вычитание
//    public static float sub(float value, float secondvalue) {
//        float result = value - secondvalue;
//        return result;
//    }

//    public static float mul(float value, float secondvalue) {
//        float result = value * secondvalue;
//        return result;
//    }

//ДЕЛЕНИЕ
//    public static float div(float value, float secondvalue) {
//            float result = value / secondvalue;
//            return result;
//        }
//    }

