package gr.aueb.cf.ch11;

public class CFMain {

    public static void main(String[] args) {
        CodingFactory cf = CodingFactory.getInstance();
        cf.sayHello();

        CodingFactory cf2 = CodingFactory.getInstance();
    }
}
