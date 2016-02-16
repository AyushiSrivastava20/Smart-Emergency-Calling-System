/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.CitizenRole;
import Business.Role.Role;
import static Business.Role.Role.RoleType.Citizen;
import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class CitizenOrganization extends Organization{

    public CitizenOrganization() {
        super(Type.Citizen.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CitizenRole(Citizen));
        return roles;
    }
    
}
