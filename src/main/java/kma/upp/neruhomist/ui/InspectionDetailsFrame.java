package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InspectionDetailsFrame extends DelayedInitJFrame {

    private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonVidhylyty;
    private javax.swing.JButton buttonDeatilsDohovir;
    private javax.swing.JButton buttonDeatilsObject;
    private javax.swing.JButton buttonDeatilsSpivrobitnyk;
    private javax.swing.JButton buttonDeatilsClient;
    private javax.swing.JLabel labelAdresa;
    private javax.swing.JLabel labelClient;
    private javax.swing.JLabel labelComentar;
    private javax.swing.JLabel labelAdresa_value;
    private javax.swing.JLabel labelKimnat_value;
    private javax.swing.JLabel labelTyp_value;
    private javax.swing.JLabel labelNomerDohovoru_value;
    private javax.swing.JLabel labelDataUkladannia_value;
    private javax.swing.JLabel labelDataPochatkuOrendy_value;
    private javax.swing.JLabel labelDataZakinchenniaOrendy_value;
    private javax.swing.JLabel labelData_value;
    private javax.swing.JLabel labelKimnat;
    private javax.swing.JLabel labelComentar_value;
    private javax.swing.JLabel labelClient_value;
    private javax.swing.JLabel labelSpivrobitnyk_value;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelStatus_value;
    private javax.swing.JLabel labelTyp;
    private javax.swing.JLabel labelNomerDohovoru;
    private javax.swing.JLabel labelDataUkladannia;
    private javax.swing.JLabel labelDataPochatkuOrendy;
    private javax.swing.JLabel labelDataZakinchenniaOrendy;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelSpivrobitnyk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelDohovir;
    private javax.swing.JPanel panelInspekcia;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelButtonOK;
    private javax.swing.JPanel panelButtonVidhylyty;

    @Autowired
    private MenuFrame menuFrame;

    @Autowired
    private AgreementDetailsFrame agreementDetailsFrame;

    @Autowired
    private EmployeeDetailsFrame employeeDetailsFrame;

    @Autowired
    private ObjectDetailsFrame objectDetailsFrame;

    @Autowired
    private ClientDetailsFrame clientDetailsFrame;

    @Override
    protected void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelAdresa = new javax.swing.JLabel();
        labelKimnat = new javax.swing.JLabel();
        labelTyp = new javax.swing.JLabel();
        labelAdresa_value = new javax.swing.JLabel();
        labelKimnat_value = new javax.swing.JLabel();
        labelTyp_value = new javax.swing.JLabel();
        buttonDeatilsObject = new javax.swing.JButton();
        panelDohovir = new javax.swing.JPanel();
        labelNomerDohovoru = new javax.swing.JLabel();
        labelDataUkladannia = new javax.swing.JLabel();
        labelDataPochatkuOrendy = new javax.swing.JLabel();
        labelDataZakinchenniaOrendy = new javax.swing.JLabel();
        labelNomerDohovoru_value = new javax.swing.JLabel();
        labelDataUkladannia_value = new javax.swing.JLabel();
        labelDataPochatkuOrendy_value = new javax.swing.JLabel();
        labelDataZakinchenniaOrendy_value = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        labelStatus_value = new javax.swing.JLabel();
        buttonDeatilsDohovir = new javax.swing.JButton();
        panelInspekcia = new javax.swing.JPanel();
        labelData = new javax.swing.JLabel();
        labelSpivrobitnyk = new javax.swing.JLabel();
        labelClient = new javax.swing.JLabel();
        labelComentar = new javax.swing.JLabel();
        labelData_value = new javax.swing.JLabel();
        labelComentar_value = new javax.swing.JLabel();
        labelClient_value = new javax.swing.JLabel();
        labelSpivrobitnyk_value = new javax.swing.JLabel();
        buttonDeatilsSpivrobitnyk = new javax.swing.JButton();
        buttonDeatilsClient = new javax.swing.JButton();
        panelButtons = new javax.swing.JPanel();
        panelButtonOK = new javax.swing.JPanel();
        buttonOK = new javax.swing.JButton();
        panelButtonVidhylyty = new javax.swing.JPanel();
        buttonVidhylyty = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Деталі про інспекцію №4534");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Об'єкт"));

        labelAdresa.setText("Адреса:");
        labelAdresa.setName("labelAdresa"); // NOI18N

        labelKimnat.setText("Кімнат:");
        labelKimnat.setName("labelKimnat"); // NOI18N

        labelTyp.setText("Тип:");
        labelTyp.setName("labelTyp"); // NOI18N

        labelAdresa_value.setText("Олеко Дундича вулиця, буд. 22, кв. 13");
        labelAdresa_value.setName("labelAdresa_value"); // NOI18N

        labelKimnat_value.setText("2");
        labelKimnat_value.setName("labelKimnat_value"); // NOI18N

        labelTyp_value.setText("житловий");
        labelTyp_value.setName("labelTyp_value"); // NOI18N

        buttonDeatilsObject.setText("Детальніше про об'єкт...");
        buttonDeatilsObject.setName("buttonDeatilsObject"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAdresa)
                    .addComponent(labelKimnat)
                    .addComponent(labelTyp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTyp_value)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(buttonDeatilsObject, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKimnat_value)
                            .addComponent(labelAdresa_value))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdresa)
                    .addComponent(labelAdresa_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKimnat)
                    .addComponent(labelKimnat_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTyp)
                    .addComponent(labelTyp_value)
                    .addComponent(buttonDeatilsObject))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));

        panelDohovir.setBorder(javax.swing.BorderFactory.createTitledBorder("Договір"));

        labelNomerDohovoru.setText("Номер договору");
        labelNomerDohovoru.setName("labelNomerDohovoru"); // NOI18N

        labelDataUkladannia.setText("Дата укладання");
        labelDataUkladannia.setName("labelDataUkladannia"); // NOI18N

        labelDataPochatkuOrendy.setText("Дата початку оренди");
        labelDataPochatkuOrendy.setName("labelDataPochatkuOrendy"); // NOI18N

        labelDataZakinchenniaOrendy.setText("Дата закінчення оренди");
        labelDataZakinchenniaOrendy.setName("labelDataZakinchenniaOrendy"); // NOI18N

        labelNomerDohovoru_value.setText("228");
        labelNomerDohovoru_value.setName("labelNomerDohovoru_value"); // NOI18N

        labelDataUkladannia_value.setText("26.07.2016");
        labelDataUkladannia_value.setName("labelDataUkladannia_value"); // NOI18N

        labelDataPochatkuOrendy_value.setText("01.08.2016");
        labelDataPochatkuOrendy_value.setName("labelDataPochatkuOrendy_value"); // NOI18N

        labelDataZakinchenniaOrendy_value.setText("01.02.2017");
        labelDataZakinchenniaOrendy_value.setName("labelDataZakinchenniaOrendy_value"); // NOI18N

        labelStatus.setText("Статус");
        labelStatus.setName("labelStatus"); // NOI18N

        labelStatus_value.setText("Архів");
        labelStatus_value.setName("labelStatus_value"); // NOI18N

        buttonDeatilsDohovir.setText("Детальніше про договір...");
        buttonDeatilsDohovir.setName("buttonDeatilsDohovir"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelDohovir);
        panelDohovir.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomerDohovoru)
                    .addComponent(labelDataUkladannia)
                    .addComponent(labelDataPochatkuOrendy)
                    .addComponent(labelDataZakinchenniaOrendy))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDataZakinchenniaOrendy_value)
                    .addComponent(labelNomerDohovoru_value)
                    .addComponent(labelDataUkladannia_value)
                    .addComponent(labelDataPochatkuOrendy_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labelStatus)
                        .addGap(32, 32, 32)
                        .addComponent(labelStatus_value)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonDeatilsDohovir, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelStatus)
                        .addComponent(labelStatus_value))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNomerDohovoru)
                        .addComponent(labelNomerDohovoru_value)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataUkladannia)
                    .addComponent(labelDataUkladannia_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataPochatkuOrendy)
                    .addComponent(labelDataPochatkuOrendy_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataZakinchenniaOrendy)
                    .addComponent(labelDataZakinchenniaOrendy_value)
                    .addComponent(buttonDeatilsDohovir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(panelDohovir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 530, -1));

        panelInspekcia.setBorder(javax.swing.BorderFactory.createTitledBorder("Інспекція"));

        labelData.setText("Дата");
        labelData.setName("labelData"); // NOI18N

        labelSpivrobitnyk.setText("Співробітник");
        labelSpivrobitnyk.setName("labelSpivrobitnyk"); // NOI18N

        labelClient.setText("Клієнт");
        labelClient.setName("labelClient"); // NOI18N

        labelComentar.setText("Коментар");
        labelComentar.setName("labelComentar"); // NOI18N

        labelData_value.setText("01.01.2017");
        labelData_value.setName("labelData_value"); // NOI18N

        labelComentar_value.setText("Стан об'єкту задовільний");
        labelComentar_value.setName("labelComentar_value"); // NOI18N

        labelClient_value.setText("Глибовець Андрій Миколайович");
        labelClient_value.setName("labelClient_value"); // NOI18N

        labelSpivrobitnyk_value.setText("Джейк Джиллєнхол");
        labelSpivrobitnyk_value.setName("labelSpivrobitnyk_value"); // NOI18N

        buttonDeatilsSpivrobitnyk.setText("Детальніше про співробітника...");
        buttonDeatilsSpivrobitnyk.setName("buttonDeatilsSpivrobitnyk"); // NOI18N

        buttonDeatilsClient.setText("Детальніше про клієнта...");
        buttonDeatilsClient.setName("buttonDeatilsClient"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(panelInspekcia);
        panelInspekcia.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelSpivrobitnyk)
                        .addGap(18, 18, 18)
                        .addComponent(labelSpivrobitnyk_value)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDeatilsSpivrobitnyk))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelData)
                            .addComponent(labelComentar)
                            .addComponent(labelClient))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelData_value)
                                    .addComponent(labelComentar_value))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(labelClient_value)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(buttonDeatilsClient, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData)
                    .addComponent(labelData_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSpivrobitnyk)
                    .addComponent(labelSpivrobitnyk_value)
                    .addComponent(buttonDeatilsSpivrobitnyk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClient)
                    .addComponent(labelClient_value)
                    .addComponent(buttonDeatilsClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComentar)
                    .addComponent(labelComentar_value))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelInspekcia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 530, 150));

        panelButtons.setToolTipText("");
        panelButtons.setName("panelButtons"); // NOI18N
        panelButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelButtonOK.setName("panelButtonOK"); // NOI18N

        buttonOK.setText("ОК");
        buttonOK.setName("buttonOK"); // NOI18N
        buttonOK.setPreferredSize(null);
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1OKButtonClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(panelButtonOK);
        panelButtonOK.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonOK, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelButtons.add(panelButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 40));

        panelButtonVidhylyty.setName("panelButtonVidhylyty"); // NOI18N

        buttonVidhylyty.setText("Відхилити");
        buttonVidhylyty.setToolTipText("");
        buttonVidhylyty.setName("buttonVidhylyty"); // NOI18N
        buttonVidhylyty.setPreferredSize(null);
        buttonVidhylyty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2VidhylytyButtonClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(panelButtonVidhylyty);
        panelButtonVidhylyty.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonVidhylyty, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonVidhylyty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelButtons.add(panelButtonVidhylyty, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 40));

        getContentPane().add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 530, 70));

        pack();

        assignActionsToButtons();
    }

    private void assignActionsToButtons() {
        buttonDeatilsClient.addActionListener(actionEvent -> {
            dispose();
            clientDetailsFrame.setVisible(true);
        });

        buttonDeatilsDohovir.addActionListener(actionEvent -> {
            dispose();
            agreementDetailsFrame.setVisible(true);
        });

        buttonDeatilsObject.addActionListener(actionEvent -> {
            dispose();
            objectDetailsFrame.setVisible(true);
        });

        buttonDeatilsSpivrobitnyk.addActionListener(actionEvent -> {
            dispose();
            employeeDetailsFrame.setVisible(true);
        });
    }

    private void jButton1OKButtonClicked(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton2VidhylytyButtonClicked(java.awt.event.ActionEvent evt) {
        dispose();
        menuFrame.setVisible(true);
    }

}