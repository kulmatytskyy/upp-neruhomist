package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AgreementDetailsFrame extends DelayedInitJFrame {

    private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonVidhylyty;
    private javax.swing.JButton buttonDeatilsDohovir;
    private javax.swing.JButton buttonDeatilsObject;
    private javax.swing.JButton buttonDeatilsSpivrobitnyk;
    private javax.swing.JButton buttonDeatilsClient;
    private javax.swing.JButton buttonDetailsInspekcia;
    private javax.swing.JLabel labelAdresa;
    private javax.swing.JLabel labelAdresa_value;
    private javax.swing.JLabel labelKimnat_value;
    private javax.swing.JLabel labelTyp_value;
    private javax.swing.JLabel labelNomerDohovoru_value;
    private javax.swing.JLabel labelDataUkladannia_value;
    private javax.swing.JLabel labelDataPochatkuOrendy_value;
    private javax.swing.JLabel labelDataZakinchenniaOrendy_value;
    private javax.swing.JLabel labelKimnat;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelStatus_value;
    private javax.swing.JLabel labelClient;
    private javax.swing.JLabel labelClientTelefon;
    private javax.swing.JLabel labelOwner;
    private javax.swing.JLabel labelTyp;
    private javax.swing.JLabel labelClientTelefon_value;
    private javax.swing.JLabel labelOwnerTelefon;
    private javax.swing.JLabel labelOwnerTelefon_value;
    private javax.swing.JLabel labelNomerDohovoru;
    private javax.swing.JLabel labelDataUkladannia;
    private javax.swing.JLabel labelDataPochatkuOrendy;
    private javax.swing.JLabel labelDataZakinchenniaOrendy;
    private javax.swing.JPanel panelObject;
    private javax.swing.JPanel panelOwner;
    private javax.swing.JPanel panelInspekcii;
    private javax.swing.JPanel panelDohovir;
    private javax.swing.JPanel panelClient;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelButtonOK;
    private javax.swing.JPanel panelButtonVidhylyty;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableInspekcia;

    @Autowired
    private MenuFrame menuFrame;

    @Autowired
    private ObjectDetailsFrame objectDetailsFrame;

    @Autowired
    private EmployeeDetailsFrame employeeDetailsFrame;

    @Autowired
    private ClientDetailsFrame clientDetailsFrame;

    @Autowired
    private AgreementDetailsFrame agreementDetailsFrame;

    @Autowired
    private InspectionDetailsFrame inspectionDetailsFrame;

    @Override
    protected void initComponents() {

        panelObject = new javax.swing.JPanel();
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
        panelButtons = new javax.swing.JPanel();
        panelButtonOK = new javax.swing.JPanel();
        buttonOK = new javax.swing.JButton();
        panelButtonVidhylyty = new javax.swing.JPanel();
        buttonVidhylyty = new javax.swing.JButton();
        panelClient = new javax.swing.JPanel();
        labelClient = new javax.swing.JLabel();
        labelClientTelefon = new javax.swing.JLabel();
        labelClientTelefon_value = new javax.swing.JLabel();
        buttonDeatilsSpivrobitnyk = new javax.swing.JButton();
        panelOwner = new javax.swing.JPanel();
        labelOwner = new javax.swing.JLabel();
        labelOwnerTelefon = new javax.swing.JLabel();
        labelOwnerTelefon_value = new javax.swing.JLabel();
        buttonDeatilsClient = new javax.swing.JButton();
        panelInspekcii = new javax.swing.JPanel();
        buttonDetailsInspekcia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInspekcia = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Деталі договору №228");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelObject.setBorder(javax.swing.BorderFactory.createTitledBorder("Об'єкт"));
        panelObject.setName("panelObject"); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelObject);
        panelObject.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAdresa)
                            .addComponent(labelKimnat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKimnat_value)
                            .addComponent(labelAdresa_value)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTyp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTyp_value)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(buttonDeatilsObject, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdresa)
                    .addComponent(labelAdresa_value))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelKimnat)
                            .addComponent(labelKimnat_value))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTyp)
                            .addComponent(labelTyp_value))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDeatilsObject)
                        .addGap(20, 20, 20))))
        );

        getContentPane().add(panelObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 530, 100));

        panelDohovir.setBorder(javax.swing.BorderFactory.createTitledBorder("Договір"));
        panelDohovir.setName("panelDohovir"); // NOI18N

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

        getContentPane().add(panelDohovir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, -1));

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

        panelButtons.add(panelButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 40));

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

        panelButtons.add(panelButtonVidhylyty, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, 40));

        getContentPane().add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 540, 40));

        panelClient.setBorder(javax.swing.BorderFactory.createTitledBorder("Клієнт"));
        panelClient.setName("panelClient"); // NOI18N

        labelClient.setText("Глибовець Андрій Миколайович");
        labelClient.setName("labelClient"); // NOI18N

        labelClientTelefon.setText("Телефон");
        labelClientTelefon.setName("labelClientTelefon"); // NOI18N

        labelClientTelefon_value.setText("0449379992");
        labelClientTelefon_value.setName("labelClientTelefon_value"); // NOI18N

        buttonDeatilsSpivrobitnyk.setText("Детальніше про співробітника...");
        buttonDeatilsSpivrobitnyk.setName("buttonDeatilsSpivrobitnyk"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(panelClient);
        panelClient.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelClient)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelClientTelefon)
                        .addGap(136, 136, 136)
                        .addComponent(labelClientTelefon_value)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(buttonDeatilsSpivrobitnyk)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelClientTelefon)
                            .addComponent(labelClientTelefon_value, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonDeatilsSpivrobitnyk)))
                .addContainerGap())
        );

        getContentPane().add(panelClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 530, 60));

        panelOwner.setBorder(javax.swing.BorderFactory.createTitledBorder("Власник"));
        panelOwner.setName("panelOwner"); // NOI18N

        labelOwner.setText("Джейк Джиллєнхол");
        labelOwner.setName("labelOwner"); // NOI18N

        labelOwnerTelefon.setText("Телефон");
        labelOwnerTelefon.setName("labelOwnerTelefon"); // NOI18N

        labelOwnerTelefon_value.setText("0447777777");
        labelOwnerTelefon_value.setName("labelOwnerTelefon_value"); // NOI18N

        buttonDeatilsClient.setText("Детальніше про клієнта...");
        buttonDeatilsClient.setName("buttonDeatilsClient"); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(panelOwner);
        panelOwner.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(labelOwnerTelefon)
                        .addGap(135, 135, 135)
                        .addComponent(labelOwnerTelefon_value))
                    .addComponent(labelOwner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(buttonDeatilsClient, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(labelOwner)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelOwnerTelefon)
                            .addComponent(labelOwnerTelefon_value))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonDeatilsClient)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, 530, 60));

        panelInspekcii.setBorder(javax.swing.BorderFactory.createTitledBorder("Інспекції"));
        panelInspekcii.setName("panelInspekcii"); // NOI18N

        buttonDetailsInspekcia.setText("Детальніше про інспекцію...");
        buttonDetailsInspekcia.setActionCommand("Детальніше про інспекцію...");
        buttonDetailsInspekcia.setName("buttonDetailsInspekcia"); // NOI18N

        tableInspekcia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01.02.2017", "заплановано"},
                {"01.01.2017", "проведено"},
                {"01.12.2016", "проведено"},
                {"01.11.2017", "проведено"}
            },
            new String [] {
                "Дата", "Стан"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableInspekcia.setName("tableInspekcia"); // NOI18N
        jScrollPane1.setViewportView(tableInspekcia);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(panelInspekcii);
        panelInspekcii.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDetailsInspekcia, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(buttonDetailsInspekcia))
        );

        getContentPane().add(panelInspekcii, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 530, 150));

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

        buttonDetailsInspekcia.addActionListener(actionEvent -> {
            dispose();
            inspectionDetailsFrame.setVisible(true);
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