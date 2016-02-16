/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author ayushi
 */
public class CrimeIncident {
    
    private String crime_description;
    private CrimeType crimeType;
    
    
    public CrimeIncident(CrimeType type){
        this.crimeType=type;
    }
    public enum CrimeType{
        Murder("Murder"),
        Robbery("Robbery"),
        Others("Others"),
        ShootOuts("ShootOuts");
        
        private String value;

        private CrimeType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    
    

    public String getCrime_description() {
        return crime_description;
    }

    public void setCrime_description(String crime_description) {
        this.crime_description = crime_description;
    }

    public CrimeType getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(CrimeType crimeType) {
        this.crimeType = crimeType;
    }

   
   
    @Override
    public String toString(){
        return this.getCrimeType().getValue();
    }
    
}
