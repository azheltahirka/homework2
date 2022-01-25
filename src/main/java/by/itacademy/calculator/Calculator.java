package by.itacademy.calculator;

public class Calculator {

    public static void main(String[] args) {
        SelectOperation selectOperation = new SelectOperation();
        Calculate calculate = new Calculate(selectOperation);
        calculate.resultOperation();
    }
}
