package gr.aueb.cf.ch11.staticfields;

/**
 * Τα static fields ανήκουν στην κλάση, όχι στα instances. Είναι σαν
 * global variables και διαμοιράζονται μεταξύ όλων των instances.
 *
 * Student static fields vs instance fields
 */
public class Student {
    private static int studentsCount = 0;
    private  int id;
    private String firstname;
    private String lastname;

    public Student() {
        studentsCount++;
    }

    public static  int getStudentsCount() {
        return studentsCount;
    }

    // Getters amd Setters

    public static void setStudentsCount(int studentsCount) {
        Student.studentsCount = studentsCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
