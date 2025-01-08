package rj.java.abstractperson;

//Concrete class extending AcademicProgram
class UndergraduateProgram extends AcademicProgram {
 private int creditsRequired;

 public UndergraduateProgram(String programName, int creditsRequired) {
     super(programName);
     this.creditsRequired = creditsRequired;
 }

 @Override
 public boolean checkGraduationEligibility(int completedCredits) {
     return completedCredits >= creditsRequired;
 }

 @Override
 public String toString() {
     return super.toString() + ", Credits Required: " + creditsRequired;
 }
}