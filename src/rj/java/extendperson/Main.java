package rj.java.extendperson;
// Main class to demonstrate inheritance
public class Main {
    public static void main(String[] args) {
        // Create Person object
        Person person = new Person("John Doe", 45);
        System.out.println(person);

        // Create Employee object
        Employee employee = new Employee("Jane Smith", 30, 80000);
        System.out.println(employee);

        // Create Student object
        Student student = new Student("Mike Johnson", 20, "Computer Science");
        System.out.println(student);
        
        // Overloaded method call
        System.out.println(student.toString("Student Details"));
    }
}