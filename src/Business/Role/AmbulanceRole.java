/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FccAmbulanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AmbulanceWorkArea.AmbulanceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ayushi
 */
public class AmbulanceRole extends Role {

    public AmbulanceRole(RoleType type) {
        super(type);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AmbulanceWorkAreaJPanel(userProcessContainer, account, (FccAmbulanceOrganization)organization, enterprise, business);
    }
    
}
