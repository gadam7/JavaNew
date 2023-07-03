package gr.aueb.cf.Projects.ch11.model1;

/**
 * Represents user credentials.
 */
public class UserCredentials {
    private long id;
    private String username;
    private String password;

    /**
     * Default constructor for the UserCredentials class.
     */
    public UserCredentials() {
    }

    /**
     * Overloaded constructor for the UserCredentials class.
     *
     * @param id       the ID of the user credentials.
     * @param username the username of the user.
     * @param password the password of the user.
     */
    public UserCredentials(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /**
     * Retrieves the ID of the user credentials.
     *
     * @return the ID of the user credentials.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the ID of the user credentials.
     *
     * @param id the ID of the user credentials.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Retrieves the username of the user.
     *
     * @return the username of the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the user.
     *
     * @param username the username of the user.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Retrieves the password of the user.
     *
     * @return the password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the user.
     *
     * @param password the password of the user.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}

