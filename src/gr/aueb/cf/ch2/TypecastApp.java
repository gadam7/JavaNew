package gr.aueb.cf.ch2;

public class TypecastApp {

    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;
        long result = 0L;

        num1 = (int) num2; //τα typecast είναι error prone, να τα αποφεύγουμε.

        result = (long) num1 + num2; //περιττό μετατρέπεται αυτόματα
    }
}
