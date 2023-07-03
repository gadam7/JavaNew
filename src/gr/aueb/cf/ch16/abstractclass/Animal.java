package gr.aueb.cf.ch16.abstractclass;

public abstract class Animal {
    private long id;
    private String name;

    public Animal() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak();

    public void eat() {
        System.out.print(this.getClass().getSimpleName());
    }

    @Override
    public abstract String toString();
}
