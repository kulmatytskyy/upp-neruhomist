package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.model.Client;
import kma.upp.neruhomist.repository.ClientRepository;
import kma.upp.neruhomist.ui.util.ClientTableModel;
import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

@Component
public class ListClientsFrame extends DelayedInitJFrame {

    private javax.swing.JButton backButton;
    private javax.swing.JButton moreAboutClientButton;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JPanel clientsListPanel;
    private javax.swing.JPanel backButtonPanel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JTable clientsTable;
    private javax.swing.JTextField phoneToSearchField;
    private JButton searchButton;

    @Autowired
    private ClientRepository clientRepository;

    private ClientTableModel tableModel;

    @Autowired
    private ClientDetailsFrame clientDetailsFrame;

    @Autowired
    private Client client;

    @Override
	protected void initComponents() {

        clientsListPanel = new javax.swing.JPanel();
        clientsListPanel.setBounds(0, 70, 325, 300);
        tableScrollPane = new javax.swing.JScrollPane();
        clientsTable = new javax.swing.JTable();
        moreAboutClientButton = new javax.swing.JButton();
        backButtonPanel = new javax.swing.JPanel();
        backButtonPanel.setBounds(0, 380, 325, 40);
        backButton = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        searchPanel.setBounds(0, 0, 325, 70);
        phoneLabel = new javax.swing.JLabel();
        phoneToSearchField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Список клієнтів");
        getContentPane().setLayout(null);

        clientsListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Список клієнтів"));
        clientsListPanel.setName("panelOwners"); // NOI18N

        tableModel = new ClientTableModel(clientRepository.findAll());
        clientsTable.setModel(tableModel);
        clientsTable.removeColumn(clientsTable.getColumnModel().getColumn(0));
        clientsTable.setName("tableOwners"); // NOI18N
        clientsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableScrollPane.setViewportView(clientsTable);

        moreAboutClientButton.setText("Детальніше про клієнта...");
        moreAboutClientButton.setName("buttonOwnerDetails"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(clientsListPanel);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(tableScrollPane, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(53)
        					.addComponent(moreAboutClientButton, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(tableScrollPane, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(moreAboutClientButton)
        			.addContainerGap(18, Short.MAX_VALUE))
        );
        clientsListPanel.setLayout(jPanel1Layout);

        getContentPane().add(clientsListPanel);

        backButtonPanel.setName("panelNazad"); // NOI18N

        backButton.setText("Назад до головного меню");
        backButton.setName("buttonNazad"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(backButtonPanel);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(26)
        			.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(backButton)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backButtonPanel.setLayout(jPanel2Layout);

        getContentPane().add(backButtonPanel);

        searchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Пошук"));
        searchPanel.setName("panelPoshuk"); // NOI18N

        phoneLabel.setText("Телефон");
        phoneLabel.setName("labalTelefon"); // NOI18N

        phoneToSearchField.setName("textfieldTelefon"); // NOI18N
        
        searchButton = new JButton("Пошук");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(searchPanel);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(phoneLabel)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(phoneToSearchField, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(phoneLabel)
        				.addComponent(phoneToSearchField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(searchButton))
        			.addContainerGap(16, Short.MAX_VALUE))
        );
        searchPanel.setLayout(jPanel3Layout);

        getContentPane().add(searchPanel);

        attachActionsToButtons();
    }

    private void attachActionsToButtons() {
        backButton.addActionListener(backToMenu);
        searchButton.addActionListener(actionEvent -> {
            tableModel.setClients(clientRepository.findByPhoneStartingWith(phoneToSearchField.getText()));
            tableModel.fireTableDataChanged();
        });
        moreAboutClientButton.addActionListener(actionEvent -> {
            BeanUtils.copyProperties(clientRepository.findOne((Integer)tableModel.getValueAt(clientsTable.getSelectedRow(), 0)), client);
            System.out.println(client);
            dispose();
            clientDetailsFrame.setVisible(true);
        });
    }


}
