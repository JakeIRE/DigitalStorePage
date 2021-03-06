/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import common.DoNothingCommand;
import common.NavigateToCommand;
import Controller.UIHandler;
import Memento.CareTaker;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dev Mode
 */
public class CheckoutPanel extends javax.swing.JPanel {
    private UIHandler uiHandler;
    private javax.swing.JFrame frame;
    
    CheckoutPanel(JFrame mainFrame, UIHandler uiHandler) {
        this.frame = mainFrame;
        initComponents();
        displaycartInTable();
        
    }

    CheckoutPanel(JFrame frame, JPanel panel, UIHandler uiHandler) {
         this.frame = frame;
        this.uiHandler = uiHandler;
        
        //pay = new CommandJbutton(new NavigateToCommand(panel,frame));
        initComponents();
        displaycartInTable();
    }
        private void displaycartInTable() {
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        int rowCount = model.getRowCount();
        // Remove all existing rows
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        // Add product listings
        Object[][] listings = uiHandler.getCart();
        
        for (Object[] list : listings) {
            model.addRow(list);
        }
        if(model.getRowCount()==0)
        {
            pay.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        pay = new CommandJbutton(new DoNothingCommand());
        back = new CommandJbutton(new DoNothingCommand());
        storeLabel = new javax.swing.JLabel();
        productScrollPane = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        storeLabel.setText("Checkout");

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productScrollPane.setViewportView(productTable);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(storeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pay, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(storeLabel)
                .addGap(5, 5, 5)
                .addComponent(productScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(pay)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        back.setCommand(new NavigateToCommand(CareTaker.getInstance().get(2), frame));
        back.execute();
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        pay.setCommand(new NavigateToCommand(new Pay(frame,this,uiHandler), frame));
        pay.execute();
    }                                        


    // Variables declaration - do not modify                     
    private CommandJbutton back;
    private CommandJbutton pay;
    private javax.swing.JScrollPane productScrollPane;
    private javax.swing.JTable productTable;
    private javax.swing.JLabel storeLabel;
    // End of variables declaration                   
}
