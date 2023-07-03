package gr.aueb.cf.ch12;

public class AccountMain {

    public static void main(String[] args) {
        Account george = new Account(1, "GR123456", "George", "Adamidis", "G666", 1000);

        try {
            george.deposit(900);
            System.out.printf("Successful deposit");

            george.withdraw(500, "G666");
            System.out.println("Successful withdrawal");

            System.out.println("George account balance: " + george.getAccountBalance());
            System.out.println(george.getAccountState());

            george.withdraw(500, "T777");
            System.out.println("Successful withdrawal");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
