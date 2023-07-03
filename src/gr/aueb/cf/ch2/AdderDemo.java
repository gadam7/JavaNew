package gr.aueb.cf.ch2;

public class AdderDemo {

    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση Μεταβλητών
        int num1 = 10;
        int num2 = 20;
        int sum = 0;

        //Εντολές
        sum = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Το άθροισμα των " + num1 + " και " + num2 + " είναι " + sum);
        System.out.printf("Το άθροισμα των %d και %d είναι %d", num1, num2, sum);
    }
}
