package DAO;

import VO.Student;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements IStudent<Student>{

    @Override
    public List<Student> findAll() {
        List<Student> estudiantes = null;
        String query = "SELECT * FROM Student";
        Connection conexion = Conexion.getConnection();
        try {
            Statement st = conexion.createStatement();
	    ResultSet rs = st.executeQuery(query);
            String department = null;
            int id = 0;
            String name = null;
            Date hirigDate = null;
            while(rs.next()){
                if(estudiantes==null){
                    estudiantes = new ArrayList<Student>();
                }
                id = rs.getInt("id");
                department = rs.getString("department");
                hirigDate = rs.getDate("hirigDate");
                Student registro = new Student(department, hirigDate, id, name);
                estudiantes.add(registro);
            }
            st.close();
            } catch (Exception e) {
            System.out.println("Error al listar estudiantes.");
        }
        return estudiantes;
    }

    @Override
    public boolean insert(Student t) {
        boolean resultado=false;
        Connection conexion = Conexion.getConnection();
        String query ="INSERT INTO Student (department, hirigDate, id, name)" + "VALUES(?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps.setString(1, t.getDepartment());
            ps.setDate(2, t.getHirigDate());
            ps.setInt(3, t.getId());
            ps.setString(4, t.getName());
            resultado = ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;        
    }

    @Override
    public boolean delete(Student t) {
        return false;
    }

    @Override
    public boolean update(Student t) {
        return false;
    }
    
}
