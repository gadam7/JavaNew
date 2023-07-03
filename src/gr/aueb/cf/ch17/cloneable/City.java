package gr.aueb.cf.ch17.cloneable;

import java.util.Objects;

public class City implements Cloneable {
    private String name;

    public City() {}

    public City(String name) {
        this.name = name;
    }

    //  Copy constructor
    public City(City city) {
        this.name = city.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone(); // Object.clone()
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(getName(), city.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
