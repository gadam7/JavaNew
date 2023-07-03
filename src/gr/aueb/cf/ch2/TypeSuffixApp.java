package gr.aueb.cf.ch2;

/**
 * Type suffix demo.
 */
public class TypeSuffixApp {

    public static void main(String[] args) {
        /**
         * int literals are integers (32-bit)
         * by default. In order to typecast to
         * long we have to insert a type suffix L or l.
         */
        long num1 = 20L;
        long num2 = 2147483684L;

        /**
         * For short and byte data types
         * no type-suffixes are provided.
         */
        short num3 = 12;
        byte b1 = 2;

        int num4 = 10;
        System.out.print(num4); //Prints 10
        System.out.println(num4); //Prints 10 and leaves an
                                  // empty row
        System.out.printf("%d", num4); //Prints 10, %d means int and is replaced by 10
    }
}
