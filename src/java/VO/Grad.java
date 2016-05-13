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

    public Grad(int courses, String department, Date hirigDate, String id, String name) {
        super(department, hirigDate, id, name);
        this.courses = courses;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }   
}
