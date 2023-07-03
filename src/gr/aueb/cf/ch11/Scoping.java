package gr.aueb.cf.ch11;

public class Scoping {

    /**
     * Το ίδιο ισχύει και για το result και num1, num2 της main. Σημειωτέον, είναι άλλο το result της add και
     * άλλο το result της main. Αυτός ο τύπο εμβέλειας ονομάζεται lexical scoping γιατί μπορούμε να συνάγουμε
     * την εμβέλεια μίας μεταβλητής απλά από την ανάγνωση κώδικα.
     *
     * @param args
     */
    public static void main(String[] args) {
        int result;
        int num1 = 1;
        int num2 = 2;

        result = add(num1, num2);
        System.out.println(result);

        result = div(num1, num2);
        System.out.println(result);

    }

    /**
     * Αν έχουμε μία μέθοδο add, τότε το result, (αλλά και τα a, b) είναι τοπικές (local) μεταβλητές της μεθόδου
     * add. Αυτό σημαίνει πως έξω από την add δεν υπάρχουν αυτές οι μεταβλητές.
     *
     * @param a 1st int num1
     * @param b 2nd int num2
     * @return  result (num1 + num2)
     */
    private static int add(int a, int b) {  // Τα curly brackets {} των μεθόδων ορίζουν χώρους εμβέλειας (Local Scoping)
        int result;
        result = a + b;
        return result;
    }

    /**
     * Άλλο σημείο όπου μπορούμε να κάνουμε δηλώσεις μεταβλητών είναι μέσα σε δομές ελέγχου όπως
     * if, while, for.
     *
     * @param a num1
     * @param b num2
     * @return  result (num1 / num2)
     */
    private static int div(int a, int b) {
        int result = 0; // Ωστόσο, το result που είναι τοπική μεταβλητή της div έχει εμβέλεια σε όλο το scope της div,
                        // Άρα και μέσα στην if. Το scope της div είναι το outer scope, ενώ το scope της if είναι το
                        // inner scope
        if (b == 0) {
            boolean isZero = true;  // Στο παράδειγμα η εμβέλεια του isZero είναι μόνο μέσα στην if. Έξω από την if το
            System.out.println("is zero: " + isZero);   // isZero δεν υπάρχει, δεν μπορούμε να αναφερθούμε σε αυτό.
            return result;
            // Γενικά, στην περίπτωση που έχουμε nested scopes, οι μεταβλητές των outer scopes έχουν πρόσβαση στα
            // inned scopes, όχι όμως και το αντίθετο
        }

        return a / b;
    }
}
