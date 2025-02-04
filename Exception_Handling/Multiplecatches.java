class Multiplecatches {
    public static void main(String args[]) {
        int a[] = {50, 20, 30, 40, 0};
        try {
            int div = a[0] / a[3]; 
            System.out.println("Division is : " + div);
            try{
            System.out.println(a[8]); 
            }
            catch (ArrayIndexOutOfBoundsException p) {
                System.out.println("Array index out of size");
            }
        } catch (ArithmeticException p) {
            System.out.println("Denominator not equal to 0, try again");
        } 
        System.out.println("Bye");
    }
}
