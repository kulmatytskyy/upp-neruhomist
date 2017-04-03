package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateEmployeeFrame extends DelayedInitJFrame {
	
	private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonVidhylyty;
    private javax.swing.JLabel labelPrizvysche;
    private javax.swing.JLabel labelImya;
    private javax.swing.JLabel labelPoBatkovi;
    private javax.swing.JPanel panelImya;
    private javax.swing.JPanel panelPosada;
    private javax.swing.JPanel panelTelefon;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelButtonOK;
    private javax.swing.JPanel panelButtonVidhylyty;
    private javax.swing.JTextField textfieldImya;
    private javax.swing.JTextField textfieldPoBatkovi;
    private javax.swing.JTextField textfieldPosada;
    private javax.swing.JTextField textfieldPrizvysche;
    private javax.swing.JTextField textfieldTelefonOne;
    private javax.swing.JTextField textfieldTelefonTwo;

    @Autowired
    private MenuFrame menuFrame;

    @Override
	protected void initComponents() {

        panelImya = new javax.swing.JPanel();
        textfieldPoBatkovi = new javax.swing.JTextField();
        textfieldImya = new javax.swing.JTextField();
        labelImya = new javax.swing.JLabel();
        labelPrizvysche = new javax.swing.JLabel();
        labelPoBatkovi = new javax.swing.JLabel();
        textfieldPrizvysche = new javax.swing.JTextField();
        panelPosada = new javax.swing.JPanel();
        textfieldPosada = new javax.swing.JTextField();
        panelTelefon = new javax.swing.JPanel();
        textfieldTelefonOne = new javax.swing.JTextField();
        textfieldTelefonTwo = new javax.swing.JTextField();
        panelButton = new javax.swing.JPanel();
        panelButtonOK = new javax.swing.JPanel();
        buttonOK = new javax.swing.JButton();
        panelButtonVidhylyty = new javax.swing.JPanel();
        buttonVidhylyty = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Додати співробітника");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        

        panelImya.setBorder(javax.swing.BorderFactory.createTitledBorder("Ім'я"));
        panelImya.setName("panelImya"); // NOI18N

        textfieldPoBatkovi.setName("textfieldPoBatkovi"); // NOI18N

        textfieldImya.setName("textfieldImya"); // NOI18N

        labelImya.setText("Ім'я");
        labelImya.setName("labelImya"); // NOI18N

        labelPrizvysche.setText("Прізвище");
        labelPrizvysche.setName("labelPrizvysche"); // NOI18N

        labelPoBatkovi.setText("По батькові");
        labelPoBatkovi.setName("labelPoBatkovi"); // NOI18N

        textfieldPrizvysche.setName("textfieldPrizvysche"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelImya);
        panelImya.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPrizvysche)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldPrizvysche, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelImya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldImya, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPoBatkovi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldPoBatkovi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelImya)
                    .addComponent(textfieldImya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPoBatkovi)
                    .addComponent(textfieldPoBatkovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrizvysche)
                    .addComponent(textfieldPrizvysche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(panelImya, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 60));

        panelPosada.setBorder(javax.swing.BorderFactory.createTitledBorder("Посада"));
        panelPosada.setName("panelPosada"); // NOI18N

        textfieldPosada.setName("textfieldPosada"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelPosada);
        panelPosada.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textfieldPosada, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textfieldPosada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelPosada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 60));

        panelTelefon.setBorder(javax.swing.BorderFactory.createTitledBorder("Телефон"));
        panelTelefon.setName("panelTelefon"); // NOI18N

        textfieldTelefonOne.setName("textfieldTelefonOne"); // NOI18N

        textfieldTelefonTwo.setName("textfieldTelefonTwo"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(panelTelefon);
        panelTelefon.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textfieldTelefonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textfieldTelefonTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldTelefonOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldTelefonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 320, 60));

        panelButton.setName("panelButton"); // NOI18N

        panelButtonOK.setName("panelButtonOK"); // NOI18N

        buttonOK.setText("ОК");
        buttonOK.setName("buttonOK"); // NOI18N
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
                .addComponent(buttonOK))
        );

        panelButtonVidhylyty.setName("panelButtonVidhylyty"); // NOI18N

        buttonVidhylyty.setText("Відхилити");
        buttonVidhylyty.setToolTipText("");
        buttonVidhylyty.setName("buttonVidhylyty"); // NOI18N
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
                .addComponent(buttonVidhylyty))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(panelButton);
        panelButton.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(panelButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(panelButtonVidhylyty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelButtonVidhylyty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 510, 50));

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
