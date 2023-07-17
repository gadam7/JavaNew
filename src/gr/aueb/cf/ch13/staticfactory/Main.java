package gr.aueb.cf.ch13.staticfactory;

public class Main {

    public static void main(String[] args) {
        CodingFactory codingFactory = CodingFactory.getInstance();
        codingFactory.sayHello();
    }
}
