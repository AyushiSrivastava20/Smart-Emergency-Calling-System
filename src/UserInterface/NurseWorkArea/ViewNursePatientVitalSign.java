/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NurseWorkArea;

import Business.Patient.Patient;
import Business.Patient.VitalSign;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayushi
 */
public class ViewNursePatientVitalSign extends javax.swing.JPanel {

    /**
     * Creates new form ViewNursePatientVitalSign
     */
    private JPanel userProcessContainer;
    private Patient patient;
    public ViewNursePatientVitalSign(JPanel userProcessContainer,Patient patient) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.patient=patient;
        value.setText(patient.getPatientName());
        populate();
    }
    
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)VitalSignJTable.getModel();
        dtm.setRowCount(0);
        for( VitalSign vs : patient.getVitalSignHistory().getVitalSignList()){
            Object[] row = new Object[7];
            row[0]=vs.getRespiratoryRate();
            row[1]=vs.getHeartRate();
            row[2]=vs.getBodyTemp();
            row[3]=vs.getBloodSugar();
            row[4]=vs.getOxygenInBlood();
            row[5]=vs.getWeight();
            row[6]=vs.getBp();
            dtm.addRow(row);
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
        VitalSignJTable = new javax.swing.JTable();
        value = new javax.swing.JLabel();
        addVitalSignJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pathJTextField = new javax.swing.JTextField();
        backMVJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(154, 192, 205));

        VitalSignJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Respiratory", "Heart rate", "Body Temp", "Blood Sugar", "Oxygen in Blood", "Weight", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VitalSignJTable);

        value.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        value.setText("<Patient>");

        addVitalSignJButton.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        addVitalSignJButton.setText("Add Vital Sign");
        addVitalSignJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addVitalSignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVitalSignJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 15)); // NOI18N
        jLabel3.setText("Vital Sign Path");

        backMVJButton.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        backMVJButton.setText("<<Back");
        backMVJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backMVJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMVJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pathJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addVitalSignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(backMVJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(49, 49, 49)
                .addComponent(addVitalSignJButton)
                .addGap(48, 48, 48)
                .addComponent(backMVJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addVitalSignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVitalSignJButtonActionPerformed
        // TODO add your handling code here:
        BufferedReader br = null;
        String path ="/Users/ayushi/Documents/NetBeansProjects/Project/vs2.csv";
      
            try {
                br = new BufferedReader(new FileReader(new File(path)));
                String line="";
                while ((line = br.readLine()) != null) {
                    String[] entries = line.split(",");
                    VitalSign vs = new VitalSign();

                    vs.setRespiratoryRate(Integer.valueOf(entries[0]));
                    vs.setHeartRate(Integer.valueOf(entries[1]));
                    vs.setBp(Float.parseFloat(entries[2]));
                    vs.setWeight(Float.parseFloat(entries[3]));
                    vs.setOxygenInBlood(Integer.parseInt(entries[4]));
                    vs.setBodyTemp(Float.parseFloat(entries[5]));
                    vs.setBloodSugar(Integer.parseInt(entries[6]));
                    vs.setStatus(entries[7]);
                    vs.setTimestamp(entries[8]);
                    patient.getVitalSignHistory().getVitalSignList().add(vs);
                    JOptionPane.showMessageDialog(null, "vital Sign added.");
                    populate();
                    System.out.println("Done");

                }

            } catch (FileNotFoundException e) {
            } catch (IOException e) {
            } finally {
                if(br!=null){
                    try {
                        br.close();
                    } catch (IOException e) {
                    }
                }

            }
            System.out.println("Done");
        
     
    }//GEN-LAST:event_addVitalSignJButtonActionPerformed

    private void backMVJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMVJButtonActionPerformed
        // TODO add your handling code here:
       userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length -1];
        ViewNursePatient vs = (ViewNursePatient) component;
        vs.populate();
        vs.populateVitalSign();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backMVJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VitalSignJTable;
    private javax.swing.JButton addVitalSignJButton;
    private javax.swing.JButton backMVJButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pathJTextField;
    private javax.swing.JLabel value;
    // End of variables declaration//GEN-END:variables
}