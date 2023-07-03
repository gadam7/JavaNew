package gr.aueb.cf.ch11.staticfields;

/**
 * Η αρχικοποίηση της static variable γίνεται
 * όταν κληθεί ο constructor (lazy instantiation)
 */
public class LazyStatic {
    private static String s;

    public LazyStatic() {
        s = "AUEB";
    }

    public static  String getName() {
        return s;
    }
}
