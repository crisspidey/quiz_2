<%-- 
    Document   : salario
    Created on : 16-may-2016, 23:01:50
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
                            <h3 class="panel-title">Salario a Pagar</h3>
                        </div>
                        <div class="panel-body">
                            <form role="form" method="post" action="EmpleadoControlador">
                                                <input type="hidden" name="action" value="salario" />
                                                <div class="form-group">
                                                    <label>Salario a Pagar: </label>
                                                    <label>100 pesos</label>                                                    
                                                </div>       
                                            </form>
                        </div>
                        <a href="index.jsp" class="btn btn-lg btn-primary btn-block">Menu </a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
