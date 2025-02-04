class ownClass extends Exception {
    ownClass() {
        super("must be positive");
    }
}

public class ThrowThrowsDemo {
    static int area(int l, int b) throws ownClass {
        if (l < 0 || b < 0) {
            throw new ownClass();
        }
        return l * b;
    }

    static void meth1() throws ownClass {
        System.out.println(area(-5, 4));
    }

    public static void main(String args[]) {
        try {
            meth1();
        } catch (ownClass e) {
            System.out.println(e);
        }
    }
}
