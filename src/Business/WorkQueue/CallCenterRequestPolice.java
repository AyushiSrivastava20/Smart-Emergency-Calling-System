/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Person.CrimeIncident;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ayushi
 */
public class CallCenterRequestPolice extends WorkRequest {
    
    private UserAccount receiverPolice;
    private String statusPolice;
    private String PoliceMessage;
    private CrimeIncident crimeIncident;

    public UserAccount getReceiverPolice() {
        return receiverPolice;
    }

    public void setReceiverPolice(UserAccount receiverPolice) {
        this.receiverPolice = receiverPolice;
    }

    public String getStatusPolice() {
        return statusPolice;
    }

    public void setStatusPolice(String statusPolice) {
        this.statusPolice = statusPolice;
    }

    public String getPoliceMessage() {
        return PoliceMessage;
    }

    public void setPoliceMessage(String PoliceMessage) {
        this.PoliceMessage = PoliceMessage;
    }

    public CrimeIncident getCrimeIncident() {
        return crimeIncident;
    }

    public void setCrimeIncident(CrimeIncident crimeIncident) {
        this.crimeIncident = crimeIncident;
    }
    
    
    
    
    public String toString(){
       return super.toString();
   }
}
