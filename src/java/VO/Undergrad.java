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

    public Undergrad(int weekHours, String department, Date hirigDate, String id, String name) {
        super(department, hirigDate, id, name);
        this.weekHours = weekHours;
    }

    public int getWeekHours() {
        return weekHours;
    }

    public void setWeekHours(int weekHours) {
        this.weekHours = weekHours;
    }
       
}
