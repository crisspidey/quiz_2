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
public class PartialTime extends Professor{

    private String category;
    private int classHours;
    private double salary;

    public PartialTime(String category, int classHours, double salary, String school, String department, Date hirigDate, int id, String name) {
        super(school, department, hirigDate, id, name);
        this.category = category;
        this.classHours = classHours;
        this.salary = salary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getClassHours() {
        return classHours;
    }

    public void setClassHours(int classHours) {
        this.classHours = classHours;
    }
    
     public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

