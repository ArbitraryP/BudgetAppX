/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

/**
 *
 * @author Ivan Flavano
 */


import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import mainpackage.AddEditForm;

public class TransactionsPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainDBPanel
     */
    public TransactionsPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_TransTable = new javax.swing.JTable();
        pnl_Add = new javax.swing.JPanel();
        lb_Add = new javax.swing.JLabel();
        pnl_Edit = new javax.swing.JPanel();
        lb_Edit = new javax.swing.JLabel();
        pnl_Delete = new javax.swing.JPanel();
        lb_Delete = new javax.swing.JLabel();
        pnl_Refresh = new javax.swing.JPanel();
        lb_Refresh = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jScrollPane1.getViewport().setBackground(new java.awt.Color(0, 0, 0));

        tbl_TransTable.setBackground(new java.awt.Color(0, 0, 0));
        JTableHeader tblHeader = tbl_TransTable.getTableHeader();
        tblHeader.setBackground(new java.awt.Color(0, 0, 0));
        ((DefaultTableCellRenderer)tblHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        tblHeader.setForeground(new java.awt.Color(255, 255, 255));
        tblHeader.setReorderingAllowed(false);
        tblHeader.setFont(new java.awt.Font("Roboto Light", 0, 16));
        tblHeader.setOpaque(false);
        tbl_TransTable.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tbl_TransTable.setForeground(new java.awt.Color(255, 255, 255));
        tbl_TransTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID#", "Date", "Item", "Category", "Amount", "Savings"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_TransTable.setIntercellSpacing(new java.awt.Dimension(20, 20));
        tbl_TransTable.setRowHeight(40);
        tbl_TransTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_TransTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_TransTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_TransTable);
        if (tbl_TransTable.getColumnModel().getColumnCount() > 0) {
            tbl_TransTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        pnl_Add.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Add.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        pnl_Add.setForeground(new java.awt.Color(255, 255, 255));
        pnl_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_AddMouseExited(evt);
            }
        });
        pnl_Add.setLayout(new java.awt.BorderLayout());

        lb_Add.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_Add.setForeground(new java.awt.Color(255, 255, 255));
        lb_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/round_add_white_18dp Yellow.png"))); // NOI18N
        lb_Add.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_AddMouseExited(evt);
            }
        });
        pnl_Add.add(lb_Add, java.awt.BorderLayout.CENTER);

        pnl_Edit.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Edit.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        pnl_Edit.setForeground(new java.awt.Color(255, 255, 255));
        pnl_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_EditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_AddMouseExited(evt);
            }
        });
        pnl_Edit.setLayout(new java.awt.BorderLayout());

        lb_Edit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_Edit.setForeground(new java.awt.Color(255, 255, 255));
        lb_Edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/round_create_white_18dp Yellow.png"))); // NOI18N
        lb_Edit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_EditMouseClicked(evt);
            }
        });
        pnl_Edit.add(lb_Edit, java.awt.BorderLayout.CENTER);

        pnl_Delete.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Delete.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        pnl_Delete.setForeground(new java.awt.Color(255, 255, 255));
        pnl_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_AddMouseExited(evt);
            }
        });
        pnl_Delete.setLayout(new java.awt.BorderLayout());

        lb_Delete.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_Delete.setForeground(new java.awt.Color(255, 255, 255));
        lb_Delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/baseline_delete_white_18dp Yellow.png"))); // NOI18N
        lb_Delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_DeleteMouseClicked(evt);
            }
        });
        pnl_Delete.add(lb_Delete, java.awt.BorderLayout.CENTER);

        pnl_Refresh.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Refresh.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        pnl_Refresh.setForeground(new java.awt.Color(255, 255, 255));
        pnl_Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_RefreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_AddMouseExited(evt);
            }
        });
        pnl_Refresh.setLayout(new java.awt.BorderLayout());

        lb_Refresh.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_Refresh.setForeground(new java.awt.Color(255, 255, 255));
        lb_Refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/baseline_cached_white_18dp Yellow.png"))); // NOI18N
        lb_Refresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_RefreshMouseClicked(evt);
            }
        });
        pnl_Refresh.add(lb_Refresh, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Transactions");
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnl_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // ----- TOOLBAR - MOUSE ENTERED ------ //
    private void pnl_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_AddMouseEntered
        evt.getComponent().setBackground(new Color(32, 32, 32));
    }//GEN-LAST:event_pnl_AddMouseEntered
    
    // ----- TOOLBAR - MOUSE EXITED ------ //
    private void pnl_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_AddMouseExited
        java.awt.Point p = new java.awt.Point(evt.getLocationOnScreen());
        SwingUtilities.convertPointFromScreen(p, evt.getComponent());
        if(evt.getComponent().contains(p)){
            return;
        }
        evt.getComponent().setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_pnl_AddMouseExited
    
    
    // ----- ADD BUTTON - MOUSE CLICKED ------ //
    private void lb_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_AddMouseClicked
        
        AddEditForm jdf_AddEdit = new AddEditForm(parentFrame, true, this);
        jdf_AddEdit.setVisible(true);
        
    }//GEN-LAST:event_lb_AddMouseClicked
    

    // ----- EDIT BUTTON - MOUSE CLICKED ------ //
    private void lb_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_EditMouseClicked
        int selectedtablerow = tbl_TransTable.getSelectedRow();
        if(selectedtablerow == -1){
            JOptionPane.showMessageDialog(null,"No Transaction Selected");
        }else{
            int selectedid = Integer.parseInt(tbl_TransTable.getValueAt(selectedtablerow, 0).toString());
            String selecteditem = tbl_TransTable.getValueAt(selectedtablerow, 2).toString();
            String selectedcategory = tbl_TransTable.getValueAt(selectedtablerow, 3).toString();
            String datetmp = tbl_TransTable.getValueAt(selectedtablerow, 1).toString();
            Date selecteddate = null;
            try {
                selecteddate = new SimpleDateFormat("dd/MM/yyyy E").parse(datetmp);
            } catch (ParseException ex) {
                Logger.getLogger(TransactionsPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            double selectedamount = Double.parseDouble(tbl_TransTable.getValueAt(selectedtablerow, 4).toString());
                    
            AddEditForm jdf_AddEdit = new AddEditForm(parentFrame, true, this, selectedid, selecteditem, selectedcategory, selecteddate, selectedamount);
            jdf_AddEdit.setVisible(true);
        }
    }//GEN-LAST:event_lb_EditMouseClicked

    
    // ----- DELETE BUTTON - MOUSE CLICKED ------ //
    private void lb_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_DeleteMouseClicked
        //must have selected a columnn
        //asks for confirmation
        //revallidate (refresh and repopulate if invalid)
        //search and remove from stack, rearrange stack and rewrite file
        //refresh and repopulate
        
        
        int selectedtablerow = tbl_TransTable.getSelectedRow();
        if(selectedtablerow == -1){
            JOptionPane.showMessageDialog(null,"No Transaction Selected");
        }else{
            if(JOptionPane.showConfirmDialog (null, "Are you sure you want to delete transaction?\nThis action cannot be undone","Thrifty Coins",JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION){
                //ANSWERED YES: Remove item from stack, rewrite file
                if(validateDataSource()){
                    
                    int selectedid = Integer.parseInt(tbl_TransTable.getValueAt(selectedtablerow, 0).toString());
                    deleteData(selectedid);
                    
                    repopulateTable();
                    
                    //Write to File
                    saveDataSource();
                    
                    
                    
                    
                }
                
            }else{
                //Do nothing
            }
        }
        
        
        
    }//GEN-LAST:event_lb_DeleteMouseClicked

    
    // ----- REFRESH BUTTON - MOUSE CLICKED ------ //
    private void lb_RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_RefreshMouseClicked
        if(validateDataSource()){
            refreshData();
            repopulateTable();
        }
        
    }//GEN-LAST:event_lb_RefreshMouseClicked

    
    
    
    
    
    // ------------------------------------------ CUSTOM METHODS ------------------------------------------ //
    
    // ----- CHECKS IF DATA SOURCE IS VALID ------ //
    public boolean validateDataSource(){
        //checks whether the File is ready to be used
        
        File test = SettingsClass.getDataSource();
        
        if ( !test.exists() || !test.isFile() || test == null ){
            JOptionPane.showMessageDialog(this,"Data source not found. To fix go to:\nSettings > Data Source","Thrifty Coins",JOptionPane.WARNING_MESSAGE);
            return false;
            
        } else {
            return true;
        }
        
        
    }
    
    // ----- REFRESHES THE STACK VALUES ------ //
    public void refreshData(){
        //Assumes File is valid. check validDataSource()
        //Reset Values of Stack
        //Reads File Assigns it on a STACK then Displays it on the Table
        
        stk_ID = new Stack();
        stk_Date = new Stack();
        stk_Item = new Stack();
        stk_Category = new Stack();
        stk_Amount = new Stack();
        stk_Savings = new Stack();
        
        try{
            flr_Reader = new FileReader(fl_DataSource);
            
            
            //Traverse through all text content
            //starts from 0 field selector... 0 date, 1 item, 2 category, 3 amount, 4 savings
            int_fieldselector = 0;
            str_TmpData = "";
            loop:
            while ((int_ctr = flr_Reader.read()) != -1) {
                chr_txt = (char) int_ctr;
                switch(int_fieldselector){
                    
                    case 0: //ID
                        //Append to ID
                        
                        while(chr_txt != ','){
                            //get char, put to temp, push to stack
                            str_TmpData = str_TmpData + chr_txt;
                            continue loop; 
                        }
                        System.out.println(str_TmpData);
                        stk_ID.push( Integer.parseInt(str_TmpData) );
                        
                        str_TmpData = "";
                        int_fieldselector++;
                        
                        break;
                        
                    case 1: //Date
                        //Append to Date
                        while(chr_txt != ',' ){
                            //get char, put to temp, push to stack
                            str_TmpData = str_TmpData + chr_txt;
                            continue loop;   
                        }
                        try{
                            stk_Date.push( new SimpleDateFormat("dd/MM/yyyy E").parse(str_TmpData) );
                        }catch(ParseException e){
                            System.out.println(e.getMessage());
                        }
                        
                        
                        str_TmpData = "";
                        int_fieldselector++;
                        
                        
                        break;

                        
                    case 2: //Item
                        //Append to Item
                        while(chr_txt != ','){
                            //get char, put to temp, push to stack
                            str_TmpData = str_TmpData + chr_txt;
                            continue loop; 
                        }
                        stk_Item.push( str_TmpData );
                        
                        
                        str_TmpData = "";
                        int_fieldselector++;
                        
                        break;
                        
                    case 3: //Category
                        //Append to Category
                        while(chr_txt != ','){
                            //get char, put to temp, push to stack
                            str_TmpData = str_TmpData + chr_txt;
                            continue loop; 
                        }
                        stk_Category.push( str_TmpData );
                        
                        str_TmpData = "";
                        int_fieldselector++;
                        
                        break;
                    case 4: //Amount
                        //Append to Amount
                        while(chr_txt != ','){
                            //get char, put to temp, push to stack
                            str_TmpData = str_TmpData + chr_txt;
                            continue loop; 
                        }
                        stk_Amount.push( Double.parseDouble(str_TmpData) );
                        
                        
                        str_TmpData = "";
                        int_fieldselector++;
                        
                        break;
                        
                    case 5: //Savings
                        //Append to Savings
                        while(chr_txt != ';'){
                            //get char, put to temp, push to stack
                            str_TmpData = str_TmpData + chr_txt;
                            continue loop; 
                        }
                        stk_Savings.push( Double.parseDouble(str_TmpData) );
                        
                        int_ctr = flr_Reader.read();//Skips the Semicolon
                        
                        str_TmpData = "";
                        int_fieldselector = 0;
                        
                        break;
                        
                    default:
                }//end of switch
                
            }//end of while
            
            /*
            Used for debugging
            System.out.println("IDs: " + stk_ID);
            System.out.println("Dates: " + stk_Date);
            System.out.println("Items: " + stk_Item);
            System.out.println("Categories: " + stk_Category);
            System.out.println("Amount: " + stk_Amount);
            System.out.println("Savings: " + stk_Savings);
            */
            
            if(flr_Reader!=null){
                flr_Reader.close();
            }

        }catch(IOException ex){
            System.out.println("Exception:" + ex.getMessage());
        }
        
        
    }
    
    // ----- REPOPULATES THE TABLE WITH STACK VALUES ------ //
    public void repopulateTable(){
        
        DefaultTableModel dtmodel = (DefaultTableModel) tbl_TransTable.getModel();
        dtmodel.getDataVector().removeAllElements();
        revalidate();
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtmodel);
        tbl_TransTable.setRowSorter(sorter);
        
        Object rowData[] = new Object[6];
        for(int i = stk_Date.size()-1; i >= 0; i--)
        {
            rowData[0] = String.format("%03d", stk_ID.get(i));
            rowData[1] = new SimpleDateFormat("dd/MM/yyyy E").format(stk_Date.get(i));
            rowData[2] = stk_Item.get(i);
            rowData[3] = stk_Category.get(i);
            rowData[4] = stk_Amount.get(i);
            rowData[5] = stk_Savings.get(i);
            dtmodel.addRow(rowData);
        }
        tbl_TransTable.getRowSorter().toggleSortOrder(1); 
        tbl_TransTable.getRowSorter().toggleSortOrder(1); //two time to set as descending
    }
    
    // ----- DELETE DATA IN STACK ------ //
    public void deleteData(int deletingID){
        stk_ID.remove(deletingID-1);
        stk_Date.remove(deletingID-1);
        stk_Item.remove(deletingID-1); 
        stk_Category.remove(deletingID-1);
        stk_Amount.remove(deletingID-1);
        stk_Savings.remove(deletingID-1); 
        updateIDSavingsValues();
    }
    
    
    // ----- UPDATE THE ID AND SAVINGS VALUES IN STACK ------ //
    public void updateIDSavingsValues(){
        for(int x1 = 0 ; x1 < stk_Savings.size() ; x1++){
            stk_ID.set(x1, x1+1);
            double tempSavings = 0;
            for(int x2 = 0 ; x2 <= x1 ; x2++){
                tempSavings += stk_Amount.get(x2);
            }
            stk_Savings.set(x1, tempSavings);
        }
    }
    
    // ----- SAVES THE STACK VALUES ITO THE DATA SOURCE FILE------ //
    protected void saveDataSource(){
        //This methods assumes valid file
        //directly saves all stack values into the file
        
        
        fl_DataSource = SettingsClass.getDataSource();
        try{
            flw_Writer = new FileWriter(fl_DataSource);

            //Store everting in a strng
            String texts = "";
            
            //traverse through all stacks
            for(int x = 0; x < stk_ID.size() ;x++){
                
                texts = texts +
                        stk_ID.get(x) + ',' +
                        new SimpleDateFormat("dd/MM/yyyy E").format(stk_Date.get(x)) + ',' +
                        stk_Item.get(x) + ',' +
                        stk_Category.get(x) + ',' +
                        stk_Amount.get(x) + ',' +
                        stk_Savings.get(x) + ";\n";
                
                
                
            }
            
            for(char x : texts.toCharArray()) {
                flw_Writer.write(x);

            }


            if (flw_Writer!= null){
                flw_Writer.close();
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Add;
    private javax.swing.JLabel lb_Delete;
    private javax.swing.JLabel lb_Edit;
    private javax.swing.JLabel lb_Refresh;
    private javax.swing.JPanel pnl_Add;
    private javax.swing.JPanel pnl_Delete;
    private javax.swing.JPanel pnl_Edit;
    private javax.swing.JPanel pnl_Refresh;
    private javax.swing.JTable tbl_TransTable;
    // End of variables declaration//GEN-END:variables
    
    private File fl_DataSource = SettingsClass.getDataSource();
    private FileReader flr_Reader;
    private FileWriter flw_Writer;
    private char chr_txt;
    private int int_ctr;
    private int int_fieldselector;
    private String str_TmpData = "";
    
    protected Stack<Integer> stk_ID = new Stack<>();
    protected Stack<Date> stk_Date = new Stack<Date>();
    protected Stack<String> stk_Item = new Stack();
    protected Stack<String> stk_Category = new Stack();
    protected Stack<Double> stk_Amount = new Stack();
    protected Stack<Double> stk_Savings = new Stack();
    
    public JFrame parentFrame;
}
