package com.mycompany.fabcontrol;

import com.mycompany.conexion.Conexion;
import com.mycompany.modelos.Muebles;
import com.mycompany.modelos.Encargos;
import com.mycompany.modelos.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.interfaces.DAOEncargos;

public class DAOEncargosImpl extends Conexion implements DAOEncargos {

    @Override
    public void registrar(Encargos encargos) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO encargos(id_usuario, id_mueble, cantidad, date_out) VALUES(?,?,?,?);");
            st.setInt(1, encargos.getId_usuario());
            st.setInt(2, encargos.getId_mueble());
            st.setInt(3, encargos.getCantidad());
            st.setString(4, encargos.getDate_out());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Encargos encargos) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE encargos SET id_usuario = ?, id_mueble = ?, cantidad = ?, date_out = ?, date_return = ? WHERE id = ?");
            st.setInt(1, encargos.getId_usuario());
            st.setInt(2, encargos.getId_mueble());
            st.setInt(3, encargos.getCantidad());
            st.setString(4, encargos.getDate_out());
            st.setString(5, encargos.getDate_return());
            st.setInt(6, encargos.getId());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public Encargos getEncargos(Usuarios usuarios, Muebles muebles) throws Exception {
        Encargos encargos = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM encargos WHERE id_usuario = ? AND id_mueble = ? AND date_return IS NULL ORDER BY id DESC LIMIT 1");
            st.setInt(1, usuarios.getId());
            st.setInt(2, muebles.getId());
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                encargos = new Encargos();
                encargos.setId(rs.getInt("id"));
                encargos.setId_usuario(rs.getInt("id_usuario"));
                encargos.setId_mueble(rs.getInt("id_mueble"));
                encargos.setCantidad(rs.getInt("cantidad"));
                encargos.setDate_out(rs.getString("date_out"));
                encargos.setDate_return(rs.getString("date_return"));
            }
            
            st.close();
            rs.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        
        return encargos;
    }
    
    @Override
    public List<Encargos> listar() throws Exception {
        List<Encargos> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM encargos ORDER BY id DESC");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Encargos encargos = new Encargos();
                encargos.setId(rs.getInt("id"));
                encargos.setId_usuario(rs.getInt("id_usuario"));
                encargos.setId_mueble(rs.getInt("id_mueble"));
                encargos.setCantidad(rs.getInt("cantidad"));
                encargos.setDate_out(rs.getString("date_out"));
                encargos.setDate_return(rs.getString("date_return"));
                lista.add(encargos);
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

}
