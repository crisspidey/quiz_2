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
public class Student extends Employee{
  
    private String department;

    public Student(String department, Date hirigDate, String id, String name) {
        super(hirigDate, id, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public float paySalary() {
        return 0;
    }
    
    
    
}
