package ptcmanagement_system;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ptc implements ActionListener{
    
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame = new JFrame();
    
    public Ptc() {

        // the clickable button
        JButton button = new JButton("Click Me");
        button.addActionListener((ActionListener) this);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    
    }
    
     public void actionPerformed(ActionEvent e) {
        TestListString.populateList();
        label.setText("Number of :");
    }
    
    public static void main(String[] args) {  
        System.out.print("Enter number of new enrollments: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
    
        for (int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
        }
        
    
        for (int n = 0; n < numOfStudents; n++){
            System.out.println(students[n]);
    }
        
    new Ptc();
}
}
    

