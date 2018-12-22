package form;

import dao.CustomerDao;
import entity.Customer;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import lib.ManajerKoneksi;

public class FormAddCustomer extends javax.swing.JFrame 
{
    public FormAddCustomer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        alamatText = new javax.swing.JTextField();
        telpText = new javax.swing.JTextField();
        namaText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 14, 62));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-washing-machine-40.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Lemon/Milk", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("LAUNDRY ONLINE");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Exo", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(3, 14, 62));
        jLabel7.setText("Nama");

        jLabel8.setFont(new java.awt.Font("Exo", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(3, 14, 62));
        jLabel8.setText("Alamat");

        jLabel9.setFont(new java.awt.Font("Exo", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(3, 14, 62));
        jLabel9.setText("No. Telepon");

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Exo", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(3, 14, 62));
        jButton3.setText("Batal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Exo", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(3, 14, 62));
        jButton4.setText("Tambah");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        alamatText.setBackground(new java.awt.Color(204, 204, 204));
        alamatText.setFont(new java.awt.Font("Exo", 0, 24)); // NOI18N
        alamatText.setForeground(new java.awt.Color(3, 14, 62));
        alamatText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 14, 62)));
        alamatText.setCaretColor(new java.awt.Color(3, 14, 62));
        alamatText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        alamatText.setDisabledTextColor(new java.awt.Color(3, 14, 62));
        alamatText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatTextActionPerformed(evt);
            }
        });

        telpText.setBackground(new java.awt.Color(204, 204, 204));
        telpText.setFont(new java.awt.Font("Exo", 0, 24)); // NOI18N
        telpText.setForeground(new java.awt.Color(3, 14, 62));
        telpText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 14, 62)));
        telpText.setCaretColor(new java.awt.Color(3, 14, 62));
        telpText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        telpText.setDisabledTextColor(new java.awt.Color(3, 14, 62));
        telpText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telpTextActionPerformed(evt);
            }
        });

        namaText.setBackground(new java.awt.Color(204, 204, 204));
        namaText.setFont(new java.awt.Font("Exo", 0, 24)); // NOI18N
        namaText.setForeground(new java.awt.Color(3, 14, 62));
        namaText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 14, 62)));
        namaText.setCaretColor(new java.awt.Color(3, 14, 62));
        namaText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        namaText.setDisabledTextColor(new java.awt.Color(3, 14, 62));
        namaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(namaText, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addComponent(alamatText)
                    .addComponent(telpText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(namaText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addComponent(alamatText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telpText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/addAccount/icons8-add-user-female-64.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/addAccount/icons8-add-user-male-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        
        new FormMenuCustomer().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ManajerKoneksi.getKoneksi();
        
        Customer c = new Customer();
        
        CustomerDao cd = new CustomerDao();
        
        c.setNama(namaText.getText());
        c.setAlamat(alamatText.getText());
        c.setNoTelp(telpText.getText());
        
        try 
        {
            cd.insert(c);
            JOptionPane.showMessageDialog(this, "Input Berhasil!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(this, "input tidak bisa dilakukan!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void alamatTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatTextActionPerformed

    private void telpTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telpTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telpTextActionPerformed

    private void namaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTextActionPerformed

    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(FormAddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatText;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namaText;
    private javax.swing.JTextField telpText;
    // End of variables declaration//GEN-END:variables
}
