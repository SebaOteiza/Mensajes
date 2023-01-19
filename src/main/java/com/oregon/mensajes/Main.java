

package com.oregon.mensajes;

import java.sql.SQLException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       // Conexion.getConexion();
      //  System.out.println("Conexion exitosa");
      
      //objeto de la clase DAO
      MensajeDao mensajeDao = new MensajeDao();
      
        List<Mensaje> mensajes = mensajeDao.selecionar();
        
        //recorrer la lista mensajes
        
        for(Mensaje mensaje : mensajes){
            System.out.println(mensaje);
        }
        
    }

}
