package rj.java.abstractperson;
// Parent class (Base Class)
public class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString method to display information
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}