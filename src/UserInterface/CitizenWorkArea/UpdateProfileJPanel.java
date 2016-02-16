

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CitizenWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CitizenOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.utils.MyPhoneNumberVerifier;
import Business.utils.MyStringVerifier;
import UserInterface.ManageCitizenJPanel;
import java.awt.CardLayout;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class UpdateProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateProfileJPanel
     */
    private JPanel userProcessContainer;
    private CitizenOrganization organization;
    private UserAccount userAccount;
    private EcoSystem system;
    public UpdateProfileJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=account;
        this.system=business;
        this.organization=(CitizenOrganization) organization;
        saveUPJButton.setEnabled(false);
        nameJTextField.setEnabled(false);
        streetJTextField.setEnabled(false);
        cityJTextField.setEnabled(false);
        zipCodeJTextField.setEnabled(false);
        password2JField.setEnabled(false);
        ssnJTextField.setEnabled(false);
        dobJTextField.setEnabled(false);
        emerContJTextField.setEnabled(false);
        phnNoJTextField.setEnabled(false);
        yesRadioButton.setEnabled(false);
        NoRadioButton.setEnabled(false);
        carNoJTextField.setEnabled(false);
        drivLicJTextField.setEnabled(false);
        passwordJField.setEnabled(false);
        userNameJTextField.setEnabled(false);
        populate();
        populateState();
        MyStringVerifier myStringVerifier= new MyStringVerifier();
        nameJTextField.setInputVerifier(myStringVerifier);
        streetJTextField.setInputVerifier(myStringVerifier);
        cityJTextField.setInputVerifier(myStringVerifier);
        zipCodeJTextField.setInputVerifier(myStringVerifier);
        ssnJTextField.setInputVerifier(myStringVerifier);
        carNoJTextField.setInputVerifier(myStringVerifier);
        drivLicJTextField.setInputVerifier(myStringVerifier);
        userNameJTextField.setInputVerifier(myStringVerifier);
        MyPhoneNumberVerifier myPhoneNumberVerifier= new MyPhoneNumberVerifier();
        phnNoJTextField.setInputVerifier(myPhoneNumberVerifier);
        emerContJTextField.setInputVerifier(myPhoneNumberVerifier);
    }
     public void populateState() {
        stateCombo.removeAllItems();
        for (Network ntw : system.getNetworkList()) {
            stateCombo.addItem(ntw);
        }
    }
    public void populate(){
      nameJTextField.setText(userAccount.getPerson().getName());
      streetJTextField.setText(userAccount.getPerson().getStreet());
      cityJTextField.setText(userAccount.getPerson().getCity());
      zipCodeJTextField.setText(userAccount.getPerson().getZipCode());
      ssnJTextField.setText(userAccount.getPerson().getSsn());
      dobJTextField.setText(userAccount.getPerson().getDateOfBirth());
      emerContJTextField.setText(userAccount.getPerson().getEmergencyContact());
      phnNoJTextField.setText(userAccount.getPerson().getPhoneNumber());
      carNoJTextField.setText(userAccount.getPerson().getCarNoRegistered());
      drivLicJTextField.setText(userAccount.getPerson().getDrivingLicense());
      userNameJTextField.setText(userAccount.getUsername());
      passwordJField.setText(userAccount.getPassword());
      password2JField.setText(userAccount.getPassword());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        updateJButton = new javax.swing.JButton();
        saveUPJButton = new javax.swing.JButton();
        backbutton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dobJTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ssnJTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        streetJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cityJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        zipCodeJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        stateCombo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        emerContJTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        phnNoJTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        carNoJTextField = new javax.swing.JTextField();
        drivLicJTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        yesRadioButton = new javax.swing.JRadioButton();
        NoRadioButton = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        passwordJField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        password2JField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(154, 192, 205));

        jLabel5.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel5.setText("Update My Profile");

        updateJButton.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        updateJButton.setText("Update");
        updateJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        saveUPJButton.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        saveUPJButton.setText("Save");
        saveUPJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveUPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUPJButtonActionPerformed(evt);
            }
        });

        backbutton1.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        backbutton1.setText("<<Back");
        backbutton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "1. Personal Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 15))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel2.setText("Name");

        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel6.setText("DOB(dd-mm-yyyy)");

        jLabel14.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel14.setText("SSN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ssnJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addComponent(dobJTextField)))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dobJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ssnJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "2. Contact Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 15))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel7.setText("Street");

        jLabel8.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel8.setText("City");

        cityJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel9.setText("ZipCode");

        zipCodeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeJTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel1.setText("State");

        stateCombo.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        stateCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        stateCombo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel10.setText("Phone Number");

        jLabel11.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel11.setText("EmergencyContact");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emerContJTextField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(streetJTextField)
                            .addComponent(cityJTextField)
                            .addComponent(zipCodeJTextField)
                            .addComponent(stateCombo, 0, 215, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(phnNoJTextField))
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(streetJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(zipCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(stateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(phnNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emerContJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(48, 48, 48))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "3. Vehicle Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 15))); // NOI18N

        jLabel12.setText("Car Registered No");

        jLabel13.setText("Driving License");

        jLabel15.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel15.setText("Do you have car ?");

        yesRadioButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        yesRadioButton.setText("Yes");
        yesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRadioButtonActionPerformed(evt);
            }
        });

        NoRadioButton.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        NoRadioButton.setText("NO");
        NoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(43, 43, 43)
                        .addComponent(yesRadioButton)
                        .addGap(68, 68, 68)
                        .addComponent(NoRadioButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(carNoJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(drivLicJTextField))))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(yesRadioButton)
                    .addComponent(NoRadioButton))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(carNoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(drivLicJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "4. User Account Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 15))); // NOI18N

        jLabel3.setText("User Name");

        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        jLabel16.setText("Re-enter Password");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel16))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(passwordJField)
                    .addComponent(password2JField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(userNameJTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(password2JField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(backbutton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(saveUPJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(updateJButton)
                        .addGap(33, 33, 33)
                        .addComponent(saveUPJButton))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(backbutton1)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        nameJTextField.setEnabled(true);
        streetJTextField.setEnabled(true);
        cityJTextField.setEnabled(true);
        zipCodeJTextField.setEnabled(true);
        stateCombo.setEnabled(true);
        
        dobJTextField.setEnabled(true);
        emerContJTextField.setEnabled(true);
        phnNoJTextField.setEnabled(true);
        yesRadioButton.setEnabled(true);
        NoRadioButton.setEnabled(true);
       
        drivLicJTextField.setEnabled(true);
        passwordJField.setEnabled(true);
        password2JField.setEnabled(true);
        saveUPJButton.setEnabled(true);
        updateJButton.setEnabled(false);
    }//GEN-LAST:event_updateJButtonActionPerformed

   
    
    
    
    
    
    
    
    private void saveUPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUPJButtonActionPerformed
        // TODO add your handling code here:

        char[] passwordCharArray = passwordJField.getPassword();
        String password = String.valueOf(passwordCharArray);
        char[] passwordCharArray1 = password2JField.getPassword();
        String password2 = String.valueOf(passwordCharArray1);
        if (nameJTextField.getText().trim().length() == 0 || streetJTextField.getText().length() == 0 || cityJTextField.getText().trim().length() == 0
                || zipCodeJTextField.getText().length() == 0 || phnNoJTextField.getText().trim().length() == 0 || emerContJTextField.getText().trim().length() == 0
                || ssnJTextField.getText().trim().length() == 0 || dobJTextField.getText().trim().length() == 0 || userNameJTextField.getText().trim().length() == 0 
                || password.length()==0) {
            JOptionPane.showMessageDialog(this, "Please enter all the values.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        String mob = phnNoJTextField.getText().trim();
                String em = emerContJTextField.getText().trim();
                if(mob.equals(em)){
                   JOptionPane.showMessageDialog(this, "Emergency Contact Number should not be same","Error", JOptionPane.ERROR_MESSAGE);
                  return;
                }
                
         String ssn=ssnJTextField.getText().trim();
          if (!password.equals(password2)){
          JOptionPane.showMessageDialog(this, "Password entered are different","Error", JOptionPane.ERROR_MESSAGE); 
           return;  
        } 
                
        Network network = (Network) stateCombo.getSelectedItem();
        String userName= userNameJTextField.getText().trim();
        
        try{
            userAccount.getPerson().setName(nameJTextField.getText().trim());
             userAccount.getPerson().setStreet(streetJTextField.getText().trim());
                userAccount.getPerson().setCity(cityJTextField.getText().trim());
                userAccount.getPerson().setZipCode(zipCodeJTextField.getText().trim());
                userAccount.getPerson().setDateOfBirth(dobJTextField.getText().trim());
                String db=dobJTextField.getText().trim();
                     try {
                         int age=userAccount.getPerson().calculateage(db);
                         //System.out.println("Age "+ age);
                         userAccount.getPerson().setAge(age);
                     } catch (ParseException ex) {
                         Logger.getLogger(ManageCitizenJPanel.class.getName()).log(Level.SEVERE, null, ex);
                     }
                
                userAccount.getPerson().setPhoneNumber(phnNoJTextField.getText().trim());
                userAccount.getPerson().setEmergencyContact(emerContJTextField.getText().trim());
                //userAccount.getPerson().setSsn(ssnJTextField.getText().trim());
                userAccount.getPerson().setCarNoRegistered(carNoJTextField.getText().trim());
                userAccount.getPerson().setDrivingLicense(drivLicJTextField.getText().trim());
                userAccount.setUsername(userName);
                userAccount.setPassword(password);
            JOptionPane.showMessageDialog(null,"Profile updated Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
            saveUPJButton.setEnabled(false);
            updateJButton.setEnabled(true);
            nameJTextField.setEnabled(false);
        streetJTextField.setEnabled(false);
        cityJTextField.setEnabled(false);
        zipCodeJTextField.setEnabled(false);
        
        ssnJTextField.setEnabled(false);
        dobJTextField.setEnabled(false);
        emerContJTextField.setEnabled(false);
        phnNoJTextField.setEnabled(false);
        yesRadioButton.setEnabled(false);
        NoRadioButton.setEnabled(false);
        carNoJTextField.setEnabled(false);
        drivLicJTextField.setEnabled(false);
        passwordJField.setEnabled(false);
        userNameJTextField.setEnabled(false);

        }catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null,"Correct Format Reuired", "Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_saveUPJButtonActionPerformed

    private void backbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbutton1ActionPerformed

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void cityJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJTextFieldActionPerformed

    private void zipCodeJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeJTextFieldActionPerformed

    private void yesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesRadioButtonActionPerformed
        // TODO add your handling code here:
        carNoJTextField.setEnabled(true);
    }//GEN-LAST:event_yesRadioButtonActionPerformed

    private void NoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoRadioButtonActionPerformed
        // TODO add your handling code here:
        carNoJTextField.setEnabled(false);
    }//GEN-LAST:event_NoRadioButtonActionPerformed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton NoRadioButton;
    private javax.swing.JButton backbutton1;
    private javax.swing.JTextField carNoJTextField;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JTextField dobJTextField;
    private javax.swing.JTextField drivLicJTextField;
    private javax.swing.JTextField emerContJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JPasswordField password2JField;
    private javax.swing.JPasswordField passwordJField;
    private javax.swing.JTextField phnNoJTextField;
    private javax.swing.JButton saveUPJButton;
    private javax.swing.JTextField ssnJTextField;
    private javax.swing.JComboBox stateCombo;
    private javax.swing.JTextField streetJTextField;
    private javax.swing.JButton updateJButton;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JRadioButton yesRadioButton;
    private javax.swing.JTextField zipCodeJTextField;
    // End of variables declaration//GEN-END:variables
}
