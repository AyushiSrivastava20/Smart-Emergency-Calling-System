/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person.Person;

/**
 *
 * @author ayushi
 */
public class Employee extends Person {
    
    private String EmpID;
    private String Company;
    

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    
    
}
