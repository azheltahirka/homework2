package by.itacademy.calculator;

class Calculate {

    private SelectOperation selectOperation = new SelectOperation();

    public void resultOperation(double x, double y, int i) {
        try {
            System.out.println(x + " " + selectOperation.getOperation(i).getSign() + " " + y + " = " + selectOperation.getOperation(i).performCalculation(x, y));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
