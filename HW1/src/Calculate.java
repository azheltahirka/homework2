class Calculate {
    public SelectOperation selectOperation;

    public Calculate(SelectOperation selectOperation) {
        this.selectOperation = selectOperation;
    }

    public void resultOperation() {
        EnterNumber enterNumber = new EnterNumber();
        EnterNumberOfOperation enterNumberOfOperation = new EnterNumberOfOperation();
        System.out.println("Enter a first number");
        double first = enterNumber.enterNumber();
        System.out.println("Enter a second number");
        double second = enterNumber.enterNumber();
        System.out.println("Enter a number of Operation( +(1). -(2), *(3), /(4) )");
        int operationNumber = enterNumberOfOperation.enterNumberOfOperation();
        Operation operation = selectOperation.getOperation(operationNumber);
        try {
            System.out.println(first + " " + operation.getSign() + " " + second + " = " + operation.performCalculation(first, second));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
