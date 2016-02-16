/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NurseWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Patient.Medication;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NurseWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
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
public class CreateDrugsRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDrugsRequestJPanel
     */
    private JPanel userProcessContainer;
    private NurseOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public CreateDrugsRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=account;
        this.organization=(NurseOrganization) organization;
        this.enterprise=enterprise;
        populateTablePatient();
        SpaceStringCheckVerifier spacecheck= new SpaceStringCheckVerifier();
        messageJTextField.setInputVerifier(spacecheck);

        
    }

    public void  populate( Patient patient){
         DefaultTableModel dtm = (DefaultTableModel)medicationJTable.getModel();
        dtm.setRowCount(0);
        for(Medication med : patient.getMedicationDirectory().getMedicationList()){
          Object[] row = new Object[3];  
          row[0]=med;
          row[1]=med.getMedication_description();
          row[2]=med.getDosage();
         
          dtm.addRow(row);
      
        }    
    }
    
    public void populateTablePatient(){
        DefaultTableModel model = (DefaultTableModel) patientJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof NurseWorkRequest) {
                NurseWorkRequest ra = (NurseWorkRequest) request;
                Patient patient = ra.getPatient();
                
            Object[] row = new Object[3];
            row[0] = patient;
            row[1] = patient.getRoom_no();
            row[2] = patient.getStatus();
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        requestButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientJTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicationJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(154, 192, 205));

        jPanel1.setBackground(new java.awt.Color(154, 192, 205));

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel1.setText("Create Request to Pharmacy");

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel2.setText("Message");

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
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

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
        patientJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patientJTable);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Medication for patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 15))); // NOI18N

        medicationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medication Type", "Description", "Dosage"
            }
        ));
        jScrollPane2.setViewportView(medicationJTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(requestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(316, 316, 316))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel2)
                .addGap(119, 119, 119)
                .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requestButton)
                            .addComponent(backJButton))
                        .addGap(118, 118, 118))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 882, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientJTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = patientJTable.getSelectedRow();
        Patient patient = (Patient)patientJTable.getValueAt(selectedRow,0);
        populate(patient);
    }//GEN-LAST:event_patientJTableMouseClicked

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DrugRequestJPanel dr = (DrugRequestJPanel) component;
        dr.populateRequest();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientJTable.getSelectedRow();
        
        if(selectedRow>=0){
        Patient patient = (Patient)patientJTable.getValueAt(selectedRow,0);
        String message = messageJTextField.getText();

        PharmacyWorkRequest request = new PharmacyWorkRequest();
        request.setMessage(message);
        request.setSender(userAccount);

        request.setStatus("Sent");
        request.setPatient(patient);
        Organization org = null;
        for (Organization orgDoc : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (orgDoc instanceof PharmacyOrganization) {
                org = orgDoc;
                break;
            }
        }

        if (org != null) {

            userAccount.getWorkQueue().getWorkRequestList().add(request);
            org.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null,"Request has been successfully created");
        }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please Select a row from the table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_requestButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable medicationJTable;
    private javax.swing.JTable medicationJTable1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTextField messageJTextField1;
    private javax.swing.JTable patientJTable;
    private javax.swing.JTable patientJTable1;
    private javax.swing.JButton requestButton;
    private javax.swing.JButton requestButton1;
    // End of variables declaration//GEN-END:variables
}