package rj.java.abstractperson;
//Subclass (inherits from Person)
public class Employee extends Person {
 private double salary;
 private Department department;

 // Constructor chaining with super
 public Employee(String name, int age, double salary, Department department) {
     super(name, age);
     this.salary = salary;
     this.department = department;
 }

 public double calculateTotalSalary() {
     return salary + department.calculateBonus(5000);
 }

 // Overriding toString method
 @Override
 public String toString() {
     return "Name: " + name + ", Age: " + age + ", Salary: $" + calculateTotalSalary() + ", " + department;
 }
}