package rj.java.person.domain;
public class Person {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    // Constructor
    public Person(String name, int age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Override toString to provide string representation of the object
    @Override
    public String toString() {
        return "Person{name='" + name + '\'' +
               ", age=" + age +
               ", email='" + email + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
               '}';
    }

    // Override equals to compare based on name and email
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && email.equals(person.email);
    }

    // Optional - HashCode to ensure consistency with equals
    @Override
    public int hashCode() {
        return name.hashCode() + email.hashCode();
    }
}
