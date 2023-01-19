

package com.oregon.mensajes;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Conexion.getConexion();
        System.out.println("Conexion exitosa");
    }

}
