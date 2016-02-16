/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FireAdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.FccFireOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class FireAdminMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FireAdminMainJPanel
     */
    private JPanel userProcessContainer;
    private FccFireOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public FireAdminMainJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.organization = (FccFireOrganization) organization;
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
        createReq = new javax.swing.JButton();
        addFireBrigade = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel1.setText("Fire Admin Work Area");
        add(jLabel1);
        jLabel1.setBounds(60, 56, 165, 23);

        createReq.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        createReq.setText("Create Fire Request");
        createReq.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createReqActionPerformed(evt);
            }
        });
        add(createReq);
        createReq.setBounds(380, 130, 255, 29);

        addFireBrigade.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        addFireBrigade.setText("Add FireBrigade to Organization ");
        addFireBrigade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addFireBrigade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFireBrigadeActionPerformed(evt);
            }
        });
        add(addFireBrigade);
        addFireBrigade.setBounds(380, 230, 255, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/FireAdminWorkArea/firefighter.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 220, 370, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void addFireBrigadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFireBrigadeActionPerformed
        // TODO add your handling code here:
                AddFireBrigadeWorkArea fr = new AddFireBrigadeWorkArea(userProcessContainer, userAccount, organization);
                userProcessContainer.add("AddFireBrigadeWorkArea", fr);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
        
        
        
    }//GEN-LAST:event_addFireBrigadeActionPerformed

    private void createReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createReqActionPerformed
        // TODO add your handling code here:
                FireAdminWorkAreaJPanel er = new FireAdminWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise);
                userProcessContainer.add("FireAdminWorkAreaJPanel", er);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
    }//GEN-LAST:event_createReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFireBrigade;
    private javax.swing.JButton createReq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
