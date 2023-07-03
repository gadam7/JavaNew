package gr.aueb.cf.ch7;

/**
 * Η replace αντικαθιστά ένα χαρακτήρα με ένα άλλο ή ένα substring με ένα άλλο.
 */
public class ReplaceDeleteApp {

    public static void main(String[] args) {
        String firstname = "Maria-Helen";
        String simpleName;
        String nickname;
        String oneName;

        //  Replaces dash with whitespace
        simpleName = firstname.replace("-", " ");

        //  Replaces with empty string (string with length() == 0)
        //  Thus essentially deletes
        nickname = firstname.replace("-", " ");
        System.out.println(nickname);

        //  Replaces with empty string - Deletes
        oneName = firstname.replace("-Helen", " ");
        System.out.println(oneName);
    }
}
