

package com.oregon.mensajes;

import java.sql.*;

public class Conexion {
    
    //crear la conexión
    private static final String URL ="jdbc:mysql://localhost/mensajes_bd?serverTimezone=UTC";
    private static final String USER="root";
    private static final String PASS="seba12345OTEIZA";

    //metodo para devolver la conexion a la BD
    
    public static Connection getConexion() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver"); //este es el driver que estamos ocupando para la conexión a la db
        return DriverManager.getConnection(URL,USER,PASS);
        
    }
    
    //metodos para que cierre todos los flujos que vamos a abrir al momento de conectar
    
    public static void cerrar(ResultSet rs) throws SQLException{
        rs.close();
        
    }
    
    public static void cerrar(PreparedStatement ps) throws SQLException{
        ps.close();
    }
    
    public static void cerrar(Connection conn) throws SQLException{
        conn.close();
        
    }
}
