/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import common.DoNothingCommand;
import common.LogoutCommand;
import common.NavigateToCommand;
import Controller.UIHandler;
import Memento.CareTaker;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Vilius
 */
public class LibraryPanelAdapted extends javax.swing.JPanel {

    private UIHandler uiHandler;
    private javax.swing.JFrame frame;
    private int[] productIDs;
    
    /**
     * Creates new form LibraryPanel
     */
    public LibraryPanelAdapted(JFrame mainFrame, UIHandler uiHandler) {
        this.frame = mainFrame;
        this.uiHandler = uiHandler;
        logoutB = new CommandJbutton(new LogoutCommand(uiHandler.getUsername()));
        launchB = new CommandJbutton(new DoNothingCommand());
        backB = new CommandJbutton(new DoNothingCommand());
        initComponents();
        
        displayAllProducts();
    }
    
    public LibraryPanelAdapted(JFrame frame, JPanel panel, UIHandler uiHandler) {
        this.frame = frame;
        this.uiHandler = uiHandler;
        logoutB = new CommandJbutton(new LogoutCommand(uiHandler.getUsername()));
        launchB = new CommandJbutton(new DoNothingCommand());
        backB = new CommandJbutton(new DoNothingCommand());
        initComponents();
        
        displayAllProducts();
    }
    
    private void displayAllProducts() {
        productDropdown.removeAllItems();
        
        String[] productNames = uiHandler.getLibrary();
        productIDs = uiHandler.getProductIDsByUsername();
        
        for (String name : productNames) {
            System.out.println(name);
        }
        
        for (int i = 0; i < productNames.length; i++) {
            productDropdown.addItem(productNames[i]);
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

        productDropdown = new javax.swing.JComboBox<>();

        productDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });
        logoutB.setText("Logout");
        logoutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBActionPerformed(evt);
            }
        });
        

        launchB.setText("Launch");
        launchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(productDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                        .addComponent(backB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoutB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(launchB, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backB))
                .addGap(18, 18, 18)
                .addComponent(logoutB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(launchB)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void logoutBActionPerformed(java.awt.event.ActionEvent evt) {                                        
        logoutB.execute();
        logoutB.setCommand(new NavigateToCommand(new LoginPanel(frame,this,uiHandler),frame));
        logoutB.execute();
    }     
    
    private void launchBActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedProduct = productDropdown.getSelectedIndex();
        int selectedProductID = productIDs[selectedProduct];
        uiHandler.launchProduct(selectedProductID);
    }     

    private void backBActionPerformed(ActionEvent evt) {
        backB.setCommand(new NavigateToCommand(CareTaker.getInstance().get(2),frame));
        backB.execute();
    }

    // Variables declaration - do not modify                     
    private CommandJbutton backB;
    private CommandJbutton launchB;
    private CommandJbutton logoutB;
    private javax.swing.JComboBox<String> productDropdown;
    // End of variables declaration                   
}
