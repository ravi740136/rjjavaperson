package rj.java.person.domainx;
public class Personx {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private Address address;  // Composition: Person "has a" Address
    private Job job;          // Composition: Person "has a" Job

    // Constructor
    public Personx(String name, int age, String email, String phoneNumber, Address address, Job job) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }

    // Getters and Setters
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + '\'' +
               ", age=" + age +
               ", email='" + email + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
               ", address=" + address +
               ", job=" + job +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personx person = (Personx) o;
        return name.equals(person.name) && email.equals(person.email);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + email.hashCode();
    }
}

