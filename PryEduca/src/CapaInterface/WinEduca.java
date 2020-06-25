/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterface;

import CapaNegocio.ClsListas;
import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class WinEduca extends javax.swing.JFrame {

    /**
     * Creates new form WinEduca
     */
    public static ClsListas lst =new ClsListas();
    
    public WinEduca() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(207,253,252));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnCrear = new javax.swing.JMenu();
        ItmEstNvo = new javax.swing.JMenuItem();
        ItmEstLst = new javax.swing.JMenuItem();
        ItmSalir = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        ItmMatNvo = new javax.swing.JMenuItem();
        ItmMatLst = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        ItmAcerca = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Estudiantil");

        MnCrear.setText("Alumnos");

        ItmEstNvo.setText("Nuevo");
        ItmEstNvo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmEstNvoActionPerformed(evt);
            }
        });
        MnCrear.add(ItmEstNvo);

        ItmEstLst.setText("Lista");
        ItmEstLst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmEstLstActionPerformed(evt);
            }
        });
        MnCrear.add(ItmEstLst);

        ItmSalir.setText("Salir");
        ItmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmSalirActionPerformed(evt);
            }
        });
        MnCrear.add(ItmSalir);

        jMenuBar1.add(MnCrear);

        jMenu6.setText("Materia");

        ItmMatNvo.setText("Nuevo");
        ItmMatNvo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmMatNvoActionPerformed(evt);
            }
        });
        jMenu6.add(ItmMatNvo);

        ItmMatLst.setText("Lista");
        ItmMatLst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmMatLstActionPerformed(evt);
            }
        });
        jMenu6.add(ItmMatLst);

        jMenuBar1.add(jMenu6);

        jMenu8.setText("Ayuda");

        ItmAcerca.setText("Acerca de");
        ItmAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmAcercaActionPerformed(evt);
            }
        });
        jMenu8.add(ItmAcerca);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItmEstNvoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmEstNvoActionPerformed
        // TODO add your handling code here:
        new WinEstudiante().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItmEstNvoActionPerformed

    private void ItmEstLstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmEstLstActionPerformed
        new WinListaEstudiantes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItmEstLstActionPerformed

    private void ItmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ItmSalirActionPerformed

    private void ItmMatLstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmMatLstActionPerformed
        // TODO add your handling code here:
        new WinListaMaterias().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItmMatLstActionPerformed

    private void ItmAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmAcercaActionPerformed
        // TODO add your handling code here:
        new WinAcerca().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItmAcercaActionPerformed

    private void ItmMatNvoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmMatNvoActionPerformed
        // TODO add your handling code here:
        new WinMateria().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItmMatNvoActionPerformed

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
            java.util.logging.Logger.getLogger(WinEduca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinEduca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinEduca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinEduca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItmAcerca;
    private javax.swing.JMenuItem ItmEstLst;
    private javax.swing.JMenuItem ItmEstNvo;
    private javax.swing.JMenuItem ItmMatLst;
    private javax.swing.JMenuItem ItmMatNvo;
    private javax.swing.JMenuItem ItmSalir;
    private javax.swing.JMenu MnCrear;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
