package com.mycompany.modelos;

public class Muebles {
    private int id;
    private String nombre;
    private String tipo;
    private String material;
    private String color;
    private String dimensiones;
    private String peso;
    private String precio;
    private int stock;
    private int disponibles;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDimenciones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getDimenciones() {
        return dimensiones;
    }

    public String getPeso() {
        return peso;
    }

    public String getPrecio() {
        return precio;
    }
    
    public int getStock() {
        return stock;
    }

    public int getDisponibles() {
        return disponibles;
    }
}
