package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.stereotype.Component;

import javax.swing.JFrame;

@Component
public class NewAgreementFrame extends DelayedInitJFrame {

	private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonDetailsClient;
    private javax.swing.JButton buttonNovyClient;
    private javax.swing.JButton buttonDetailsSpivrobitnyk;
    private javax.swing.JButton buttonNovySpivrobitnyk;
    private javax.swing.JButton buttonDetailsObject;
    private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonVidhylyty;
    private javax.swing.JLabel labelClientTelefon;
    private javax.swing.JLabel labelSpivrobitnykImya_value;
    private javax.swing.JLabel labelObjectAdresa_value;
    private javax.swing.JLabel labelObjectKimnat_value;
    private javax.swing.JLabel labelObjectTyp_value;
    private javax.swing.JLabel labelObjectPlata_value;
    private javax.swing.JLabel labelClientImya;
    private javax.swing.JLabel labelObjectAdresa;
    private javax.swing.JLabel labelObjectKimnat;
    private javax.swing.JLabel labelObjectTyp;
    private javax.swing.JLabel labelObjectPlata;
    private javax.swing.JLabel labelClientImya_value;
    private javax.swing.JLabel labelSpivrobitnykTelefon;
    private javax.swing.JLabel labelSpivrobitnykImya;
    private javax.swing.JPanel panelClient;
    private javax.swing.JPanel panelSpivrobitnyk;
    private javax.swing.JPanel panelObject;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelButtonOK;
    private javax.swing.JPanel panelButtonVidhylyty;
    private javax.swing.JRadioButton radiobuttonClientNovy;
    private javax.swing.JRadioButton radiobuttonClientIsnuuchyi;
    private javax.swing.JRadioButton radiobuttonSpivrobitnykNovy;
    private javax.swing.JRadioButton radiobuttonSpivrobitnykIsnuuchyi;
    private javax.swing.JTextField labelClientTelefon_value;
    private javax.swing.JTextField labelSpivrobitnykTelefon_value;

    @Override
	protected void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelClient = new javax.swing.JPanel();
        radiobuttonClientNovy = new javax.swing.JRadioButton();
        radiobuttonClientIsnuuchyi = new javax.swing.JRadioButton();
        labelClientTelefon = new javax.swing.JLabel();
        labelClientImya = new javax.swing.JLabel();
        labelClientImya_value = new javax.swing.JLabel();
        labelClientTelefon_value = new javax.swing.JTextField();
        buttonDetailsClient = new javax.swing.JButton();
        buttonNovyClient = new javax.swing.JButton();
        panelSpivrobitnyk = new javax.swing.JPanel();
        radiobuttonSpivrobitnykNovy = new javax.swing.JRadioButton();
        radiobuttonSpivrobitnykIsnuuchyi = new javax.swing.JRadioButton();
        labelSpivrobitnykImya = new javax.swing.JLabel();
        buttonDetailsSpivrobitnyk = new javax.swing.JButton();
        labelSpivrobitnykImya_value = new javax.swing.JLabel();
        labelSpivrobitnykTelefon_value = new javax.swing.JTextField();
        labelSpivrobitnykTelefon = new javax.swing.JLabel();
        buttonNovySpivrobitnyk = new javax.swing.JButton();
        panelObject = new javax.swing.JPanel();
        labelObjectAdresa = new javax.swing.JLabel();
        labelObjectKimnat = new javax.swing.JLabel();
        labelObjectTyp = new javax.swing.JLabel();
        labelObjectPlata = new javax.swing.JLabel();
        buttonDetailsObject = new javax.swing.JButton();
        labelObjectAdresa_value = new javax.swing.JLabel();
        labelObjectKimnat_value = new javax.swing.JLabel();
        labelObjectTyp_value = new javax.swing.JLabel();
        labelObjectPlata_value = new javax.swing.JLabel();
        panelButtons = new javax.swing.JPanel();
        panelButtonOK = new javax.swing.JPanel();
        buttonOK = new javax.swing.JButton();
        panelButtonVidhylyty = new javax.swing.JPanel();
        buttonVidhylyty = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Новий договір");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelClient.setBorder(javax.swing.BorderFactory.createTitledBorder("Клієнт"));
        panelClient.setName("panelClient"); // NOI18N

