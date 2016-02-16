/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FireBrigade;

/**
 *
 * @author ayushi
 */
public class FireBrigade {
    
    
    private String brigadeName;
    private String brigadeNo;
    private String Status;

    public String getBrigadeName() {
        return brigadeName;
    }

    public void setBrigadeName(String brigadeName) {
        this.brigadeName = brigadeName;
    }

    public String getBrigadeNo() {
        return brigadeNo;
    }

    public void setBrigadeNo(String brigadeNo) {
        this.brigadeNo = brigadeNo;
    }

   

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    @Override
    
    public String toString()
    {
        return this.brigadeName;
    }
    
}
