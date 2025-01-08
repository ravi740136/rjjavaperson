package rj.java.extendperson;
// Another Subclass
public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Major: " + major;
    }

    // Overloading method to accept different parameters
    public String toString(String message) {
        return message + ": " + toString();
    }
}