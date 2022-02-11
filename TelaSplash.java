/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOViews;

import DAOControl.Utilitarios;
import com.sun.javafx.applet.Splash;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nolasco Dos Anjos
 */
public class TelaSplash extends javax.swing.JFrame {

    /**
     * Creates new form TelaSplash
     */
    public TelaSplash() {
        initComponents();
        Utilitarios u = new Utilitarios();
        u.InsererIcone(this);
        new Thread(){ 
            
        public void run(){
            for(int i = 0; i < 101; i++){
                try {
                    sleep(60);
                    jLabelContagen.setText(Integer.toString(i)+"%");
                    jProgressBarTelaSplash.setValue(i);
                    if(jProgressBarTelaSplash.getValue() <= 40){
                        jLabelMostrarProgresso.setText("Carregando Dados...");
                    }else if(jProgressBarTelaSplash.getValue() <= 70){
                        jLabelMostrarProgresso.setText("Carregando Tabelas...");
                    }else if(jProgressBarTelaSplash.getValue() == 100){
                        jLabelMostrarProgresso.setText("Conectando com o sistema");
                        TelaMenu tm = new TelaMenu();
                        tm.setVisible(true);
                        dispose();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaSplash.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }.start();
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
        jProgressBarTelaSplash = new javax.swing.JProgressBar();
        jLabelMostrarProgresso = new javax.swing.JLabel();
        jLabelContagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBarTelaSplash.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBarTelaSplash.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(jProgressBarTelaSplash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 720, 20));

        jLabelMostrarProgresso.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 13)); // NOI18N
        jLabelMostrarProgresso.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMostrarProgresso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelMostrarProgresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 190, 20));

        jLabelContagen.setBackground(new java.awt.Color(255, 255, 255));
        jLabelContagen.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelContagen.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContagen.setText("99%");
        jPanel1.add(jLabelContagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 80, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/142446201903135c8912ae26b95.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(720, 290));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSplash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabelContagen;
    private javax.swing.JLabel jLabelMostrarProgresso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBarTelaSplash;
    // End of variables declaration//GEN-END:variables
}