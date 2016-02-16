/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class DrugCatalog {
   
     private ArrayList<Drug>drugList;
     
     public DrugCatalog(){
         drugList = new ArrayList<>();
        
     }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }
     
     public Drug addDrug(){
        Drug d = new Drug();
        drugList.add(d);
        return d;
        
    }
     
    public Drug search(String id){
        
    for (Drug d : drugList){
            if(id.equals(d.getDrugName())){
                return d;
            }
        }
        return null;
    }
}
