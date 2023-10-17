package atm_machine;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Services_options extends javax.swing.JFrame {

    /**
     * Creates new form Services_options
     */
    String accountnumber;
    public Services_options(String accountnumber) {
        this.accountnumber=accountnumber;
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        depositeButton = new javax.swing.JButton();
        pinchangeButton = new javax.swing.JButton();
        ministatementButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        fastcashButton = new javax.swing.JButton();
        checkbalanceButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("XYZ BANK");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Choose your Transaction Type");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        depositeButton.setBackground(new java.awt.Color(204, 255, 255));
        depositeButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        depositeButton.setForeground(new java.awt.Color(0, 51, 51));
        depositeButton.setText("DEPOSITE");
        depositeButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        depositeButton.setMaximumSize(new java.awt.Dimension(127, 23));
        depositeButton.setMinimumSize(new java.awt.Dimension(127, 23));
        depositeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositeButtonActionPerformed(evt);
            }
        });

        pinchangeButton.setBackground(new java.awt.Color(204, 255, 255));
        pinchangeButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pinchangeButton.setForeground(new java.awt.Color(0, 51, 51));
        pinchangeButton.setText("CHANGE PIN");
        pinchangeButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pinchangeButton.setMaximumSize(new java.awt.Dimension(127, 23));
        pinchangeButton.setMinimumSize(new java.awt.Dimension(127, 23));
        pinchangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinchangeButtonActionPerformed(evt);
            }
        });

        ministatementButton.setBackground(new java.awt.Color(204, 255, 255));
        ministatementButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ministatementButton.setForeground(new java.awt.Color(0, 51, 51));
        ministatementButton.setText("MINI STATEMENT");
        ministatementButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ministatementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ministatementButtonActionPerformed(evt);
            }
        });

        withdrawButton.setBackground(new java.awt.Color(204, 255, 255));
        withdrawButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        withdrawButton.setForeground(new java.awt.Color(0, 51, 51));
        withdrawButton.setText("WITHDRAW");
        withdrawButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        withdrawButton.setMaximumSize(new java.awt.Dimension(127, 23));
        withdrawButton.setMinimumSize(new java.awt.Dimension(127, 23));
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        fastcashButton.setBackground(new java.awt.Color(204, 255, 255));
        fastcashButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fastcashButton.setForeground(new java.awt.Color(0, 51, 51));
        fastcashButton.setText("FAST CASH");
        fastcashButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fastcashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastcashButtonActionPerformed(evt);
            }
        });

        checkbalanceButton.setBackground(new java.awt.Color(204, 255, 255));
        checkbalanceButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkbalanceButton.setForeground(new java.awt.Color(0, 51, 51));
        checkbalanceButton.setText("CHECK BALANCE");
        checkbalanceButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkbalanceButton.setMaximumSize(new java.awt.Dimension(127, 23));
        checkbalanceButton.setMinimumSize(new java.awt.Dimension(127, 23));
        checkbalanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbalanceButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(204, 255, 255));
        logoutButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 51, 51));
        logoutButton.setText("LOGOUT");
        logoutButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pinchangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fastcashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ministatementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbalanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(187, 187, 187))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinchangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ministatementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fastcashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbalanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pinchangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinchangeButtonActionPerformed
        dispose();
        new ChangePin_Page().setVisible(true);
    }//GEN-LAST:event_pinchangeButtonActionPerformed

    private void fastcashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastcashButtonActionPerformed
        dispose();
        new FASTCASH_PAGE(accountnumber).setVisible(true);
    }//GEN-LAST:event_fastcashButtonActionPerformed

    private void checkbalanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbalanceButtonActionPerformed
        dispose();
        new CheckBalance_Page().setVisible(true);
    }//GEN-LAST:event_checkbalanceButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        new SignIn_Page().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void ministatementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ministatementButtonActionPerformed
        dispose();
        new minstatement(accountnumber).setVisible(true);
    }//GEN-LAST:event_ministatementButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        dispose();
        new Withdral_Page().setVisible(true);
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void depositeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositeButtonActionPerformed
        dispose();
        new Deposite_Page().setVisible(true);
    }//GEN-LAST:event_depositeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Services_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Services_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Services_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Services_options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Services_options("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkbalanceButton;
    private javax.swing.JButton depositeButton;
    private javax.swing.JButton fastcashButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton ministatementButton;
    private javax.swing.JButton pinchangeButton;
    private javax.swing.JButton withdrawButton;
    // End of variables declaration//GEN-END:variables
}