
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author j23
 */
public class Makanan extends javax.swing.JFrame {
    public Makanan() {
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

        jLabel1 = new javax.swing.JLabel();
        cbSoto = new javax.swing.JCheckBox();
        cbRawon = new javax.swing.JCheckBox();
        cbBakso = new javax.swing.JCheckBox();
        cbGudeg = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        tfSoto = new javax.swing.JTextField();
        tfRawon = new javax.swing.JTextField();
        tfBakso = new javax.swing.JTextField();
        tfGudeg = new javax.swing.JTextField();
        tfTotal = new javax.swing.JTextField();
        bHitung = new javax.swing.JButton();
        bClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel1.setText("MENU MAKANAN");

        cbSoto.setText("Soto : 5.000");
        cbSoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSotoActionPerformed(evt);
            }
        });

        cbRawon.setText("Rawon : 6.000");
        cbRawon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRawonActionPerformed(evt);
            }
        });

        cbBakso.setText("Bakso : 4.000");
        cbBakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBaksoActionPerformed(evt);
            }
        });

        cbGudeg.setText("Gudeg : 8.000");
        cbGudeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGudegActionPerformed(evt);
            }
        });

        jLabel2.setText("Hitung :");

        tfSoto.setEnabled(false);

        tfRawon.setEnabled(false);

        tfBakso.setEnabled(false);

        tfGudeg.setEnabled(false);

        tfTotal.setEditable(false);

        bHitung.setText("Hitung");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bClear))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbGudeg)
                                .addGap(46, 46, 46)
                                .addComponent(tfGudeg))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbBakso)
                                .addGap(49, 49, 49)
                                .addComponent(tfBakso))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRawon)
                                    .addComponent(cbSoto))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSoto)
                                    .addComponent(tfRawon))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bHitung)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSoto)
                    .addComponent(tfSoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRawon)
                    .addComponent(tfRawon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBakso)
                    .addComponent(tfBakso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGudeg)
                    .addComponent(tfGudeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHitung))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bClear))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbSotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSotoActionPerformed
        if (cbSoto.isSelected()) {
            tfSoto.setEnabled(true);
        } else {
            tfSoto.setEnabled(false);
        }
    }//GEN-LAST:event_cbSotoActionPerformed

    private void cbRawonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRawonActionPerformed
        if (cbRawon.isSelected()) {
            tfRawon.setEnabled(true);
        } else {
            tfRawon.setEnabled(false);
        }
    }//GEN-LAST:event_cbRawonActionPerformed

    private void cbBaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBaksoActionPerformed
        if (cbBakso.isSelected()) {
            tfBakso.setEnabled(true);
        } else {
            tfBakso.setEnabled(false);
        }
    }//GEN-LAST:event_cbBaksoActionPerformed

    private void cbGudegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGudegActionPerformed
        if (cbGudeg.isSelected()) {
            tfGudeg.setEnabled(true);
        } else {
            tfGudeg.setEnabled(false);
        }
    }//GEN-LAST:event_cbGudegActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        int total = 0;
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        format.setMaximumFractionDigits(0);
        
        try {
            if (cbBakso.isSelected()) {
                total += (4000*Integer.valueOf(tfBakso.getText()));
            }

            if (cbGudeg.isSelected()) {
                total += (8000*Integer.valueOf(tfGudeg.getText()));
            }

            if (cbRawon.isSelected()) {
                total += (6000*Integer.valueOf(tfRawon.getText()));
            }

            if (cbSoto.isSelected()) {
                total += (5000*Integer.valueOf(tfSoto.getText()));
            }
            tfTotal.setText(format.format(total).replace("Rp", "Rp "));
        } catch (NumberFormatException e) {
            System.out.println("Bukan angka");
        }
    }//GEN-LAST:event_bHitungActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        tfBakso.setText("");
        tfGudeg.setText("");
        tfRawon.setText("");
        tfSoto.setText("");
        tfTotal.setText("");
    }//GEN-LAST:event_bClearActionPerformed
   
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
            java.util.logging.Logger.getLogger(Makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Makanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClear;
    private javax.swing.JButton bHitung;
    private javax.swing.JCheckBox cbBakso;
    private javax.swing.JCheckBox cbGudeg;
    private javax.swing.JCheckBox cbRawon;
    private javax.swing.JCheckBox cbSoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfBakso;
    private javax.swing.JTextField tfGudeg;
    private javax.swing.JTextField tfRawon;
    private javax.swing.JTextField tfSoto;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
