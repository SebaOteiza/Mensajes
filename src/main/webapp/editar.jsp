<%-- 
    Document   : editar
    Created on : 20-01-2023, 12:20:18
    Author     : Caos
--%>

<%@page import="com.oregon.mensajes.Mensaje"%>
<%@page import="com.oregon.mensajes.MensajeDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Mensaje</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" 
              rel="stylesheet" 
              integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" 
              crossorigin="anonymous">
    </head>
    <body>
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="editar.jsp" method="POST">
                    <div class="modal-header">
                        <h5 class="modal-title"> Editar Mensaje </h5>
                    </div>
                    <div class="modal-body">

                        <div class="mb-3">
                            <input type="hidden" name="id"  value="<%=request.getParameter("id")%>">
                            <label>Ingrese un mensaje</label>
                            <textarea class="form-control" name="mensaje" rows="3">
                                <%=request.getParameter("mensaje")%>
                            </textarea>
                        </div>
                        <div class="mb-3">
                            <label>Autor</label>
                            <input type="text" name="autor" class="form-control" value="<%=request.getParameter("autor")%>">
                        </div>

                    </div>
                    <div class="modal-footer">
                        <a href="index.jsp=" type="submit" class="btn btn-danger">Regresar</a>
                        <button type="submit" class="btn btn-primary" name="Guardar Cambios">Enviar</button>
                    </div>
                    <form>
                        </div>
                        </div>

                        <%
                            //objeto de mensaje DAO
                            MensajeDao mensajeDao = new MensajeDao();

                            //crear un objeto de tipo mensaje con los datos asignados en los campos de abajo
                            String id = request.getParameter("id");

                            if (request.getParameter("enviar") != null) {
                                Mensaje mensaje = new Mensaje(
                                        Integer.parseInt(id.trim()),
                                        request.getParameter("mensaje"),
                                        request.getParameter("autor"));

                                mensajeDao.editar(mensaje); 

                            }
                        %>
                        </body>
                        </html>
