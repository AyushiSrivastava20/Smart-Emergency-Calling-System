/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FccFireOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.FireAdminWorkArea.FireAdminMainJPanel;
import UserInterface.FireInspectorWorkArea.FireInspectorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class FireAdminRole extends Role {

    public FireAdminRole(RoleType type) {
        super(type);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FireAdminMainJPanel(userProcessContainer, account, (FccFireOrganization)organization, enterprise);
    }
    
}