        buttonGroup2.add(radiobuttonClientNovy);
        radiobuttonClientNovy.setText("Новий");
        radiobuttonClientNovy.setName("radiobuttonClientNovy"); // NOI18N

        buttonGroup2.add(radiobuttonClientIsnuuchyi);
        radiobuttonClientIsnuuchyi.setSelected(true);
        radiobuttonClientIsnuuchyi.setText("Існуючий");
        radiobuttonClientIsnuuchyi.setName("radiobuttonClientIsnuuchyi"); // NOI18N

        labelClientTelefon.setText("Телефон:");
        labelClientTelefon.setName("labelClientTelefon"); // NOI18N

        labelClientImya.setText("Клієнт:");
        labelClientImya.setName("labelClientImya"); // NOI18N

        labelClientImya_value.setText("Глибовець Андрій Миколайович");
        labelClientImya_value.setName("labelClientImya_value"); // NOI18N

        labelClientTelefon_value.setText("0449379992");

        buttonDetailsClient.setText("Детальніше про клієнта...");
        buttonDetailsClient.setName("buttonDetailsClient"); // NOI18N

        buttonNovyClient.setText("Додати нового клієнта...");
        buttonNovyClient.setName("buttonNovyClient"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelClient);
        panelClient.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiobuttonClientIsnuuchyi)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelClientTelefon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelClientTelefon_value, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelClientImya)
                                .addGap(18, 18, 18)
                                .addComponent(labelClientImya_value))
                            .addComponent(radiobuttonClientNovy))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonDetailsClient, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(buttonNovyClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobuttonClientNovy)
                    .addComponent(buttonNovyClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiobuttonClientIsnuuchyi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClientTelefon)
                    .addComponent(labelClientTelefon_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClientImya)
                    .addComponent(labelClientImya_value)
                    .addComponent(buttonDetailsClient))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        getContentPane().add(panelClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 480, -1));

        panelSpivrobitnyk.setBorder(javax.swing.BorderFactory.createTitledBorder("Співробітник"));
        panelSpivrobitnyk.setName("panelSpivrobitnyk"); // NOI18N

        buttonGroup1.add(radiobuttonSpivrobitnykNovy);
        radiobuttonSpivrobitnykNovy.setText("Новий");
        radiobuttonSpivrobitnykNovy.setName("radiobuttonSpivrobitnykNovy"); // NOI18N

        buttonGroup1.add(radiobuttonSpivrobitnykIsnuuchyi);
        radiobuttonSpivrobitnykIsnuuchyi.setSelected(true);
        radiobuttonSpivrobitnykIsnuuchyi.setText("Існуючий");
        radiobuttonSpivrobitnykIsnuuchyi.setName("radiobuttonSpivrobitnykIsnuuchyi"); // NOI18N

        labelSpivrobitnykImya.setText("Співробітник:");
        labelSpivrobitnykImya.setName("labelSpivrobitnykImya"); // NOI18N

        buttonDetailsSpivrobitnyk.setText("Детальніше про співробітника...");
        buttonDetailsSpivrobitnyk.setName("buttonDetailsSpivrobitnyk"); // NOI18N

        labelSpivrobitnykImya_value.setText("Джейк Джиллєнхол");
        labelSpivrobitnykImya_value.setName("labelSpivrobitnykImya_value"); // NOI18N

        labelSpivrobitnykTelefon_value.setText("0631234567");

        labelSpivrobitnykTelefon.setText("Телефон:");
        labelSpivrobitnykTelefon.setName("labelSpivrobitnykTelefon"); // NOI18N

        buttonNovySpivrobitnyk.setText("Додати нового співробітника...");
        buttonNovySpivrobitnyk.setName("buttonNovySpivrobitnyk"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelSpivrobitnyk);
        panelSpivrobitnyk.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelSpivrobitnykImya)
                                .addGap(18, 18, 18)
                                .addComponent(labelSpivrobitnykImya_value))
                            .addComponent(radiobuttonSpivrobitnykNovy)
                            .addComponent(radiobuttonSpivrobitnykIsnuuchyi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonNovySpivrobitnyk, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDetailsSpivrobitnyk, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelSpivrobitnykTelefon)
                        .addGap(39, 39, 39)
                        .addComponent(labelSpivrobitnykTelefon_value, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobuttonSpivrobitnykNovy)
                    .addComponent(buttonNovySpivrobitnyk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiobuttonSpivrobitnykIsnuuchyi)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSpivrobitnykTelefon)
                    .addComponent(labelSpivrobitnykTelefon_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSpivrobitnykImya)
                    .addComponent(labelSpivrobitnykImya_value)
                    .addComponent(buttonDetailsSpivrobitnyk))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(panelSpivrobitnyk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 480, 170));

        panelObject.setBorder(javax.swing.BorderFactory.createTitledBorder("Об'єкт"));
        panelObject.setName("panelObject"); // NOI18N

        labelObjectAdresa.setText("Адреса:");
        labelObjectAdresa.setName("labelObjectAdresa"); // NOI18N

        labelObjectKimnat.setText("Кімнат:");
        labelObjectKimnat.setName("labelObjectKimnat"); // NOI18N

        labelObjectTyp.setText("Тип:");
        labelObjectTyp.setName("labelObjectTyp"); // NOI18N

        labelObjectPlata.setText("Плата:");
        labelObjectPlata.setName("labelObjectPlata"); // NOI18N

        buttonDetailsObject.setText("Детальніше про об'єкт...");
        buttonDetailsObject.setName("buttonDetailsObject"); // NOI18N

        labelObjectAdresa_value.setText("Олеко Дундича проспект, буд.22, кв.13");
        labelObjectAdresa_value.setName("labelObjectAdresa_value"); // NOI18N

        labelObjectKimnat_value.setText("2");
        labelObjectKimnat_value.setName("labelObjectKimnat_value"); // NOI18N

        labelObjectTyp_value.setText("житловий");
        labelObjectTyp_value.setToolTipText("");
        labelObjectTyp_value.setName("labelObjectTyp_value"); // NOI18N

        labelObjectPlata_value.setText("5000");
        labelObjectPlata_value.setName("labelObjectPlata_value"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(panelObject);
        panelObject.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelObjectAdresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelObjectAdresa_value))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelObjectKimnat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelObjectKimnat_value))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(labelObjectTyp_value))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelObjectTyp)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(labelObjectPlata)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelObjectPlata_value)))
                                .addGap(28, 28, 28)))
                        .addGap(116, 116, 116)
                        .addComponent(buttonDetailsObject, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelObjectAdresa)
                    .addComponent(labelObjectAdresa_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelObjectKimnat)
                    .addComponent(labelObjectKimnat_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelObjectTyp)
                    .addComponent(labelObjectTyp_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelObjectPlata)
                    .addComponent(labelObjectPlata_value))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDetailsObject)
                .addContainerGap())
        );

        getContentPane().add(panelObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 480, 120));

        panelButtons.setToolTipText("");
        panelButtons.setName("panelButtons"); // NOI18N
        panelButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelButtonOK.setName("panelButtonOK"); // NOI18N

        buttonOK.setText("ОК");
        buttonOK.setName("buttonOK"); // NOI18N
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6OKButtonClicked(evt);
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

        panelButtons.add(panelButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelButtonVidhylyty.setName("panelButtonVidhylyty"); // NOI18N

        buttonVidhylyty.setText("Відхилити");
        buttonVidhylyty.setToolTipText("");
        buttonVidhylyty.setName("buttonVidhylyty"); // NOI18N
        buttonVidhylyty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7VidhylytyButtonClicked(evt);
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

        panelButtons.add(panelButtonVidhylyty, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        getContentPane().add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 480, 40));

        pack();
    }
	
	private void jButton6OKButtonClicked(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton7VidhylytyButtonClicked(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }   

}
