package by.itacademy.calculator;

public class Subtraction implements Operation {

    @Override
    public double performCalculation(double x, double y) {
        return x - y;
    }

    @Override
    public String getSign() {
        return "-";
    }
}
