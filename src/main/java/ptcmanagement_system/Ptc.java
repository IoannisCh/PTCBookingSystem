package ptcmanagement_system;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Ptc extends JFrame {
    private ArrayList<Student> studentList = new ArrayList<>();
    
    // Table components
    private JTable studentTable;
    private DefaultTableModel tableModel;

    public Ptc() {
        setTitle("PTC Management Dashboard");
        setSize(850, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 1. Setup the Table Columns
        String[] columns = {"Student ID", "First Name", "DOB", "Address", "Balance"};
        tableModel = new DefaultTableModel(columns, 0);
        studentTable = new JTable(tableModel);
        
        // 2. Layout
        setLayout(new BorderLayout(10, 10));
        
        // Header
        JLabel header = new JLabel("Registered Students Database", SwingConstants.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        header.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(header, BorderLayout.NORTH);

        // Center: The Table (inside a ScrollPane)
        add(new JScrollPane(studentTable), BorderLayout.CENTER);

        // Bottom: Action Panel
        JPanel actionPanel = new JPanel();
        JButton enrollBtn = new JButton("Enroll New Student");
        enrollBtn.setPreferredSize(new Dimension(200, 40));
        enrollBtn.addActionListener(e -> openEnrollmentForm());
        actionPanel.add(enrollBtn);
        add(actionPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void openEnrollmentForm() {
        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));
        JTextField nameF = new JTextField();
        JTextField dobF = new JTextField();
        JTextField addrF = new JTextField();
        JTextField contactF = new JTextField();

        panel.add(new JLabel("First Name:")); panel.add(nameF);
        panel.add(new JLabel("DOB (YYYYMMDD):")); panel.add(dobF);
        panel.add(new JLabel("Address:")); panel.add(addrF);
        panel.add(new JLabel("Contact Number:")); panel.add(contactF);

        int result = JOptionPane.showConfirmDialog(null, panel, "New Student Enrollment", JOptionPane.OK_CANCEL_OPTION);
        
        if (result == JOptionPane.OK_OPTION) {
            try {
                // Create Student object
                Student s = new Student(
                    nameF.getText(), 
                    "N/A", 
                    Integer.parseInt(dobF.getText().trim()), 
                    addrF.getText(), 
                    contactF.getText(), 
                    1
                );
                
                studentList.add(s);

                // Add data to the Table Model as a new row
                Object[] rowData = {
                    s.getStudentID(), 
                    s.getFirstName(), 
                    s.getDOB(), 
                    s.getAddress(), 
                    "£0.00"
                };
                tableModel.addRow(rowData);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Input Error: Check numbers and fields.");
            }
        }
    }

    public static void main(String[] args) {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } 
        catch (Exception e) {}
        SwingUtilities.invokeLater(() -> new Ptc());
    }
}