package kma.upp.neruhomist.ui;

import javax.swing.*;
import java.awt.*;

import static java.awt.GridBagConstraints.HORIZONTAL;

public class InspectionDetails extends JFrame {

    public InspectionDetails() {
        initUi();
    }

    private void initUi() {
        setTitle("Деталі про інспекцію №4534");
        setMinimumSize(new Dimension(Constants.DEFAULT_WIDHT, Constants.DEFAULT_HEIGHT));
        setSize(Constants.DEFAULT_WIDHT, Constants.DEFAULT_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        JPanel objectPanel = new JPanel();
        objectPanel.setLayout(new GridBagLayout());
        constraints.fill = HORIZONTAL;
        constraints.weightx = 1;
        objectPanel.setBorder(BorderFactory.createTitledBorder("Об'єкт"));
        contentPane.add(objectPanel, constraints);

        JLabel addressLabel = new JLabel("Адреса: ");
        objectPanel.add(addressLabel, constraints);

        JLabel addressValueLabel = new JLabel("Олеко Дудича вулиця, буд. 22, кв. 13");
        constraints.gridx = 1;
        constraints.insets.left = 10;
        objectPanel.add(addressValueLabel, constraints);

        JLabel roomsNumLabel = new JLabel("Кімнат: ");
        constraints.insets.left = 0;
        constraints.gridx = 0;
        constraints.gridy = 1;
        objectPanel.add(roomsNumLabel, constraints);

        JLabel roomsNumValueLabel = new JLabel("2");
        constraints.gridx = 1;
        constraints.insets.left = 10;
        objectPanel.add(roomsNumValueLabel, constraints);

        JLabel typeLabel = new JLabel("Тип: ");
        constraints.insets.left = 0;
        constraints.gridx = 0;
        constraints.gridy = 2;
        objectPanel.add(typeLabel, constraints);

        JLabel typeValueLabel = new JLabel("житловий");
        constraints.gridx = 1;
        constraints.insets.left = 10;
        objectPanel.add(typeValueLabel, constraints);

        JButton objectMoreInfoButton = new JButton("Детальніше про об'єкт...");
        constraints.gridx = 2;
        objectPanel.add(objectMoreInfoButton, constraints);

        JPanel contractPanel = new JPanel();
        contractPanel.setLayout(new GridBagLayout());
        contractPanel.setBorder(BorderFactory.createTitledBorder("Договір"));
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.insets.left = 0;
        contentPane.add(contractPanel, constraints);

        JLabel contractNumLabel = new JLabel("Номер договору: ");
        constraints.gridy = 0;
        contractPanel.add(contractNumLabel, constraints);

        JLabel contractNumValueLabel = new JLabel("228");
        constraints.gridx = 1;
        constraints.insets.left = 10;
        contractPanel.add(contractNumValueLabel, constraints);

        JLabel signingDateLabel = new JLabel("Дата укладання: ");
        constraints.insets.left = 0;
        constraints.gridx = 0;
        constraints.gridy = 1;
        contractPanel.add(signingDateLabel, constraints);

        JLabel signingDateValueLabel = new JLabel("26.07.2016");
        constraints.gridx = 1;
        constraints.insets.left = 10;
        contractPanel.add(signingDateValueLabel, constraints);

        JLabel rentStartDateLabel = new JLabel("Дата початку оренди: ");
        constraints.insets.left = 0;
        constraints.gridx = 0;
        constraints.gridy = 2;
        contractPanel.add(rentStartDateLabel, constraints);

        JLabel rentStartValueLabel = new JLabel("01.08.2016");
        constraints.gridx = 1;
        constraints.insets.left = 10;
        contractPanel.add(rentStartValueLabel, constraints);

        JLabel rentEndDateLabel = new JLabel("Дата кінця оренди: ");
        constraints.insets.left = 0;
        constraints.gridx = 0;
        constraints.gridy = 3;
        contractPanel.add(rentEndDateLabel, constraints);

        JLabel rentEndValueLabel = new JLabel("01.02.2017");
        constraints.gridx = 1;
        constraints.insets.left = 10;
        contractPanel.add(rentEndValueLabel, constraints);

        JLabel rentStatusLabel = new JLabel("Статус");
        constraints.gridx = 2;
        constraints.gridy = 0;
        contractPanel.add(rentStatusLabel, constraints);

        JLabel rentStatusValueLabel = new JLabel("Архів");
        constraints.gridx = 3;
        constraints.insets.left = 10;
        contractPanel.add(rentStatusValueLabel, constraints);

        JButton contractMoreInfoButton = new JButton("Детальніше про договір...");
        constraints.gridy = 3;
        constraints.gridx = 2;
        constraints.gridwidth = 2;
        contractPanel.add(contractMoreInfoButton, constraints);

        JPanel inspectionPanel = new JPanel();
        inspectionPanel.setLayout(new GridBagLayout());
        inspectionPanel.setBorder(BorderFactory.createTitledBorder("Інспекція"));
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.insets.left = 0;
        constraints.gridwidth = 1;
        contentPane.add(inspectionPanel, constraints);

        JLabel inspectionDateLabel = new JLabel("Дата: ");
        constraints.gridy = 0;
        inspectionPanel.add(inspectionDateLabel, constraints);

        JLabel inspectionDateValueLabel = new JLabel("01.01.2017");
        constraints.gridx = 1;
        inspectionPanel.add(inspectionDateValueLabel, constraints);

        JLabel inspectionEmployeeLabel = new JLabel("Співробітник: ");
        constraints.gridx = 0;
        constraints.gridy = 1;
        inspectionPanel.add(inspectionEmployeeLabel, constraints);

        JLabel inspectionEmployeeValueLabel = new JLabel("Джейк Джиллєнхон");
        constraints.gridx = 1;
        inspectionPanel.add(inspectionEmployeeValueLabel, constraints);

        JLabel inspectionClientLabel = new JLabel("Клієнт: ");
        constraints.gridx = 0;
        constraints.gridy = 2;
        inspectionPanel.add(inspectionClientLabel, constraints);

        JLabel inspectionClientValueLabel = new JLabel("Глибовець Андрій Миколайович");
        constraints.gridx = 1;
        inspectionPanel.add(inspectionClientValueLabel, constraints);

        JLabel inspectionCommentLabel = new JLabel("Коментар: ");
        constraints.gridx = 0;
        constraints.gridy = 3;
        inspectionPanel.add(inspectionCommentLabel, constraints);

        JLabel inspectionCommentValueLabel = new JLabel("Стан об'єкту задовільний");
        constraints.gridx = 1;
        inspectionPanel.add(inspectionCommentValueLabel, constraints);

        JButton inspectionMoreInfoAboutEmployeeButton = new JButton("Детальніше про співробітника");
        constraints.gridx = 2;
        constraints.gridy = 1;
        inspectionPanel.add(inspectionMoreInfoAboutEmployeeButton, constraints);

        JButton inspectionMoreInfoAboutClientButton = new JButton("Детальніше про клієнта");
        constraints.gridy = 2;
        inspectionPanel.add(inspectionMoreInfoAboutClientButton, constraints);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridBagLayout());
        constraints.weighty = 1;
        constraints.gridy = 3;
        constraints.gridx = 0;
        contentPane.add(buttonsPanel, constraints);

        JButton okButton = new JButton("OK");
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
