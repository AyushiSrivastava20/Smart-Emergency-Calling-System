/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PharmacyRole;
import Business.Role.Role;
import static Business.Role.Role.RoleType.Pharmacy;
import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class PharmacyOrganization extends Organization{

    public PharmacyOrganization() {
        super(Type.Pharmacy.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PharmacyRole(Pharmacy));
        return roles;
    }
    
}
