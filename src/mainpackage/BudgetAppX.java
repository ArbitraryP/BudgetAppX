/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import javax.swing.*;
import static javax.swing.BorderFactory.*;

/**
 *
 * @author Ivan Flavano
 */
public class BudgetAppX extends javax.swing.JFrame {
    
    
    /**
     * Creates new form BudgetAppX
     */
    public BudgetAppX() {
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

        pnl_Background = new javax.swing.JPanel();
        pnl_TitleBar = new javax.swing.JPanel();
        lb_Exit = new javax.swing.JLabel();
        lb_Minimize = new javax.swing.JLabel();
        pnl_Title = new javax.swing.JPanel();
        pnl_NavBar = new javax.swing.JPanel();
        pnl_NavMainDashB = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnl_NavTransactions = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnl_NavBudSum = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnl_NavSettings = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnl_NavAbout = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnl_Container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rudy Coins");
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        pnl_Background.setBackground(new java.awt.Color(0, 0, 0));

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

        lb_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/round_remove_white_14.png"))); // NOI18N
        lb_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_MinimizeMouseClicked(evt);
            }
        });

        pnl_Title.setBackground(new java.awt.Color(32, 32, 32));

        javax.swing.GroupLayout pnl_TitleLayout = new javax.swing.GroupLayout(pnl_Title);
        pnl_Title.setLayout(pnl_TitleLayout);
        pnl_TitleLayout.setHorizontalGroup(
            pnl_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        pnl_TitleLayout.setVerticalGroup(
            pnl_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_TitleBarLayout = new javax.swing.GroupLayout(pnl_TitleBar);
        pnl_TitleBar.setLayout(pnl_TitleBarLayout);
        pnl_TitleBarLayout.setHorizontalGroup(
            pnl_TitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_TitleBarLayout.createSequentialGroup()
                .addComponent(pnl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_Minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Exit)
                .addContainerGap())
        );
        pnl_TitleBarLayout.setVerticalGroup(
            pnl_TitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_TitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Minimize)
                    .addComponent(lb_Exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnl_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_NavBar.setBackground(new java.awt.Color(32, 32, 32));

        pnl_NavMainDashB.setBackground(new java.awt.Color(32, 32, 32));
        pnl_NavMainDashB.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(252, 215, 54)));
        pnl_NavMainDashB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_NavMainDashBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_NavMainDashBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_NavMainDashBMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/dashboard.png"))); // NOI18N
        jLabel7.setText("      Main Dashboard");
        jLabel7.setToolTipText("");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_NavMainDashBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_NavMainDashBLayout = new javax.swing.GroupLayout(pnl_NavMainDashB);
        pnl_NavMainDashB.setLayout(pnl_NavMainDashBLayout);
        pnl_NavMainDashBLayout.setHorizontalGroup(
            pnl_NavMainDashBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_NavMainDashBLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        pnl_NavMainDashBLayout.setVerticalGroup(
            pnl_NavMainDashBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NavMainDashBLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnl_NavTransactions.setBackground(new java.awt.Color(32, 32, 32));
        pnl_NavTransactions.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        pnl_NavTransactions.setForeground(new java.awt.Color(32, 32, 32));
        pnl_NavTransactions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_NavTransactionsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_NavMainDashBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_NavMainDashBMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/history.png"))); // NOI18N
        jLabel5.setText("      Transactions");
        jLabel5.setToolTipText("");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_NavTransactionsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_NavTransactionsLayout = new javax.swing.GroupLayout(pnl_NavTransactions);
        pnl_NavTransactions.setLayout(pnl_NavTransactionsLayout);
        pnl_NavTransactionsLayout.setHorizontalGroup(
            pnl_NavTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NavTransactionsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_NavTransactionsLayout.setVerticalGroup(
            pnl_NavTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NavTransactionsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnl_NavBudSum.setBackground(new java.awt.Color(32, 32, 32));
        pnl_NavBudSum.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        pnl_NavBudSum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_NavBudSumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_NavMainDashBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_NavMainDashBMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/list_alt.png"))); // NOI18N
        jLabel6.setText("      Budget Summary");
        jLabel6.setToolTipText("");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_NavBudSumMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_NavBudSumLayout = new javax.swing.GroupLayout(pnl_NavBudSum);
        pnl_NavBudSum.setLayout(pnl_NavBudSumLayout);
        pnl_NavBudSumLayout.setHorizontalGroup(
            pnl_NavBudSumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NavBudSumLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_NavBudSumLayout.setVerticalGroup(
            pnl_NavBudSumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NavBudSumLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnl_NavSettings.setBackground(new java.awt.Color(32, 32, 32));
        pnl_NavSettings.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        pnl_NavSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_NavSettingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_NavMainDashBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_NavMainDashBMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/settings.png"))); // NOI18N
        jLabel9.setText("      Settings");
        jLabel9.setToolTipText("");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_NavSettingsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_NavSettingsLayout = new javax.swing.GroupLayout(pnl_NavSettings);
        pnl_NavSettings.setLayout(pnl_NavSettingsLayout);
        pnl_NavSettingsLayout.setHorizontalGroup(
            pnl_NavSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NavSettingsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_NavSettingsLayout.setVerticalGroup(
            pnl_NavSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NavSettingsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnl_NavAbout.setBackground(new java.awt.Color(32, 32, 32));
        pnl_NavAbout.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        pnl_NavAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_NavAboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_NavMainDashBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_NavMainDashBMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/res/icons/outline_info_white_18dp.png"))); // NOI18N
        jLabel10.setText("      About");
        jLabel10.setToolTipText("");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_NavAboutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_NavAboutLayout = new javax.swing.GroupLayout(pnl_NavAbout);
        pnl_NavAbout.setLayout(pnl_NavAboutLayout);
        pnl_NavAboutLayout.setHorizontalGroup(
            pnl_NavAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NavAboutLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_NavAboutLayout.setVerticalGroup(
            pnl_NavAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NavAboutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_NavBarLayout = new javax.swing.GroupLayout(pnl_NavBar);
        pnl_NavBar.setLayout(pnl_NavBarLayout);
        pnl_NavBarLayout.setHorizontalGroup(
            pnl_NavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_NavTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_NavBudSum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_NavMainDashB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_NavSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_NavAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_NavBarLayout.setVerticalGroup(
            pnl_NavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_NavBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_NavMainDashB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_NavTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_NavBudSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(pnl_NavSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_NavAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        pnl_Container.setBackground(new java.awt.Color(0, 0, 0));
        pnl_Container.setForeground(new java.awt.Color(255, 255, 255));
        pnl_Container.setMinimumSize(new java.awt.Dimension(802, 659));
        pnl_Container.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout pnl_BackgroundLayout = new javax.swing.GroupLayout(pnl_Background);
        pnl_Background.setLayout(pnl_BackgroundLayout);
        pnl_BackgroundLayout.setHorizontalGroup(
            pnl_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BackgroundLayout.createSequentialGroup()
                .addComponent(pnl_NavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnl_TitleBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_BackgroundLayout.setVerticalGroup(
            pnl_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BackgroundLayout.createSequentialGroup()
                .addComponent(pnl_TitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_NavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    //EXIT BUTTON
    private void lb_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_ExitMouseClicked
    
    //MINIMIZE BUTTON
    private void lb_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MinimizeMouseClicked
        setState(this.ICONIFIED);
    }//GEN-LAST:event_lb_MinimizeMouseClicked
    
    //MOVE WINDOW PRESS
    private void pnl_TitleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_TitleBarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_pnl_TitleBarMousePressed

    //MOVE WINDOW DRAG
    private void pnl_TitleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_TitleBarMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        setLocation(xx-x, yy-y);
        
    }//GEN-LAST:event_pnl_TitleBarMouseDragged
    
    // ----- NAVIGATION BAR - MOUSE ENTERED ------ //
    private void pnl_NavMainDashBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_NavMainDashBMouseEntered
        evt.getComponent().setBackground(new Color(66, 66, 66));
    }//GEN-LAST:event_pnl_NavMainDashBMouseEntered
    
    // ----- NAVIGATION BAR - MOUSE EXIT  ------ //
    
    private void pnl_NavMainDashBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_NavMainDashBMouseExited
        java.awt.Point p = new java.awt.Point(evt.getLocationOnScreen());
        SwingUtilities.convertPointFromScreen(p, evt.getComponent());
        if(evt.getComponent().contains(p)){
            return;
        }
        evt.getComponent().setBackground(new Color(32, 32, 32));
    }//GEN-LAST:event_pnl_NavMainDashBMouseExited

    
    // ----- NAVIGATION BAR - MOUSE CLICK  ------ //
    private void pnl_NavMainDashBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_NavMainDashBMouseClicked
        navbtn_OnClick(evt, pnl_NavMainDashB, 'm');
    }//GEN-LAST:event_pnl_NavMainDashBMouseClicked

    private void pnl_NavBudSumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_NavBudSumMouseClicked
        navbtn_OnClick(evt, pnl_NavBudSum, 'b');
    }//GEN-LAST:event_pnl_NavBudSumMouseClicked

    private void pnl_NavSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_NavSettingsMouseClicked
        navbtn_OnClick(evt, pnl_NavSettings, 's');
    }//GEN-LAST:event_pnl_NavSettingsMouseClicked

    private void pnl_NavAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_NavAboutMouseClicked
        navbtn_OnClick(evt, pnl_NavAbout, 'a');
    }//GEN-LAST:event_pnl_NavAboutMouseClicked

    // ----- NAVIGATION BAR - MOUSE CLICKED ------ //
    
    private void pnl_NavTransactionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_NavTransactionsMouseClicked
        navbtn_OnClick(evt, pnl_NavTransactions, 't');
    }//GEN-LAST:event_pnl_NavTransactionsMouseClicked
    
    
    
    // ------------------------------------------ CUSTOM METHODS ------------------------------------------ //
    
    
    // Navigation Bar - Mouse Clicked
    private void navbtn_OnClick(MouseEvent evt, JPanel pnl, char Navigation){
        
        //Change Color of Selected Panel
        pnl_NavMainDashB.setBorder(createEmptyBorder(0, 5, 0, 0));
        pnl_NavTransactions.setBorder(createEmptyBorder(0, 5, 0, 0));
        pnl_NavBudSum.setBorder(createEmptyBorder(0, 5, 0, 0));
        pnl_NavSettings.setBorder(createEmptyBorder(0, 5, 0, 0));
        pnl_NavAbout.setBorder(createEmptyBorder(0, 5, 0, 0));
        pnl.setBorder(createMatteBorder(0, 5, 0, 0, new Color(252,215,54)));
        
        //Add and Repaint Panel on Main Container
        pnl_Container.removeAll();
        pnl_Container.repaint();
        pnl_Container.revalidate();
        
        JPanel pnl_Selected = null;
        switch(Navigation){
            case 'm':
                pnl_Selected = new MainDashBPanel();
                break;
            case 't':
                TransactionsPanel tpnl = new TransactionsPanel();
                pnl_Selected = tpnl;
                if(tpnl.validateDataSource()){
                    tpnl.refreshData();
                    tpnl.repopulateTable();
                    tpnl.parentFrame = this;
                }
                break;

            case 'b':
                pnl_Selected = new BudgetSummaryPanel();
                break;
            case 's':
                pnl_Selected = new SettingsPanel();
                break;
            case 'a':
                pnl_Selected = new AboutPanel();
                break;
            default:
        }
        
        
        pnl_Container.add(pnl_Selected);
        pnl_Container.repaint();
        pnl_Container.revalidate();
        
    }
    
    
    
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BudgetAppX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BudgetAppX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BudgetAppX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BudgetAppX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BudgetAppX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_Exit;
    private javax.swing.JLabel lb_Minimize;
    private javax.swing.JPanel pnl_Background;
    private javax.swing.JPanel pnl_Container;
    private javax.swing.JPanel pnl_NavAbout;
    private javax.swing.JPanel pnl_NavBar;
    private javax.swing.JPanel pnl_NavBudSum;
    private javax.swing.JPanel pnl_NavMainDashB;
    private javax.swing.JPanel pnl_NavSettings;
    private javax.swing.JPanel pnl_NavTransactions;
    private javax.swing.JPanel pnl_Title;
    private javax.swing.JPanel pnl_TitleBar;
    // End of variables declaration//GEN-END:variables
    private String selectedTab = "";
    private int x,y;
}
