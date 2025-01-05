package rj.java.person.domainx;
public class Job {
    private String title;
    private double salary;

    // Constructor
    public Job(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return title + " (Salary: $" + salary + ")";
    }
}
