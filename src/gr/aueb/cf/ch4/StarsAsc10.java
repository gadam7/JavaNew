package gr.aueb.cf.ch4;

/**
 * Εμφανίζει 10 σειρές από αστεράκια σε αύξουσα σειρά, 1 αστεράκι στη 1η σειρά,
 * 2 στη 2η σειρά, κοκ, 10 αστεράκια στη 10η σειρά.
 */
public class StarsAsc10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
