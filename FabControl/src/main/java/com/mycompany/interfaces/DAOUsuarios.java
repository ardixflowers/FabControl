package com.mycompany.interfaces;

import com.mycompany.modelos.Usuarios;
import java.util.List;

public interface DAOUsuarios {
    public void registrar(Usuarios usuarios) throws Exception;
    public void modificar(Usuarios usuarios) throws Exception;
    public void sancionar(Usuarios usuarios) throws Exception;
    public void eliminar(int usuarioId) throws Exception;
    public List<Usuarios> listar(String name) throws Exception;
    public Usuarios getUsuariosId(int usuarioId) throws Exception;
}