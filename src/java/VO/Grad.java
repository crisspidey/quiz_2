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
public class Grad extends Student{
    
    private int courses;
    private double salary;

    public Grad(int courses, double salary, String department, Date hirigDate, String id, String name) {
        super(department, hirigDate, id, name);
        this.courses = courses;
        this.salary = salary;
    }
    
    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }   
    
     public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
