/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Emergency;

import Business.Location.Location;
import Business.Person.Person;

/**
 *
 * @author ayushi
 */
public class Emergency {
    private int emId;
    private static int count = 1;
    private Location location;
    private String timestamp;
    private EmergencyType emergencyType;
    private Person person;
    

    public Emergency(EmergencyType type){
        emId=count;
        count ++;
        this.emergencyType=type;
    }
    
     public enum EmergencyType{
        Medical("Medical"),
        Criminal("Criminal"),
        CarAccident("CarAccident"),
        Fire("Fire");
        
        private String value;

        private EmergencyType(String value) {
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
   

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public EmergencyType getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(EmergencyType emergencyType) {
        this.emergencyType = emergencyType;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getEmId() {
        return emId;
    }

    public void setEmId(int emId) {
        this.emId = emId;
    }

   
    @Override
    public String toString(){
        return String.valueOf(emId);
    }
    
    
    
    
}
