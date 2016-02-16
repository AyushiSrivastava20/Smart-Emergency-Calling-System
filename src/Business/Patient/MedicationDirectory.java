/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class MedicationDirectory {
    
     private ArrayList<Medication>MedicationList;
     
     public MedicationDirectory(){
         this.MedicationList= new ArrayList<>();
     }

    public ArrayList<Medication> getMedicationList() {
        return MedicationList;
    }

    public void setMedicationList(ArrayList<Medication> MedicationList) {
        this.MedicationList = MedicationList;
    }
     
     public Medication addMedication(){
        Medication m = new Medication();
        MedicationList.add(m);
        return m;
        
    }
    
    public void removeMedication(Medication m){
        
        MedicationList.remove(m);
           
    }
}
