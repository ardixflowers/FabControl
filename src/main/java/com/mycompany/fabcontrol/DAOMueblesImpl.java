package com.mycompany.fabcontrol;

import com.mycompany.conexion.Conexion;
import com.mycompany.modelos.Muebles;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.interfaces.DAOMuebles;

public class DAOMueblesImpl extends Conexion implements DAOMuebles {

    @Override
    public void registrar(Muebles muebles) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO muebles(nombre, tipo, material, color, dimensiones, peso, precio, stock, disponibles, encargados) VALUES(?,?,?,?,?,?,?,?,?,?);");
            st.setString(1, muebles.getNombre());
            st.setString(2, muebles.getTipo());
            st.setString(3, muebles.getMaterial());
            st.setString(4, muebles.getColor());
            st.setString(5, muebles.getDimenciones());
            st.setString(6, muebles.getPeso());
            st.setString(7, muebles.getPrecio());
            st.setInt(8, muebles.getStock());
            st.setInt(9, muebles.getDisponibles());
            st.setInt(10, muebles.getEncargados());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Muebles muebles) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE muebles SET nombre = ?, tipo = ?, material = ?, color = ?, dimensiones = ?, peso = ?, precio = ?, stock = ?, disponibles = ?, encargados = ? WHERE id = ?");
            st.setString(1, muebles.getNombre());
            st.setString(2, muebles.getTipo());
            st.setString(3, muebles.getMaterial());
            st.setString(4, muebles.getColor());
            st.setString(5, muebles.getDimenciones());
            st.setString(6, muebles.getPeso());
            st.setString(7, muebles.getPrecio());
            st.setInt(8, muebles.getStock());
            st.setInt(9, muebles.getDisponibles());
            st.setInt(10, muebles.getEncargados());
            st.setInt(11, muebles.getId());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int id_mueble) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM muebles WHERE id = ?;");
            st.setInt(1, id_mueble);
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Muebles> listar(String nombre) throws Exception {
        List<Muebles> lista = null;
        try {
            this.Conectar();
            String Query = nombre.isEmpty() ? "SELECT * FROM muebles;" : "SELECT * FROM muebles WHERE nombre LIKE '%" + nombre + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Muebles muebles = new Muebles();
                muebles.setId(rs.getInt("id"));
                muebles.setNombre(rs.getString("nombre"));
                muebles.setTipo(rs.getString("tipo"));
                muebles.setMaterial(rs.getString("material"));
                muebles.setColor(rs.getString("color"));
                muebles.setDimenciones(rs.getString("dimensiones"));
                muebles.setPeso(rs.getString("peso"));
                muebles.setPrecio(rs.getString("precio"));
                muebles.setStock(rs.getInt("stock"));
                muebles.setDisponibles(rs.getInt("disponibles"));
                muebles.setEncargados(rs.getInt("encargados"));
                lista.add(muebles);
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
    public Muebles getMueblesId(int id_mueble) throws Exception {
        Muebles muebles = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM muebles WHERE id = ? LIMIT 1;");
            st.setInt(1, id_mueble);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                muebles = new Muebles();
                muebles.setId(rs.getInt("id"));
                muebles.setNombre(rs.getString("nombre"));
                muebles.setTipo(rs.getString("tipo"));
                muebles.setMaterial(rs.getString("material"));
                muebles.setColor(rs.getString("color"));
                muebles.setDimenciones(rs.getString("dimensiones"));
                muebles.setPeso(rs.getString("peso"));
                muebles.setPrecio(rs.getString("precio"));
                muebles.setStock(rs.getInt("stock"));
                muebles.setDisponibles(rs.getInt("disponibles"));
                muebles.setEncargados(rs.getInt("encargados"));
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return muebles;
    }   
}