package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

@Component
public class OwnerDetailsFrame extends DelayedInitJFrame {

    private javax.swing.JButton buttonOK;
    private javax.swing.JButton buttonVidhylyty;
    private javax.swing.JButton buttonDetailsObject;
    private javax.swing.JLabel labelClient;
    private javax.swing.JLabel labelTelefon;
    private javax.swing.JLabel labelTypOsoby;
    private javax.swing.JLabel labelTypBiznesu;
    private javax.swing.JLabel labelContactneImya;
    private javax.swing.JLabel labelTelefon_value;
    private javax.swing.JLabel labelTypOsoby_value;
    private javax.swing.JLabel labelTypBiznesu_value;
    private javax.swing.JLabel labelContactneImya_value;
    private javax.swing.JPanel panelOwner;
    private javax.swing.JPanel panelObjects;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelButtonOK;
    private javax.swing.JPanel panelButtonVidhylyty;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableObjects;
    private JButton createNewObjectButton;

    public OwnerDetailsFrame() {
		initComponents();
	}
    
    @Autowired
    private MenuFrame menuFrame;

    @Autowired
    private ObjectDetailsFrame objectDetailsFrame;

    @Autowired
    private CreateObjectFrame createObjectFrame;

    @Override
    protected void initComponents() {

        panelOwner = new javax.swing.JPanel();
        labelClient = new javax.swing.JLabel();
        labelTelefon = new javax.swing.JLabel();
        labelTypOsoby = new javax.swing.JLabel();
        labelTypBiznesu = new javax.swing.JLabel();
        labelContactneImya = new javax.swing.JLabel();
        labelTelefon_value = new javax.swing.JLabel();
        labelTypOsoby_value = new javax.swing.JLabel();
        labelTypBiznesu_value = new javax.swing.JLabel();
        labelContactneImya_value = new javax.swing.JLabel();
        panelObjects = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableObjects = new javax.swing.JTable();
        buttonDetailsObject = new javax.swing.JButton();
        panelButtons = new javax.swing.JPanel();
        panelButtonOK = new javax.swing.JPanel();
        buttonOK = new javax.swing.JButton();
        panelButtonVidhylyty = new javax.swing.JPanel();
        buttonVidhylyty = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Деталі про власника №89");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOwner.setBorder(javax.swing.BorderFactory.createTitledBorder("Власник"));
        panelOwner.setName("panelOwner"); // NOI18N

        labelClient.setText("Шарлот Хорнетс");
        labelClient.setName("labelClient"); // NOI18N

        labelTelefon.setText("Телефон");
        labelTelefon.setName("labelTelefon"); // NOI18N

        labelTypOsoby.setText("Тип особи");
        labelTypOsoby.setName("labelTypOsoby"); // NOI18N

        labelTypBiznesu.setText("Тип бізнесу");
        labelTypBiznesu.setName("labelTypBiznesu"); // NOI18N

        labelContactneImya.setText("Контактне ім'я");
        labelContactneImya.setName("labelContactneImya"); // NOI18N

        labelTelefon_value.setText("0447777777");
        labelTelefon_value.setName("labelTelefon_value"); // NOI18N

        labelTypOsoby_value.setText("юридична");
        labelTypOsoby_value.setName("labelTypOsoby_value"); // NOI18N

        labelTypBiznesu_value.setText("Національна баскетбольна асоціація");
        labelTypBiznesu_value.setName("labelTypBiznesu_value"); // NOI18N

        labelContactneImya_value.setText("Стів Кліффорд");
        labelContactneImya_value.setName("labelContactneImya_value"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelOwner);
        panelOwner.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelClient)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelTelefon)
                                                        .addComponent(labelTypOsoby)
                                                        .addComponent(labelTypBiznesu)
                                                        .addComponent(labelContactneImya))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelContactneImya_value)
                                                        .addComponent(labelTypOsoby_value)
                                                        .addComponent(labelTelefon_value)
                                                        .addComponent(labelTypBiznesu_value))))
                                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelClient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelTelefon)
                                        .addComponent(labelTelefon_value))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelTypOsoby)
                                        .addComponent(labelTypOsoby_value))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelTypBiznesu)
                                        .addComponent(labelTypBiznesu_value))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelContactneImya)
                                        .addComponent(labelContactneImya_value))
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(panelOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 400, 140));

        panelObjects.setBorder(javax.swing.BorderFactory.createTitledBorder("Об'єкти"));
        panelObjects.setName("panelObjects"); // NOI18N

        tableObjects.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"Дубенська вулиця, 35", "житловий", "2", "8000"},
                        {"Дундича Олеко проспект, 22", "житловий", "3", "12200"},
                        {"Князя Романа вулиця, 7", "нежитловий", "1", "2500"},
                        {"Соборна вулиця, 151", "житловий", "2", "9800"}
                },
                new String[]{
                        "Адреса", "Тип", "Кімнат", "Ціна"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        tableObjects.setName("tableObjects"); // NOI18N
        jScrollPane1.setViewportView(tableObjects);
        if (tableObjects.getColumnModel().getColumnCount() > 0) {
            tableObjects.getColumnModel().getColumn(0).setPreferredWidth(200);
            tableObjects.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        buttonDetailsObject.setText("Детальніше про об'єкт...");
        buttonDetailsObject.setName("buttonDetailsObject"); // NOI18N
        
        createNewObjectButton = new JButton();
        createNewObjectButton.setText("Додати новий об'єкт...");
        createNewObjectButton.setName("buttonDetailsObject");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelObjects);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        					.addComponent(buttonDetailsObject, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        					.addGap(18)
        					.addComponent(createNewObjectButton, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(buttonDetailsObject)
        				.addComponent(createNewObjectButton))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelObjects.setLayout(jPanel2Layout);

        getContentPane().add(panelObjects, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, 170));

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

        getContentPane().add(panelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 400, 40));

        pack();

        assingActionsToButtons();
    }

    private void assingActionsToButtons() {
        buttonDetailsObject.addActionListener(actionEvent -> {
            dispose();
            objectDetailsFrame.setVisible(true);
        });

        createNewObjectButton.addActionListener(actionEvent -> {
            dispose();
            createNewObjectButton.setVisible(true);
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
