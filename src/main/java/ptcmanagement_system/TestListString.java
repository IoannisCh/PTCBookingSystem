package ptcmanagement_system;

import java.util.ArrayList; // Essential import

import javax.swing.DefaultListModel;

public class TestListString {
    public static void populateList(ArrayList<Student> list, DefaultListModel<String> model) {
        Student testData = new Student("TestUser", "Other", 20260101, "Ubuntu Lane", "000000", 1);
        list.add(testData);
        model.addElement(testData.toString());
    }
}