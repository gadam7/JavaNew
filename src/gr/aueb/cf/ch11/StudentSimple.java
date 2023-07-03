package gr.aueb.cf.ch11;

/**
 * Ορισμός μιας απλής κλάσης Student. Η κλάση StudentSimple περιέχει τρία πεδία (fields), διαφόρων απλών
 * και σύνθετων τύπων (int και String). Ωστόσο, δεν έχουμε χαρακτηρισμό ορατότητας (visibility/scoping)
 * για τα πεδία, αν δηλαδή τα πεδία είναι public, private κλπ. Η κλάση StudentSimple επέχει θέση τύπου
 * δεδομένων και αφού οριστεί (μέσα σε ένα αρχείο StudentSimple.java), μπορούμε στη συνέχεια να ορίσουμε
 * μεταβλητές αυτής της κλάσης μέσα σε άλλες κλάσεις, όπως σε μία κλάση ποθ περιέχει μόνο τη main.
 */
public class StudentSimple {    // Default Constructor
    public int id;
    public String firstname;
    public String lastname;

    /**
     * Σκοπός των constructors είναι να αρχικοποιήσουν τα πεδία της κλάσης και το instance σε ένα αρχικό state,
     * παρέχεται και ένας constructor, δηλαδή μία μέθοδος με ίδιο όνομα με την κλάση. Ο συγκεκριμένος constructor
     * δεν έχει παραμέτρους και αρχικοποιεί τα πεδία σε default τιμές.
     */
    public StudentSimple() {
        id = 0;
        firstname = null;
        lastname = null;
    }

    public StudentSimple(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
