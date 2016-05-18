/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import DAO.IStudent;
import DAO.ProfessorDao;
import DAO.StudentDAO;
import VO.Student;
import java.util.List;

/**
 *
 * @author Andres Felipe Bernal
 */
public class StudentService {
         private StudentDAO dao = null;
    
    public StudentService(StudentDAO dao ){
      this.dao = dao;
    }
    
    public List<Student> findAll() {
      return this.dao.findAll();
    }
    
    public boolean insert(Student t){
      return this.dao.insert(t);
    } 
}
