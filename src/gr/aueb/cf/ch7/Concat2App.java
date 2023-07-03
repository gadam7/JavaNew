package gr.aueb.cf.ch7;

public class Concat2App {

    public static void main(String[] args) {
        String firstname = "Georgios";
        String lastname = "Adamidis";
        String title = "Mr.";
        String fullName1, fullName2, fullName3, fullName4;

        //  + operator is overloaded in Java.
        //  When applied to strings is considered concat
        fullName1 = firstname + lastname;
        fullName2 = title + firstname + lastname;

        fullName3 = firstname.concat(lastname);
        fullName4 = title.concat(firstname).concat(lastname);   // method chain

        System.out.printf("Firstname: %s, Lastname: %s", firstname, lastname);
        System.out.printf("Full name 1: %s", fullName1);
        System.out.printf("Full name 2: %s", fullName2);
        System.out.printf("Full name 3: %s", fullName3);
        System.out.printf("Full name 4: %s", fullName4);
    }
}
