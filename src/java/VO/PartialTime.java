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

    public PartialTime(String category, int classHours, String school, String department, Date hirigDate, String id, String name) {
        super(school, department, hirigDate, id, name);
        this.category = category;
        this.classHours = classHours;
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
    
    
}

