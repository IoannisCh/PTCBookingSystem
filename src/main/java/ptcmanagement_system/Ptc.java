package ptcmanagement_system;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Ptc extends JFrame {
    private ArrayList<Student> studentList = new ArrayList<>();
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> displayList = new JList<>(listModel);

    public Ptc() {
        setTitle("PTC Booking System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // UI Layout
        setLayout(new BorderLayout(10, 10));
        add(new JLabel("Current Enrolled Students:", SwingConstants.CENTER), BorderLayout.NORTH);
        add(new JScrollPane(displayList), BorderLayout.CENTER);

        JButton enrollBtn = new JButton("Enroll New Student");
        enrollBtn.addActionListener(e -> openEnrollmentForm());
        add(enrollBtn, BorderLayout.SOUTH);

        // Pre-populate with one test user from your TestListString class
        TestListString.populateList(studentList, listModel);

        setVisible(true);
    }

    private void openEnrollmentForm() {
        JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));
        JTextField nameF = new JTextField();
        JTextField dobF = new JTextField();
        JTextField addrF = new JTextField();
        JTextField contactF = new JTextField();

        panel.add(new JLabel("First Name:")); panel.add(nameF);
        panel.add(new JLabel("DOB (YYYYMMDD):")); panel.add(dobF);
        panel.add(new JLabel("Address:")); panel.add(addrF);
        panel.add(new JLabel("Contact Number:")); panel.add(contactF);

        int result = JOptionPane.showConfirmDialog(null, panel, "Student Enrollment", JOptionPane.OK_CANCEL_OPTION);
        
        if (result == JOptionPane.OK_OPTION) {
            try {
                // Ensure Student.java has this constructor: 
                // Student(String name, String gender, int dob, String addr, String contact, int course)
                Student s = new Student(
                    nameF.getText(), 
                    "N/A", 
                    Integer.parseInt(dobF.getText().trim()), 
                    addrF.getText(), 
                    contactF.getText(), 
                    1
                );
                studentList.add(s);
                listModel.addElement(s.toString());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: Please check your inputs (DOB must be a number).");
            }
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}

        SwingUtilities.invokeLater(() -> new Ptc());
    }
}