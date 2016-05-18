<%-- 
    Document   : index
    Created on : 16-may-2016, 21:09:17
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
                            <h3 class="panel-title">Menu</h3>
                        </div>
                        <div class="panel-body">
                            <form role="form" method="post" action="LoginControlador">
                                <input type="hidden" name="action" value="login" />
                                <fieldset>
                                    <a href="crearDocente.jsp" class="btn btn-lg btn-success btn-block">Crear Docente</a>
                                    <a href="crearEstudiante.jsp" class="btn btn-lg btn-success btn-block">Crear Estudiante</a>
                                    <a href="listar.jsp" class="btn btn-lg btn-warning btn-block">Listar </a>
                                    <a href="salario.jsp" class="btn btn-lg btn-danger btn-block">Salario Total</a>
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

