public class SelectOperation implements Operations {
    public Operation operation;

    @Override
    public Operation getOperation(int x) {
        switch (x) {
            case 1: {
                operation = new Addition();
                break;
            }
            case 2: {
                operation = new Subtraction();
                break;
            }
            case 3: {
                operation = new Multiply();
                break;
            }
            case 4: {
                operation = new Division();
                break;
            }
        }
        return operation;
    }
}
