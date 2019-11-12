/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.awt.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

import java.time.*;
import static mainpackage.TransactionsPanel.*;

/**
 *
 * @author Ivan Flavano
 */
public class AddEditForm extends javax.swing.JDialog {

    /**
     * Creates new form AddEditForm
     */
    public AddEditForm( java.awt.Frame parent, boolean modal ) {
        super(parent, modal);
        initComponents();
        
        
    } 
    
    // -------------- Constructor for ADD TRANS -------------- //
    public AddEditForm( java.awt.Frame parent, boolean modal, TransactionsPanel panel ) {
        this(parent, modal);
        parentPanel = panel;
        isEditing = false;
        
    }
    
    // -------------- Constructor for EDIT TRANS -------------- //
    public AddEditForm ( java.awt.Frame parent, boolean modal, TransactionsPanel panel, int id, String item, String category, Date date, double Amount){
        this(parent, modal, panel);
        editingID = id;
        isEditing = true;
        lb_AddEditTile.setText("Edit Transaction");
        txt_Item.setText(item);
        for (int x = 0; x<cmb_Categories.getItemCount(); x++){
            if(cmb_Categories.getItemAt(x).toString().equals(category) ){
                cmb_Categories.setSelectedIndex(x);
            }
        }
        jxd_Date.setDate(date);
        if(Amount > 0){
            toggleSymbol();
        }
        txt_Amount.setText(""+Math.abs(Amount));
        
        
        
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
        pnl_TitleBar = new javax.swing.JPanel();
        lb_Exit = new javax.swing.JLabel();
        txt_Item = new javax.swing.JTextField();
        cmb_Categories = new javax.swing.JComboBox<>();
        jxd_Date = new org.jdesktop.swingx.JXDatePicker();
        pnl_Toggle = new javax.swing.JPanel();
        lb_Toggle = new javax.swing.JLabel();
        pnl_Submit = new javax.swing.JPanel();
        lb_Submit = new javax.swing.JLabel();
        pnl_Cancel = new javax.swing.JPanel();
        lb_Cancel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lb_AddEditTile = new javax.swing.JLabel();
        txt_Amount = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add/Edit Form");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(501, 600));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 66, 66)));

        pnl_TitleBar.setBackground(new java.awt.Color(0, 0, 0));
        pnl_TitleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_TitleBarMouseDragged(evt);
            }
        });
        pnl_TitleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_TitleBarMousePressed(evt);
            }
        });

        lb_Exit.setBackground(new java.awt.Color(255, 255, 255));
        lb_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/round_clear_white_14.png"))); // NOI18N
        lb_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_TitleBarLayout = new javax.swing.GroupLayout(pnl_TitleBar);
        pnl_TitleBar.setLayout(pnl_TitleBarLayout);
        pnl_TitleBarLayout.setHorizontalGroup(
            pnl_TitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_TitleBarLayout.createSequentialGroup()
                .addContainerGap(483, Short.MAX_VALUE)
                .addComponent(lb_Exit)
                .addContainerGap())
        );
        pnl_TitleBarLayout.setVerticalGroup(
            pnl_TitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_Exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_Item.setBackground(new java.awt.Color(0, 0, 0));
        txt_Item.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Item.setForeground(new java.awt.Color(255, 255, 255));
        txt_Item.setText("Item");
        txt_Item.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        txt_Item.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ItemFocusLost(evt);
            }
        });
        txt_Item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ItemKeyTyped(evt);
            }
        });

        cmb_Categories.setBackground(new java.awt.Color(0, 0, 0));
        cmb_Categories.setEditable(true);
        cmb_Categories.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_Categories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Entertainment", "Household", "Utilities", "Salary", "Others" }));
        cmb_Categories.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        cmb_Categories.setSelectedItem("Category");
        cmb_Categories.setEditable(false);

        jxd_Date.setToolTipText("");
        jxd_Date.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jxd_Date.setFormats("dd/MM/yyyy E");
        jxd_Date.getEditor().setEditable(false);
        //jxd_Date.getEditor().setText("Date");

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zdt = now.atZone(ZoneId.systemDefault());
        Date output = Date.from(zdt.toInstant());
        jxd_Date.setDate(output);

        pnl_Toggle.setBackground(new java.awt.Color(200, 0, 0));
        pnl_Toggle.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2), javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        pnl_Toggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_ToggleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_ToggleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_ToggleMouseExited(evt);
            }
        });
        pnl_Toggle.setLayout(new java.awt.BorderLayout());

        lb_Toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/round_remove_white_18dp.png"))); // NOI18N
        pnl_Toggle.add(lb_Toggle, java.awt.BorderLayout.CENTER);

        pnl_Submit.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Submit.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        pnl_Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_SubmitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_SubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_SubmitMouseExited(evt);
            }
        });
        pnl_Submit.setLayout(new java.awt.BorderLayout());

        lb_Submit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/round_done_white_18dp.png"))); // NOI18N
        lb_Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_SubmitMouseClicked(evt);
            }
        });
        pnl_Submit.add(lb_Submit, java.awt.BorderLayout.CENTER);

        pnl_Cancel.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Cancel.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        pnl_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_CancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_SubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_SubmitMouseExited(evt);
            }
        });
        pnl_Cancel.setLayout(new java.awt.BorderLayout());

        lb_Cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/round_close_white_18dp.png"))); // NOI18N
        lb_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_CancelMouseClicked(evt);
            }
        });
        pnl_Cancel.add(lb_Cancel, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new java.awt.BorderLayout());

        lb_AddEditTile.setBackground(new java.awt.Color(0, 0, 0));
        lb_AddEditTile.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lb_AddEditTile.setForeground(new java.awt.Color(255, 255, 255));
        lb_AddEditTile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_AddEditTile.setText("Add Transaction");
        jPanel6.add(lb_AddEditTile, java.awt.BorderLayout.CENTER);

        txt_Amount.setBackground(new java.awt.Color(0, 0, 0));
        txt_Amount.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
        txt_Amount.setForeground(new java.awt.Color(255, 255, 255));
        txt_Amount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txt_Amount.setText("0.00");
        txt_Amount.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txt_Amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_AmountFocusLost(evt);
            }
        });
        txt_Amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_AmountKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_TitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Item)
                    .addComponent(cmb_Categories, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jxd_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnl_Toggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(pnl_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnl_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_Amount))))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnl_TitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(txt_Item, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmb_Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jxd_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_Toggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Amount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //EXIT BUTTON
    private void lb_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ExitMouseClicked
        dispose();
    }//GEN-LAST:event_lb_ExitMouseClicked
    
    //MOVE WINDOW DRAG
    private void pnl_TitleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_TitleBarMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        setLocation(xx-formAxisX, yy-formAxisY);

    }//GEN-LAST:event_pnl_TitleBarMouseDragged
    
    //MOVE WINDOW PRESS
    private void pnl_TitleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_TitleBarMousePressed
        formAxisX = evt.getX();
        formAxisY = evt.getY();
    }//GEN-LAST:event_pnl_TitleBarMousePressed
    
    // ----- ANSWER - MOUSE ENTERED ------ //
    private void pnl_SubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_SubmitMouseEntered
        evt.getComponent().setBackground(new Color(32, 32, 32));
        
    }//GEN-LAST:event_pnl_SubmitMouseEntered
    
    // ----- ANSWER - MOUSE EXITED ------ //
    private void pnl_SubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_SubmitMouseExited
        java.awt.Point p = new java.awt.Point(evt.getLocationOnScreen());
        SwingUtilities.convertPointFromScreen(p, evt.getComponent());
        if(evt.getComponent().contains(p)){
            return;
        }
        evt.getComponent().setBackground(new Color(0, 0, 0));
        
    }//GEN-LAST:event_pnl_SubmitMouseExited
    
    // ----- SYMBOL - MOUSE EXITED ------ //
    private void pnl_ToggleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_ToggleMouseExited
        java.awt.Point p = new java.awt.Point(evt.getLocationOnScreen());
        SwingUtilities.convertPointFromScreen(p, evt.getComponent());
        if(evt.getComponent().contains(p)){
            return;
        }
        pnl_Toggle.setBorder(BorderFactory.createCompoundBorder((BorderFactory.createEmptyBorder(2, 2, 2, 2)), BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        
        
    }//GEN-LAST:event_pnl_ToggleMouseExited
    
    // ----- SYMBOL - MOUSE ENTERED ------ //
    private void pnl_ToggleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_ToggleMouseEntered
        
        pnl_Toggle.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(252,215,54), 2, true), BorderFactory.createEmptyBorder(15, 15, 15, 15)));
    }//GEN-LAST:event_pnl_ToggleMouseEntered
    
    // ----- SYMBOL - MOUSE CLICKED ------ //
    private void pnl_ToggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_ToggleMouseClicked
        toggleSymbol();
        
    }//GEN-LAST:event_pnl_ToggleMouseClicked

    
    
    // ----- DATA VALIDATION - TXT AMOUNT ------ //
    private void txt_AmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AmountKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if( ( c == '.' || Character.isDigit(c) ) && !evt.isAltDown() ){
            
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_txt_AmountKeyTyped
    
    
    // ----- DATA VALIDATION - TXT ITEM ------ //
    private void txt_ItemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ItemKeyTyped
        char c=evt.getKeyChar();
        if( !Character.isLetter(c) && !Character.isDigit(c) && c != ' ' && !evt.isAltDown()){
            evt.consume();
        }
    }//GEN-LAST:event_txt_ItemKeyTyped

    
    // --------- DATA VALIDATION - TEXT BOX LOST FOCUS REMOVE ALL BAD CHARS ------ //
    private void txt_ItemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ItemFocusLost
        autoValidateItem();
              
    }//GEN-LAST:event_txt_ItemFocusLost
    
    //CANCEL IS CLICKED
    private void lb_CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_CancelMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_lb_CancelMouseClicked
    
    
    // ------ SUBMIT IS CLICKED ------ //
    private void lb_SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_SubmitMouseClicked
        
        //Run AutoValidation Methods for data validation
        autoValidateItem();
        autoValidateAmount();
        
        
        System.out.println(fieldsAreValid());
        if(!fieldsAreValid()){
            JOptionPane.showMessageDialog(null,"No Category Selected");
        }else{
            if(JOptionPane.showConfirmDialog (null, "Confirm Submission?","Thrifty Coins",JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION){
                
                //Call Add/Edit Method
                if(parentPanel.validateDataSource()){
                    submitTransaction();
                    dispose();
                    parentPanel.refreshData();
                    parentPanel.repopulateTable();
                }
                
                
            }
            
            
        }
        
        
    }//GEN-LAST:event_lb_SubmitMouseClicked
    
    
    // --------- DATA VALIDATION - TEXT BOX LOST FOCUS REVERT TO ZERO ------ //
    private void txt_AmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_AmountFocusLost
        autoValidateAmount();
        
    }//GEN-LAST:event_txt_AmountFocusLost

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
            java.util.logging.Logger.getLogger(AddEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddEditForm dialog = new AddEditForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    
    
    // ------------------------ CUSTOM METHODS ------------------------ //
    
    public void toggleSymbol(){
        if(isExpense){
            lb_Toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/round_add_white_18dp small.png")));
            pnl_Toggle.setBackground(new Color(0,170,0));
            isExpense = false;
        }else{
            lb_Toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/round_remove_white_18dp.png")));
            pnl_Toggle.setBackground(new Color(170,0,0));
            isExpense = true;
        }
    }
    
    public void autoValidateItem(){
        String cont = txt_Item.getText();
        StringBuilder sb = new StringBuilder(cont);
        
        for(int x = 0; x < sb.length(); x++){
            if( !Character.isLetter(sb.charAt(x)) && !Character.isDigit(sb.charAt(x)) && sb.charAt(x) != ' '){
                sb.deleteCharAt(x);
                x--;
            }
        }
        txt_Item.setText(sb.toString());  
    }
    
    public void autoValidateAmount(){
        String cont = txt_Amount.getText();
        boolean isDouble = true;
        try{
          Double.parseDouble(cont);
        }
        catch(NumberFormatException e){
          isDouble = false;
        }
        if(cont.equals("") || !isDouble){
            txt_Amount.setText("0.00");  
        }
    }
    
    private boolean fieldsAreValid(){
        // Check if Category is Set
        String category = cmb_Categories.getSelectedItem().toString();
        return !(category.equals("Category"));
    }
    
    
    
    
    
    // -------------------  MAIN ADD/EDIT METHOD ------------------- //
    private void submitTransaction(){
        
        
        
        int useID = -1; //by default it assumes it is last = push into stack
        String useItem = txt_Item.getText();
        String useCategory = cmb_Categories.getSelectedItem().toString();
        Date useDate = jxd_Date.getDate();
        double useAmount = Double.parseDouble(txt_Amount.getText());
        
        
        
        // SET ID VALUE... if last.. use -1 instead
        
        
        if(isEditing){ // EDITING TRANSACTION
            //Remove Item the PROCEED to Add new one
            parentPanel.deleteData(editingID);
            
        }

        // ADDING TRANSACTION
            
        //Get ID base on Date - loop to traverse all Dates - 
        for(int i = parentPanel.stk_Date.size()-1; i >= 0; i--){
            //Checks if lesser
            if( useDate.compareTo(parentPanel.stk_Date.get(i)) >= 0){
                //Checks if last by date
                if(i==parentPanel.stk_Date.size()-1){
                    useID = -1; //latest.. so use push instead
                    break;
                }else{
                    useID = i+2; //place it after the target
                    break;
                }

            }
        }
            
            
            
            
        
        
        // SET AMOUNT VALUE IF POSITIVE OR NEGATIVE
        if(isExpense){
            useAmount *= -1;
        }
        
        
        // PUT ALL DATA IN STACK
        if(useID == -1){ //use push
            parentPanel.stk_ID.push(parentPanel.stk_ID.size()+1);
            parentPanel.stk_Date.push(useDate);
            parentPanel.stk_Item.push(useItem);
            parentPanel.stk_Category.push(useCategory);
            parentPanel.stk_Amount.push(useAmount);
            parentPanel.stk_Savings.push(0.0);
            
        }else{ //Add 
            parentPanel.stk_ID.add(useID-1, useID);
            parentPanel.stk_Date.add(useID-1, useDate);
            parentPanel.stk_Item.add(useID-1, useItem);
            parentPanel.stk_Category.add(useID-1, useCategory);
            parentPanel.stk_Amount.add(useID-1, useAmount);
            parentPanel.stk_Savings.add(useID-1, 0.0);
            
        }
        
        parentPanel.updateIDSavingsValues();
        parentPanel.saveDataSource();
        
        
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_Categories;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private org.jdesktop.swingx.JXDatePicker jxd_Date;
    private javax.swing.JLabel lb_AddEditTile;
    private javax.swing.JLabel lb_Cancel;
    private javax.swing.JLabel lb_Exit;
    private javax.swing.JLabel lb_Submit;
    private javax.swing.JLabel lb_Toggle;
    private javax.swing.JPanel pnl_Cancel;
    private javax.swing.JPanel pnl_Submit;
    private javax.swing.JPanel pnl_TitleBar;
    private javax.swing.JPanel pnl_Toggle;
    private javax.swing.JFormattedTextField txt_Amount;
    private javax.swing.JTextField txt_Item;
    // End of variables declaration//GEN-END:variables
    
    
    
    private File fl_DataSource = SettingsClass.getDataSource();
    private FileWriter flw_Writer;
    private int formAxisX,formAxisY;
    private TransactionsPanel parentPanel;
    private int editingID;
    private boolean isExpense = true;
    private boolean isEditing = false;
}
