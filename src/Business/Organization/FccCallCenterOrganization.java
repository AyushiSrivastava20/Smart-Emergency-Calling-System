/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CallCenterRole;
import Business.Role.Role;
import static Business.Role.Role.RoleType.CallCenter;
import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class FccCallCenterOrganization extends Organization {

    
    public FccCallCenterOrganization() {
        super(Type.CallCenter.getValue());
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
          ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CallCenterRole(CallCenter));
        return roles;
    }
    
}
