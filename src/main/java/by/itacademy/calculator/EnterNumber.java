package by.itacademy.calculator;

import java.util.Scanner;

public class EnterNumber {

    public static double enterNumber() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            System.out.println("Not a number! Enter a number");
            scanner.next();
        }
        double number = scanner.nextDouble();
        return number;
    }
}
