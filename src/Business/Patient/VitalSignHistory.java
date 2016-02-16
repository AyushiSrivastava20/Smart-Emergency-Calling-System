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
public class VitalSignHistory {
    
    private ArrayList<VitalSign>vitalSignList;
    
    public VitalSignHistory(){
        
        this.vitalSignList =  new ArrayList<>();
        
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public VitalSign addVitalSign(){
        VitalSign vs = new VitalSign();
        vitalSignList.add(vs);
        return vs;
        
    }
    
    public void removeVitalSign(VitalSign vs){
        
        vitalSignList.remove(vs);
           
    }
      
}

