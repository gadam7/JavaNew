package gr.aueb.cf.ch1;

import gr.aueb.cf.ch1.model.Point;
import gr.aueb.cf.ch11.HelloUtil;

import static java.lang.Math.abs;
import java.util.Scanner;


/**
 * Είναι τεκμηρίωση, εκτυπώνει <b>Hello World!</b> στο
 * standard output (κονσόλα).
 * Defines a {@link HelloWorld} type.
 * @author adminmacbook
 * @version 1.0
 * @since 0.1
 */
public class HelloWorld {

    private Scanner sc = new Scanner(System.in);
    private Point point;
    private String s;

    public static void main(String[] args) {

        int abs = abs(-3);
        // Prints Hello World
        HelloUtil.sayHello();
        System.out.println("Hello World!");
    }
}
