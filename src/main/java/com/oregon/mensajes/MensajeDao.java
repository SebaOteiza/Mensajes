
package com.oregon.mensajes;

import static com.oregon.mensajes.Conexion.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//DAO significa objeto de acceso a datos/ DATA ACCES OBJECT, sirve para manejar el acceso de datos a la DB
public class MensajeDao {
    
    
    //SELECCIONAR LOS REGISTROS DE LA DB
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Mensaje mensaje;
    
    //recuperar los datos de la DB y los almacenaremos en una lista, lo que va a retornar será una lista
    
    public List<Mensaje> selecionar() throws ClassNotFoundException{
        String sql = "SELECT * FROM mensajes"; //query
        List<Mensaje> mensajes = new ArrayList<>();
        
        try {
            this.conn = getConexion();
            this.ps = this.conn.prepareStatement(sql);
            this.rs = this.ps.executeQuery();
            
            while(this.rs.next()){
                int id = this.rs.getInt("id_mensaje");
                String msn = this.rs.getString("mensaje");
                String autor = this.rs.getString("autor");
                String fecha = this.rs.getString("fecha");
                
                //objeto de tipo mensaje
                this.mensaje = new Mensaje(id, fecha, autor, fecha);
                mensajes.add(this.mensaje);
                
                //cada registro o cada mensaje vamos a convetirlo en un objeto  y ese objeto se almacena en una lista
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                cerrar(this.rs);
                cerrar(this.ps);
                cerrar(this.conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return mensajes; //sería la lista que vamos a retornar 
    }
    
    
    //INSERTAR DATOS 
    
     public int insertar(Mensaje mensaje) throws ClassNotFoundException{
        String sql = "INSERT INTO mensajes(mensaje, autor, fecha) VALUE(?,?, current_time())"; //query
       
        //para saber si realizó el insert
        int registros = 0;
        
        try {
            this.conn = getConexion(); //realizamos la conexion
            this.ps = this.conn.prepareStatement(sql);
            
            this.ps.setString(1, mensaje.getMensaje()); //con esto obtenemos el valor o el campo del mensaje
            this.ps.setString(2, mensaje.getAutor());
            registros = this.ps.executeUpdate(); //actualizar en la tabla
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                cerrar(this.ps);
                cerrar(this.conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return registros; 
    }

     
     //ACTUALIZAR REGISTROS 
     
      public int editar(Mensaje mensaje) throws ClassNotFoundException{
        String sql = "UPDATE mensajes SET mensaje=?, autor=? WHERE id_mensaje = ?"; //query
       
        //para saber si realizó el insert
        int registros = 0;
        
        try {
            this.conn = getConexion(); //realizamos la conexion
            this.ps = this.conn.prepareStatement(sql);
            
            this.ps.setString(1, mensaje.getMensaje()); //con esto obtenemos el valor o el campo del mensaje
            this.ps.setString(2, mensaje.getAutor());
            this.ps.setInt(3, mensaje.getId());
            registros = this.ps.executeUpdate(); //actualizar en la tabla
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                cerrar(this.ps);
                cerrar(this.conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return registros; 
    }
}
