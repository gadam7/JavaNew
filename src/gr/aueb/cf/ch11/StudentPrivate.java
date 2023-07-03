package gr.aueb.cf.ch11;

/**
 * Ορισμός μιας κλάσης StudentPrivate με
 * private πεδία (encapsulation).
 */
public class StudentPrivate {
    private int id;
    private String firstname;
    private String lastname;

    // Default Constructor
    public StudentPrivate() {}

    public StudentPrivate(int id, String firstname, String lastname) {
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
