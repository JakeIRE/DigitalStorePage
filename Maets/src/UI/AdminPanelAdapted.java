/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Common.NavigateToCommand;
import Common.PromoteToAdminCommand;
import Controller.UIHandler;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Vilius
 */
public class AdminPanelAdapted extends javax.swing.JPanel {

    public UIHandler uiHandler;
    private javax.swing.JFrame frame;
    
    /**
     * Creates new form AdminPanel
     */
    public AdminPanelAdapted(JFrame mainFrame, UIHandler uiHandler) {
        this.frame = mainFrame;
        this.uiHandler = uiHandler;
        promoteB = new CommandJbutton(new PromoteToAdminCommand());
        initComponents();
        
        displayAllUsers();
    }
    
    public AdminPanelAdapted(JFrame frame, JPanel panel, UIHandler uiHandler) {
         this.frame = frame;
         this.uiHandler = uiHandler;
        promoteB = new CommandJbutton(new PromoteToAdminCommand());
        initComponents();
        
        displayAllUsers();
    }
    
    // Diplay all users that are non Admin and non Publisher
    private void displayAllUsers() {
        userDropdown.removeAllItems();
        
        String[] userNames = uiHandler.getAllUserNames();
        int[] userTypes = uiHandler.getAllUserTypes();
        for (int i = 0; i < userNames.length; i++) {
            if (userTypes[i] == 3) continue;
            if (userTypes[i] == 2) continue;
            userDropdown.addItem(userNames[i]);
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

        selectUserLabel = new javax.swing.JLabel();
        userDropdown = new javax.swing.JComboBox<>();
        backB = new javax.swing.JButton();

        selectUserLabel.setText("Select user");

        userDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        promoteB.setText("Promote");
        promoteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promoteBActionPerformed(evt);
            }
        });

        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
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
                        .addComponent(promoteB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                        .addComponent(backB))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectUserLabel)
                            .addComponent(userDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectUserLabel)
                .addGap(18, 18, 18)
                .addComponent(userDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(promoteB)
                    .addComponent(backB))
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void promoteBActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String selectedUser = (String) userDropdown.getSelectedItem();
        if (selectedUser == null || selectedUser.isEmpty()) return;
        
        PromoteToAdminCommand promoteCommand = (PromoteToAdminCommand) promoteB.command;
        promoteCommand.setUserSelected(selectedUser);
        promoteCommand.execute();
        
        userDropdown.removeItem(selectedUser);
    }                                        

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }
    
    
    private javax.swing.JButton backB;
    private CommandJbutton promoteB;
    private javax.swing.JLabel selectUserLabel;
    private javax.swing.JComboBox<String> userDropdown;
}
