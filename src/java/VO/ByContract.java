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
public class ByContract extends Employee{
    
    private int months;
    private float value;

    public ByContract(int months, float value, Date hirigDate, String id, String name) {
        super(hirigDate, id, name);
        this.months = months;
        this.value = value;
    }

    @Override
    public float paySalary() {
        return 0;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
}
