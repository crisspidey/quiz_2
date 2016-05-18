<%-- 
    Document   : crearEstudiante
    Created on : 16-may-2016, 20:36:06
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

       <title>BIENVENIDO</title>

       <!-- Bootstrap Core CSS -->
       <link href="css/bootstrap.min.css" rel="stylesheet">

       <!-- MetisMenu CSS -->
       <link href="css/metisMenu.min.css" rel="stylesheet">

       <!-- Custom CSS -->
       <link href="css/sb-admin-2.css" rel="stylesheet">

       <!-- Custom Fonts -->
       <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
       
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="login-panel panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Crear Estudiante</h3>
                        </div>
                        <div class="panel-body">
                            <form role="form" method="post" action="EmpleadoControlador">
                                                                        <form role="form" method="post" action="EmpleadoControlador">
                                                <input type="hidden" name="action" value="crearEstudiante" />
                                                <div class="form-group">
                                                    <label>ID: </label>
                                                    <input  name="txtIDE" class="form-control">                                                    
                                                </div>                                                
                                                <div class="form-group">
                                                    <label>Name: </label>
                                                    <input  name="txtNombreE" class="form-control">                                                    
                                                </div>                                        
                                                <div class="form-group">
                                                    <label>hiringDate: </label>
                                                    <input name="txtDateE" class="form-control">                                                    
                                                </div>
                                                <div class="form-group">
                                                    <label>Department: </label>
                                                    <input name="txtDepartamentoE" class="form-control">                                                    
                                                </div>  
                                                <div class="form-group">
                                                    <label>Grad - Undergrad </label>
                                                    <input name="txtGradE" class="form-control">                                                    
                                                </div>
                                                
                                                <button type="submit" class="btn btn-success">Crear</button>
                                                <button type="reset" class="btn btn-default">Limpiar</button>
                                                
                                            </form>
                        </div>
                        <a href="index.jsp" class="btn btn-lg btn-primary btn-block">Menu </a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
