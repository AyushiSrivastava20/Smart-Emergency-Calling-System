/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class CrimeIncidentDirectory {
    
    private ArrayList<CrimeIncident>crimeList;
    
    public CrimeIncidentDirectory(){
        
        crimeList= new ArrayList<>();
    }

    public ArrayList<CrimeIncident> getCrimeList() {
        return crimeList;
    }

    public void setCrimeList(ArrayList<CrimeIncident> crimeList) {
        this.crimeList = crimeList;
    }
    
    
    
}
