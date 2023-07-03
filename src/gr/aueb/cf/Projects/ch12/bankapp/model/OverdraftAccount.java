package gr.aueb.cf.Projects.ch12.bankapp.model;

/**
 * Represents an overdraft account that allows withdrawals greater than the account balance.
 */
public class OverdraftAccount extends Account {
    private double overdraftLimit;

    public OverdraftAccount() {}

    public OverdraftAccount(String iban, double balance, double overdraftLimit) {
        super(iban, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double availableBalance = getBalance() + overdraftLimit;
        if (amount <= availableBalance) {
            double newBalance = getBalance() - amount;
            if (newBalance >= 0) {
                setBalance(newBalance);
            } else {
                setBalance(0);
                overdraftLimit += newBalance;
            }
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
