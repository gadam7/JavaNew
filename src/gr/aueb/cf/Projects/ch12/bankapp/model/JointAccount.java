package gr.aueb.cf.Projects.ch12.bankapp.model;

/**
 * Represents a joint account with two holders.
 */
public class JointAccount extends Account {
    private String holder1;
    private String holder2;

    public JointAccount() {}

    public JointAccount(String iban, double balance, String holder1, String holder2) {
        super(iban, balance);
        this.holder1 = holder1;
        this.holder2 = holder2;
    }

    public String getHolder1() {
        return holder1;
    }

    public void setHolder1(String holder1) {
        this.holder1 = holder1;
    }

    public String getHolder2() {
        return holder2;
    }

    public void setHolder2(String holder2) {
        this.holder2 = holder2;
    }

    @Override
    public String toString() {
        return "JointAccount{" +
                "holder1='" + holder1 + '\'' +
                ", holder2='" + holder2 + '\'' +
                '}';
    }
}
