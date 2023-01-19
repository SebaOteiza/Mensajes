package com.oregon.mensajes;

//cada mensaje se considera un objeto
public class Mensaje {

      private int id;
      private String mensaje;
      private String autor;
      private String fecha;
      
      //CONSTRUCTORES

    public Mensaje() {
    }
      
    //constructor solo con ID en caso de querer eliminar un mensaje

    public Mensaje(int id) {
        this.id = id;
    }
    
    //constructor para insertar datos

    public Mensaje(String mensaje, String autor) {
        this.mensaje = mensaje;
        this.autor = autor;
    }
    
    //para actualizar un mensaje

    public Mensaje(int id, String mensaje, String autor) {
        this.id = id;
        this.mensaje = mensaje;
        this.autor = autor;
    }
    
    //para construir un mensaje

    public Mensaje(int id, String mensaje, String autor, String fecha) {
        this.id = id;
        this.mensaje = mensaje;
        this.autor = autor;
        this.fecha = fecha;
    }
    
    //GETTERS AND SETTERS PARA ACCEDER O RECUPERAR LOS DATOS DE CADA MENSAJE o los atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    //TOSTRING para saber el estado de ese objeto

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mensaje{");
        sb.append("id=").append(id);
        sb.append(", mensaje=").append(mensaje);
        sb.append(", autor=").append(autor);
        sb.append(", fecha=").append(fecha);
        sb.append('}');
        return sb.toString();
    }
      
      
}
