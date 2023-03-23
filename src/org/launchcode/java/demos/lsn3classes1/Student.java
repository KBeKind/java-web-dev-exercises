package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
// constructor - but we probably won't use it
//    public Student(String name, int studentId, int numberOfCredits, double gpa) {
//        this.name = name;
//        this.studentId = studentId;
//        this.numberOfCredits = numberOfCredits;
//        this.gpa = gpa;
//    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int newID){
        studentId = newID;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public void setNumberOfCredits(int newCredits){
        numberOfCredits = newCredits;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double newGpa){
        gpa = newGpa;
    }

    public String getGradeLevel(int totalCredits){
        String gradeLevel;
        if(totalCredits < 30){
            gradeLevel = "Freshman";
        } else if(totalCredits < 60){
            gradeLevel = "Sophomore";
        } else if(totalCredits < 90){
            gradeLevel = "Junior";
        } else {
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }

    public void addGrade(int credits, double grade){
        double totalQualityScore = gpa * numberOfCredits;
        totalQualityScore  += credits * grade;
        numberOfCredits += credits;
        gpa = totalQualityScore / numberOfCredits;

    }

    public String toString() {
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }

    public boolean equals(Object toBeCompared){
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }

}