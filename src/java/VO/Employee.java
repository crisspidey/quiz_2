/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.sql.Date;

/**
 *
 * @author Andres Rodriguez
 */
public abstract class Employee extends Person{
    
    private Date hirigDate;

    public Employee(Date hirigDate, String id, String name) {
        super(id, name);
        this.hirigDate = hirigDate;
    }

    public Date getHirigDate() {
        return hirigDate;
    }

    public void setHirigDate(Date hirigDate) {
        this.hirigDate = hirigDate;
    }
    
    public abstract float paySalary();
    
}
