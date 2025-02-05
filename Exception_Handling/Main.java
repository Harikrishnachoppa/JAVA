public class Main {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred:");
            e.printStackTrace();
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
