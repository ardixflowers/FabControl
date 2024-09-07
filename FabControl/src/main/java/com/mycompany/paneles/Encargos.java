package com.mycompany.paneles;

import com.mycompany.fabcontrol.DAOMueblesImpl;
import com.mycompany.fabcontrol.DAOEncargosImpl;
import com.mycompany.fabcontrol.DAOUsuariosImpl;
import com.mycompany.utilidades.Utilidades;
import java.awt.Color;
import com.mycompany.interfaces.DAOUsuarios;
import com.mycompany.interfaces.DAOMuebles;
import com.mycompany.interfaces.DAOEncargos;

public class Encargos extends javax.swing.JPanel {

    public Encargos() {
        initComponents();
        InitStyles();
    }

    private void InitStyles() {
        folioLbl.putClientProperty("FlatLaf.styleClass", "large");
        folioLbl.setForeground(Color.black);
        muebleLbl.putClientProperty("FlatLaf.styleClass", "large");
        muebleLbl.setForeground(Color.black);
        cantidadLbl.putClientProperty("FlatLaf.styleClass", "large");
        cantidadLbl.setForeground(Color.black);
        folioTxt.putClientProperty("JTextField.placeholderText", "Ingrese el folio del usuario.");
        muebleTxt.putClientProperty("JTextField.placeholderText", "Ingrese el ID del mueble a encargar.");
        cantidadTxt.putClientProperty("JTextField.placeholderText", "Ingrese la cantidadidad de muebles a encargar.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        folioLbl = new javax.swing.JLabel();
        folioTxt = new javax.swing.JTextField();
        muebleLbl = new javax.swing.JLabel();
        muebleTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        cantidadTxt = new javax.swing.JTextField();
        cantidadLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        folioLbl.setText("Folio Usuario");

        folioTxt.setToolTipText("");

        muebleLbl.setText("Mueble ID");

        button.setBackground(new java.awt.Color(102, 102, 102));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Encargar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        cantidadLbl.setText("Cantidad del mueble");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(muebleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantidadLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(229, 229, 229))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(folioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(205, 205, 205))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(muebleTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(folioTxt))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(folioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(muebleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(muebleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cantidadLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(cantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String folio = folioTxt.getText();
        String id_mueble = muebleTxt.getText();
        String cantidad = cantidadTxt.getText();

        // Validaciones para los campos
        if (folio.isEmpty() || id_mueble.isEmpty() || cantidad.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (!Utilidades.isNumeric(folio) || !Utilidades.isNumeric(id_mueble) || !Utilidades.isNumeric(cantidad)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (Integer.parseInt(folio) <= 0 || Integer.parseInt(id_mueble) <= 0 || Integer.parseInt(cantidad) <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos deben ser mayor que 0. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        }

        try {
            DAOUsuarios daoUsuarios = new DAOUsuariosImpl();
            
            // Validamos existencia del usuario
            com.mycompany.modelos.Usuarios currentUsuario = daoUsuarios.getUsuariosId(Integer.parseInt(folio));
            if (currentUsuario == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún usuario con ese folio. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                folioTxt.requestFocus();
                return;
            }
            
            DAOMuebles daoMuebles = new DAOMueblesImpl();
            
            // Validamos existencia del mueble
            com.mycompany.modelos.Muebles currentMueble = daoMuebles.getMueblesId(Integer.parseInt(id_mueble));
            if (currentMueble == null){
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún mueble con ese ID. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                muebleTxt.requestFocus();
                return;
            }
            // Validamos disponibilidad del mueble.
            else if (currentMueble.getDisponibles() < Integer.parseInt(cantidad)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ya no hay más muebles disponibles con esa ID para entregar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                cantidadTxt.requestFocus();
                return;
            }
            
            DAOEncargos daoEncargos = new DAOEncargosImpl();
            
            // Validamos que el usuario no tenga ya ese mueble entregado.
            com.mycompany.modelos.Encargos currentEncargo = daoEncargos.getEncargos(currentUsuario, currentMueble);
            if (currentEncargo != null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Esa persona ya cuenta con un encargos del mismo mueble. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                muebleTxt.requestFocus();
                return;
            }

            // Todo OK: Encargos mueble.
            com.mycompany.modelos.Encargos encargos = new com.mycompany.modelos.Encargos();
            encargos.setId_mueble(currentMueble.getId());
            encargos.setId_usuario(currentUsuario.getId());
            encargos.setCantidad(Integer.parseInt(cantidad));
            encargos.setDate_out(Utilidades.getFechaActual());
            daoEncargos.registrar(encargos);
            
            // Modificamos el mueble restandole cantidad en disponibilidad.
            currentMueble.setDisponibles(currentMueble.getDisponibles() - Integer.parseInt(cantidad));
            daoMuebles.modificar(currentMueble);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Mueble ID: " + currentMueble.getId() + " encargos exitosamente a " + currentUsuario.getNombre() + ".\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            folioTxt.setText("");
            muebleTxt.setText("");
            cantidadTxt.setText("");
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al encargar el mueble. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel cantidadLbl;
    private javax.swing.JTextField cantidadTxt;
    private javax.swing.JLabel folioLbl;
    private javax.swing.JTextField folioTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel muebleLbl;
    private javax.swing.JTextField muebleTxt;
    // End of variables declaration//GEN-END:variables
}
