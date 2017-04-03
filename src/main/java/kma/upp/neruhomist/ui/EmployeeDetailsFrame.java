package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDetailsFrame extends DelayedInitJFrame {

    private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonVidhylyty;
    private javax.swing.JButton buttonDetailsDohovir;
    private javax.swing.JButton buttonDetailsObject;
    private javax.swing.JLabel labelSpivrobitnyk;
    private javax.swing.JLabel labelTelefon;
    private javax.swing.JLabel labelPosada;
    private javax.swing.JLabel labelTelefon_value;
    private javax.swing.JLabel labelPosada_value;
    private javax.swing.JPanel panelSpivrobitnyk;
    private javax.swing.JPanel panelDohovory;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelButtonOK;
    private javax.swing.JPanel panelButtonVidhylyty;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDohovory;

    @Autowired
    private MenuFrame menuFrame;

    @Override
    protected void initComponents() {

        panelSpivrobitnyk = new javax.swing.JPanel();
        labelSpivrobitnyk = new javax.swing.JLabel();
        labelTelefon = new javax.swing.JLabel();
        labelPosada = new javax.swing.JLabel();
        labelTelefon_value = new javax.swing.JLabel();
        labelPosada_value = new javax.swing.JLabel();
        panelDohovory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDohovory = new javax.swing.JTable();
        buttonDetailsDohovir = new javax.swing.JButton();
        buttonDetailsObject = new javax.swing.JButton();
        panelButtons = new javax.swing.JPanel();
        panelButtonOK = new javax.swing.JPanel();
        buttonOK = new javax.swing.JButton();
        panelButtonVidhylyty = new javax.swing.JPanel();
        buttonVidhylyty = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Деталі про співробітника №37");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSpivrobitnyk.setBorder(javax.swing.BorderFactory.createTitledBorder("Співробітник"));
        panelSpivrobitnyk.setName("panelSpivrobitnyk"); // NOI18N

        labelSpivrobitnyk.setText("Джейк Джиллєнхол");
        labelSpivrobitnyk.setName("labelSpivrobitnyk"); // NOI18N

        labelTelefon.setText("Телефон");
        labelTelefon.setName("labelTelefon"); // NOI18N

        labelPosada.setText("Посада");
        labelPosada.setName("labelPosada"); // NOI18N

        labelTelefon_value.setText("0449379992");
        labelTelefon_value.setName("labelTelefon_value"); // NOI18N

        labelPosada_value.setText("молодший черговий інженер");
        labelPosada_value.setName("labelPosada_value"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelSpivrobitnyk);
        panelSpivrobitnyk.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSpivrobitnyk)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTelefon)
                            .addComponent(labelPosada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPosada_value)
                            .addComponent(labelTelefon_value))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelSpivrobitnyk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefon)
                    .addComponent(labelTelefon_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPosada)
                    .addComponent(labelPosada_value))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(panelSpivrobitnyk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 400, 90));

        panelDohovory.setBorder(javax.swing.BorderFactory.createTitledBorder("Договори"));
        panelDohovory.setName("panelDohovory"); // NOI18N

        tableDohovory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Дубенська вулиця, 35", "активний"},
                {"Дундича Олеко проспект, 22", "неактивний"},
                {"Князя Романа вулиця, 7", "активний"},
                {"Соборна вулиця, 151", "активний"}
            },
            new String [] {
                "Клієнт", "Стан"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDohovory.setName("tableDohovory"); // NOI18N
        jScrollPane1.setViewportView(tableDohovory);
        if (tableDohovory.getColumnModel().getColumnCount() > 0) {
            tableDohovory.getColumnModel().getColumn(0).setPreferredWidth(200);
        }

        buttonDetailsDohovir.setText("Детальніше про договір...");
        buttonDetailsDohovir.setName("buttonDetailsDohovir"); // NOI18N

        buttonDetailsObject.setText("Детальніше про об'єкт...");
        buttonDetailsObject.setName("buttonDetailsObject"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelDohovory);
        panelDohovory.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonDetailsDohovir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDetailsObject, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(buttonDetailsObject))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(panelDohovory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 170));

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

        getContentPane().add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 400, 40));

        pack();
    }

    private void jButton1OKButtonClicked(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton2VidhylytyButtonClicked(java.awt.event.ActionEvent evt) {
        dispose();
        menuFrame.setVisible(true);
    }

}
