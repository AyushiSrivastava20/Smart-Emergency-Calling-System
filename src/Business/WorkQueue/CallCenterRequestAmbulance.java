/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author ayushi
 */
public class CallCenterRequestAmbulance extends WorkRequest {
    
    private UserAccount receiverAmbulance;
    private String statusAmbulance;
    private String AmbulanceMessage;
    private UserAccount emergencyWard;
    private String statusEmergency;
    private String messageEmergency;
    private int noofPatients;
    
    
    

    public UserAccount getReceiverAmbulance() {
        return receiverAmbulance;
    }

    public void setReceiverAmbulance(UserAccount receiverAmbulance) {
        this.receiverAmbulance = receiverAmbulance;
    }

    public String getStatusAmbulance() {
        return statusAmbulance;
    }

    public void setStatusAmbulance(String statusAmbulance) {
        this.statusAmbulance = statusAmbulance;
    }

    public String getAmbulanceMessage() {
        return AmbulanceMessage;
    }

    public void setAmbulanceMessage(String AmbulanceMessage) {
        this.AmbulanceMessage = AmbulanceMessage;
    }

    public UserAccount getEmergencyWard() {
        return emergencyWard;
    }

    public void setEmergencyWard(UserAccount emergencyWard) {
        this.emergencyWard = emergencyWard;
    }

    public String getStatusEmergency() {
        return statusEmergency;
    }

    public void setStatusEmergency(String statusEmergency) {
        this.statusEmergency = statusEmergency;
    }

    public String getMessageEmergency() {
        return messageEmergency;
    }

    public void setMessageEmergency(String messageEmergency) {
        this.messageEmergency = messageEmergency;
    }

    public int getNoofPatients() {
        return noofPatients;
    }

    public void setNoofPatients(int noofPatients) {
        this.noofPatients = noofPatients;
    }

    
    public String toString(){
       return super.toString();
   }
    
    
}
