package kma.upp.neruhomist.ui;

import com.google.common.collect.ImmutableMap;
import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

@Component
public class MenuFrame extends DelayedInitJFrame {

    private javax.swing.JButton buttonDodatyObject;
    private javax.swing.JButton buttonDodatyVlasnyka;
    private javax.swing.JButton buttonDodatyClienta;
    private javax.swing.JButton buttonDodatySpivrobitnyka;
    private javax.swing.JButton buttonStatystyka;
    private javax.swing.JButton buttonArchive;
    private javax.swing.JButton buttonPoshuk;
    private javax.swing.JButton buttonVyhid;
    private javax.swing.JPanel panelDodaty;
    private javax.swing.JPanel panelPerehlyanuty;
    private javax.swing.JPanel panelPoshuk;
    private javax.swing.JPanel panelVyhid;

    @Autowired
    private ArchiveFrame archiveFrame;

    @Autowired
    private CreateClientFrame createClientFrame;

    @Autowired
    private CreateObjectFrame createObjectFrame;

    @Autowired
    private CreateEmployeeFrame createEmployeeFrame;

    @Autowired
    private CreateOwnerFrame createOwnerFrame;

    @Autowired
    private SearchFrame searchFrame;

    @Autowired
    private StatisticsFrame statisticsFrame;

    @Autowired
    private ListClientsFrame listClientsFrame;

    @Autowired
    private ListEmployeesFrame listEmployeesFrame;

    @Autowired
    private ListOwnersFrame listOwnersFrame;

    private JButton ownersListButton;
    private JButton clientsListButton;
    private JButton workersListButton;

    @Override
    protected void initComponents() {

        panelDodaty = new javax.swing.JPanel();
        panelDodaty.setBounds(0, 0, 190, 180);
        buttonDodatyObject = new javax.swing.JButton();
        buttonDodatyVlasnyka = new javax.swing.JButton();
        buttonDodatyClienta = new javax.swing.JButton();
        buttonDodatySpivrobitnyka = new javax.swing.JButton();
        panelPerehlyanuty = new javax.swing.JPanel();
        panelPerehlyanuty.setBounds(190, 0, 170, 252);
        buttonStatystyka = new javax.swing.JButton();
        buttonArchive = new javax.swing.JButton();
        panelPoshuk = new javax.swing.JPanel();
        panelPoshuk.setBounds(0, 182, 190, 70);
        buttonPoshuk = new javax.swing.JButton();
        panelVyhid = new javax.swing.JPanel();
        panelVyhid.setBounds(10, 263, 343, 50);
        buttonVyhid = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Головне меню");
        getContentPane().setLayout(null);

        panelDodaty.setBorder(javax.swing.BorderFactory.createTitledBorder("Додати"));
        panelDodaty.setName("panelDodaty"); // NOI18N

        buttonDodatyObject.setText("Додати об'єкт");
        buttonDodatyObject.setName("buttonDodatyObject"); // NOI18N

        buttonDodatyVlasnyka.setText("Додати власника");
        buttonDodatyVlasnyka.setName("buttonDodatyVlasnyka"); // NOI18N

        buttonDodatyClienta.setText("Додати клієнта");
        buttonDodatyClienta.setName("buttonDodatyClienta"); // NOI18N

        buttonDodatySpivrobitnyka.setText("Додати співробітника");
        buttonDodatySpivrobitnyka.setName("buttonDodatySpivrobitnyka"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelDodaty);
        panelDodaty.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonDodatySpivrobitnyka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDodatyClienta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDodatyVlasnyka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDodatyObject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(buttonDodatyObject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                .addComponent(buttonDodatyVlasnyka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                .addComponent(buttonDodatyClienta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                .addComponent(buttonDodatySpivrobitnyka)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(panelDodaty);

        panelPerehlyanuty.setBorder(javax.swing.BorderFactory.createTitledBorder("Переглянути"));
        panelPerehlyanuty.setName("panelPerehlyanuty"); // NOI18N

        buttonStatystyka.setText("Статистика");
        buttonStatystyka.setName("buttonStatystyka"); // NOI18N

        buttonArchive.setText("Архів");
        buttonArchive.setName("buttonArchive"); // NOI18N
        
        ownersListButton = new JButton();
        ownersListButton.setText("Список власників");
        ownersListButton.setName("buttonDodatyVlasnyka");
        
        clientsListButton = new JButton();
        clientsListButton.setText("Список клієнтів");
        clientsListButton.setName("buttonDodatyClienta");
        
        workersListButton = new JButton();
        workersListButton.setText("Список співробітників");
        workersListButton.setName("buttonDodatySpivrobitnyka");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelPerehlyanuty);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(buttonStatystyka, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        				.addComponent(buttonArchive, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        				.addComponent(workersListButton, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
        				.addComponent(clientsListButton, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
        				.addComponent(ownersListButton, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(13)
        			.addComponent(ownersListButton)
        			.addGap(18)
        			.addComponent(clientsListButton)
        			.addGap(18)
        			.addComponent(workersListButton)
        			.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
        			.addComponent(buttonStatystyka)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(buttonArchive)
        			.addContainerGap())
        );
        panelPerehlyanuty.setLayout(jPanel2Layout);

        getContentPane().add(panelPerehlyanuty);

        panelPoshuk.setBorder(javax.swing.BorderFactory.createTitledBorder("Пошук"));
        panelPoshuk.setName("panelPoshuk"); // NOI18N

        buttonPoshuk.setText("Пошук");
        buttonPoshuk.setName("buttonPoshuk"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(panelPoshuk);
        panelPoshuk.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPoshuk, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPoshuk)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(panelPoshuk);

        panelVyhid.setName("pPanelVyhid"); // NOI18N

        buttonVyhid.setText("Вихід");
        buttonVyhid.setName("buttonVyhid"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(panelVyhid);
        panelVyhid.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(buttonVyhid, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(buttonVyhid)
                .addContainerGap())
        );

        getContentPane().add(panelVyhid);

        attachActionsToButtons();

        pack();
        pack();

    }

    private void attachActionsToButtons() {

        final Map<JButton, JFrame> buttonFrameMap = ImmutableMap.<JButton, JFrame>builder()
                .put(buttonArchive, archiveFrame)
                .put(buttonDodatyClienta, createClientFrame)
                .put(buttonDodatyObject, createObjectFrame)
                .put(buttonDodatySpivrobitnyka, createEmployeeFrame)
                .put(buttonDodatyVlasnyka, createOwnerFrame)
                .put(buttonPoshuk, searchFrame)
                .put(buttonStatystyka, statisticsFrame)
                .put(clientsListButton, listClientsFrame)
                .put(workersListButton, listEmployeesFrame)
                .put(ownersListButton, listOwnersFrame)
                .build();

        buttonFrameMap.forEach((button, frame) -> button.addActionListener(actionEvent -> {
            dispose();
            EventQueue.invokeLater(() -> frame.setVisible(true));
        }));

        buttonVyhid.addActionListener(actionEvent -> dispose());
    }
}
