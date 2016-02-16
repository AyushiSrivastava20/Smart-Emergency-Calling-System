/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;



import Business.FireBrigade.FireBrigade;
import Business.Role.FireAdminRole;
import Business.Role.FireInspectorRole;
import Business.Role.Role;

import static Business.Role.Role.RoleType.FireAdmin;
import static Business.Role.Role.RoleType.FireInspector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ayushi
 */
public class FccFireOrganization extends Organization {

    private Queue<FireBrigade> fireBrigadeQ;
    public FccFireOrganization() {
        super(Type.Fire.getValue());
        fireBrigadeQ = new LinkedList<>();
    }

    public Queue<FireBrigade> getFireBrigadeQ() {
        return fireBrigadeQ;
    }

    public void setFireBrigadeQ(Queue<FireBrigade> fireBrigadeQ) {
        this.fireBrigadeQ = fireBrigadeQ;
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FireInspectorRole(FireInspector));
        roles.add(new FireAdminRole(FireAdmin));
        return roles;
    }
    
}
