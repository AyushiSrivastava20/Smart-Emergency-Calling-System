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
public class Patient{
    
    private int patientId;
    private static int count = 1;
    private String patientDoctor;
    private String room_no;
    private String status;
    private VitalSignHistory vitalSignHistory;
    private String patientName;
    private int age;
    private int emID;
    private MedicationDirectory medicationDirectory;
    private int total;
   
    
    public Patient(){
        patientId=count;
        count ++;
       vitalSignHistory = new VitalSignHistory();
       medicationDirectory = new MedicationDirectory();
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    

    public String getPatientDoctor() {
        return patientDoctor;
    }

    public void setPatientDoctor(String patientDoctor) {
        this.patientDoctor = patientDoctor;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmID() {
        return emID;
    }

    public void setEmID(int emID) {
        this.emID = emID;
    }

    public MedicationDirectory getMedicationDirectory() {
        return medicationDirectory;
    }

    public void setMedicationDirectory(MedicationDirectory medicationDirectory) {
        this.medicationDirectory = medicationDirectory;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    
   
    @Override 
    public String toString(){
        return this.patientName;
    }
    
}
