/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Lingkaran extends javax.swing.JFrame {
    double JARIJARI,LUAS,KELILING;

    /**
     * Creates new form Lingkaran
     */
    public Lingkaran() {
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

        LLingkaran = new javax.swing.JLabel();
        LJarijari = new javax.swing.JLabel();
        LKeliling = new javax.swing.JLabel();
        TJarijari = new javax.swing.JTextField();
        LLUAS = new javax.swing.JLabel();
        TLuas = new javax.swing.JTextField();
        TKeliling = new javax.swing.JTextField();
        BHITUNG = new javax.swing.JButton();
        BRESET = new javax.swing.JButton();
        BKEMBALI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LLingkaran.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LLingkaran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LLingkaran.setText("LINGKARAN");

        LJarijari.setText("JARIJARI");

        LKeliling.setText("KELILING");

        LLUAS.setText("LUAS");

        BHITUNG.setText("HITUNG");
        BHITUNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHITUNGActionPerformed(evt);
            }
        });

        BRESET.setText("RESET");
        BRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRESETActionPerformed(evt);
            }
        });

        BKEMBALI.setText("KEMBALI");
        BKEMBALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKEMBALIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LJarijari)
                    .addComponent(LLUAS)
                    .addComponent(LKeliling))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TJarijari, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TLuas, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(TKeliling))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(LLingkaran)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BHITUNG)
                .addGap(69, 69, 69)
                .addComponent(BRESET)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(BKEMBALI)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LLingkaran)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LJarijari)
                    .addComponent(TJarijari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BHITUNG)
                    .addComponent(BRESET)
                    .addComponent(BKEMBALI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LLUAS)
                    .addComponent(TLuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LKeliling)
                    .addComponent(TKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BHITUNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHITUNGActionPerformed
        // TODO add your handling code here:
        // Ambil nilai jari-jari dari input
    double jarijari = Double.parseDouble(TJarijari.getText());

    // Hitung luas lingkaran
    double luas = Math.PI * Math.pow(jarijari, 2);
    TLuas.setText(String.valueOf(luas));

    // Hitung keliling lingkaran
    double keliling = 2 * Math.PI * jarijari;
    TKeliling.setText(String.valueOf(keliling));
    }//GEN-LAST:event_BHITUNGActionPerformed

    private void BRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRESETActionPerformed
        // TODO add your handling code here:
    TJarijari.setText("");
    TLuas.setText("");
    TKeliling.setText("");
    }//GEN-LAST:event_BRESETActionPerformed

    private void BKEMBALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKEMBALIActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BKEMBALIActionPerformed

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
            java.util.logging.Logger.getLogger(Lingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lingkaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHITUNG;
    private javax.swing.JButton BKEMBALI;
    private javax.swing.JButton BRESET;
    private javax.swing.JLabel LJarijari;
    private javax.swing.JLabel LKeliling;
    private javax.swing.JLabel LLUAS;
    private javax.swing.JLabel LLingkaran;
    private javax.swing.JTextField TJarijari;
    private javax.swing.JTextField TKeliling;
    private javax.swing.JTextField TLuas;
    // End of variables declaration//GEN-END:variables
}
