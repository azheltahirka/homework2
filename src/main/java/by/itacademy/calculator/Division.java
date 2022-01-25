package by.itacademy.calculator;

public class Division implements Operation {

    @Override
    public double performCalculation(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Division by 0");
        }
        return x / y;
    }

    @Override
    public String getSign() {
        return "/";
    }
}
