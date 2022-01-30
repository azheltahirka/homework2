package by.itacademy.calculator;

class Addition implements Operation {

    @Override
    public double performCalculation(double x, double y) {
        return x + y;
    }

    @Override
    public String getSign() {
        return "+";
    }
}
