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
public class VitalSign {
    
    private int respiratoryRate;
    private int heartRate;
    private float bp;
    private float weight;
    private int oxygenInBlood;
    private float bodyTemp;
    private int bloodSugar;
    private String timestamp;
    private String status;
    
    

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public float getBp() {
        return bp;
    }

    public void setBp(float bp) {
        this.bp = bp;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getOxygenInBlood() {
        return oxygenInBlood;
    }

    public void setOxygenInBlood(int oxygenInBlood) {
        this.oxygenInBlood = oxygenInBlood;
    }

    public float getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(float bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public int getBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(int bloodSugar) {
        this.bloodSugar = bloodSugar;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
   
    return timestamp;
}
    
}
