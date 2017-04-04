package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchFrame extends DelayedInitJFrame {

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonPoshuk;
    private javax.swing.JButton buttonDetaliObject;
    private javax.swing.JButton buttonDetaliVlasnyka;
    private javax.swing.JButton buttonUklastyDohovir;
    private javax.swing.JButton buttonNazad;
    private javax.swing.JComboBox<String> dropdownKilkistKimnat;
    private javax.swing.JLabel labelVulytsia;
    private javax.swing.JPanel panelTypPrymischennya;
    private javax.swing.JPanel panelStanDohovoru;
    private javax.swing.JPanel panelRezultatyPoshuku;
    private javax.swing.JPanel panelNazad;
    private javax.swing.JPanel panelMaxPlata;
    private javax.swing.JPanel panelAdresa;
    private javax.swing.JRadioButton radiobuttonZhytlovy;
    private javax.swing.JRadioButton radiobuttonNeZhytlovy;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableResultaty;
    private javax.swing.JTextField textfieldMaxPlata;
    private javax.swing.JTextField textfieldVulytsia;

    @Autowired
    private MenuFrame menuFrame;

    @Autowired
    private ObjectDetailsFrame objectDetailsFrame;

    @Autowired
    private OwnerDetailsFrame ownerDetailsFrame;

    @Override
    protected void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelTypPrymischennya = new javax.swing.JPanel();
        radiobuttonZhytlovy = new javax.swing.JRadioButton();
        radiobuttonNeZhytlovy = new javax.swing.JRadioButton();
        panelStanDohovoru = new javax.swing.JPanel();
        dropdownKilkistKimnat = new javax.swing.JComboBox<>();
        panelRezultatyPoshuku = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResultaty = new javax.swing.JTable();
        buttonDetaliObject = new javax.swing.JButton();
        buttonDetaliVlasnyka = new javax.swing.JButton();
        buttonUklastyDohovir = new javax.swing.JButton();
        buttonPoshuk = new javax.swing.JButton();
        panelNazad = new javax.swing.JPanel();
        buttonNazad = new javax.swing.JButton();
        panelMaxPlata = new javax.swing.JPanel();
        textfieldMaxPlata = new javax.swing.JTextField();
        panelAdresa = new javax.swing.JPanel();
        textfieldVulytsia = new javax.swing.JTextField();
        labelVulytsia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Пошук");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTypPrymischennya.setBorder(javax.swing.BorderFactory.createTitledBorder("Тип бажаного приміщення"));
        panelTypPrymischennya.setName("panelTypPrymischennya"); // NOI18N

        buttonGroup1.add(radiobuttonZhytlovy);
        radiobuttonZhytlovy.setSelected(true);
        radiobuttonZhytlovy.setText("Житловий");
        radiobuttonZhytlovy.setName("radiobuttonZhytlovy"); // NOI18N

        buttonGroup1.add(radiobuttonNeZhytlovy);
        radiobuttonNeZhytlovy.setText("Нежитловий");
        radiobuttonNeZhytlovy.setName("radiobuttonNeZhytlovy"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelTypPrymischennya);
        panelTypPrymischennya.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radiobuttonZhytlovy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radiobuttonNeZhytlovy)
                                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radiobuttonZhytlovy)
                                        .addComponent(radiobuttonNeZhytlovy))
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(panelTypPrymischennya, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 80));

        panelStanDohovoru.setBorder(javax.swing.BorderFactory.createTitledBorder("Кількість кімнат"));
        panelStanDohovoru.setName("panelStanDohovoru"); // NOI18N

        dropdownKilkistKimnat.setEditable(true);
        dropdownKilkistKimnat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5"}));
        dropdownKilkistKimnat.setName("dropdownKilkistKimnat"); // NOI18N
        dropdownKilkistKimnat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelStanDohovoru);
        panelStanDohovoru.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(56, Short.MAX_VALUE)
                                .addComponent(dropdownKilkistKimnat, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addComponent(dropdownKilkistKimnat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelStanDohovoru, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 50));

        panelRezultatyPoshuku.setBorder(javax.swing.BorderFactory.createTitledBorder("Результати пошуку"));
        panelRezultatyPoshuku.setName("panelRezultatyPoshuku"); // NOI18N

        tableResultaty.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"Дубенська вулиця, 35", "4250"},
                        {"Дундича Олеко проспект, 22", "5000"},
                        {"Князя Романа вулиця, 7", "3700"},
                        {"Соборна вулиця, 151", null}
                },
                new String[]{
                        "Адреса", "Ціна"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        tableResultaty.setToolTipText("");
        tableResultaty.setName("tableResultaty"); // NOI18N
        jScrollPane1.setViewportView(tableResultaty);
        if (tableResultaty.getColumnModel().getColumnCount() > 0) {
            tableResultaty.getColumnModel().getColumn(0).setPreferredWidth(200);
            tableResultaty.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        buttonDetaliObject.setText("Детальніше про об'єкт...");
        buttonDetaliObject.setName("buttonDetaliObject"); // NOI18N

        buttonDetaliVlasnyka.setText("Детальніше про власника...");
        buttonDetaliVlasnyka.setName("buttonDetaliVlasnyka"); // NOI18N

        buttonUklastyDohovir.setText("Укласти договір");
        buttonUklastyDohovir.setName("buttonUklastyDohovir"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(panelRezultatyPoshuku);
        panelRezultatyPoshuku.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(buttonUklastyDohovir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(buttonDetaliObject, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonDetaliVlasnyka, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonDetaliObject)
                                        .addComponent(buttonDetaliVlasnyka))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonUklastyDohovir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelRezultatyPoshuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 400, 360));

        buttonPoshuk.setText("Пошук");
        buttonPoshuk.setName("buttonPoshuk"); // NOI18N
        getContentPane().add(buttonPoshuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 180, 40));

        panelNazad.setName("panelNazad"); // NOI18N

        buttonNazad.setText("Назад до головного меню");
        buttonNazad.setName("buttonNazad"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(panelNazad);
        panelNazad.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonNazad, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonNazad)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelNazad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 366, 610, 40));

        panelMaxPlata.setBorder(javax.swing.BorderFactory.createTitledBorder("Максимальна плата"));

        textfieldMaxPlata.setName("textfieldMaxPlata"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(panelMaxPlata);
        panelMaxPlata.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textfieldMaxPlata, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textfieldMaxPlata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        getContentPane().add(panelMaxPlata, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 143, 200, 60));

        panelAdresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Адреса"));

        textfieldVulytsia.setName("textfieldVulytsia"); // NOI18N

        labelVulytsia.setText("Вулиця");
        labelVulytsia.setName("labelVulytsia"); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(panelAdresa);
        panelAdresa.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelVulytsia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textfieldVulytsia, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textfieldVulytsia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelVulytsia))
                                .addContainerGap())
        );

        getContentPane().add(panelAdresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 70));

        pack();

        attachActionsToButtons();
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void attachActionsToButtons() {
        buttonNazad.addActionListener(actionEvent -> {
            dispose();
            menuFrame.setVisible(true);
        });

        buttonDetaliObject.addActionListener(actionEvent -> {
            dispose();
            objectDetailsFrame.setVisible(true);
        });

        buttonDetaliVlasnyka.addActionListener(actionEvent -> {
            dispose();
            ownerDetailsFrame.setVisible(true);
        });

        buttonUklastyDohovir.addActionListener(actionEvent -> {

        });
    }

}
