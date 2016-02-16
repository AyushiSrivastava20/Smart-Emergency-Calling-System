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
public class NurseWorkRequest extends WorkRequest {
    
    private String nurseResult;
    private Patient patient;

    public String getNurseResult() {
        return nurseResult;
    }

    public void setNurseResult(String nurseResult) {
        this.nurseResult = nurseResult;
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
