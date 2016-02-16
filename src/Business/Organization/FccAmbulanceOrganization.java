/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AmbulanceRole;
import Business.Role.Role;
import static Business.Role.Role.RoleType.Ambulance;
import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class FccAmbulanceOrganization extends Organization {

    public FccAmbulanceOrganization() {
        super(Type.Ambulance.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
          ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmbulanceRole(Ambulance));
        return roles;
    }
    
}
