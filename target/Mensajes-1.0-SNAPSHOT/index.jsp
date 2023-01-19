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
                <div class="modal-header">
                    <h1 class="modal-title fs-5"> Crear Mensaje</h1>
                </div>
                <div class="modal-body">
                    <form>
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Ingrese un mensaje</label>
                            <textarea class="form-control" name="mensaje" rows="3"></textarea>
                        </div>
                        <div class="mb-3">
                            <label>Autor</label>
                            <input type="text" name="mensaje" class="form-control">
                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="submit" class="btn btn-primary" name="enviar">Enviar</button>
                </div>
            </div>
        </div>

    </body>
</html>
