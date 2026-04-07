package ptcmanagement_system;

import java.io.Serializable;

public class Student implements Serializable {
    private String firstName;
    private String gender;
    private int DOB;
    private String address;
    private String contactNumber; 
    private int courses;
    private int tuitionBalance;
    private String studentID;

    private static int costOfCourse = 100;
    private static int idCounter = 1000;

    // Fixed constructor to match your UI needs
    public Student(String firstName, String gender, int DOB, String address, String contactNumber, int courses) {
        this.firstName = firstName;
        this.gender = gender;
        this.DOB = DOB;
        this.address = address;
        this.contactNumber = contactNumber;
        this.courses = courses;
        this.tuitionBalance = 0;
        setStudentID();
    }

    private void setStudentID() {
        idCounter++;
        this.studentID = DOB + "" + idCounter;
    }

    public void enroll(int num) {
        this.tuitionBalance += (num * costOfCourse);
    }

    @Override
    public String toString() {
        return "ID: " + studentID + " | Name: " + firstName + " | Balance: £" + tuitionBalance;
    }
}