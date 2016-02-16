/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public abstract class Role {
    
    private RoleType roleType;
    
    public Role(RoleType type ){
        this.roleType=type;
    }
    public enum RoleType{
        FCCAdmin("FCCAdmin"),
        FireInspector("FireInspector"),
        FireAdmin("FireAdmin"),
        Police("Police"),
        Ambulance("Ambulance"),
        CallCenter("CallCenter"),
        Citizen("Citizen"),
        HospitalAdmin("HospitalAdmin"),
        EmergencyWard("EmergencyWard"),
        Doctor("Doctor"),
        Patient("Patient"),
        Pharmacy("Pharmacy"),
        SystemAdmin("SystemAdmin"),
        Nurse("Nurse");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        
      return  this.getRoleType().getValue();
           
    }
}