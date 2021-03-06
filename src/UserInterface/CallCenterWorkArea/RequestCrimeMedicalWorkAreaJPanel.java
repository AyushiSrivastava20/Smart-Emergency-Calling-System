/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CallCenterWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.FccCallCenterOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CallCenterRequestAmbulance;
import Business.WorkQueue.CallCenterRequestPolice;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayushi
 */
public class RequestCrimeMedicalWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestCrimeMedicalWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private FccCallCenterOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public RequestCrimeMedicalWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (FccCallCenterOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateTableAmbulance();
        populateTablePolice();
    }
    
    public void populateTableAmbulance() {
        DefaultTableModel model = (DefaultTableModel) AmbulanceEmergencyJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
             if(request instanceof CallCenterRequestAmbulance){
              CallCenterRequestAmbulance ra = (CallCenterRequestAmbulance) request;   
             
            Object[] row = new Object[6];
            row[0] = ra;
            row[1] = ra.getEmergency().getPerson().getName();
            row[2] = ra.getEmergency().getEmergencyType().getValue();
            row[3]=ra.getStatusAmbulance();
             try{
           String df = DateFormat.getDateTimeInstance().format(request.getRequestDate());
            row[4]=df;
            }
            catch(Exception e){}
            try{ 
           
             String df1 = DateFormat.getDateTimeInstance().format(request.getResolveDate());

                    row[5]=df1;
           }
            catch(Exception e){}
            
            model.addRow(row);
        }
    }
    }
    
     public void populateTablePolice() {
        DefaultTableModel model = (DefaultTableModel) PoliceEmergencyRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
             if(request instanceof CallCenterRequestPolice){
              CallCenterRequestPolice rp = (CallCenterRequestPolice) request;   
             
            Object[] row = new Object[6];
            row[0] = rp;
            row[1] = rp.getEmergency().getPerson().getName();
            row[2] = rp.getEmergency().getEmergencyType().getValue();
            row[3]=rp.getStatusPolice();
             try{
           
            row[4]=rp.getRequestDate();
            }
            catch(Exception e){}
            try{ 
           
            row[5]=rp.getResolveDate();
           }
            catch(Exception e){}
            
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PoliceEmergencyRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AmbulanceEmergencyJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(154, 192, 205));

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel1.setText("Request Crime and Medical Emergencies");

        PoliceEmergencyRequestJTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PoliceEmergencyRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Person", "EmergencyType", "Police Status", "Date", "Resolve Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PoliceEmergencyRequestJTable);

        requestTestJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        requestTestJButton.setText("Request Emergency");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel2.setText("Police Department Emergency");

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel3.setText("Ambulance Emergencies");

        AmbulanceEmergencyJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Person", "Emergency Type", "Ambulance status", "Date", "Resolve State"
            }
        ));
        jScrollPane2.setViewportView(AmbulanceEmergencyJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(requestTestJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backJButton)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshTestJButton)
                    .addComponent(requestTestJButton))
                .addGap(16, 16, 16)
                .addComponent(backJButton)
                .addGap(93, 93, 93))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestEmergencyJPanel", new RequestEmergencyJPanel(userProcessContainer, userAccount, enterprise, organization));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

      populateTableAmbulance();
        populateTablePolice();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AmbulanceEmergencyJTable;
    private javax.swing.JTable PoliceEmergencyRequestJTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}
