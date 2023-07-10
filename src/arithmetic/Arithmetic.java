public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double x = in.nextDouble();
        System.out.println("Enter the second number: ");
        double y = in.nextDouble();
        System.out.println("Enter the arithmetic operation (PLUS, MINUS, TIMES, DIVIDE): ");
        Operation operation = Operation.valueOf(in.next().toUpperCase());
        double result = r.calculate(x, y, operation);
        System.out.println("Result: " + result);
    }
}