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
public class Undergrad extends Student{
    
    private int weekHours;
    private double salary;

    public Undergrad(int weekHours, double salary, String department, Date hirigDate, int id, String name) {
        super(department, hirigDate, id, name);
        this.weekHours = weekHours;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWeekHours() {
        return weekHours;
    }

    public void setWeekHours(int weekHours) {
        this.weekHours = weekHours;
    }
       
}
