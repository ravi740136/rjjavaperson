package rj.java.abstractperson;

//Abstract class for Student Programs
abstract class AcademicProgram {
 protected String programName;

 public AcademicProgram(String programName) {
     this.programName = programName;
 }

 public abstract boolean checkGraduationEligibility(int completedCredits);

 @Override
 public String toString() {
     return "Program: " + programName;
 }
}