package com.mycompany.modelos;

public class Encargos {
    private int id;
    private int id_usuario;
    private int id_mueble;
    private int cantidad;
    private String date_out;
    private String date_return;

    public void setId(int id) {
        this.id = id;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId_mueble(int id_mueble) {
        this.id_mueble = id_mueble;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDate_out(String date_out) {
        this.date_out = date_out;
    }

    public void setDate_return(String date_return) {
        this.date_return = date_return;
    }

    public int getId() {
        return id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public int getId_mueble() {
        return id_mueble;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public String getDate_out() {
        return date_out;
    }

    public String getDate_return() {
        return date_return;
    }
}