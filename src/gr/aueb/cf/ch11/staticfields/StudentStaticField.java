package gr.aueb.cf.ch11.staticfields;

/**
 * Άλλος τρόπος να αρχικοποιήσουμε ένα static variable
 * είναι μέσω ενός static block.
 */
public class StudentStaticField {
    private static int studentsCount;
    private String firstname;
    private String lastname;

    static {
        studentsCount = 0;
    }

    public StudentStaticField() {}


}
