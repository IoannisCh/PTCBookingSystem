
package ptcmanagement_system;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String gender;
    private int DOB;
    private String address;
    private int contactNumber;
    private int courses;
    private static int tuitionBalance = 0;
    private static int costOfCourse = 100;
    private static int id = 1000;
    private String studentID;
    private int review;
    
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        
        System.out.print("Enter student gender : ");
        this.gender = in.nextLine();
        
        System.out.print("1 - SatA\n2 - SatB\n3 - SatC\n4 - SunA\n5 - SunB\n6 - SunC\nEnter a lesson selection: ");
        this.courses = in.nextInt();
        
        System.out.print("Enter student DOB: ");
        this.DOB = in.nextInt();
        
        System.out.print("Enter student Address: ");
        this.address = in.nextLine();
        
        System.out.print("\nEnter student Contact Number: ");
        this.contactNumber = in.nextInt();
         
        setStudentID();
    }

    Student(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private void setStudentID(){
        id++;
        this.studentID = DOB + "" + id;
    }
    
    public void enroll(){
        do {
        System.out.println("Enter course to enroll (Q to quit)");
        Scanner in = new Scanner(System.in);
        String courses = in.nextLine();
        if (!courses.equals("Q")){
            courses = courses + "\n" + courses;
            tuitionBalance = tuitionBalance + costOfCourse;
        }
        else {
            break;
        }
        }while (1 != 0);
         
    }
    
    public void viewBalance(){
        System.out.println("Your balance is: £" + tuitionBalance);
    }
    
    public void writeReview(){
        System.out.println("Please write your review, from 1-5 with 5 been the best: ");
        Scanner in = new Scanner(System.in);
        review = in.nextInt();
    }
    
    
    public String toString(){
        
        return "Name: " + firstName + 
               "\nGender: " + gender + 
               "\nENROLLED IN: "+ courses + 
               "\nDOB" + DOB +
               "\nAddress: " + address + 
               "\nContact Nimber: " + contactNumber +
               "\nID: " + studentID + 
               "\nTUITION BALANCE: " + tuitionBalance;
    }
    
  
}


