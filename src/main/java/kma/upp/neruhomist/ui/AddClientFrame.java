package kma.upp.neruhomist.ui;

import javax.swing.*;
import java.awt.*;

import static java.awt.GridBagConstraints.HORIZONTAL;
import static java.awt.GridBagConstraints.WEST;

public class AddClientFrame extends JFrame {

    public AddClientFrame() {
        initUi();
    }

    private void initUi() {
        setTitle("Додати клієнта");
        setMinimumSize(new Dimension(Constants.DEFAULT_WIDHT, Constants.DEFAULT_HEIGHT));
        setSize(Constants.DEFAULT_WIDHT, Constants.DEFAULT_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        JPanel personTypePanel = new JPanel();
        personTypePanel.setLayout(new GridBagLayout());
        constraints.fill = HORIZONTAL;
        constraints.gridwidth = 2;
        constraints.weightx = 1;
        personTypePanel.setBorder(BorderFactory.createTitledBorder("Тип особи"));
        contentPane.add(personTypePanel, constraints);

        ButtonGroup personTypeButtonGroup = new ButtonGroup();

        JRadioButton juridicPersonTypeRadioButton = new JRadioButton("Юридична");
        personTypeButtonGroup.add(juridicPersonTypeRadioButton);

        constraints.anchor = WEST;
        constraints.gridwidth = 1;
        personTypePanel.add(juridicPersonTypeRadioButton, constraints);

        JLabel juridicPersonNameLabel = new JLabel("Назва");
        juridicPersonNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        constraints.gridy = 1;
        personTypePanel.add(juridicPersonNameLabel, constraints);

        JTextField juridicPersonNameField = new JTextField();
        constraints.gridx = 1;
        personTypePanel.add(juridicPersonNameField, constraints);

        JLabel businessTypeLabel = new JLabel("Тип бізнесу");
        businessTypeLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        constraints.gridy = 2;
        constraints.gridx = 0;
        personTypePanel.add(businessTypeLabel, constraints);

        JTextField businessTypeField = new JTextField();
        constraints.gridx = 1;
        personTypePanel.add(businessTypeField, constraints);

        JLabel contactNameLabel = new JLabel("Контакна особа");
        contactNameLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        constraints.gridy = 1;
        constraints.gridx = 2;
        constraints.insets.left = 20;
        personTypePanel.add(contactNameLabel, constraints);

        JTextField contactNameField = new JTextField();
        constraints.gridx = 3;
        constraints.insets.left = 0;
        personTypePanel.add(contactNameField, constraints);

        JRadioButton physicalPersonTypeRadioButton = new JRadioButton("Фізична");
        physicalPersonTypeRadioButton.setSelected(true);
        constraints.gridy = 3;
        constraints.gridx = 0;
        personTypeButtonGroup.add(physicalPersonTypeRadioButton);
        constraints.gridwidth = 1;
        personTypePanel.add(physicalPersonTypeRadioButton, constraints);

        JLabel physicalPersonSurnameLabel = new JLabel("Прізвище");
        physicalPersonSurnameLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        constraints.gridy = 4;
        constraints.gridx = 0;
        personTypePanel.add(physicalPersonSurnameLabel, constraints);

        JTextField physicalPersonSurnameField = new JTextField();
        constraints.gridx = 1;
        personTypePanel.add(physicalPersonSurnameField, constraints);

        JLabel physicalPersonFirstNameLabel = new JLabel("Ім'я");
        physicalPersonFirstNameLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        constraints.gridx = 2;
        constraints.insets.left = 20;
        personTypePanel.add(physicalPersonFirstNameLabel, constraints);

        JTextField physicalPersonFirstNameField = new JTextField();
        constraints.gridx = 3;
        constraints.insets.left = 0;
        personTypePanel.add(physicalPersonFirstNameField, constraints);

        JLabel physicalPersonFatherNameLabel = new JLabel("По-батькові");
        physicalPersonFatherNameLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        constraints.gridx = 4;
        constraints.insets.left = 20;
        personTypePanel.add(physicalPersonFatherNameLabel, constraints);

        JTextField physicalPersonFatherNameField = new JTextField();
        constraints.gridx = 5;
        constraints.insets.left = 0;
        personTypePanel.add(physicalPersonFatherNameField, constraints);

        JPanel phoneNumberPanel = new JPanel();
        phoneNumberPanel.setLayout(new GridBagLayout());
        phoneNumberPanel.setBorder(BorderFactory.createTitledBorder("Телефон"));
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        contentPane.add(phoneNumberPanel, constraints);

        JTextField phoneNumberPrefixField = new JTextField();
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        phoneNumberPanel.add(phoneNumberPrefixField, constraints);

        JTextField phoneNumberSuffixField = new JTextField();
        constraints.gridx = 1;
        constraints.insets.left = 20;
        phoneNumberPanel.add(phoneNumberSuffixField, constraints);

        JPanel desiredObjectTypePanel = new JPanel();
        desiredObjectTypePanel.setLayout(new GridBagLayout());
        desiredObjectTypePanel.setBorder(BorderFactory.createTitledBorder("Тип бажаного приміщення"));
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.weightx = 1;
        constraints.insets.left = 0;
        contentPane.add(desiredObjectTypePanel, constraints);

        ButtonGroup desiredObjectTypeButtonGroup = new ButtonGroup();

        JRadioButton desiredObjectTypeLivingRadioButton = new JRadioButton("Житловий");
        desiredObjectTypeButtonGroup.add(desiredObjectTypeLivingRadioButton);

        constraints.gridy = 0;
        desiredObjectTypePanel.add(desiredObjectTypeLivingRadioButton, constraints);

        JRadioButton desiredObjectTypeNonLivingRadioButton = new JRadioButton("Нежитловий");
        desiredObjectTypeButtonGroup.add(desiredObjectTypeNonLivingRadioButton);

        constraints.gridx = 1;
        desiredObjectTypePanel.add(desiredObjectTypeNonLivingRadioButton, constraints);

        JPanel maxPaymentPanel = new JPanel();
        maxPaymentPanel.setLayout(new GridBagLayout());
        maxPaymentPanel.setBorder(BorderFactory.createTitledBorder("Максимальна плата"));
        constraints.gridx = 1;
        constraints.gridy = 2;
        contentPane.add(maxPaymentPanel, constraints);

        JTextField maxPaymentField = new JTextField();
        constraints.gridx = 0;
        constraints.gridy = 0;
        maxPaymentPanel.add(maxPaymentField, constraints);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridBagLayout());
        constraints.weighty = 1;
        constraints.gridy = 3;
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
