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
public class Professor extends Employee{
    
    private String school;
    private String department;

    public Professor(String school, String department, Date hirigDate, int id, String name) {
        super(hirigDate, id, name);
        this.school = school;
        this.department = department;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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
