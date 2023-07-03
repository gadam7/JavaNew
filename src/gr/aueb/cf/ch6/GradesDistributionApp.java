package gr.aueb.cf.ch6;

/**
 * Λαμβάνει ως input ένα πίνακα βαθμολογιών (ακεραίων
 * από 0 - 100) και εμφανίζει την κατανομή των βαθμών
 * σε ένα chart.
 */
public class GradesDistributionApp {

    public static void main(String[] args) {
        int[] grades = {30, 9, 8, 14, 17, 12, 22, 44, 57, 59, 60, 61, 68, 28, 29, 21, 34, 44, 46, 47, 48, 49, 55, 67,
                        77, 72, 75, 80, 85, 93, 91, 69, 89, 90 ,95, 100};
        int[] count = new int[10];

        for (int grade : grades) {
            if (grade == 100) count[9]++;
            else {
                count[grade / 10] += 1;
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.printf("%2d - %2d: ", i * 10, (i != 9) ? (i * 10 + 9) : (i * 10 + 10));
            for (int j = 1; j <= count[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
