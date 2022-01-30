package by.itacademy.calculator;

class Multiply implements Operation {

    @Override
    public double performCalculation(double x, double y) {
        return x * y;
    }

    @Override
    public String getSign() {
        return "*";
    }
}