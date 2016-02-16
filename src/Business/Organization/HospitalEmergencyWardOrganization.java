/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EmergencyWardRole;
import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import static Business.Role.Role.RoleType.EmergencyWard;
import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class HospitalEmergencyWardOrganization extends Organization {

    public HospitalEmergencyWardOrganization() {
        super(Type.EmergencyWard.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EmergencyWardRole(EmergencyWard));
        return roles;
    }
    
}
