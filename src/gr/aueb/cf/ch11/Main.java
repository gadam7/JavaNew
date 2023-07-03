package gr.aueb.cf.ch11;

/**
 * Driver class. (θα χρησιμοποιήσει το Student)
 */
public class Main {

    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "D.");

        System.out.println(Student.getStudentsCount());

        //  Set
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(3);

        //  Get
        System.out.println("Id: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());

        System.out.println("Bob id: " + bob.getId());
        System.out.println("Bob firstname: " + bob.getFirstname());
        System.out.println("Bob lastname: " + bob.getLastname());
    }
}
