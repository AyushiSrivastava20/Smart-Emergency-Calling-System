/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FCCAdminRole;
import Business.Role.Role;
import static Business.Role.Role.RoleType.FCCAdmin;
import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class FccAdminOrganization extends Organization {

    public FccAdminOrganization(String name) {
        super(Type.FccAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
          ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FCCAdminRole(FCCAdmin));
        return roles;
    }
    
}
