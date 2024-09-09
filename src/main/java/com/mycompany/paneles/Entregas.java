package com.mycompany.paneles;

import com.mycompany.fabcontrol.DAOMueblesImpl;
import com.mycompany.fabcontrol.DAOEncargosImpl;
import com.mycompany.fabcontrol.DAOUsuariosImpl;
import com.mycompany.utilidades.Utilidades;
import java.awt.Color;
import java.util.Date;
import com.mycompany.interfaces.DAOUsuarios;
import com.mycompany.interfaces.DAOMuebles;
import com.mycompany.interfaces.DAOEncargos;

public class Entregas extends javax.swing.JPanel {

    private final int MAX_DAYS_RETURN = 5;
    private final int COST_DAY_SANC = 10;
    
    public Entregas() {
        initComponents();
        InitStyles();
    }
    
    private void InitStyles() {
        titulo.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        titulo.setForeground(Color.black);
        folioLbl.putClientProperty("FlatLaf.styleClass", "large");
        folioLbl.setForeground(Color.black);
        muebleLbl.putClientProperty("FlatLaf.styleClass", "large");
        muebleLbl.setForeground(Color.black);
        folioTxt.putClientProperty("JTextField.placeholderText", "Ingrese el folio del usuario.");
        muebleTxt.putClientProperty("JTextField.placeholderText", "Ingrese el ID del Mueble a devolver.");
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
        titulo = new javax.swing.JLabel();
        folioLbl = new javax.swing.JLabel();
        folioTxt = new javax.swing.JTextField();
        muebleLbl = new javax.swing.JLabel();
        muebleTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        titulo.setText("Entrega del Mueble");

        folioLbl.setText("Folio Usuario");

        muebleLbl.setText("Mueble ID");

        button.setBackground(new java.awt.Color(102, 102, 102));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Entregar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(folioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(199, 199, 199))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(167, 167, 167))
                    .addComponent(folioTxt)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(muebleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(223, 223, 223))
                    .addComponent(muebleTxt)
                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(409, 409, 409))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63)
                        .addComponent(folioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(muebleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(muebleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
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
        String muebleId = muebleTxt.getText();

        // Validaciones para los campos
        if (folio.isEmpty() || muebleId.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (!Utilidades.isNumeric(folio) || !Utilidades.isNumeric(muebleId)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del mueble deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (Integer.parseInt(folio) <= 0 || Integer.parseInt(muebleId) <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del mueble deben ser mayor que 0. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
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
            com.mycompany.modelos.Muebles currentMueble = daoMuebles.getMueblesId(Integer.parseInt(muebleId));
            if (currentMueble == null){
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún mueble con ese ID. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                muebleTxt.requestFocus();
                return;
            }
            
            DAOEncargos daoEncargos = new DAOEncargosImpl();
            
            // Validamos que el usuario tenga ese mueble encargado.
            com.mycompany.modelos.Encargos currentEncargo = daoEncargos.getEncargos(currentUsuario, currentMueble);
            if (currentEncargo == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se ha podido encontrar el préstamo correspiendote a los datos ingresados. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                muebleTxt.requestFocus();
                return;
            }

            // Todo OK: Entregamos el mueble.
            currentEncargo.setDate_return(Utilidades.getFechaActual());
            daoEncargos.modificar(currentEncargo);
            
            // Modificamos el mueble sumandole 1 en disponibilidad.
            currentMueble.setDisponibles(currentMueble.getDisponibles() - currentEncargo.getCantidad());
            currentMueble.setEncargados(currentMueble.getEncargados() - currentEncargo.getCantidad());
            daoMuebles.modificar(currentMueble);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Mueble ID: " + currentMueble.getId() + " devuelto exitosamente por " + currentUsuario.getNombre() + ".\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            folioTxt.setText("");
            muebleTxt.setText("");
            
            // Verificamos sanciones
            int days = Utilidades.diferenciasDeFechas(Utilidades.stringToDate(currentEncargo.getDate_out()), new Date());
            if (days > MAX_DAYS_RETURN) {
                int daysDelayed = days - MAX_DAYS_RETURN;
                int sancMoney = daysDelayed * COST_DAY_SANC;
                
                // Aumentamos sanción del usuario y en dinero.
                currentUsuario.setSanctions(currentUsuario.getSanctions() + 1);
                currentUsuario.setSanc_money(currentUsuario.getSanc_money() + sancMoney);
                daoUsuarios.sancionar(currentUsuario);
                javax.swing.JOptionPane.showMessageDialog(this, "¡USUARIO SANCIONADO POR ENTREGA A DESTIEMPO! ($" + sancMoney + ") \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al entregar el mueble. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel folioLbl;
    private javax.swing.JTextField folioTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel muebleLbl;
    private javax.swing.JTextField muebleTxt;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
