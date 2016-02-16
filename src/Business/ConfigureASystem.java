/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.Person;
import static Business.Role.Role.RoleType.SystemAdmin;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ayushi
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Person person = system.getPersonDirectory().createPerson();
        person.setSsn("SSN0001");
        system.getSsnSet().add("SSN0001");
        person.setName("Ayushi");
        person.setStreet("49 Symphony Road");
        person.setCity("Boston");
        person.setZipCode("02115");
        person.setPhoneNumber("8578003978");
        person.setEmergencyContact("9619209309");
       
        person.setAge(25);
        person.setCarNoRegistered("MH0421A");
        person.setDrivingLicense("DR001");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole(SystemAdmin));
        
        return system;
    }
    
}
