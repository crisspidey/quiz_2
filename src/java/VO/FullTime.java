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
public class FullTime extends Professor{
    
    private float salary;

    public FullTime(float salary, String school, String department, Date hirigDate, int id, String name) {
        super(salary,school, department, hirigDate, id, name);
        
    }    
}
