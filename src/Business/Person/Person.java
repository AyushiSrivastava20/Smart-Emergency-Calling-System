/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ayushi
 */
public class Person {
    
    private int personId;
    private static int count = 1;
    private String ssn;
    private String Name;
    private String street;
    private String city;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContact;
    private CrimeIncidentDirectory crimeDirectory;
    
    private int age;
    private String email;
    private String carNoRegistered;
    private String drivingLicense;
    private String dateOfBirth;
    
    public Person(){
        personId=count;
        count++;
        crimeDirectory=new CrimeIncidentDirectory();
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarNoRegistered() {
        return carNoRegistered;
    }

    public void setCarNoRegistered(String carNoRegistered) {
        this.carNoRegistered = carNoRegistered;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    

    public int calculateage(String dob) throws ParseException{
      
       DateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
       Date personDateOfBirth = (Date)formatter.parse(dob);
       Calendar Birthdate = Calendar.getInstance();
       Birthdate.setTime(personDateOfBirth);
       Calendar currentDate = Calendar.getInstance();
       currentDate.setTime(new Date());
       return currentDate.get(Calendar.YEAR)-Birthdate.get(Calendar.YEAR);     
   
    }

    public CrimeIncidentDirectory getCrimeDirectory() {
        return crimeDirectory;
    }

    public void setCrimeDirectory(CrimeIncidentDirectory crimeDirectory) {
        this.crimeDirectory = crimeDirectory;
    }
    
    
    
   @Override
    public String toString() {
        return Name;
    }
    
    
    
}
