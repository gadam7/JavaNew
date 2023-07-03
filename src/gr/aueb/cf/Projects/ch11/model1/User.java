package gr.aueb.cf.Projects.ch11.model1;

/**
 * Represents a User.
 */
public class User {
    private long id;
    private String firstname;
    private String lastname;

    /**
     * Default constructor for the User class.
     */
    public User() {
    }

    /**
     * Overloaded constructor for the User class.
     *
     * @param id        the ID of the user.
     * @param firstname the firstname of the user.
     * @param lastname  the lastname of the user.
     */
    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Retrieves the ID of the user.
     *
     * @return the ID of the user.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the ID of the user.
     *
     * @param id the ID of the user.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Retrieves the first name of the user.
     *
     * @return the first name of the user.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the firstname of the user.
     *
     * @param firstname the firstname of the user.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Retrieves the lastname of the user.
     *
     * @return the lastname of the user.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the lastname of the user.
     *
     * @param lastname the lastname of the user.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
