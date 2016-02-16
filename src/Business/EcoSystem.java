/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import static Business.Role.Role.RoleType.SystemAdmin;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import java.util.HashSet;


/**
 *
 * @author ayushi
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList = new ArrayList<>();
    private HashSet<String> ssnSet = new HashSet<String>();

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole(SystemAdmin));
        return roleList;
    }

    public HashSet<String> getSsnSet() {
        return ssnSet;
    }

    public void setSsnSet(HashSet<String> ssnSet) {
        this.ssnSet = ssnSet;
    }

    

  
    public boolean checkSSN(String ssn){
        boolean flag= false;
        for(String s : ssnSet){
            if(s.equals(ssn)){
            flag=true;
            break;
        }
        }
        
        return flag;
    }
}
