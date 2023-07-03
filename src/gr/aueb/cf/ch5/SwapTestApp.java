package gr.aueb.cf.ch5;

public class SwapTestApp {

    public static void main(String[] args) {
        IntWrapper a = new IntWrapper(10);
        IntWrapper b = new IntWrapper(20);
        swap(a, b);

        System.out.println("a = " + a.value + " b = " + b.value);

        IntWrapper c = new IntWrapper(10);
        IntWrapper d = new IntWrapper(20);
        swap(c, d);
        System.out.println("c = " + c.value + " d = " + d.value);
    }

    /**
     * Swaps a and b: a -> b, b -> a.
     *
     * @param a     the first value
     * @param b     the second value
     */
    public static void swap(IntWrapper a, IntWrapper b) {
        int tmp = a.value;
        a.value = b.value;
        b.value = tmp;
    }

    static class IntWrapper {
        int value;

        IntWrapper(int value) {
            this.value = value;
        }
    }
}
