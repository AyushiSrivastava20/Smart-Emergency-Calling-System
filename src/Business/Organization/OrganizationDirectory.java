/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.EmergencyWard.getValue())){
            organization = new HospitalEmergencyWardOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.Citizen.getValue())){
            organization = new CitizenOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.CallCenter.getValue())){
            organization = new FccCallCenterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Ambulance.getValue())){
            organization = new FccAmbulanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Police.getValue())){
            organization = new FccPoliceEmergencyOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Fire.getValue())){
            organization = new FccFireOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
}
