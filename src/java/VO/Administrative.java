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
public class Administrative extends Employee{
    
    private String category;
    

    public Administrative(String category, float salary, Date hirigDate, String id, String name) {
        super(hirigDate, id, name);
        this.category = category;
        
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

    @Override
    public float paySalary() {
        return 0;
    }
    
    
    
}
