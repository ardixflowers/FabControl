package com.mycompany.modelos;

public class Usuarios {
    private int id;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String domicilio;
    private String tel;
    private int sanctions;
    private int sanc_money;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setSanctions(int sanctions) {
        this.sanctions = sanctions;
    }

    public void setSanc_money(int sanc_money) {
        this.sanc_money = sanc_money;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTel() {
        return tel;
    }

    public int getSanctions() {
        return sanctions;
    }

    public int getSanc_money() {
        return sanc_money;
    }
}
