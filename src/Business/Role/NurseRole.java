/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.NurseWorkArea.NurseWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class NurseRole extends Role {

    public NurseRole(RoleType type) {
        super(type);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new NurseWorkAreaJPanel(userProcessContainer, account, (NurseOrganization)organization, enterprise);
    }
    
}
