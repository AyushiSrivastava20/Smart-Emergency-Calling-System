/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Drug.DrugCatalog;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class HospitalEnterprise extends Enterprise{

    private PatientDirectory patientDirectory;
    private DrugCatalog drugCatalog;
    
    public HospitalEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Hospital);
        patientDirectory = new PatientDirectory();
        drugCatalog = new DrugCatalog();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }
    
    
    
    
}

