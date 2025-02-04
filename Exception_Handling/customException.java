import java.io.*;

class NegativeDimension extends Exception {
    public NegativeDimension(String s){
        super("hello");
    }
}

public class customException {
    static int area(int l, int b) throws NegativeDimension {
        if (l < 0 || b < 0) {
            throw new NegativeDimension("no negative dimensions");
        }
        int a = l * b;
        return a;
    }

    static void meth1() {
        try {
            int a = area(-10, 5);
            System.out.println(a);
        } catch (NegativeDimension e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        meth1();
    }
}
