/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PharmacyWorkArea.PharmacyMainWorkJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class PharmacyRole extends Role {

    public PharmacyRole(RoleType type) {
        super(type);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmacyMainWorkJPanel(userProcessContainer, account, (PharmacyOrganization)organization, enterprise);
    }
    
}
