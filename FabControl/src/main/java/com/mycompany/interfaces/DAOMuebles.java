package com.mycompany.interfaces;

import com.mycompany.modelos.Muebles;
import java.util.List;

public interface DAOMuebles {
    public void registrar(Muebles muebles) throws Exception;
    public void modificar(Muebles muebles) throws Exception;
    public void eliminar(int muebleId) throws Exception;
    public List<Muebles> listar(String titulo) throws Exception;
    public Muebles getMueblesId(int id_mueble) throws Exception;
}
