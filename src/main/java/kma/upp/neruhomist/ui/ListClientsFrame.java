package kma.upp.neruhomist.ui;

import kma.upp.neruhomist.ui.util.DelayedInitJFrame;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

@Component
public class ListClientsFrame extends DelayedInitJFrame {

    private javax.swing.JButton backButton;
    private javax.swing.JButton moreAboutClientButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private JButton serachButton;

    @Override
	protected void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBounds(0, 70, 325, 300);
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        moreAboutClientButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(0, 380, 325, 40);
        backButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBounds(0, 0, 325, 70);
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Список клієнтів");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Список клієнтів"));
        jPanel1.setName("panelOwners"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Джек Деніелс", "фізична", "99878766"},
                {"Курит Воннегут", "юридична", "7675433"},
                {"Дарья Донцова", "фізична", "9379992"},
                {null, null, null}
            },
            new String [] {
                "Клієнт", "Тип особи", "Телефон"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setName("tableOwners"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        moreAboutClientButton.setText("Детальніше про клієнта...");
        moreAboutClientButton.setName("buttonOwnerDetails"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(53)
        					.addComponent(moreAboutClientButton, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(moreAboutClientButton)
        			.addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        getContentPane().add(jPanel1);

        jPanel2.setName("panelNazad"); // NOI18N

        backButton.setText("Назад до головного меню");
        backButton.setName("buttonNazad"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(26)
        			.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(backButton)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        getContentPane().add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Пошук"));
        jPanel3.setName("panelPoshuk"); // NOI18N

        jLabel1.setText("Телефон");
        jLabel1.setName("labalTelefon"); // NOI18N

        jTextField1.setName("textfieldTelefon"); // NOI18N
        
        serachButton = new JButton("Пошук");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(serachButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(serachButton))
        			.addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        getContentPane().add(jPanel3);

        attachActionsToButtons();
    }

    private void attachActionsToButtons() {
        backButton.addActionListener(backToMenu);
    }


}
