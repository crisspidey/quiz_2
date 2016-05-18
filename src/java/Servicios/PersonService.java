/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import DAO.PersonDAO;
import VO.Person;
import java.util.List;

/**
 *
 * @author Andres Rodriguez
 */
public class PersonService {
    private PersonDAO dao = null;
    
    public PersonService(){
      this.dao = new PersonDAO();
    }
    
    public List<Person> findAll() {
      return this.dao.findAll();
    }
    
    public boolean insert(Person t){
      return this.dao.insert(t);
    }   
}
