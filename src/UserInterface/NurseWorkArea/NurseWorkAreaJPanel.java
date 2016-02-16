/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NurseWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.FccCallCenterOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NurseWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private NurseOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public NurseWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=account;
        this.organization = (NurseOrganization) organization;
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
        viewRequest = new javax.swing.JButton();
        viewPatients = new javax.swing.JButton();
        PharmacistRequest = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel1.setText("Nurse Work Area");
        add(jLabel1);
        jLabel1.setBounds(131, 48, 153, 23);

        viewRequest.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        viewRequest.setText("View Requests from Doctor");
        viewRequest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestActionPerformed(evt);
            }
        });
        add(viewRequest);
        viewRequest.setBounds(131, 143, 261, 29);

        viewPatients.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        viewPatients.setText("View My assigned Patients");
        viewPatients.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientsActionPerformed(evt);
            }
        });
        add(viewPatients);
        viewPatients.setBounds(131, 219, 261, 29);

        PharmacistRequest.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        PharmacistRequest.setText("Create Pharmacist Drugs Request ");
        PharmacistRequest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacistRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacistRequestActionPerformed(evt);
            }
        });
        add(PharmacistRequest);
        PharmacistRequest.setBounds(131, 300, 261, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/NurseWorkArea/nurse.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(420, 40, 260, 256);
    }// </editor-fold>//GEN-END:initComponents

    private void PharmacistRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacistRequestActionPerformed
        // TODO add your handling code here:
        DrugRequestJPanel cdr = new DrugRequestJPanel(userProcessContainer, userAccount, organization, enterprise);
        userProcessContainer.add("DrugsRequestJPanel", cdr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PharmacistRequestActionPerformed

    private void viewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestActionPerformed
        // TODO add your handling code here:
        ViewDoctorRequestsJPanel vdr = new ViewDoctorRequestsJPanel(userProcessContainer, userAccount, organization, enterprise);
        userProcessContainer.add("ViewDoctorRequestsJPanel", vdr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewRequestActionPerformed

    private void viewPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientsActionPerformed
        // TODO add your handling code here:
        ViewAssignedPatientsJPanel vpr = new ViewAssignedPatientsJPanel(userProcessContainer, userAccount, organization, enterprise);
        userProcessContainer.add("ViewAssignedPatientsJPanel", vpr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPatientsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PharmacistRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton viewPatients;
    private javax.swing.JButton viewRequest;
    // End of variables declaration//GEN-END:variables
}