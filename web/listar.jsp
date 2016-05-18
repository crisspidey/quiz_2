<%-- 
    Document   : lista
    Created on : 16-may-2016, 20:37:15
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
           <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <meta http-equiv="X-UA-Compatible" content="IE=edge">
           <meta name="viewport" content="width=device-width, initial-scale=1">
           <meta name="description" content="">
           <meta name="author" content="">

           <title>Empleados</title>

           <!-- Bootstrap Core CSS -->
           <link href="css/bootstrap.min.css" rel="stylesheet">

           <!-- MetisMenu CSS -->
           <link href="css/metisMenu.min.css" rel="stylesheet">

           <!-- Custom CSS -->
           <link href="css/sb-admin-2.css" rel="stylesheet">

           <!-- Custom Fonts -->
           <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">     
           
           <link href="css/dataTables.bootstrap.css" rel="stylesheet">
    </head>
    <body>
        <!-- Page Content -->
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">Lista de Empleados</h1>
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                    <!-- /.row -->
                    
                    
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    Caracteristicas del Empleado
                                </div>
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            
                                            
                                            
                                    <div class="dataTable_wrapper">
                                        <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                            <thead>
                                                <tr>
                                                    <th>Id</th>
                                                    <th>Nombre</th>
                                                    <th>Departamento</th>
                                                    <th>Tipo</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    /*List<Employee> listE = EmployeeControlador.listaEmployee();
                                                    for (int i=0;i<listE.size();i++)
                                                    {                                                        
                                                            out.println("<tr>");
                                                            out.println("<td>" + listE.get(i).getId_Employee());
                                                            out.println("<td>" + listE.get(i).getNombre_Employee());
                                                            out.println("<td>" + listE.get(i).getDepartment_Employee());
                                                            out.println("<td>" + listE.get(i).getType_Employe());
                                                            out.println("</tr>");                                                                                                                                                                            
                                                    }*/
                                                    %>                                                                                                                                 
                                            </tbody>
                                        </table>
                                    </div>
                                            
                                            
                                            
                                            
                                            
                                            
                                        </div>
                                        <!-- /.col-lg-6 (nested) -->                                                                                                                                                                
                                    </div>
                                    <!-- /.row (nested) -->
                                </div>
                                <!-- /.panel-body -->
                            </div>
                            <!-- /.panel -->
                             <a href="index.jsp" class="btn btn-lg btn-primary btn-block">Menu </a>
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                       
                </div>
                <!-- /.container-fluid -->


        <!-- jQuery -->
        <script src="js/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="js/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="js/sb-admin-2.js"></script>
        
        <script src="js/jquery.dataTables.min.js"></script>
        
        <script src="js/dataTables.bootstrap.min.js"></script>
 
    </body>
</html>