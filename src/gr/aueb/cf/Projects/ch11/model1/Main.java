package gr.aueb.cf.Projects.ch11.model1;

/**
 * Main class to demonstrate the usage of User and UserCredentials classes.
 */
public class Main {
    /**
     * The entry point of the program.
     *
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // Create an instance of User using the overloaded constructor
        User user = new User(1L, "George", "Adamidis");

        // Create an instance of UserCredentials using the overloaded constructor
        UserCredentials userCredentials = new UserCredentials(1L, "georgeaueb", "123456");

        // Display the fields of the User instance
        System.out.println("User Fields: ");
        System.out.println("ID: " + user.getId());
        System.out.println("First Name: " + user.getFirstname());
        System.out.println("Last Name: " + user.getLastname());

        // Display the fields of the UserCredentials instance
        System.out.println("UserCredentials Fields: ");
        System.out.println("ID: " + userCredentials.getId());
        System.out.println("Username: " + userCredentials.getUsername());
        System.out.println("Password: " + userCredentials.getPassword());
    }
}
