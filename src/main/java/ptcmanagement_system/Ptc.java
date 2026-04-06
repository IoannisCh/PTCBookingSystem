package ptcmanagement_system;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ptc implements ActionListener {
    
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame = new JFrame();
    
    public Ptc() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // Fallback to default
        }

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
        label.setText("Action Triggered!");
    }
    
    public static void main(String[] args) { 
        String input = JOptionPane.showInputDialog(null, "Enter number of new enrollments:");

        if (input == null) {
            System.exit(0);
        }

        try {
            final int numOfStudents = Integer.parseInt(input);
            System.out.println("Enrolling " + numOfStudents + " students...");

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Ptc();
                }
            });
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }    
}