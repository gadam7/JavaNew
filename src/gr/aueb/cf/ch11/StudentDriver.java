package gr.aueb.cf.ch11;

/**
 * Creates a StudentSimple instance named alice.
 *
 * Instantiates two Students (alice & bob) with
 * Default and Overloaded Constructors, respectively.
 */
public class StudentDriver {

    /**
     * Δηλώσαμε στη main ένα αντικείμενο / instance με όνομα alice τύπου StudentSimple. Οι μεταβλητές κλάσεων
     * ονομάζονται αντικείμενα ή στιγμιότυπα (objects or instances) της κλάσης.
     * Η δήλωση του alice γίνεται όπως η δήλωση όλων των μεταβλητών ενώ η δημιουργία του instance με όνομα alice
     * γίνεται με τη new η οποία καλεί τη μέθοδο StudentSimple() που ονομάζεται κατασκευαστής ή δημιουργός (constructor)
     * και έχει το ίδιο όνομα με την κλάση (παρατηρήστε ότι έχει παρενθέσεις, άρα είναι μέθοδος).
     * Ο constructor όταν δεν έχει τυπικές παραμέτρους (non-argument constructor) όπως ο StudentSimple() ονομάζεται
     * default constructor και παρέχεται αυτόματα από τη Java.
     *
     * @param args
     */
    public static void main(String[] args) {
        // StudentSimple alice -- όπου δηλώνει την αναφορική μεταβλητή alice και κατανέμει χώρο για αυτήν στο stack
        // της μνήμης. Αυτό γίνεται κατά το χρόνος μεταγλώττισης (στατική δέσμευση)
        // = new StudentSimple(); -- όπου κατανέμει χώρο στο heap για το πραγματικό αντικείμενο (instance) και
        // επιστρέφει ένα δείκτη (διεύθυνση μνήμης) στο alice. Το new γίνεται κατά το χρόνο εκτέλεσης (δυναμική
        // δέσμευση).
        StudentSimple alice = new StudentSimple();
        StudentSimple bob = new StudentSimple(2, "Bob", "Marley");

        alice.setId(1);
        alice.setFirstname("Alice"); // default constructor
        alice.setLastname("Wonderland"); // overloaded constructor

        System.out.println("ID: " + alice.getId());
        System.out.println("First Name: " + alice.getFirstname());
        System.out.println("Last Name: " + alice.getLastname());

        System.out.println("ID: " + bob.getId());
        System.out.println("First Name: " + bob.getFirstname());
        System.out.println("Last Name: " + bob.getLastname());
    }
}
