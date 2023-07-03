package gr.aueb.cf.ch11;

/**
 * Creates an instance (alice) of type Student and has access to alice's state,
 * that is, alice's fields. Με τον τελεστή τελεία (dot notation) έχουμε πρόσβαση
 * στα public πεδία ενός instance.
 */
public class StudentApp {

    public static void main(String[] args) {
        StudentSimple alice = new StudentSimple();

        /**
         * Οι συγκεκριμένες τιμές των πεδίων ενός instance ονομάζεται:
         * το state του instance.
         */
        alice.id = 1;
        alice.firstname = "Alice";
        alice.lastname = "Wonderland";

        System.out.println("Id: " + alice.id);
        System.out.println("Firstname: " + alice.firstname);
        System.out.println("Lastname: " + alice.lastname);
    }
}
