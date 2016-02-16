/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FccPoliceEmergencyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.PoliceWorkArea.PoliceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class PoliceRole extends Role {

    public PoliceRole(RoleType type) {
        super(type);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PoliceWorkAreaJPanel(userProcessContainer, account, (FccPoliceEmergencyOrganization)organization, enterprise);
    }
    
}
