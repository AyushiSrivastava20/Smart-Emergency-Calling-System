/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FireAdminWorkArea;

import Business.Emergency.Emergency;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentFccEnterprise;
import Business.Location.Location;
import Business.Organization.FccAmbulanceOrganization;
import Business.Organization.FccFireOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CallCenterRequestAmbulance;
import Business.WorkQueue.FireRequest;
import Business.utils.Check;
import Business.utils.MyStringVerifier;
import Business.utils.SpaceStringCheckVerifier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class ProcessFireAdminRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcrssFireAdminRequestJPanel
     */
    private JPanel userProcessContainer;
    private FccFireOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Emergency emergency;
    public ProcessFireAdminRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.organization = (FccFireOrganization) organization;
        SpaceStringCheckVerifier spacecheckverifier= new SpaceStringCheckVerifier();
        messageJTextField.setInputVerifier(spacecheckverifier);
        Check chk = new Check();
        LatitudeJTextField.setInputVerifier(chk);
        LongituteJTextField.setInputVerifier(chk);
        timeJTextField.setInputVerifier(chk);
        populatetype();
        requestAmb.setEnabled(false);
        requestJButton.setEnabled(false);
        AmbulanceCheckBox.setEnabled(false);
    }

   
    
     public void populatetype(){
        typeJBox.removeAllItems();
        for (Emergency.EmergencyType type : Emergency.EmergencyType.values()) {
            if(type.getValue().equals(Emergency.EmergencyType.Fire.getValue())){
            typeJBox.addItem(type);
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

        backJButton = new javax.swing.JButton();
        requestJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        timeJTextField = new javax.swing.JTextField();
        messageJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LongituteJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        typeJBox = new javax.swing.JComboBox();
        LatitudeJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        createEmergencyButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        AmbulanceCheckBox = new javax.swing.JCheckBox();
        requestAmb = new javax.swing.JButton();

        setBackground(new java.awt.Color(154, 192, 205));

        backJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        backJButton.setText("Back");
        backJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        requestJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        requestJButton.setText("Request Emergency");
        requestJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestJButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel7.setText("Create Request ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Create Emergency", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 15))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel5.setText("Emergency Type");

        jLabel6.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel6.setText("Longitude");

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel3.setText("Latitude");

        typeJBox.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        typeJBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typeJBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel4.setText("Time of Emergency");

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel1.setText("Message");

        createEmergencyButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        createEmergencyButton.setText("Create Emergency");
        createEmergencyButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createEmergencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEmergencyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LongituteJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(LatitudeJTextField))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(timeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addComponent(typeJBox, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createEmergencyButton)
                .addGap(300, 300, 300))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LongituteJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(timeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LatitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(typeJBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(createEmergencyButton)
                .addGap(21, 21, 21))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Send toAmbulance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 15))); // NOI18N

        AmbulanceCheckBox.setText("Ambulance");
        AmbulanceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmbulanceCheckBoxActionPerformed(evt);
            }
        });

        requestAmb.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        requestAmb.setText("Request Ambulance");
        requestAmb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestAmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestAmbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(AmbulanceCheckBox)
                .addGap(57, 57, 57)
                .addComponent(requestAmb, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmbulanceCheckBox)
                    .addComponent(requestAmb))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(requestJButton)))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(requestJButton))
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FireAdminWorkAreaJPanel far = (FireAdminWorkAreaJPanel) component;
        far.populatefireTable();
        far.populateambTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestJButtonActionPerformed
        
        
        String message = messageJTextField.getText();
        
       
        FireRequest request = new FireRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        
        request.setStatus("Sent");
        request.setEmergency(emergency);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
//        Organization org = null;
//        for (Organization org1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            if (org1 instanceof FccFireOrganization) {
//                org = org1;
//                break;
//            }
//        }
//        if (org != null) {
//            org.getWorkQueue().getWorkRequestList().add(request);
//            JOptionPane.showMessageDialog(null,"Request has been successfully sent to fire Department");
//        }
//       
//        
        organization.getWorkQueue().getWorkRequestList().add(request);
        JOptionPane.showMessageDialog(null,"Request has been successfully created");
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FireAdminWorkAreaJPanel far = (FireAdminWorkAreaJPanel) component;
        far.populatefireTable();
        far.populateambTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_requestJButtonActionPerformed

    private void AmbulanceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmbulanceCheckBoxActionPerformed
        // TODO add your handling code here:
        boolean flag=false;
        flag=AmbulanceCheckBox.isSelected();
        if (flag == true){
        requestAmb.setEnabled(true);
        }else{
           requestAmb.setEnabled(false);      
                }
        
    }//GEN-LAST:event_AmbulanceCheckBoxActionPerformed

    private void requestAmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestAmbActionPerformed
        // TODO add your handling code here:
        String message = messageJTextField.getText();
        CallCenterRequestAmbulance ambRequest = new CallCenterRequestAmbulance();
        ambRequest.setMessage(message);
        ambRequest.setSender(userAccount);
        ambRequest.setStatusAmbulance("Sent");
        ambRequest.setEmergency(emergency);
        userAccount.getWorkQueue().getWorkRequestList().add(ambRequest);
         Organization org = null;
        for (Organization org1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org1 instanceof FccAmbulanceOrganization) {
                org = org1;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(ambRequest);
            JOptionPane.showMessageDialog(null,"Request has been successfully sent to Ambulance Department");
        }
        requestAmb.setEnabled(false);
        requestJButton.setEnabled(true);
    }//GEN-LAST:event_requestAmbActionPerformed

    private void createEmergencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEmergencyButtonActionPerformed
        // TODO add your handling code here:
        if(LatitudeJTextField.getText().trim().length()==0 || LongituteJTextField.getText().trim().length()==0 || timeJTextField.getText().trim().length()==0){
            JOptionPane.showMessageDialog(this, "Please enter all the values.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String time = timeJTextField.getText().trim();
        Emergency.EmergencyType type= (Emergency.EmergencyType)typeJBox.getSelectedItem();
       
        
            
            Location l1 = new Location();
            l1.setLatitude(LatitudeJTextField.getText().trim());
            l1.setLongitude(LongituteJTextField.getText().trim());
            emergency = new Emergency(type);
            emergency.setLocation(l1);
            emergency.setTimestamp(time);
            if(enterprise instanceof GovernmentFccEnterprise){
                GovernmentFccEnterprise gov = (GovernmentFccEnterprise) enterprise;
                gov.getEmergencyDirectory().getEmergencyList().add(emergency);

            
        }
      createEmergencyButton.setEnabled(false);
      AmbulanceCheckBox.setEnabled(true);

    }//GEN-LAST:event_createEmergencyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AmbulanceCheckBox;
    private javax.swing.JTextField LatitudeJTextField;
    private javax.swing.JTextField LongituteJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createEmergencyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestAmb;
    private javax.swing.JButton requestJButton;
    private javax.swing.JTextField timeJTextField;
    private javax.swing.JComboBox typeJBox;
    // End of variables declaration//GEN-END:variables
}