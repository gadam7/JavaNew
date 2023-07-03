package gr.aueb.cf.ch7;

/**
 * Identical strings are stored only once, that is,
 * strings are interned in a special heap area called
 * String Constant Pool (SCP).
 */
public class StringConstantPool {

    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = "Coding Factory";
        String s3 = new String("Coding Factory");
        String s4 = new String("CF");
    }
}
