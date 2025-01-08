package rj.java.abstractperson;


//Another Subclass
public class Student extends Person {
 private String major;
 private AcademicProgram program;
 private int completedCredits;

 public Student(String name, int age, String major, AcademicProgram program, int completedCredits) {
     super(name, age);
     this.major = major;
     this.program = program;
     this.completedCredits = completedCredits;
 }

 public boolean isEligibleForGraduation() {
     return program.checkGraduationEligibility(completedCredits);
 }

 @Override
 public String toString() {
     return "Name: " + name + ", Age: " + age + ", Major: " + major + ", Graduation Eligible: " + isEligibleForGraduation() + ", " + program;
 }
}