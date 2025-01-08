package rj.java.abstractperson;

//Concrete class extending abstract Department class
class ITDepartment extends Department {
 private int numberOfProjects;

 public ITDepartment(String departmentName, int numberOfProjects) {
     super(departmentName);
     this.numberOfProjects = numberOfProjects;
 }

 @Override
 public int calculateBonus(int baseBonus) {
     return baseBonus + (numberOfProjects * 1000);
 }

 @Override
 public String toString() {
     return super.toString() + ", Projects: " + numberOfProjects;
 }
}