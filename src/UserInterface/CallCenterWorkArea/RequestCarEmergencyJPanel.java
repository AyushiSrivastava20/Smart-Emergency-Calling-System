/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CallCenterWorkArea;

import Business.Emergency.Emergency;

import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentFccEnterprise;
import Business.Location.Location;
import Business.Organization.CitizenOrganization;
import Business.Organization.FccAmbulanceOrganization;
import Business.Organization.FccCallCenterOrganization;
import Business.Organization.FccPoliceEmergencyOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CallCenterRequestAmbulance;
import Business.WorkQueue.CallCenterRequestPolice;
import Business.utils.Check;
import Business.utils.MyStringVerifier;
import Business.utils.SpaceStringCheckVerifier;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayushi
 */
public class RequestCarEmergencyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestCarEmergencyJPanel
     */
    private JPanel userProcessContainer;
    private FccCallCenterOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Emergency emergency;
    ArrayList<Person> personSearch;
    public RequestCarEmergencyJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        
        this.organization = (FccCallCenterOrganization) organization;
        MyStringVerifier myStringVerifier= new MyStringVerifier();
        searchJTextField.setInputVerifier(myStringVerifier);
        SpaceStringCheckVerifier spacecheck= new SpaceStringCheckVerifier();
        messageJTextField.setInputVerifier(spacecheck);

        Check chk = new Check();
        LatitudeJTextField.setInputVerifier(chk);
        LongituteJTextField.setInputVerifier(chk);
        timeJTextField.setInputVerifier(chk);
        AmbulanceButton.setEnabled(false);
        ambulanceCheckBox.setEnabled(false);
        policeButton.setEnabled(false);
        policeCheckBox.setEnabled(false);
        populatetype();
      
    }

    public void populatetype(){
        typeJBox.removeAllItems();
        for (Emergency.EmergencyType type : Emergency.EmergencyType.values()) {
            if(type.getValue().equals(Emergency.EmergencyType.CarAccident.getValue())){
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

        messageJTextField = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PersonTable = new javax.swing.JTable();
        searchJTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LongituteJTextField = new javax.swing.JTextField();
        LatitudeJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        timeJTextField = new javax.swing.JTextField();
        typeJBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        createEmergencyButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        policeCheckBox = new javax.swing.JCheckBox();
        policeButton = new javax.swing.JButton();
        AmbulanceButton = new javax.swing.JButton();
        ambulanceCheckBox = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(154, 192, 205));

        messageJTextField.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        messageJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageJTextFieldActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel1.setText("Message");

        PersonTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PersonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PersonName", "PersonId", "EmergencyNo", "SSN", "Car Registerd", "Driver License"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PersonTable);

        searchButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        searchButton.setText("Search By Car No>>");
        searchButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Create Emergency", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 15))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel2.setText("Longitude");

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel3.setText("Latitude");

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel4.setText("Time of Emergency");

        typeJBox.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        typeJBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typeJBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        typeJBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeJBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel5.setText("Emergency Type");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LatitudeJTextField)
                            .addComponent(LongituteJTextField))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(typeJBox, 0, 165, Short.MAX_VALUE)
                            .addComponent(timeJTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(createEmergencyButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LongituteJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(timeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LatitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeJBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addComponent(createEmergencyButton)
                .addGap(29, 29, 29))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Send Emergency ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 15))); // NOI18N

        policeCheckBox.setText("Police Department");
        policeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policeCheckBoxActionPerformed(evt);
            }
        });

        policeButton.setText("Send");
        policeButton.setEnabled(false);
        policeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policeButtonActionPerformed(evt);
            }
        });

        AmbulanceButton.setText("Send");
        AmbulanceButton.setEnabled(false);
        AmbulanceButton.setFocusPainted(false);
        AmbulanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmbulanceButtonActionPerformed(evt);
            }
        });

        ambulanceCheckBox.setText("Ambulance");
        ambulanceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulanceCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(policeCheckBox)
                .addGap(33, 33, 33)
                .addComponent(policeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(ambulanceCheckBox)
                .addGap(42, 42, 42)
                .addComponent(AmbulanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(policeCheckBox)
                    .addComponent(policeButton)
                    .addComponent(AmbulanceButton)
                    .addComponent(ambulanceCheckBox))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(backJButton)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void messageJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageJTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String id = searchJTextField.getText().trim();
        ArrayList<Person> personSearch = new ArrayList<>();
        Organization org = null;
        for (Organization organ : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organ instanceof CitizenOrganization) {
                org = organ;
                break;
            }
        }

        if (org != null) {
            for(Person p : org.getPersonDirectory().getPersonList()) {
                if(p.getCarNoRegistered().equalsIgnoreCase(id)){
                    personSearch.add(p);
                }
                
            }
            if(personSearch.size()==0){
               JOptionPane.showMessageDialog(this, "No Search result found. please re-enter the correct search message","Error", JOptionPane.ERROR_MESSAGE);
            return; 
            }
        }
        DefaultTableModel model = (DefaultTableModel) PersonTable.getModel();
        model.setRowCount(0);
        for (Person p : personSearch){
            Object[] row = new Object[6];
            row[0] = p;
            row[1] = p.getPersonId();
            row[2] = p.getEmergencyContact();
            row[3] = p.getSsn();
            row[4] = p.getCarNoRegistered();
            row[5] = p.getDrivingLicense();
            model.addRow(row);

        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void createEmergencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEmergencyButtonActionPerformed
        // TODO add your handling code here:
        if(LatitudeJTextField.getText().trim().length()==0 || LongituteJTextField.getText().trim().length()==0 || timeJTextField.getText().trim().length()==0
               ){
            JOptionPane.showMessageDialog(this, "Please enter all the values.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        String time = timeJTextField.getText().trim();
        Emergency.EmergencyType type= (Emergency.EmergencyType)typeJBox.getSelectedItem();
        int selectedRow = PersonTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select row","Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Person person = (Person)PersonTable.getValueAt(selectedRow, 0);
            Location l1 = new Location();
            l1.setLatitude(LatitudeJTextField.getText().trim());
            l1.setLongitude(LongituteJTextField.getText().trim());
            emergency = new Emergency(type);
            emergency.setLocation(l1);
            emergency.setPerson(person);
            emergency.setTimestamp(time);
            if(enterprise instanceof GovernmentFccEnterprise){
                GovernmentFccEnterprise gov = (GovernmentFccEnterprise) enterprise;
                gov.getEmergencyDirectory().getEmergencyList().add(emergency);

            }
            JOptionPane.showMessageDialog(null,"Emergency Created");
        }
        
         createEmergencyButton.setEnabled(false);
         ambulanceCheckBox.setEnabled(true);
         policeCheckBox.setEnabled(true);

    }//GEN-LAST:event_createEmergencyButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RequestCarWorkAreaJPanel ccw = (RequestCarWorkAreaJPanel) component;
        ccw.populateTableAmbulance();
        ccw.populateTablePolice();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void ambulanceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulanceCheckBoxActionPerformed
        // TODO add your handling code here:
        boolean flag= false;
        flag=ambulanceCheckBox.isSelected();
        if(flag==true){
        AmbulanceButton.setEnabled(true);
        }
        else{
          AmbulanceButton.setEnabled(false);   
        }
    }//GEN-LAST:event_ambulanceCheckBoxActionPerformed

    private void policeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policeCheckBoxActionPerformed
        // TODO add your handling code here:
         boolean flag= false;
        flag=policeCheckBox.isSelected();
        if(flag==true){
        policeButton.setEnabled(true);
        }
        else{
          policeButton.setEnabled(false);   
        }
    }//GEN-LAST:event_policeCheckBoxActionPerformed

    private void AmbulanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmbulanceButtonActionPerformed
        // TODO add your handling code here:
        String message = messageJTextField.getText();
        if(messageJTextField.getText().length()==0){
          JOptionPane.showMessageDialog(this, "Please enter all the values.","Error", JOptionPane.ERROR_MESSAGE);
            return;   
        }
        CallCenterRequestAmbulance ambRequest = new CallCenterRequestAmbulance();
        ambRequest.setMessage(message);
        ambRequest.setSender(userAccount);
        ambRequest.setStatusAmbulance("Sent");
        ambRequest.setEmergency(emergency);
        organization.getWorkQueue().getWorkRequestList().add(ambRequest);
        Organization org = null;
        for (Organization org6 : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org6 instanceof FccAmbulanceOrganization) {
                org = org6;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(ambRequest);
            JOptionPane.showMessageDialog(null,"Request has been successfully sent to Ambulance Department");
        }
        ambulanceCheckBox.setEnabled(false);
        AmbulanceButton.setEnabled(false);
    }//GEN-LAST:event_AmbulanceButtonActionPerformed

    private void policeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policeButtonActionPerformed
        // TODO add your handling code here:

        String message = messageJTextField.getText();
        CallCenterRequestPolice policeRequest = new CallCenterRequestPolice();
        policeRequest.setMessage(message);
        policeRequest.setSender(userAccount);
        policeRequest.setStatusPolice("Sent");
        policeRequest.setEmergency(emergency);
        organization.getWorkQueue().getWorkRequestList().add(policeRequest);
        Organization org = null;
        for (Organization org5 : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org5 instanceof FccPoliceEmergencyOrganization) {
                org = org5;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(policeRequest);
            JOptionPane.showMessageDialog(null,"Request has been successfully sent to Police Department");
        }
        policeCheckBox.setEnabled(false);
        policeButton.setEnabled(false);

    }//GEN-LAST:event_policeButtonActionPerformed

    private void typeJBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeJBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeJBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmbulanceButton;
    private javax.swing.JTextField LatitudeJTextField;
    private javax.swing.JTextField LongituteJTextField;
    private javax.swing.JTable PersonTable;
    private javax.swing.JCheckBox ambulanceCheckBox;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createEmergencyButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton policeButton;
    private javax.swing.JCheckBox policeCheckBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JTextField timeJTextField;
    private javax.swing.JComboBox typeJBox;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}