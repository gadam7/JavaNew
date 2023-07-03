package gr.aueb.cf.ch11.staticfields;

/**
 * Αν αρχικοποιήσουμε στο static variable, η αρχικοποίηση
 * εκτελείται όταν φορτωθεί η κλάση (eager instantiation)
 */
public class EagerStatic {
    private final static String name = "AUEB";

    public EagerStatic() {
    }

    public static String getName() {return name;}
}
