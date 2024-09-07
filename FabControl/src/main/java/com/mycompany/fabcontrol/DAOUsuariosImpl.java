package com.mycompany.fabcontrol;

import com.mycompany.conexion.Conexion;
import com.mycompany.modelos.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.interfaces.DAOUsuarios;

public class DAOUsuariosImpl extends Conexion implements DAOUsuarios {

    @Override
    public void registrar(Usuarios usuarios) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO usuarios(nombre, apellido_paterno, apellido_materno, domicilio, tel) VALUES(?,?,?,?,?);");
            st.setString(1, usuarios.getNombre());
            st.setString(2, usuarios.getApellido_p());
            st.setString(3, usuarios.getApellido_m());
            st.setString(4, usuarios.getDomicilio());
            st.setString(5, usuarios.getTel());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Usuarios usuarios) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE usuarios SET nombre = ?, apellido_paterno = ?, apellido_materno = ?, domicilio = ?, tel = ? WHERE id = ?");
            st.setString(1, usuarios.getNombre());
            st.setString(2, usuarios.getApellido_p());
            st.setString(3, usuarios.getApellido_m());
            st.setString(4, usuarios.getDomicilio());
            st.setString(5, usuarios.getTel());
            st.setInt(6, usuarios.getId());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int id_usuario) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM usuarios WHERE id = ?;");
            st.setInt(1, id_usuario);
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Usuarios> listar(String nombre) throws Exception {
        List<Usuarios> lista = null;
        try {
            this.Conectar();
            String Query = nombre.isEmpty() ? "SELECT * FROM usuarios;" : "SELECT * FROM usuarios WHERE nombre LIKE '%" + nombre + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Usuarios usuarios = new Usuarios();
                usuarios.setId(rs.getInt("id"));
                usuarios.setNombre(rs.getString("nombre"));
                usuarios.setApellido_p(rs.getString("apellido_paterno"));
                usuarios.setApellido_m(rs.getString("apellido_materno"));
                usuarios.setDomicilio(rs.getString("domicilio"));
                usuarios.setTel(rs.getString("tel"));
                usuarios.setSanctions(rs.getInt("sanctions"));
                usuarios.setSanc_money(rs.getInt("sanc_money"));
                lista.add(usuarios);
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public Usuarios getUsuariosId(int id_usuario) throws Exception {
        Usuarios usuarios = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM usuarios WHERE id = ? LIMIT 1;");
            st.setInt(1, id_usuario);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                usuarios = new Usuarios();
                usuarios.setId(rs.getInt("id"));
                usuarios.setNombre(rs.getString("nombre"));
                usuarios.setApellido_p(rs.getString("apellido_paterno"));
                usuarios.setApellido_m(rs.getString("apellido_materno"));
                usuarios.setDomicilio(rs.getString("domicilio"));
                usuarios.setTel(rs.getString("tel"));
                usuarios.setSanctions(rs.getInt("sanctions"));
                usuarios.setSanc_money(rs.getInt("sanc_money"));
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return usuarios;
    }

    @Override
    public void sancionar(Usuarios usuarios) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE usuarios SET sanctions = ?, sanc_money = ? WHERE id = ?");
            st.setInt(1, usuarios.getSanctions());
            st.setInt(2, usuarios.getSanc_money());
            st.setInt(3, usuarios.getId());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }
}