import java.util.Scanner;

public class EnterNumberOfOperation {

    public int enterNumberOfOperation() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("[1-4]")) {
            System.out.println("Wrong number of operation! Enter a number of Operation( +(1). -(2), *(3), /(4) )");
            scanner.next();
        }
        int operationNumber = scanner.nextInt();
        return operationNumber;
    }
}
