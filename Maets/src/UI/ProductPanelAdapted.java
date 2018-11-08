package UI;

import Common.AddToCartCommand;
import Common.DoNothingCommand;
import Common.LogoutCommand;
import Common.NavigateToCommand;
import Controller.UIHandler;
import Memento.CareTaker;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Vilius
 */
public class ProductPanelAdapted extends javax.swing.JPanel {

    public UIHandler uiHandler;
    private JFrame frame;
    private String productName;
    
    public ProductPanelAdapted(JFrame mainFrame, UIHandler uiHandler, String productName) {
        this.frame = frame;
        this.uiHandler = uiHandler;
        this.productName = productName;
         
        cartB = new CommandJbutton (new AddToCartCommand(uiHandler, productName));
        backB = new CommandJbutton (new NavigateToCommand(CareTaker.getInstance().get(1),frame));
        logoutB = new CommandJbutton (new DoNothingCommand());
        initComponents();
        
        listProductInfo(productName);
    }
    
    public ProductPanelAdapted(JFrame frame, JPanel panel, UIHandler uiHandler, String productName) {
        this.frame = frame;
        this.uiHandler = uiHandler;
        this.productName = productName;
        
        cartB = new CommandJbutton (new AddToCartCommand(uiHandler, productName));

        backB = new CommandJbutton (new NavigateToCommand(CareTaker.getInstance().get(1),frame));
        logoutB = new CommandJbutton (new DoNothingCommand());
        initComponents();
        
        listProductInfo(productName);
    }
    
    public void listProductInfo(String productName) {
        String productInfo = uiHandler.getProductInfo(productName);
        productInfo = "<html>" + productInfo + "</html>";
        
        productInfoLabel.setText(productInfo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        productInfoLabel = new javax.swing.JLabel();

        productInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        productInfoLabel.setText("Product Info");

        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });
        
        cartB.setText("Add to cart");
        cartB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBActionPerformed(evt);
            }
        });
        
        logoutB.setText("Logout");
        logoutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBActionPerformed(evt);
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
                        .addComponent(productInfoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                        .addComponent(backB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoutB, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productInfoLabel)
                    .addComponent(backB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(cartB)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {                                      
        backB.execute();
    }      
    
    private void logoutBActionPerformed(java.awt.event.ActionEvent evt) {   
        
        LogoutCommand logoutCommand =  (LogoutCommand) logoutB.command;
        logoutCommand.execute();
        logoutB.setCommand(new NavigateToCommand(new LoginPanel(frame,this,uiHandler),frame));
        logoutB.execute();
        // TODO add your handling code here:
    }     
    
    private void cartBActionPerformed(java.awt.event.ActionEvent evt) {                                      
        cartB.execute();
        cartB.setCommand(new NavigateToCommand(new ProductListingAdapted(frame,this,uiHandler),frame));
        cartB.execute();
    }      

    // Variables declaration - do not modify    
    private CommandJbutton backB;
    private CommandJbutton cartB;
    private CommandJbutton logoutB;
    private javax.swing.JLabel productInfoLabel;
    // End of variables declaration                   
}
