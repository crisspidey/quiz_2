/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.Person;
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
public class PersonDAO implements IStudent<Person>{

    @Override
    public List findAll() {
        List<Person> personas = null;
        String query = "SELECT * FROM Person";
        Connection conexion = Conexion.getConnection();
        try {
            Statement st = conexion.createStatement();
	    ResultSet rs = st.executeQuery(query);
            int id = 0;
            String name = null;
            while(rs.next()){
                if(personas==null){
                    personas = new ArrayList<Person>();
                }
                id = rs.getInt("id");
                name = rs.getString("name");
                Person registro = new Person(id, name);
                personas.add(registro);
            }
            st.close();
            } catch (Exception e) {
            System.out.println("Error al listar personas.");
        }
        return personas;
    }

    @Override
    public boolean insert(Person t) {
        boolean resultado=false;
        Connection conexion = Conexion.getConnection();
        String query ="INSERT INTO Person (id, name)" + "VALUES(?,?)";
        PreparedStatement ps = null;
        try {
            ps.setInt(1, t.getId());
            ps.setString(2, t.getName());
            resultado = ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public boolean delete(Person t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Person t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
