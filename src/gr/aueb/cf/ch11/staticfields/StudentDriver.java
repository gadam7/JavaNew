package gr.aueb.cf.ch11.staticfields;

/**
 * Prints the Student-class instances' count.
 */
public class StudentDriver {

    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student();
        Student slipknot = new Student();

        /**
         * Παρατηρούμε πως τις static μεθόδους όπως η getStudentCount
         * τις καλούμε, όχι όπως τις instance methods, αλλά με το πρόθεμα
         * της κλάσης δηλαδή ως Student.getStudentsCount().
         */
        System.out.println(Student.getStudentsCount());
    }
}
