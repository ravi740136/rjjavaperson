package rj.java.abstractperson;

public class Main {
    public static void main(String[] args) {
        // Create Person object
        Person person = new Person("John Doe", 45);
        System.out.println(person);

        // Create ITDepartment object
        ITDepartment itDept = new ITDepartment("Technology", 5);

        // Create Employee object with department
        Employee employee = new Employee("Jane Smith", 30, 80000, itDept);
        System.out.println(employee);

        // Create UndergraduateProgram object
        UndergraduateProgram ugProgram = new UndergraduateProgram("Computer Science", 120);

        // Create Student object with program and credits
        Student student = new Student("Mike Johnson", 20, "Computer Science", ugProgram, 130);
        System.out.println(student);
    }
}