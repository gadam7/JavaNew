package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyApp {

    public static void main(String[] args) {
        String passwordFile = "george:1234;dimitra:4567;maria:8907;";

        Pattern pattern = Pattern.compile(".*?;");  // Reluctant
        Matcher matcher = pattern.matcher(passwordFile);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
