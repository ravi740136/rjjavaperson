package rj.java.staticperson;

import rj.java.person.domainx.Address;
import rj.java.person.domainx.Job;

public class Person {
    // Instance fields (specific to each object)
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private Address address;
    private Job job;

    // Static field (shared by all Person objects)
    private static int personCount = 0;

    
    public Person() {
    	// Increment person count when a new object is created
        personCount++;
    }
    // Constructor to initialize Person objects
    public Person(String name, int age, String email, String phoneNumber, Address address, Job job) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        
        // Increment person count when a new object is created
        personCount++;
    }

    // Static method to access person count
    public static int getPersonCount() {
        return personCount;
    }
    
    public static void addPersons() {
    	new Person();
    	new Person();
    	new Person();
    	System.out.println("Three persons added by the method");
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", email='" + email + "', phone='" + phoneNumber + "', address=" + address + ", job=" + job + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && email.equals(person.email);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + email.hashCode();
    }
    
    public static void resetPersonCount() {
        personCount = 0;
    }
}
