package gr.aueb.cf.ch2;

/**
 * Prints integers and text
 *
 * @author adminmacbook
 * @version 1
 */
public class IntPrintDemo {

    public static void main(String[] args) {

        int i = 12;

        System.out.print(i);
        System.out.println(i);
        System.out.printf("%d", i);

        System.out.print("The value of i is: " + i);
        System.out.println("The value of i is: " + i);
        System.out.printf("The value of is: %d", i);
    }
}
