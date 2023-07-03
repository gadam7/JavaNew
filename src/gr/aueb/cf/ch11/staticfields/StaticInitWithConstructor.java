package gr.aueb.cf.ch11.staticfields;

public class StaticInitWithConstructor {
    private static String s;

    /**
     * Τόσο οι static μεταβλητές όσι και τα static blocks
     * εκτελούνται όταν φορτώνεται η κλάση στη μνήμη και
     * όχι όταν κάνουμε instantiate ένα instance της κλάσης.
     *
     * Μπορούμε ωστόσο να αρχικοποιήσουμε και μέσα στον
     * Constructor αν το static variable δεν είναι final.
     *
     */
    public StaticInitWithConstructor() {
        s = "AUEB";
    }
}
