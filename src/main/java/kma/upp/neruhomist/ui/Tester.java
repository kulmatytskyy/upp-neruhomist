package kma.upp.neruhomist.ui;

import java.awt.*;

public class Tester {

    public static void main(String args[]) {
        EventQueue.invokeLater(() -> {
            new InspectionDetails().setVisible(true);
            new AddClientFrame().setVisible(true);
            new AddEmployeeFrame().setVisible(true);
        });
    }
}
