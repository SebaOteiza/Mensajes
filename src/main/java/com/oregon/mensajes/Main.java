

package com.oregon.mensajes;

import java.sql.SQLException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       // Conexion.getConexion();
      //  System.out.println("Conexion exitosa");
      
      //objeto de la clase DAO
      MensajeDao mensajeDao = new MensajeDao();
      
      //crear el objeto
      Mensaje msm = new Mensaje("Hola desde Main", "Main");
      
      //para insertar ese objeto
      int registro = mensajeDao.insertar(msm);
        System.out.println("Se inserto "+ registro+ " registro");
      
      
      
        List<Mensaje> mensajes = mensajeDao.selecionar();
        
        
        //recorrer la lista mensajes
        for(Mensaje mensaje : mensajes){
            System.out.println(mensaje);
        }
        
    }

}
