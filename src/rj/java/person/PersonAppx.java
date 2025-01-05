package rj.java.person;

import rj.java.person.domainx.Address;
import rj.java.person.domainx.Job;
import rj.java.person.domainx.Personx;

public class PersonAppx {
	public static void main(String[] args) {
        Address address1 = new Address("123 Oak St", "Metropolis", "NY", "10001");
        Job job1 = new Job("Software Engineer", 90000);

        Personx person1 = new Personx("John Doe", 30, "john@example.com", "123-456-7890", address1, job1);
        Personx persondup = new Personx("John Doe", 30, "john@example.com", "123-456-7890", address1, job1);
        // Print person details
        System.out.println(person1);

        // Create another person for comparison
        Address address2 = new Address("456 Pine St", "Gotham", "IL", "60601");
        Job job2 = new Job("Data Scientist", 95000);
        Personx person2 = new Personx("Jane Smith", 28, "jane@example.com", "987-654-3210", address2, job2);

        System.out.println(person2);

        // Test equals method
        System.out.println("Is person1 equal to person2? " + person1.equals(person2));
        System.out.println("Is person1 equal to persondup? " + person1.equals(persondup));
    }

}
