/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;

/**
 *
 * @author ayushi
 */
public class DoctorWorkRequest extends WorkRequest{
    
    private String docMessage;
    private Patient patient;

    public String getDocMessage() {
        return docMessage;
    }

    public void setDocMessage(String docMessage) {
        this.docMessage = docMessage;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
    public String toString(){
       return super.toString();
   }
    
}
