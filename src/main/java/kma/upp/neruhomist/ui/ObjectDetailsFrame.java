package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjectDetailsFrame extends DelayedInitJFrame {

    private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonVidhylyty;
    private javax.swing.JButton buttonDetailsDohovir;
    private javax.swing.JButton buttonDetailsVlasnyk;
    private javax.swing.JButton buttonDetailsClient;
    private javax.swing.JLabel labelKilkistKimnat;
    private javax.swing.JLabel labelKilkistKimnat_value;
    private javax.swing.JLabel labelPlata;
    private javax.swing.JLabel labelPlata_value;
    private javax.swing.JLabel labelVlasnyk;
    private javax.swing.JLabel labelTelefon;
    private javax.swing.JLabel labelTelefon_value;
    private javax.swing.JLabel labelVulytsia;
    private javax.swing.JLabel labelBudynok;
    private javax.swing.JLabel labelKvartyra;
    private javax.swing.JLabel labelTyp;
    private javax.swing.JLabel labelVulytsia_value;
    private javax.swing.JLabel labelBudynok_value;
    private javax.swing.JLabel labelKvartyra_value;
    private javax.swing.JLabel labelTyp_value;
    private javax.swing.JPanel panelObject;
    private javax.swing.JPanel panelDohovory;
    private javax.swing.JPanel panelVlasnyk;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelButtonOK;
    private javax.swing.JPanel panelButtonVidhylyty;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDohovory;

    @Autowired
    private MenuFrame menuFrame;

    @Autowired
    private AgreementDetailsFrame agreementDetailsFrame;

    @Autowired
    private OwnerDetailsFrame ownerDetailsFrame;

    @Autowired
    private ClientDetailsFrame clientDetailsFrame;

    @Override
    protected void initComponents() {

        panelObject = new javax.swing.JPanel();
        labelVulytsia = new javax.swing.JLabel();
        labelBudynok = new javax.swing.JLabel();
        labelKvartyra = new javax.swing.JLabel();
        labelTyp = new javax.swing.JLabel();
        labelVulytsia_value = new javax.swing.JLabel();
        labelBudynok_value = new javax.swing.JLabel();
        labelKvartyra_value = new javax.swing.JLabel();
        labelTyp_value = new javax.swing.JLabel();
        labelKilkistKimnat = new javax.swing.JLabel();
        labelKilkistKimnat_value = new javax.swing.JLabel();
        labelPlata = new javax.swing.JLabel();
        labelPlata_value = new javax.swing.JLabel();
        panelDohovory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDohovory = new javax.swing.JTable();
        buttonDetailsDohovir = new javax.swing.JButton();
        buttonDetailsClient = new javax.swing.JButton();
        panelButtons = new javax.swing.JPanel();
        panelButtonOK = new javax.swing.JPanel();
        buttonOK = new javax.swing.JButton();
        panelButtonVidhylyty = new javax.swing.JPanel();
        buttonVidhylyty = new javax.swing.JButton();
        panelVlasnyk = new javax.swing.JPanel();
        labelVlasnyk = new javax.swing.JLabel();
        labelTelefon = new javax.swing.JLabel();
        labelTelefon_value = new javax.swing.JLabel();
        buttonDetailsVlasnyk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Деталі про об'єкт №45");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelObject.setBorder(javax.swing.BorderFactory.createTitledBorder("Об'єкт"));
        panelObject.setName("panelObject"); // NOI18N

        labelVulytsia.setText("Вулиця");
        labelVulytsia.setName("labelVulytsia"); // NOI18N

        labelBudynok.setText("Будинок");
        labelBudynok.setName("labelBudynok"); // NOI18N

        labelKvartyra.setText("Квартира");
        labelKvartyra.setName("labelKvartyra"); // NOI18N

        labelTyp.setText("Тип");
        labelTyp.setName("labelTyp"); // NOI18N

        labelVulytsia_value.setText("Олеко Дундича вулиця");
        labelVulytsia_value.setName("labelVulytsia_value"); // NOI18N

        labelBudynok_value.setText("22");
        labelBudynok_value.setName("labelBudynok_value"); // NOI18N

        labelKvartyra_value.setText("13");
        labelKvartyra_value.setName("labelKvartyra_value"); // NOI18N

        labelTyp_value.setText("житловий");
        labelTyp_value.setName("labelTyp_value"); // NOI18N

        labelKilkistKimnat.setText("Кількість кімнат");
        labelKilkistKimnat.setName("labelKilkistKimnat"); // NOI18N

        labelKilkistKimnat_value.setText("2");
        labelKilkistKimnat_value.setName("labelKilkistKimnat_value"); // NOI18N

        labelPlata.setText("Плата");
        labelPlata.setName("labelPlata"); // NOI18N

        labelPlata_value.setText("6600");
        labelPlata_value.setName("labelPlata_value"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelObject);
        panelObject.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelVulytsia)
                                                        .addComponent(labelBudynok)
                                                        .addComponent(labelKvartyra)
                                                        .addComponent(labelTyp))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelTyp_value)
                                                        .addComponent(labelBudynok_value)
                                                        .addComponent(labelVulytsia_value)
                                                        .addComponent(labelKvartyra_value)
                                                        .addComponent(labelKilkistKimnat_value)
                                                        .addComponent(labelPlata_value))
                                                .addContainerGap(126, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelPlata)
                                                        .addComponent(labelKilkistKimnat))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelVulytsia)
                                        .addComponent(labelVulytsia_value))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelBudynok)
                                        .addComponent(labelBudynok_value))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelKvartyra)
                                        .addComponent(labelKvartyra_value))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelTyp)
                                        .addComponent(labelTyp_value))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelKilkistKimnat)
                                        .addComponent(labelKilkistKimnat_value))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelPlata)
                                        .addComponent(labelPlata_value))
                                .addGap(0, 13, Short.MAX_VALUE))
        );

        getContentPane().add(panelObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 400, 150));

        panelDohovory.setBorder(javax.swing.BorderFactory.createTitledBorder("Договори"));
        panelDohovory.setName("panelDohovory"); // NOI18N

        tableDohovory.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"Глибовець Андрій Миколайович", "активний"},
                        {"Джаред Лєто", "неактивний"},
                        {"Кемба Уолкер", "активний"},
                        {"Марло Брандо", "активний"}
                },
                new String[]{
                        "Клієнт", "Стан"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        tableDohovory.setName("tableDohovory"); // NOI18N
        jScrollPane1.setViewportView(tableDohovory);
        if (tableDohovory.getColumnModel().getColumnCount() > 0) {
            tableDohovory.getColumnModel().getColumn(0).setPreferredWidth(200);
        }

        buttonDetailsDohovir.setText("Детальніше про договір...");
        buttonDetailsDohovir.setName("buttonDetailsDohovir"); // NOI18N

        buttonDetailsClient.setText("Детальніше про клієнта...");
        buttonDetailsClient.setName("buttonDetailsClient"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelDohovory);
        panelDohovory.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(buttonDetailsDohovir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonDetailsClient, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonDetailsDohovir)
                                        .addComponent(buttonDetailsClient))
                                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(panelDohovory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 400, 170));

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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addComponent(buttonOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelButtons.add(panelButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

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
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addComponent(buttonVidhylyty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelButtons.add(panelButtonVidhylyty, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        getContentPane().add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 400, 40));

        panelVlasnyk.setBorder(javax.swing.BorderFactory.createTitledBorder("Власник"));
        panelVlasnyk.setName("panelVlasnyk"); // NOI18N

        labelVlasnyk.setText("Майкл Джордан");
        labelVlasnyk.setName("labelVlasnyk"); // NOI18N

        labelTelefon.setText("Телефон");
        labelTelefon.setName("labelTelefon"); // NOI18N

        labelTelefon_value.setText("0447777777");
        labelTelefon_value.setName("labelTelefon_value"); // NOI18N

        buttonDetailsVlasnyk.setText("Детальніше про власника...");
        buttonDetailsVlasnyk.setName("buttonDetailsVlasnyk"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(panelVlasnyk);
        panelVlasnyk.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(buttonDetailsVlasnyk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelVlasnyk)
                                                        .addComponent(labelTelefon))
                                                .addGap(91, 91, 91)
                                                .addComponent(labelTelefon_value)))
                                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(labelVlasnyk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelTelefon)
                                        .addComponent(labelTelefon_value))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDetailsVlasnyk)
                                .addGap(0, 14, Short.MAX_VALUE))
        );

        getContentPane().add(panelVlasnyk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 400, 100));

        pack();

        assignActionsToButtons();
    }

    private void assignActionsToButtons() {
        buttonDetailsClient.addActionListener(actionEvent -> {
            dispose();
            clientDetailsFrame.setVisible(true);
        });

        buttonDetailsDohovir.addActionListener(actionEvent -> {
            dispose();
            agreementDetailsFrame.setVisible(true);
        });

        buttonDetailsVlasnyk.addActionListener(actionEvent -> {
            dispose();
            ownerDetailsFrame.setVisible(true);
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
