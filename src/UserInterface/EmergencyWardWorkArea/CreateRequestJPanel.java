/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EmergencyWardWorkArea;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.HospitalEmergencyWardOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
import Business.utils.MyStringVerifier;
import Business.utils.SpaceStringCheckVerifier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayushi
 */
public class CreateRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateRequestJPanel
     */
    private JPanel userProcessContainer;
    private HospitalEmergencyWardOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public CreateRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.organization=(HospitalEmergencyWardOrganization) organization;
        this.userAccount=account;
        this.enterprise=enterprise;
        SpaceStringCheckVerifier spacecheck= new SpaceStringCheckVerifier();
        messageJTextField.setInputVerifier(spacecheck);

         populateTablePatient();
         populateDocBox();
    }

    public void populateTablePatient(){
        DefaultTableModel dtm = (DefaultTableModel)patientJTable.getModel();
        dtm.setRowCount(0);
        if(enterprise instanceof HospitalEnterprise){
        HospitalEnterprise he = (HospitalEnterprise)enterprise;
        for(Patient patient : he.getPatientDirectory().getPatientList()){
          
           Object[] row = new Object[3];
           row[0]=patient;
           row[1]=patient.getRoom_no();
           row[2]=patient.getStatus();
           dtm.addRow(row);
            
        }
        }
    }
    
    public void populateDocBox(){
        docComboBox.removeAllItems();
        Organization org = null;
         for (Organization orgDoc : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (orgDoc instanceof DoctorOrganization) {
                org = orgDoc;
                break;
            }
        }

        if (org != null) {
            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                docComboBox.addItem(ua);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        requestButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        docComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(154, 192, 205));

        patientJTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "RoomNo", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientJTable);

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel1.setText("Create Request to Doctors");

        requestButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        requestButton.setText("Request Test");
        requestButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Select Doctor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 15))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel2.setText("Message");

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel3.setText("Doctor");

        docComboBox.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        docComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        docComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(messageJTextField)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(docComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(docComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(requestButton))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CreateRequestDoctorJPanel crjp = (CreateRequestDoctorJPanel) component;
        crjp.populateRequest();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientJTable.getSelectedRow();
         String message = messageJTextField.getText();
          if(message.length()==0){
            JOptionPane.showMessageDialog(null,"Please enter message","Warning", JOptionPane.WARNING_MESSAGE);
            return; 
        }
         UserAccount userDoctor = (UserAccount)docComboBox.getSelectedItem();
         if (userDoctor==null){
            JOptionPane.showMessageDialog(null,"Please select Nurse","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
         
         if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select row","Warning", JOptionPane.WARNING_MESSAGE);
            }
        else{
         Patient patient = (Patient)patientJTable.getValueAt(selectedRow,0);
         
         DoctorWorkRequest request = new DoctorWorkRequest();
         request.setMessage(message);
         request.setSender(userAccount);
         request.setReceiver(userDoctor);
         request.setStatus("Sent");
         request.setPatient(patient);
         Organization org = null;
         for (Organization orgDoc : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (orgDoc instanceof DoctorOrganization) {
                org = orgDoc;
                break;
            }
        }

        if (org != null) {
        userDoctor.getWorkQueue().getWorkRequestList().add(request);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        org.getWorkQueue().getWorkRequestList().add(request);
        JOptionPane.showMessageDialog(null,"Request has been successfully created");
        }
         }
         messageJTextField.setText("");
    }//GEN-LAST:event_requestButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox docComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTable patientJTable;
    private javax.swing.JButton requestButton;
    // End of variables declaration//GEN-END:variables
}