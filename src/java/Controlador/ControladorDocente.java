/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Servicios.EmployeService;
import Servicios.PersonService;
import Servicios.ProfessorService;
import VO.FullTime;
import VO.PartialTime;
import VO.Person;
import VO.Professor;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres Rodriguez
 */
public class ControladorDocente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorDocente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorDocente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int     idDoc        = Integer.parseInt(request.getParameter("txtIDD"));
        String  nameDoc      = request.getParameter("txtNameD");
        String  dateHirinDoc = request.getParameter("txtDateD");
        String  depDoc       = request.getParameter("txtDepartmentD");
        String  schoDoc      = request.getParameter("txtSchoolD");
        String  timeDoc      = request.getParameter("txtTimeD");
        int     salario        = Integer.parseInt(request.getParameter("txtSalarioD"));
        Date hd = new Date(1);           
       
        Professor profe = new Professor(salario,schoDoc,depDoc, hd,idDoc,nameDoc);
        ProfessorService profeServicio = new ProfessorService();
        PersonService profeservice2 = new PersonService();
        //profeservice2.insert(new Person(profe.getId(),profe.getName()));
        //profeservice2.insert(profe);
        profeServicio.insert(profe);
        
        response.sendRedirect("index.jsp?mensaje = Docente insertado OK");        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
