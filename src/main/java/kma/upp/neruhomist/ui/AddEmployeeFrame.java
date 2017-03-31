package kma.upp.neruhomist.ui;

import javax.swing.*;
import java.awt.*;

import static java.awt.GridBagConstraints.HORIZONTAL;

public class AddEmployeeFrame extends JFrame {

    public AddEmployeeFrame() {
        initUi();
    }

    private void initUi() {
        setTitle("Додати співробітника");
        setMinimumSize(new Dimension(Constants.DEFAULT_WIDHT, Constants.DEFAULT_HEIGHT));
        setSize(Constants.DEFAULT_WIDHT, Constants.DEFAULT_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        JPanel namePanel = new JPanel();
        namePanel.setLayout(new GridBagLayout());
        constraints.fill = HORIZONTAL;
        constraints.gridwidth = 2;
        constraints.weightx = 1;
        namePanel.setBorder(BorderFactory.createTitledBorder("Ім'я"));
        contentPane.add(namePanel, constraints);

        JLabel surnameLabel = new JLabel("Прізвище");
        surnameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        constraints.gridwidth = 1;
        namePanel.add(surnameLabel, constraints);

        JTextField surnameField = new JTextField();
        constraints.gridx = 1;
        namePanel.add(surnameField, constraints);

        JLabel nameLabel = new JLabel("Ім'я");
        constraints.gridx = 2;
        constraints.insets.left = 20;
        namePanel.add(nameLabel, constraints);

        JTextField nameField = new JTextField();
        constraints.gridx = 3;
        constraints.insets.left = 0;
        namePanel.add(nameField, constraints);

        JLabel fatherNameLabel = new JLabel("По-батькові");
        constraints.gridx = 4;
        constraints.insets.left = 20;
        namePanel.add(fatherNameLabel, constraints);

        JTextField fatherNameField = new JTextField();
        constraints.gridx = 5;
        constraints.insets.left = 0;
        namePanel.add(fatherNameField, constraints);

        JPanel positionPanel = new JPanel();
        positionPanel.setLayout(new GridBagLayout());
        positionPanel.setBorder(BorderFactory.createTitledBorder("Посада"));
        constraints.gridx = 0;
        constraints.gridy = 1;
        contentPane.add(positionPanel, constraints);

        JTextField positionField = new JTextField();
        constraints.gridy = 0;
        positionPanel.add(positionField, constraints);

        JPanel phoneNumberPanel = new JPanel();
        phoneNumberPanel.setLayout(new GridBagLayout());
        phoneNumberPanel.setBorder(BorderFactory.createTitledBorder("Телефон"));
        constraints.gridx = 1;
        constraints.gridy = 1;
        contentPane.add(phoneNumberPanel, constraints);

        JTextField phoneNumberPrefixField = new JTextField();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        phoneNumberPanel.add(phoneNumberPrefixField, constraints);

        JTextField phoneNumberSuffixField = new JTextField();
        constraints.gridx = 1;
        constraints.insets.left = 20;
        phoneNumberPanel.add(phoneNumberSuffixField, constraints);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridBagLayout());
        constraints.weighty = 1;
        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        contentPane.add(buttonsPanel, constraints);

        JButton okButton = new JButton("OK");
        constraints.gridwidth = 1;
        constraints.weightx = 0;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets.right = 10;
        buttonsPanel.add(okButton, constraints);

        JButton rejectButton = new JButton("Відхилити");
        constraints.gridx = 1;
        constraints.insets.left = 10;
        buttonsPanel.add(rejectButton, constraints);
    }
}
