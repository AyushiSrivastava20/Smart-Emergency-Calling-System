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
public class PharmacyWorkRequest extends WorkRequest {
    
    private String pharmacyresult;
    private Patient patient;

    public String getPharmacyresult() {
        return pharmacyresult;
    }

    public void setPharmacyresult(String pharmacyresult) {
        this.pharmacyresult = pharmacyresult;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
