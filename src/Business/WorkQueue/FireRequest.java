/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.FireBrigade.FireBrigade;

/**
 *
 * @author ayushi
 */
public class FireRequest extends WorkRequest {
    
    private String FireTest;
    private FireBrigade fireBrigade;

    public String getFireTest() {
        return FireTest;
    }

    public void setFireTest(String FireTest) {
        this.FireTest = FireTest;
    }

    public FireBrigade getFireBrigade() {
        return fireBrigade;
    }

    public void setFireBrigade(FireBrigade fireBrigade) {
        this.fireBrigade = fireBrigade;
    }
    
    
    
    public String toString(){
       return super.toString();
   }
}
