package gr.aueb.cf.ch8;

/**
 * Null Pointer Exception
 */
public class NullPointerExceptionApp {

    public static void main(String[] args) {
//        String s = "A String";
        String s = null;

        if (s != null) {
            if (s.equals("Coding")) {
                System.out.println("Coding");
            } else {
                System.out.println("Not Equal");
            }
        } else {
            System.out.println("String is null");
        }

//        if (s.equals("Coding")) System.out.println("Coding");
    }
}
