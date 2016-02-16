/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Emergency;

import Business.Emergency.Emergency.EmergencyType;
import Business.Location.Location;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class EmergencyDirectory {
    
    private ArrayList<Emergency>emergencyList;
    
    public EmergencyDirectory(){
        
        this.emergencyList =  new ArrayList<>();
        
    }

    public ArrayList<Emergency> getEmergencyList() {
        return emergencyList;
    }

    
    
    public Emergency addEmergency(Location l, String ts, Emergency.EmergencyType type){
        Emergency em = new Emergency(type);
        em.setLocation(l);
        em.setTimestamp(ts);
        
        return em;
        
    }
    
    
    
}
