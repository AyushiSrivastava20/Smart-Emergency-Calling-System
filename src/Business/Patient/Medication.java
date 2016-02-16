/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author ayushi
 */
public class Medication {
    
    private String Medication_type;
    private String Medication_description;
    private String Dosage;
    private int cost;
    
    

    public String getMedication_type() {
        return Medication_type;
    }

    public void setMedication_type(String Medication_type) {
        this.Medication_type = Medication_type;
    }

    public String getMedication_description() {
        return Medication_description;
    }

    public void setMedication_description(String Medication_description) {
        this.Medication_description = Medication_description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

   

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String Dosage) {
        this.Dosage = Dosage;
    }
    
    @Override
    public String toString(){
        return this.Medication_type;
    }
    
}
