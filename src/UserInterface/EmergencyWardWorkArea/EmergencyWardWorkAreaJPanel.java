/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EmergencyWardWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.HospitalEmergencyWardOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class EmergencyWardWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyWardWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private HospitalEmergencyWardOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public EmergencyWardWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.organization=(HospitalEmergencyWardOrganization) organization;
        this.userAccount=account;
        this.enterprise=enterprise;
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
        viewEmergency = new javax.swing.JButton();
        addCreateRequest = new javax.swing.JButton();
        CreateRequest = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel1.setText("Emergency Ward Work Area");
        add(jLabel1);
        jLabel1.setBounds(120, 50, 213, 23);

        viewEmergency.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        viewEmergency.setText("View/Process Emergency Request");
        viewEmergency.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmergencyActionPerformed(evt);
            }
        });
        add(viewEmergency);
        viewEmergency.setBounds(121, 131, 259, 29);

        addCreateRequest.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        addCreateRequest.setText("Manage Emergency Patients");
        addCreateRequest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addCreateRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCreateRequestActionPerformed(evt);
            }
        });
        add(addCreateRequest);
        addCreateRequest.setBounds(121, 225, 259, 29);

        CreateRequest.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        CreateRequest.setText("Create Requests to Doctors");
        CreateRequest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CreateRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateRequestActionPerformed(evt);
            }
        });
        add(CreateRequest);
        CreateRequest.setBounds(121, 322, 259, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/EmergencyWardWorkArea/ICON-01.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(410, 130, 270, 220);
    }// </editor-fold>//GEN-END:initComponents

    private void viewEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmergencyActionPerformed
        // TODO add your handling code here:
                EmergencyRequestWorkAreaJPanel er = new EmergencyRequestWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise);
                userProcessContainer.add("EmergencyRequestWorkAreaJPanel", er);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
    }//GEN-LAST:event_viewEmergencyActionPerformed

    private void addCreateRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCreateRequestActionPerformed
        // TODO add your handling code here:
                AddVitalCreateRequestJPanel avr = new AddVitalCreateRequestJPanel(userProcessContainer, userAccount, organization, enterprise);
                userProcessContainer.add("AddVitalCreateRequestJPanel", avr);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
    }//GEN-LAST:event_addCreateRequestActionPerformed

    private void CreateRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateRequestActionPerformed
        // TODO add your handling code here
        CreateRequestDoctorJPanel cr = new CreateRequestDoctorJPanel(userProcessContainer, userAccount, organization, enterprise);
                userProcessContainer.add("CreateRequestDoctorJPanel", cr);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
        
    }//GEN-LAST:event_CreateRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateRequest;
    private javax.swing.JButton addCreateRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton viewEmergency;
    // End of variables declaration//GEN-END:variables
}
