/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author ayushi
 */
public class UserAccount implements Comparable<UserAccount> {
    
    private String username;
    private String password;
    private Person person;
    private Role role;
    private WorkQueue workQueue;
    private int temp;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    

    public void setRole(Role role) {
        this.role = role;
    }

    

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    
    
    
    @Override
    public String toString() {
        return username;
    }

    @Override
    public int compareTo(UserAccount comparepro) {
    
     int comparetemp=((UserAccount)comparepro).getTemp();
     return comparetemp-this.temp;
    
    }

    

    
   
    
    
    
}
