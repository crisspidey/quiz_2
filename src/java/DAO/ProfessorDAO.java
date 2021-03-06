/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.Professor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G40
 */
public class ProfessorDAO implements IStudent<Professor>{

    @Override
    public List findAll() {
        List<Professor> profesores = null;
        String query = "SELECT * FROM Professor";
        Connection conexion = Conexion.getConnection();
        try {
            Statement st = conexion.createStatement();
	    ResultSet rs = st.executeQuery(query);
            String school = null;
            String department = null;
            int id = 0;
            String name = null;
            Date hirigDate = null;
            while(rs.next()){
                if(profesores==null){
                    profesores = new ArrayList<Professor>();
                }
                id = rs.getInt("id");
                school = rs.getString("school");
                name = rs.getString("name");
                department = rs.getString("department");
                hirigDate = rs.getDate("hirigDate");
                Professor registro = new Professor(100,school, department, hirigDate, id, name);
                profesores.add(registro);
            }
            st.close();
            } catch (Exception e) {
            System.out.println("Error al listar profesores.");
        }
        return profesores;
    }

    @Override
    public boolean insert(Professor t) {
        boolean resultado=false;
        Connection conexion = Conexion.getConnection();
        String query ="INSERT INTO Professor (type, school, department, salary, Employee_idEmployee)" + "VALUES(?,?,?,?,?)";
        PreparedStatement ps = null;
        String a = "fulll";
        try {
            ps=conexion.prepareStatement(query);
            ps.setString(1, a);
            ps.setString(2, t.getSchool());
            ps.setString(3, t.getDepartment());
            ps.setFloat(4, t.getSalary());
            ps.setInt(5, t.getId());
            resultado = ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado; 
    }

    @Override
    public boolean delete(Professor t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Professor t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }