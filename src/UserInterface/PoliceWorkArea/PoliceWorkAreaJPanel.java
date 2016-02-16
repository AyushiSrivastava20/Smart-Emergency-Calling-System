/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PoliceWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.FccPoliceEmergencyOrganization;
import Business.Organization.Organization;
import Business.Patient.VitalSign;
import Business.Person.CrimeIncident;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CallCenterRequestPolice;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author ayushi
 */
public class PoliceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoliceWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private FccPoliceEmergencyOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public PoliceWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.organization = (FccPoliceEmergencyOrganization) organization;
        populateTable();
        latitudeJTextField.setEditable(false);
        longitudeJTextField.setEditable(false);
        timeJTextField.setEditable(false);
        personNameJTextField.setEditable(false);
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = request.getSender().getPerson().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getName();
            if (request instanceof CallCenterRequestPolice) {
                CallCenterRequestPolice rp = (CallCenterRequestPolice) request;
                row[3] = rp.getStatusPolice();

            }
            row[4] = request.getEmergency().getEmergencyType().getValue();
            try {
            String df = DateFormat.getDateTimeInstance().format(request.getRequestDate());
                row[5] = df;
            } catch (Exception e) {
            }
            try {
             String df1 = DateFormat.getDateTimeInstance().format(request.getResolveDate());
                row[6] = df1;
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
        jPanel1 = new javax.swing.JPanel();
        timeJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        latitudeJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        longitudeJTextField = new javax.swing.JTextField();
        personNameJTextField = new javax.swing.JTextField();

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
                false, true, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        jLabel1.setText("Police Department Work Area");

        viewEmergencyButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        viewEmergencyButton.setText("View Emergency");
        viewEmergencyButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewEmergencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmergencyButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Emergency Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 15))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel5.setText("Time of Emergency");

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel2.setText("Latitude");

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel3.setText("Longitude");

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel4.setText("Person Name");

        personNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personNameJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(longitudeJTextField)
                    .addComponent(latitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(personNameJTextField)
                    .addComponent(timeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(latitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(longitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(viewEmergencyButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(viewEmergencyButton)
                                    .addComponent(refreshJButton))))
                        .addGap(54, 54, 54)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(processJButton)
                            .addComponent(assignJButton))))
                .addGap(139, 139, 139))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0) {
            CallCenterRequestPolice rp = (CallCenterRequestPolice) workRequestJTable.getValueAt(selectedRow, 0);

            if (rp.getStatusPolice().equalsIgnoreCase("Completed") || rp.getStatusPolice().equalsIgnoreCase("Pending") ) {
                JOptionPane.showMessageDialog(null, "Request already processed.");
            } else {
                rp.setReceiverPolice(userAccount);
                rp.setStatusPolice("Pending");
                populateTable();

            }
        }

        else {
            JOptionPane.showMessageDialog(null, "Choose a request to process.");
            
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void personNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personNameJTextFieldActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0) {
            CallCenterRequestPolice request = (CallCenterRequestPolice) workRequestJTable.getValueAt(selectedRow, 0);

            //request.setStatusAmbulance("Processing");
            if (request.getStatusPolice().equalsIgnoreCase("Completed") || request.getStatusPolice().equalsIgnoreCase("Sent") ) {
                JOptionPane.showMessageDialog(null, "Request already processed or Not Assigned");
            }

            else {

                ProcessPoliceWorkRequestJPanel processWorkRequestJPanel = new ProcessPoliceWorkRequestJPanel(userProcessContainer, request);
                userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;
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
            personNameJTextField.setText(request.getEmergency().getPerson().getName());
            timeJTextField.setText(request.getEmergency().getTimestamp());

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
        }
    }//GEN-LAST:event_viewEmergencyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField latitudeJTextField;
    private javax.swing.JTextField longitudeJTextField;
    private javax.swing.JTextField personNameJTextField;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField timeJTextField;
    private javax.swing.JButton viewEmergencyButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}