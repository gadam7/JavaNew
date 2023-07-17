package gr.aueb.cf.ch13.staticfactory;

/**
 * Defines a Singleton Coding Factory
 * with lazy instantiation.
 */
public class CodingFactoryLazy {
    private static CodingFactoryLazy SINGLETON = null;

    private CodingFactoryLazy() {}

    public static CodingFactoryLazy getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new CodingFactoryLazy();
        }
        return SINGLETON;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
