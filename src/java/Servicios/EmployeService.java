/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import DAO.PersonDAO;

/**
 *
 * @author Andres Felipe Bernal
 */
public class EmployeService {
    private PersonDAO dao;

    public EmployeService(PersonDAO dao) {
        this.dao = dao;
    }
    public boolean SalarioTotal(Employe t){
      return this.dao.insert(t);
    } 
}
