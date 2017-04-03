package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArchiveFrame extends DelayedInitJFrame {

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonPoshuk;
    private javax.swing.JButton buttonDetaliObject;
    private javax.swing.JButton buttonDetaliVlasnyka;
    private javax.swing.JButton buttonDetaliDohovoru;
    private javax.swing.JButton buttonNazad;
    private javax.swing.JPanel panelTypPrymischennya;
    private javax.swing.JPanel panelStanDohovoru;
    private javax.swing.JPanel panelRezultatyPoshuku;
    private javax.swing.JPanel panelNazad;
    private javax.swing.JRadioButton radiobuttonZhytlovy;
    private javax.swing.JRadioButton radiobuttonNeZhytlovy;
    private javax.swing.JRadioButton radiobuttonTypAny;
    private javax.swing.JRadioButton radiobuttonActyvny;
    private javax.swing.JRadioButton radiobuttonNeAktyvny;
    private javax.swing.JRadioButton radiobuttonStanAny;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableResultaty;

    @Autowired
    private MenuFrame menuFrame;

    @Override
    protected void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelTypPrymischennya = new javax.swing.JPanel();
        radiobuttonZhytlovy = new javax.swing.JRadioButton();
        radiobuttonNeZhytlovy = new javax.swing.JRadioButton();
        radiobuttonTypAny = new javax.swing.JRadioButton();
        panelStanDohovoru = new javax.swing.JPanel();
        radiobuttonActyvny = new javax.swing.JRadioButton();
        radiobuttonNeAktyvny = new javax.swing.JRadioButton();
        radiobuttonStanAny = new javax.swing.JRadioButton();
        panelRezultatyPoshuku = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResultaty = new javax.swing.JTable();
        buttonDetaliObject = new javax.swing.JButton();
        buttonDetaliVlasnyka = new javax.swing.JButton();
        buttonDetaliDohovoru = new javax.swing.JButton();
        buttonPoshuk = new javax.swing.JButton();
        panelNazad = new javax.swing.JPanel();
        buttonNazad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Архів зданих об'єктів");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTypPrymischennya.setBorder(javax.swing.BorderFactory.createTitledBorder("Тип приміщення"));
        panelTypPrymischennya.setName("panelTypPrymischennya"); // NOI18N

        buttonGroup1.add(radiobuttonZhytlovy);
        radiobuttonZhytlovy.setText("Житловий");
        radiobuttonZhytlovy.setName("radiobuttonZhytlovy"); // NOI18N

        buttonGroup1.add(radiobuttonNeZhytlovy);
        radiobuttonNeZhytlovy.setText("Нежитловий");
        radiobuttonNeZhytlovy.setName("radiobuttonNeZhytlovy"); // NOI18N

        buttonGroup1.add(radiobuttonTypAny);
        radiobuttonTypAny.setSelected(true);
        radiobuttonTypAny.setText("Будь-який");
        radiobuttonTypAny.setName("radiobuttonTypAny"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelTypPrymischennya);
        panelTypPrymischennya.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(radiobuttonZhytlovy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiobuttonNeZhytlovy)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(radiobuttonTypAny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobuttonZhytlovy)
                    .addComponent(radiobuttonNeZhytlovy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiobuttonTypAny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelTypPrymischennya, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 90));

        panelStanDohovoru.setBorder(javax.swing.BorderFactory.createTitledBorder("Стан договору"));
        panelStanDohovoru.setName("panelStanDohovoru"); // NOI18N

        buttonGroup2.add(radiobuttonActyvny);
        radiobuttonActyvny.setText("Активний");
        radiobuttonActyvny.setName("radiobuttonActyvny"); // NOI18N

        buttonGroup2.add(radiobuttonNeAktyvny);
        radiobuttonNeAktyvny.setText("Неактивний");
        radiobuttonNeAktyvny.setName("radiobuttonNeAktyvny"); // NOI18N

        buttonGroup2.add(radiobuttonStanAny);
        radiobuttonStanAny.setSelected(true);
        radiobuttonStanAny.setText("Будь-який");
        radiobuttonStanAny.setName("radiobuttonStanAny"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelStanDohovoru);
        panelStanDohovoru.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(radiobuttonActyvny)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiobuttonNeAktyvny)
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(radiobuttonStanAny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobuttonActyvny)
                    .addComponent(radiobuttonNeAktyvny))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiobuttonStanAny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelStanDohovoru, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 100));

        panelRezultatyPoshuku.setBorder(javax.swing.BorderFactory.createTitledBorder("Результати пошуку"));
        panelRezultatyPoshuku.setName("panelRezultatyPoshuku"); // NOI18N

        tableResultaty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Льонокомбінатівська вулиця, 1", "житловий", "неактивний", "12.01.2017"},
                {"Хмельницького Богдана бульвар, 18", "житловий", "активний", "15.03.2017"},
                {"Шухевича Романа вулиця, 14", "нежитловий", "неактивний", "31.01.2017"},
                {null, null, null, null}
            },
            new String [] {
                "Адреса", "Тип", "Стан", "Договір дійсний до"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableResultaty.setToolTipText("");
        tableResultaty.setName("tableResultaty"); // NOI18N
        jScrollPane1.setViewportView(tableResultaty);
        if (tableResultaty.getColumnModel().getColumnCount() > 0) {
            tableResultaty.getColumnModel().getColumn(0).setPreferredWidth(200);
            tableResultaty.getColumnModel().getColumn(1).setPreferredWidth(50);
            tableResultaty.getColumnModel().getColumn(2).setPreferredWidth(50);
            tableResultaty.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        buttonDetaliObject.setText("Детальніше про об'єкт...");
        buttonDetaliObject.setName("buttonDetaliObject"); // NOI18N

        buttonDetaliVlasnyka.setText("Детальніше про власника...");
        buttonDetaliVlasnyka.setName("buttonDetaliVlasnyka"); // NOI18N

        buttonDetaliDohovoru.setText("Детальніше про договір...");
        buttonDetaliDohovoru.setName("buttonDetaliDohovoru"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(panelRezultatyPoshuku);
        panelRezultatyPoshuku.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(buttonDetaliObject, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonDetaliVlasnyka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(buttonDetaliDohovoru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDetaliObject)
                    .addComponent(buttonDetaliVlasnyka))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDetaliDohovoru)
                .addContainerGap())
        );

        getContentPane().add(panelRezultatyPoshuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 520, 270));

        buttonPoshuk.setText("Пошук");
        buttonPoshuk.setName("buttonPoshuk"); // NOI18N
        getContentPane().add(buttonPoshuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, 180, 40));

        panelNazad.setName("panelNazad"); // NOI18N

        buttonNazad.setText("Назад до головного меню");
        buttonNazad.setName("buttonNazad"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(panelNazad);
        panelNazad.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonNazad, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(buttonNazad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelNazad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 720, -1));

        pack();

        attachActionsToButtons();
    }

    private void attachActionsToButtons() {
        buttonNazad.addActionListener(actionEvent -> {
            dispose();
            menuFrame.setVisible(true);
        });
    }


}
