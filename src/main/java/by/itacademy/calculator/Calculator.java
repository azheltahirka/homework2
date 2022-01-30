package by.itacademy.calculator;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Enter a first number");
        double first = EnterNumber.enterNumber();
        System.out.println("Enter a second number");
        double second = EnterNumber.enterNumber();
        System.out.println("Enter a number of Operation( +(1), -(2), *(3), /(4) )");
        int operationNumber = EnterNumberOfOperation.enterNumberOfOperation();
        Calculate calculate = new Calculate();
        calculate.resultOperation(first, second, operationNumber);
    }
}
