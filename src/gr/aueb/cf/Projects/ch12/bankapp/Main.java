package gr.aueb.cf.Projects.ch12.bankapp;

import gr.aueb.cf.Projects.ch12.bankapp.model.Account;
import gr.aueb.cf.Projects.ch12.bankapp.model.OverdraftAccount;
import gr.aueb.cf.Projects.ch12.bankapp.model.JointAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("G12345", 1000.0);
        account.withdraw(2000.0);
        System.out.println("Account Balance: " + account.getBalance());

        OverdraftAccount overdraftAccount = new OverdraftAccount("G67890", 1000.0, 500.0);
        overdraftAccount.withdraw(1500.0);
        System.out.println("Overdraft Account Balance: " + overdraftAccount.getBalance());

        JointAccount jointAccount = new JointAccount("G13579", 2000.0, "George Adamidis", "Thomas Adamidis");
        System.out.println("Joint Account Holders: " + jointAccount.getHolder1() + ", " + jointAccount.getHolder2());
    }
}
