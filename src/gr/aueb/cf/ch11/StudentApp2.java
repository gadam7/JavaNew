package gr.aueb.cf.ch11;

/**
 * Instantiates a Student (alice) and
 * sets values to instance's fields.
 */
public class StudentApp2 {

    public static void main(String[] args) {
        StudentPrivate alice = new StudentPrivate();

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        System.out.println("Id: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());
    }
}
