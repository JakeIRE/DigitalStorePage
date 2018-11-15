/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Controller.UIHandler;
import javax.swing.JFrame;

/**
 *
 * @author jakec
 */
public class PublisherGameDataInput extends javax.swing.JPanel {

    /**
     * Creates new form PublisherGameDataInput
     */
    public PublisherGameDataInput() {
        initComponents();
    }

    PublisherGameDataInput(JFrame frame, PublisherProductListingAdapted aThis, UIHandler uiHandler) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        backB = new javax.swing.JButton();
        logoutB = new javax.swing.JButton();
        nameTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        priceTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        descriptionTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        genreTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        minSpecTf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        proceed = new javax.swing.JButton();
        genreTf1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ErrorBox = new java.awt.TextArea();

        jLabel1.setText("Please Input new video game data");

        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        logoutB.setText("Logout");

        nameTf.setText("");
        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });

        jLabel2.setText("Game Name");

        priceTf.setText("");
        priceTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTfActionPerformed(evt);
            }
        });

        jLabel3.setText("Price");

        ageTf.setText("");
        ageTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTfActionPerformed(evt);
            }
        });

        jLabel4.setText("Age Rating");

        descriptionTf.setText("");
        descriptionTf.setAutoscrolls(false);
        descriptionTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTfActionPerformed(evt);
            }
        });

        jLabel5.setText("Description");

        genreTf.setText("");
        genreTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreTfActionPerformed(evt);
            }
        });

        jLabel6.setText("Genre");

        minSpecTf.setText("");
        minSpecTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minSpecTfActionPerformed(evt);
            }
        });

        jLabel7.setText("Minimum Specs");

        proceed.setText("Continue");

        genreTf1.setText("");
        genreTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreTf1ActionPerformed(evt);
            }
        });

        jLabel9.setText("File Location");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backB))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genreTf1)
                                    .addComponent(descriptionTf, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(priceTf)
                                    .addComponent(nameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(ageTf)
                                    .addComponent(genreTf)
                                    .addComponent(minSpecTf)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(logoutB))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(ErrorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutB)
                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genreTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(minSpecTf, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descriptionTf, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genreTf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(ErrorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(proceed)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBActionPerformed

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void priceTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTfActionPerformed

    private void ageTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTfActionPerformed

    private void descriptionTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTfActionPerformed

    private void genreTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreTfActionPerformed

    private void minSpecTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minSpecTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minSpecTfActionPerformed

    private void genreTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreTf1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea ErrorBox;
    private javax.swing.JTextField ageTf;
    private javax.swing.JButton backB;
    private javax.swing.JTextField descriptionTf;
    private javax.swing.JTextField genreTf;
    private javax.swing.JTextField genreTf1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logoutB;
    private javax.swing.JTextField minSpecTf;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField priceTf;
    private javax.swing.JButton proceed;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
