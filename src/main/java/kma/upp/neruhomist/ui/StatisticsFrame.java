package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StatisticsFrame extends DelayedInitJFrame {

    private javax.swing.JButton buttonUsogoPrymischenPerehlyanutySpysok;
    private javax.swing.JButton buttonZhytlovyhPerehlyanutySpysok;
    private javax.swing.JButton buttonNeZhytlovyhPerehlyanutySpysok;
    private javax.swing.JButton buttonNazad;
    private javax.swing.JLabel labelUsogoPrymischen;
    private javax.swing.JLabel labelSerVartist;
    private javax.swing.JLabel labelSerVartistZhytlovy;
    private javax.swing.JLabel labelSerVartistNeZhytlovy;
    private javax.swing.JLabel labelUsogoPrymischen_value;
    private javax.swing.JLabel labelUsogoZhytlovyh_value;
    private javax.swing.JLabel labelUsogoNeZhytlovyh_value;
    private javax.swing.JLabel labelSerChasVystavleny_value;
    private javax.swing.JLabel labelSerChasVystavlenyZhytlovy_value;
    private javax.swing.JLabel labelSerChasVystavlenyNeZhytlovy_value;
    private javax.swing.JLabel labelSerChasOrendovany_value;
    private javax.swing.JLabel labelUsogoZhytlovyh;
    private javax.swing.JLabel labelSerChasOrendovanyZhytlovy_value;
    private javax.swing.JLabel labelSerChasOrendovanyNeZhytlovy_value;
    private javax.swing.JLabel labelSerVartist_value;
    private javax.swing.JLabel labelSerVartistZhytlovy_value;
    private javax.swing.JLabel labelSerVartistNeZhytlovy_value;
    private javax.swing.JLabel labelUsogoNeZhytlovyh;
    private javax.swing.JLabel labelSerChasVystavleny;
    private javax.swing.JLabel labelSerChasVystavlenyZhytlovy;
    private javax.swing.JLabel labelSerChasVystavlenyNeZhytlovy;
    private javax.swing.JLabel labelSerChasOrendovany;
    private javax.swing.JLabel labelSerChasOrendovanyZhytlovy;
    private javax.swing.JLabel labelSerChasOrendovanyNeZhytlovy;
    private javax.swing.JPanel panelStatistics;
    private javax.swing.JPanel panelButton;

    @Autowired
    private MenuFrame menuFrame;

    @Override
    protected void initComponents() {

        panelStatistics = new javax.swing.JPanel();
        labelSerVartistNeZhytlovy = new javax.swing.JLabel();
        labelSerVartistZhytlovy = new javax.swing.JLabel();
        labelSerVartist = new javax.swing.JLabel();
        labelSerChasOrendovanyNeZhytlovy = new javax.swing.JLabel();
        labelSerChasOrendovanyZhytlovy = new javax.swing.JLabel();
        labelSerChasOrendovany = new javax.swing.JLabel();
        labelSerChasVystavlenyNeZhytlovy = new javax.swing.JLabel();
        labelSerChasVystavlenyZhytlovy = new javax.swing.JLabel();
        labelSerChasVystavleny = new javax.swing.JLabel();
        labelUsogoNeZhytlovyh = new javax.swing.JLabel();
        labelUsogoZhytlovyh = new javax.swing.JLabel();
        labelUsogoPrymischen = new javax.swing.JLabel();
        labelUsogoPrymischen_value = new javax.swing.JLabel();
        labelUsogoZhytlovyh_value = new javax.swing.JLabel();
        labelUsogoNeZhytlovyh_value = new javax.swing.JLabel();
        labelSerChasVystavleny_value = new javax.swing.JLabel();
        labelSerChasVystavlenyZhytlovy_value = new javax.swing.JLabel();
        labelSerChasVystavlenyNeZhytlovy_value = new javax.swing.JLabel();
        labelSerChasOrendovany_value = new javax.swing.JLabel();
        labelSerChasOrendovanyZhytlovy_value = new javax.swing.JLabel();
        labelSerChasOrendovanyNeZhytlovy_value = new javax.swing.JLabel();
        labelSerVartist_value = new javax.swing.JLabel();
        labelSerVartistZhytlovy_value = new javax.swing.JLabel();
        labelSerVartistNeZhytlovy_value = new javax.swing.JLabel();
        buttonUsogoPrymischenPerehlyanutySpysok = new javax.swing.JButton();
        buttonZhytlovyhPerehlyanutySpysok = new javax.swing.JButton();
        buttonNeZhytlovyhPerehlyanutySpysok = new javax.swing.JButton();
        panelButton = new javax.swing.JPanel();
        buttonNazad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Статистика");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelStatistics.setName("panelStatistics"); // NOI18N

        labelSerVartistNeZhytlovy.setText("із них нежитлових");
        labelSerVartistNeZhytlovy.setName("labelSerVartistNeZhytlovy"); // NOI18N

        labelSerVartistZhytlovy.setText("із них житлових");
        labelSerVartistZhytlovy.setName("labelSerVartistZhytlovy"); // NOI18N

        labelSerVartist.setText("Середня вартість оренди");
        labelSerVartist.setName("labelSerVartist"); // NOI18N

        labelSerChasOrendovanyNeZhytlovy.setText("із них нежитлових");
        labelSerChasOrendovanyNeZhytlovy.setName("labelSerChasOrendovanyNeZhytlovy"); // NOI18N

        labelSerChasOrendovanyZhytlovy.setText("із них житлових");
        labelSerChasOrendovanyZhytlovy.setName("labelSerChasOrendovanyZhytlovy"); // NOI18N

        labelSerChasOrendovany.setText("Середній час перебування в орендованому стані");
        labelSerChasOrendovany.setName("labelSerChasOrendovany"); // NOI18N

        labelSerChasVystavlenyNeZhytlovy.setText("із них нежитлових");
        labelSerChasVystavlenyNeZhytlovy.setName("labelSerChasVystavlenyNeZhytlovy"); // NOI18N

        labelSerChasVystavlenyZhytlovy.setText("із них житлових");
        labelSerChasVystavlenyZhytlovy.setName("labelSerChasVystavlenyZhytlovy"); // NOI18N

        labelSerChasVystavleny.setText("Середній час перебування у виставленому стані");
        labelSerChasVystavleny.setToolTipText("");
        labelSerChasVystavleny.setName("labelSerChasVystavleny"); // NOI18N

        labelUsogoNeZhytlovyh.setText("із них нежитлових");
        labelUsogoNeZhytlovyh.setName("labelUsogoNeZhytlovyh"); // NOI18N

        labelUsogoZhytlovyh.setText("із них житлових");
        labelUsogoZhytlovyh.setName("labelUsogoZhytlovyh"); // NOI18N

        labelUsogoPrymischen.setText("Усього приміщень");
        labelUsogoPrymischen.setName("labelUsogoPrymischen"); // NOI18N

        labelUsogoPrymischen_value.setText("123444");
        labelUsogoPrymischen_value.setName("labelUsogoPrymischen_value"); // NOI18N

        labelUsogoZhytlovyh_value.setText("100000");
        labelUsogoZhytlovyh_value.setName("labelUsogoZhytlovyh_value"); // NOI18N

        labelUsogoNeZhytlovyh_value.setText("23444");
        labelUsogoNeZhytlovyh_value.setName("labelUsogoNeZhytlovyh_value"); // NOI18N

        labelSerChasVystavleny_value.setText("3 місяці");
        labelSerChasVystavleny_value.setName("labelSerChasVystavleny_value"); // NOI18N

        labelSerChasVystavlenyZhytlovy_value.setText("5 місяців");
        labelSerChasVystavlenyZhytlovy_value.setName("labelSerChasVystavlenyZhytlovy_value"); // NOI18N

        labelSerChasVystavlenyNeZhytlovy_value.setText("1 місяць");
        labelSerChasVystavlenyNeZhytlovy_value.setName("labelSerChasVystavlenyNeZhytlovy_value"); // NOI18N

        labelSerChasOrendovany_value.setText("2 роки 1 місяць");
        labelSerChasOrendovany_value.setName("labelSerChasOrendovany_value"); // NOI18N

        labelSerChasOrendovanyZhytlovy_value.setText("2 роки 5 місяців");
        labelSerChasOrendovanyZhytlovy_value.setName("labelSerChasOrendovanyZhytlovy_value"); // NOI18N

        labelSerChasOrendovanyNeZhytlovy_value.setText("1 рік 10 місяців");
        labelSerChasOrendovanyNeZhytlovy_value.setName("labelSerChasOrendovanyNeZhytlovy_value"); // NOI18N

        labelSerVartist_value.setText("5600");
        labelSerVartist_value.setName("labelSerVartist_value"); // NOI18N

        labelSerVartistZhytlovy_value.setText("6200");
        labelSerVartistZhytlovy_value.setName("labelSerVartistZhytlovy_value"); // NOI18N

        labelSerVartistNeZhytlovy_value.setText("4700");
        labelSerVartistNeZhytlovy_value.setName("labelSerVartistNeZhytlovy_value"); // NOI18N

        buttonUsogoPrymischenPerehlyanutySpysok.setText("Переглянути список...");
        buttonUsogoPrymischenPerehlyanutySpysok.setName("buttonUsogoPrymischenPerehlyanutySpysok"); // NOI18N

        buttonZhytlovyhPerehlyanutySpysok.setText("Переглянути список...");
        buttonZhytlovyhPerehlyanutySpysok.setName("buttonZhytlovyhPerehlyanutySpysok"); // NOI18N

        buttonNeZhytlovyhPerehlyanutySpysok.setText("Переглянути список...");
        buttonNeZhytlovyhPerehlyanutySpysok.setName("buttonNeZhytlovyhPerehlyanutySpysok"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelStatistics);
        panelStatistics.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelUsogoPrymischen)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelUsogoZhytlovyh)
                                                        .addComponent(labelUsogoNeZhytlovyh)
                                                        .addComponent(labelSerChasVystavlenyZhytlovy)
                                                        .addComponent(labelSerChasVystavlenyNeZhytlovy)
                                                        .addComponent(labelSerChasOrendovanyZhytlovy)
                                                        .addComponent(labelSerChasOrendovanyNeZhytlovy)
                                                        .addComponent(labelSerVartistZhytlovy)
                                                        .addComponent(labelSerVartistNeZhytlovy)))
                                        .addComponent(labelSerChasVystavleny)
                                        .addComponent(labelSerChasOrendovany)
                                        .addComponent(labelSerVartist))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelSerVartist_value)
                                                        .addComponent(labelSerChasOrendovany_value)
                                                        .addComponent(labelSerChasVystavleny_value)
                                                        .addComponent(labelSerChasVystavlenyZhytlovy_value)
                                                        .addComponent(labelSerChasVystavlenyNeZhytlovy_value)
                                                        .addComponent(labelSerChasOrendovanyZhytlovy_value)
                                                        .addComponent(labelSerChasOrendovanyNeZhytlovy_value)
                                                        .addComponent(labelSerVartistZhytlovy_value)
                                                        .addComponent(labelSerVartistNeZhytlovy_value))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(labelUsogoPrymischen_value)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                                                .addComponent(buttonUsogoPrymischenPerehlyanutySpysok))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(labelUsogoZhytlovyh_value)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(buttonZhytlovyhPerehlyanutySpysok))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(labelUsogoNeZhytlovyh_value)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(buttonNeZhytlovyhPerehlyanutySpysok)))
                                                .addContainerGap(57, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelUsogoPrymischen)
                                        .addComponent(labelUsogoPrymischen_value)
                                        .addComponent(buttonUsogoPrymischenPerehlyanutySpysok))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelUsogoZhytlovyh)
                                        .addComponent(labelUsogoZhytlovyh_value)
                                        .addComponent(buttonZhytlovyhPerehlyanutySpysok))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelUsogoNeZhytlovyh)
                                        .addComponent(labelUsogoNeZhytlovyh_value)
                                        .addComponent(buttonNeZhytlovyhPerehlyanutySpysok))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelSerChasVystavleny)
                                        .addComponent(labelSerChasVystavleny_value))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelSerChasVystavlenyZhytlovy)
                                        .addComponent(labelSerChasVystavlenyZhytlovy_value))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelSerChasVystavlenyNeZhytlovy)
                                        .addComponent(labelSerChasVystavlenyNeZhytlovy_value))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelSerChasOrendovany)
                                        .addComponent(labelSerChasOrendovany_value))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelSerChasOrendovanyZhytlovy)
                                        .addComponent(labelSerChasOrendovanyZhytlovy_value))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelSerChasOrendovanyNeZhytlovy)
                                        .addComponent(labelSerChasOrendovanyNeZhytlovy_value))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelSerVartist)
                                        .addComponent(labelSerVartist_value))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelSerVartistZhytlovy)
                                        .addComponent(labelSerVartistZhytlovy_value))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelSerVartistNeZhytlovy)
                                        .addComponent(labelSerVartistNeZhytlovy_value))
                                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(panelStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 360));

        panelButton.setName("panelButton"); // NOI18N

        buttonNazad.setText("Назад до головного меню");
        buttonNazad.setName("buttonNazad"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelButton);
        panelButton.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(116, Short.MAX_VALUE)
                                .addComponent(buttonNazad, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonNazad)
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(panelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 550, 50));

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
