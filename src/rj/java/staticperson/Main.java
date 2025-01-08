package rj.java.staticperson;

import rj.java.person.domainx.Address;
import rj.java.person.domainx.Job;

public class Main {
	public static void main(String[] args) {
		Address address1 = new Address("123 Oak St", "Metropolis", "NY", "10001");
		Job job1 = new Job("Software Engineer", 90000);

		Person person1 = new Person("John Doe", 30, "john@example.com", "123-456-7890", address1, job1);

		Address address2 = new Address("456 Pine St", "Gotham", "IL", "60601");
		Job job2 = new Job("Data Scientist", 95000);

		Person person2 = new Person("Jane Smith", 28, "jane@example.com", "987-654-3210", address2, job2);

		// Print details of both persons
		System.out.println(person1);
		System.out.println(person2);

		// Access static field (total number of Person objects)
		System.out.println("Total number of persons created: " + Person.getPersonCount());
		Person.addPersons();
		System.out.println("After calling addPersons, Total number of persons created: " + Person.getPersonCount());
		Person.resetPersonCount();
		System.out.println("After calling reset, Total number of persons created: " + Person.getPersonCount());

	}
}
