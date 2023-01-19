<%-- 
    Document   : index
    Created on : 19-01-2023, 13:17:46
    Author     : Caos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" 
              rel="stylesheet" 
              integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" 
              crossorigin="anonymous">
    </head>
    <body>
        <h1>Por favor que esto funcione!</h1>


        <!-- Modal -->

        <div class="modal-dialog">
            <div class="modal-content">
                <form action="index.jsp" method="POST">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5"> Crear Mensaje</h1>
                    </div>
                    <div class="modal-body">

                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Ingrese un mensaje</label>
                            <textarea class="form-control" name="mensaje" rows="3"></textarea>
                        </div>
                        <div class="mb-3">
                            <label>Autor</label>
                            <input type="text" name="autor" class="form-control">
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary" name="enviar">Enviar</button>
                    </div>
                    <form>
                        </div>
                        </div>

                        <% 
                        
                        //recuperar los datos que están en la url
                        
                        String mensaje = request.getParameter("mensaje");
                        String autor = request.getParameter("autor");

                        
                        %>
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h1 class="modal-title fs-5"> Todos los mensajes </h1>
                                </div>
                                <div class="modal-body">
                                   
                                        <div class="card-body">
                                            <h5 class="card-title"><%=autor%></h5>

                                            <p class="card-text"> <%=mensaje%></p>
                                            <p class="blockquote-footer"><cite>19/01/2023 02:10</cite></p>
                                            <a href="#" class="card-link">Editar</a>
                                            <a href="#" class="card-link">Eliminar</a>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>





                        </body>
                        </html>
