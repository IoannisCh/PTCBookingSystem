package ptcmanagement_system;

public class Student {
    // Instance variables (unique to each student)
    private String firstName;
    private String gender;
    private int dob;
    private String address;
    private int contactNumber;
    private int courses;
    private int tuitionBalance = 0; // Removed static
    private String studentID;
    private int review;

    // Static variables (shared across the system)
    private static int costOfCourse = 100;
    private static int globalIdCounter = 1000;

    // CLEAN CONSTRUCTOR: No Scanners! Just takes data and assigns it.
    public Student(String firstName, String gender, int dob, String address, int contactNumber, int lessonSelection) {
        this.firstName = firstName;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.contactNumber = contactNumber;
        this.courses = lessonSelection;
        setStudentID();
    }

    // Default constructor for flexibility
    public Student() {}

    private void setStudentID() {
        globalIdCounter++;
        this.studentID = dob + "" + globalIdCounter;
    }

    // This method now handles logic, not input
    public void enroll(int numberOfCourses) {
        this.tuitionBalance += (numberOfCourses * costOfCourse);
    }

    @Override
    public String toString() {
        return "Name: " + firstName + 
               " | ID: " + studentID + 
               " | Balance: £" + tuitionBalance;
    }
    
}