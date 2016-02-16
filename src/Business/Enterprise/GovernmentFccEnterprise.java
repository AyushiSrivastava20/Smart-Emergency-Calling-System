/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Emergency.EmergencyDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class GovernmentFccEnterprise extends Enterprise {

    private EmergencyDirectory emergencyDirectory;
    public GovernmentFccEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.FCCGovernment);
        emergencyDirectory = new EmergencyDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public EmergencyDirectory getEmergencyDirectory() {
        return emergencyDirectory;
    }
    
}
