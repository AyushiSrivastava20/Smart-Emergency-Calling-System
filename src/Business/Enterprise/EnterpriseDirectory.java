/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, String location){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterprise.setLocation(location);
            enterpriseList.add(enterprise);
        }
        else{
           enterprise = new GovernmentFccEnterprise(name);
           enterprise.setLocation(location);
           enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    
    
}
