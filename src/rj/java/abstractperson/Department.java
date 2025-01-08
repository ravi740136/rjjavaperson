package rj.java.abstractperson;
abstract class Department {
    protected String departmentName;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    // Abstract method
    public abstract int calculateBonus(int baseBonus);

    @Override
    public String toString() {
        return "Department: " + departmentName;
    }
}
