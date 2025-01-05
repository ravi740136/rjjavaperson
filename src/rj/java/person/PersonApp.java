package rj.java.person;

import rj.java.person.domain.Person;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30, "john@example.com", "123-456-7890");
        Person person2 = new Person("John Doe", 30, "john@example.com", "123-456-7890");
        Person person3 = new Person("Alice Smith", 28, "alice@example.com", "987-654-3210");

        // Testing toString
        System.out.println(person1);

        // Testing equals
        System.out.println(person1.equals(person2));  // true
        System.out.println(person1.equals(person3));  // false
    }
}
