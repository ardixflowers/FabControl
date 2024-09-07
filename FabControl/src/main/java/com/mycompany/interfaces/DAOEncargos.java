package com.mycompany.interfaces;

import com.mycompany.modelos.Muebles;
import com.mycompany.modelos.Encargos;
import com.mycompany.modelos.Usuarios;
import java.util.List;

public interface DAOEncargos {
    public void registrar(Encargos encargos) throws Exception;
    public void modificar(Encargos encargos) throws Exception;
    public Encargos getEncargos(Usuarios usuarios, Muebles muebles) throws Exception;
    // public void eliminar(Encargos usuarios) throws Exception;
    public List<Encargos> listar() throws Exception;
}
