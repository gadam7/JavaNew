package gr.aueb.cf.ch12;

/**
 * Η κλάση Account περιέχει πεδία για το id, iban, firstname,
 * lastname, social security number & balance.
 */
public class Account {

    // Τα πεδία της κλάσης είναι όλα private λόγω ενθυλάκωσης
    private int id;     // Το id λειτουργεί ώς surrogate key (unique identifier)
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    // Default Constructor
    public Account() {}

    // Overloaded Constructor
    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    // Setters & Getters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
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
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Service Layer, Public API

    /**
     * Deposits a zero or positive amount of money
     * to account's balance
     *
     * @param amount    the amount of money to be deposited
     * @throws Exception    if the amount is negative
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount >= 0) {
                balance += amount;
            } else {
                throw new Exception("Negative amount exception");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws a certain amount of money from
     * account's balance based on a ssn number
     *
     * @param amount    the amount to be withdrawn
     * @param ssn       the social security number
     * @throws Exception    if the amount is greater than account's balance
     *                  of is ssn is not valid
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) throw new Exception("Ssn not valid exception");
            if (amount <= balance) {
                balance -= amount;
            } else {
                throw new Exception("Insufficient balance exception");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Checks if the provided social security number (ssn) is valid.
     *
     * @param ssn the social security number to be validated.
     * @return {@code true} if the provided ssn is valid, {@code false} otherwise.
     */
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }

    /**
     * Returns the account's balance
     *
     * @return  the account's balance
     */
    public double getAccountBalance() { // Η getAccountBalance ανήκει στο public API
        // Χρησιμοποιεί τον getter του balance και επιστρέφει το υπόλοιπο του λογαριασμού
        return getBalance();
    }

    /**
     * Returns the account state in String format
     *
     * @return the account state in String format.
     */
    public String getAccountState() {
        return "(" + id + ", " + iban + ", " + firstname + ", " + lastname + ", " + ssn + ", " + balance + ")";
    }
}
