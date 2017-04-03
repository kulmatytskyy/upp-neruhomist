package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.repository.ObjectRepository;
import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class CreateObjectFrame extends DelayedInitJFrame {
	
	private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonVidhylyty;
    private JComboBox<Integer> dropdownKilkistKimnat;
    private javax.swing.JLabel labelVulytsia;
    private javax.swing.JLabel labelBudynok;
    private javax.swing.JLabel labelKvartyra;
    private javax.swing.JPanel panelAdresa;
    private javax.swing.JPanel panelTypPrymischennya;
    private javax.swing.JPanel panelKillistKimnat;
    private javax.swing.JPanel panelPlata;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelButtonOK;
    private javax.swing.JPanel panelButtonVidhylyty;
    private javax.swing.JRadioButton radiobuttonZhytlovy;
    private javax.swing.JRadioButton radiobuttonNezhytlovy;
    private javax.swing.JTextField textfieldVulytsia;
    private javax.swing.JTextField textfieldBudynok;
    private javax.swing.JTextField textfileldKvartyra;
    private javax.swing.JTextField textfieldPlata;

    @Autowired
    private ObjectRepository objectRepository;

    @Override
	protected void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelAdresa = new javax.swing.JPanel();
        labelVulytsia = new javax.swing.JLabel();
        textfieldVulytsia = new javax.swing.JTextField();
        textfieldBudynok = new javax.swing.JTextField();
        labelBudynok = new javax.swing.JLabel();
        textfileldKvartyra = new javax.swing.JTextField();
        labelKvartyra = new javax.swing.JLabel();
        panelTypPrymischennya = new javax.swing.JPanel();
        radiobuttonNezhytlovy = new javax.swing.JRadioButton();
        radiobuttonZhytlovy = new javax.swing.JRadioButton();
        panelKillistKimnat = new javax.swing.JPanel();
        dropdownKilkistKimnat = new javax.swing.JComboBox<Integer>();
        panelPlata = new javax.swing.JPanel();
        textfieldPlata = new javax.swing.JTextField();
        panelButtons = new javax.swing.JPanel();
        panelButtonOK = new javax.swing.JPanel();
        buttonOK = new javax.swing.JButton();
        panelButtonVidhylyty = new javax.swing.JPanel();
        buttonVidhylyty = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Додати об'єкт");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAdresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Адреса"));
        panelAdresa.setName("panelAdresa"); // NOI18N

        labelVulytsia.setText("Вулиця");
        labelVulytsia.setName("labelVulytsia"); // NOI18N

        textfieldVulytsia.setName("textfieldVulytsia"); // NOI18N

        textfieldBudynok.setName("textfieldBudynok"); // NOI18N

        labelBudynok.setText("Будинок");
        labelBudynok.setName("labelBudynok"); // NOI18N

        textfileldKvartyra.setName("textfileldKvartyra"); // NOI18N

        labelKvartyra.setText("Квартира");
        labelKvartyra.setName("labelKvartyra"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelAdresa);
        panelAdresa.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelVulytsia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldVulytsia, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(labelBudynok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldBudynok, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelKvartyra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfileldKvartyra, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelKvartyra)
                        .addComponent(textfileldKvartyra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textfieldBudynok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelBudynok))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelVulytsia)
                        .addComponent(textfieldVulytsia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelAdresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 60));

        panelTypPrymischennya.setBorder(javax.swing.BorderFactory.createTitledBorder("Тип приміщення"));
        panelTypPrymischennya.setName("panelTypPrymischennya"); // NOI18N

        buttonGroup1.add(radiobuttonNezhytlovy);
        radiobuttonNezhytlovy.setText("Нежитловий");
        radiobuttonNezhytlovy.setName("radiobuttonNezhytlovy"); // NOI18N

        buttonGroup1.add(radiobuttonZhytlovy);
        radiobuttonZhytlovy.setSelected(true);
        radiobuttonZhytlovy.setText("Житловий");
        radiobuttonZhytlovy.setMinimumSize(new java.awt.Dimension(89, 23));
        radiobuttonZhytlovy.setName("radiobuttonZhytlovy"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelTypPrymischennya);
        panelTypPrymischennya.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(radiobuttonZhytlovy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(radiobuttonNezhytlovy)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobuttonZhytlovy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiobuttonNezhytlovy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelTypPrymischennya, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 220, 60));

        panelKillistKimnat.setBorder(javax.swing.BorderFactory.createTitledBorder("Кількість кімнат"));
        panelKillistKimnat.setName("panelKillistKimnat"); // NOI18N

        dropdownKilkistKimnat.setModel(new javax.swing.DefaultComboBoxModel(objectRepository.allRoomsNum().toArray()));

        dropdownKilkistKimnat.setName("dropdownKilkistKimnat"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(panelKillistKimnat);
        panelKillistKimnat.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dropdownKilkistKimnat, 0, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(dropdownKilkistKimnat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(panelKillistKimnat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 150, 60));

        panelPlata.setBorder(javax.swing.BorderFactory.createTitledBorder("Плата"));
        panelPlata.setName("panelPlata"); // NOI18N

        textfieldPlata.setName("textfieldPlata"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(panelPlata);
        panelPlata.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textfieldPlata, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textfieldPlata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelPlata, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 130, 60));

        panelButtons.setName("panelButtons"); // NOI18N

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(panelButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelButtonVidhylyty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelButtonVidhylyty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 500, 40));

        pack();
    }
	
	
	private void jButton1OKButtonClicked(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton2VidhylytyButtonClicked(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    } 
}
