package ptcmanagement_system;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ptc implements ActionListener {
    
    private int studentCount;
    private JLabel label;
    private JFrame frame = new JFrame();
    
    // Updated Constructor to handle the count
    public Ptc(int count) {
        this.studentCount = count;
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}

        this.label = new JLabel("Managing " + studentCount + " enrollments.");
        JButton button = new JButton("Click Me");
        button.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("PTC System");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Action Triggered for " + studentCount + " students!");
    }
    
    public static void main(String[] args) { 
        String input = JOptionPane.showInputDialog(null, "Enter number of new enrollments:");

        if (input == null) {
            System.exit(0);
        }

        try {
            final int count = Integer.parseInt(input);

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    // Pass the count into the constructor here!
                    new Ptc(count);
                }
            });
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }    
}