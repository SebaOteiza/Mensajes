<%-- 
    Document   : eliminar
    Created on : 20-01-2023, 13:05:34
    Author     : Caos
--%>

<%@page import="com.oregon.mensajes.MensajeDao"%>
<%@page import="com.oregon.mensajes.Mensaje"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

            String id = request.getParameter("id");
            Mensaje mensaje = new Mensaje(Integer.valueOf(id));
            MensajeDao mensajeDao = new MensajeDao();
            mensajeDao.eliminar(mensaje);
            request.getRequestDispatcher("index.jsp").forward(request, response);


        %>
    </body>
</html>
