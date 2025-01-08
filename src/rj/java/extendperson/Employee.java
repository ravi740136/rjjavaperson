package rj.java.extendperson;
// Subclass (inherits from Person)
public class Employee extends Person {
    private double salary;

    // Constructor chaining with super
    public Employee(String name, int age, double salary) {
        super(name, age);  // Call to superclass constructor
        this.salary = salary;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: $" + salary;
    }
}