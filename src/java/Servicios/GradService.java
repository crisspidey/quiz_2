/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author Andres Rodriguez
 */
public class GradService {
    private GradDAO dao= new GradDAO();
    
    public boolean crear(Grad a){
    return this.dao.insert(a);
    }
}
