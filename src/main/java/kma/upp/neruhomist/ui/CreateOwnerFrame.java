package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateOwnerFrame extends DelayedInitJFrame {
	
	private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonVidhylyty;
    private javax.swing.JLabel labelYurydychnaNazva;
    private javax.swing.JLabel labelYurydychnaTypBiznesu;
    private javax.swing.JLabel labelYurydychnaContactneImya;
    private javax.swing.JLabel labelFizychnaPrizvysche;
    private javax.swing.JLabel labelFizychnaImya;
    private javax.swing.JLabel labelFizychnaPoBatkovi;
    private javax.swing.JPanel panelTypOsoby;
    private javax.swing.JPanel panelTelefon;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelButtonOK;
    private javax.swing.JPanel panelButtonVidhylyty;
    private javax.swing.JRadioButton radiobuttonYurydychna;
    private javax.swing.JRadioButton radiobuttonFizychna;
    private javax.swing.JTextField textfieldTelefonOne;
    private javax.swing.JTextField textfieldTelefonTwo;
    private javax.swing.JTextField textfieldYurydychnaImya;
    private javax.swing.JTextField textfieldYurydychnaPoBatkovi;
    private javax.swing.JTextField textfieldYurydychnaPrizvysche;
    private javax.swing.JTextField textfieldYurydychnaTypBiznesu;
    private javax.swing.JTextField textfieldYurydychnaContactneImya;
    private javax.swing.JTextField textfieldYurydychnaNazva;

    @Autowired
    private MenuFrame menuFrame;
    
	public CreateOwnerFrame() {
        initComponents();
    }

    @Override
	protected void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelTypOsoby = new javax.swing.JPanel();
        radiobuttonYurydychna = new javax.swing.JRadioButton();
        radiobuttonFizychna = new javax.swing.JRadioButton();
        labelYurydychnaNazva = new javax.swing.JLabel();
        labelYurydychnaTypBiznesu = new javax.swing.JLabel();
        labelYurydychnaContactneImya = new javax.swing.JLabel();
        labelFizychnaPrizvysche = new javax.swing.JLabel();
        labelFizychnaImya = new javax.swing.JLabel();
        labelFizychnaPoBatkovi = new javax.swing.JLabel();
        textfieldYurydychnaImya = new javax.swing.JTextField();
        textfieldYurydychnaPoBatkovi = new javax.swing.JTextField();
        textfieldYurydychnaPrizvysche = new javax.swing.JTextField();
        textfieldYurydychnaTypBiznesu = new javax.swing.JTextField();
        textfieldYurydychnaContactneImya = new javax.swing.JTextField();
        textfieldYurydychnaNazva = new javax.swing.JTextField();
        panelTelefon = new javax.swing.JPanel();
        textfieldTelefonOne = new javax.swing.JTextField();
        textfieldTelefonTwo = new javax.swing.JTextField();
        panelButtons = new javax.swing.JPanel();
        panelButtonOK = new javax.swing.JPanel();
        buttonOK = new javax.swing.JButton();
        panelButtonVidhylyty = new javax.swing.JPanel();
        buttonVidhylyty = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Додати власника");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTypOsoby.setBorder(javax.swing.BorderFactory.createTitledBorder("Тип особи"));
        panelTypOsoby.setName("panelTypOsoby"); // NOI18N

        buttonGroup2.add(radiobuttonYurydychna);
        radiobuttonYurydychna.setText("Юридична");
        radiobuttonYurydychna.setName("radiobuttonYurydychna"); // NOI18N

        buttonGroup2.add(radiobuttonFizychna);
        radiobuttonFizychna.setSelected(true);
        radiobuttonFizychna.setText("Фізична");
        radiobuttonFizychna.setName("radiobuttonFizychna"); // NOI18N

        labelYurydychnaNazva.setText("Назва");
        labelYurydychnaNazva.setName("labelYurydychnaNazva"); // NOI18N

        labelYurydychnaTypBiznesu.setText("Тип бізнесу");
        labelYurydychnaTypBiznesu.setName("labelYurydychnaTypBiznesu"); // NOI18N

        labelYurydychnaContactneImya.setText("Контактне ім'я");
        labelYurydychnaContactneImya.setName("labelYurydychnaContactneImya"); // NOI18N

        labelFizychnaPrizvysche.setText("Прізвище");
        labelFizychnaPrizvysche.setName("labelFizychnaPrizvysche"); // NOI18N

        labelFizychnaImya.setText("Ім'я");
        labelFizychnaImya.setName("labelFizychnaImya"); // NOI18N

        labelFizychnaPoBatkovi.setText("По батькові");
        labelFizychnaPoBatkovi.setName("labelFizychnaPoBatkovi"); // NOI18N

        textfieldYurydychnaImya.setName("textfieldYurydychnaImya"); // NOI18N

        textfieldYurydychnaPoBatkovi.setName("textfieldYurydychnaPoBatkovi"); // NOI18N

        textfieldYurydychnaPrizvysche.setName("textfieldYurydychnaPrizvysche"); // NOI18N

        textfieldYurydychnaTypBiznesu.setName("textfieldYurydychnaTypBiznesu"); // NOI18N

        textfieldYurydychnaContactneImya.setName("textfieldYurydychnaContactneImya"); // NOI18N

        textfieldYurydychnaNazva.setName("textfieldYurydychnaNazva"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelTypOsoby);
        panelTypOsoby.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(radiobuttonYurydychna)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(radiobuttonFizychna)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelFizychnaPrizvysche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textfieldYurydychnaPrizvysche, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelYurydychnaNazva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textfieldYurydychnaNazva, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelYurydychnaTypBiznesu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textfieldYurydychnaTypBiznesu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelYurydychnaContactneImya)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textfieldYurydychnaContactneImya, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelFizychnaImya)
                        .addGap(18, 18, 18)
                        .addComponent(textfieldYurydychnaImya, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelFizychnaPoBatkovi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textfieldYurydychnaPoBatkovi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(radiobuttonYurydychna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelYurydychnaNazva)
                    .addComponent(labelYurydychnaContactneImya)
                    .addComponent(textfieldYurydychnaContactneImya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldYurydychnaNazva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelYurydychnaTypBiznesu)
                    .addComponent(textfieldYurydychnaTypBiznesu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(radiobuttonFizychna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFizychnaPrizvysche)
                    .addComponent(labelFizychnaImya)
                    .addComponent(labelFizychnaPoBatkovi)
                    .addComponent(textfieldYurydychnaImya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldYurydychnaPoBatkovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldYurydychnaPrizvysche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        getContentPane().add(panelTypOsoby, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 160));

        panelTelefon.setBorder(javax.swing.BorderFactory.createTitledBorder("Телефон"));
        panelTelefon.setName("panelTelefon"); // NOI18N

        textfieldTelefonOne.setName("textfieldTelefonOne"); // NOI18N

        textfieldTelefonTwo.setName("textfieldTelefonTwo"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelTelefon);
        panelTelefon.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textfieldTelefonOne, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textfieldTelefonTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldTelefonOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldTelefonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(panelTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 550, 60));

        panelButtons.setToolTipText("");
        panelButtons.setName("panelButtons"); // NOI18N
        panelButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelButtonOK.setName("panelButtonOK"); // NOI18N

        buttonOK.setText("ОК");
        buttonOK.setName("buttonOK"); // NOI18N
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonClicked(evt);
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
                VidhylytyButtonClicked(evt);
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

        getContentPane().add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 550, 40));

        pack();
    }
	
	private void OKButtonClicked(java.awt.event.ActionEvent evt) {                                 
        // TODO add your handling code here:
    }                                

    private void VidhylytyButtonClicked(java.awt.event.ActionEvent evt) {
	    dispose();
	    menuFrame.setVisible(true);
    }
}
