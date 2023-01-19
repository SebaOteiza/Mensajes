
package com.oregon.mensajes;

import static com.oregon.mensajes.Conexion.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//DAO significa objeto de acceso a datos/ DATA ACCES OBJECT, sirve para manejar el acceso de datos a la DB
public class MensajeDao {
    
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
    

}
