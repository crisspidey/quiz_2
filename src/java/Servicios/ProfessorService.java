/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import DAO.ProfessorDAO;
import VO.Professor;
import java.util.List;

/**
 *
 * @author Andres Felipe Bernal
 */
public class ProfessorService {
  private ProfessorDAO dao = null;
    
    public ProfessorService(){
      this.dao = new ProfessorDAO();
    }
    
    public List<Professor> findAll() {
      return this.dao.findAll();
    }
    
    public boolean insert(Professor t){
      return this.dao.insert(t);
    }   
}
