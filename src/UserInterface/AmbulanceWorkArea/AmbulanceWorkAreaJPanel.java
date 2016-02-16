/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AmbulanceWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FccAmbulanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CallCenterRequestAmbulance;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayushi
 */
public class AmbulanceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AmbulanceWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private FccAmbulanceOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

    public AmbulanceWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.organization = (FccAmbulanceOrganization) organization;
        this.business=business;
        populateTable();
        latitudeJTextField.setEditable(false);
        longitudeJTextField.setEditable(false);
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = request.getSender().getPerson().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getName();
            if (request instanceof CallCenterRequestAmbulance) {
                CallCenterRequestAmbulance ra = (CallCenterRequestAmbulance) request;
                row[3] = ra.getStatusAmbulance();

            }
            row[4] = request.getEmergency().getEmergencyType().getValue();
            try {
                String df1 = DateFormat.getDateTimeInstance().format(request.getRequestDate());
                row[5] = df1;
            } catch (Exception e) {
            }
            try {
                String df = DateFormat.getDateTimeInstance().format(request.getResolveDate());
                row[6] = df;
            } catch (Exception e) {
            }

            model.addRow(row);
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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewEmergencyButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        latitudeJTextField = new javax.swing.JTextField();
        longitudeJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(154, 192, 205));

        workRequestJTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "EmergencyType", "Date ", "Resolve Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        processJButton.setText("Process");
        processJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel1.setText("Ambulance Work Area");

        viewEmergencyButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        viewEmergencyButton.setText("View Emergency");
        viewEmergencyButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewEmergencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmergencyButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel2.setText("Latitude");

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel3.setText("Longitude");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addComponent(viewEmergencyButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(latitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(longitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton)
                    .addComponent(viewEmergencyButton))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(latitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(longitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(processJButton))
                .addGap(183, 183, 183))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0) {
            CallCenterRequestAmbulance ra = (CallCenterRequestAmbulance) workRequestJTable.getValueAt(selectedRow, 0);
             
       
               if (ra.getStatusAmbulance().equalsIgnoreCase("Completed") || ra.getStatusAmbulance().equalsIgnoreCase("Pending") ) {
                JOptionPane.showMessageDialog(null, "Request already processed.","Error", JOptionPane.ERROR_MESSAGE);
            } else {
                ra.setReceiverAmbulance(userAccount);
                ra.setStatusAmbulance("Pending");
                populateTable();

            }
             }
            

        else {
            JOptionPane.showMessageDialog(null, "Choose a request to process", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0) {
            CallCenterRequestAmbulance request = (CallCenterRequestAmbulance) workRequestJTable.getValueAt(selectedRow, 0);

            //request.setStatusAmbulance("Processing");
            if (request.getStatusAmbulance().equalsIgnoreCase("Completed") || request.getStatusAmbulance().equalsIgnoreCase("Sent") ) {
                 JOptionPane.showMessageDialog(null, "Request already processed or Not Assigned", "Error", JOptionPane.ERROR_MESSAGE);
            }

            else {
            
            ProcessAmbulanceWorkRequestJPanel processWorkRequestJPanel = new ProcessAmbulanceWorkRequestJPanel(userProcessContainer, request, business);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void viewEmergencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmergencyButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
            latitudeJTextField.setText(request.getEmergency().getLocation().getLatitude());
            longitudeJTextField.setText(request.getEmergency().getLocation().getLongitude());
           

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewEmergencyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField latitudeJTextField;
    private javax.swing.JTextField longitudeJTextField;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton viewEmergencyButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}