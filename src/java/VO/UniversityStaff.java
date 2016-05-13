/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.util.ArrayList;

/**
 *
 * @author Andres Rodriguez
 */
public class UniversityStaff {
 
    private ArrayList<Employee> payroll;

    public UniversityStaff(ArrayList<Employee> payroll) {
        this.payroll = payroll;
    }

    public ArrayList<Employee> getPayroll() {
        return payroll;
    }

    public void setPayroll(ArrayList<Employee> payroll) {
        this.payroll = payroll;
    }
        
}
