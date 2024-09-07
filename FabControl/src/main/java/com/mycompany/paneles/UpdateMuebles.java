package com.mycompany.paneles;

import com.mycompany.fabcontrol.DAOMueblesImpl;
import com.mycompany.utilidades.Utilidades;
import java.awt.Color;
import com.mycompany.interfaces.DAOMuebles;

public class UpdateMuebles extends javax.swing.JPanel {

    boolean enEdicion = false;
    com.mycompany.modelos.Muebles edicionMueble;

    public UpdateMuebles() {
        initComponents();
        InitStyles();
    }

    public UpdateMuebles(com.mycompany.modelos.Muebles mueble) {
        initComponents();
        enEdicion = true;
        edicionMueble = mueble;
        InitStyles();
    }

    private void InitStyles() {
        titulo.putClientProperty("FlatLaf.styleClass", "h1");
        titulo.setForeground(Color.black);
        nombreTxt.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del mueble");
        tipoTxt.putClientProperty("JTextField.placeholderText", "Ingrese el tipo de mueble.");
        materialTxt.putClientProperty("JTextField.placeholderText", "Ingrese el material del mueble.");
        colorTxt.putClientProperty("JTextField.placeholderText", "Ingrese el color del mueble.");
        dimensionesTxt.putClientProperty("JTextField.placeholderText", "0x0x0cm.");
        pesoTxt.putClientProperty("JTextField.placeholderText", "0kg");
        precioTxt.putClientProperty("JTextField.placeholderText", "Ingrese el precio del mueble.");
        stockTxt.putClientProperty("JTextField.placeholderText", "Ingrese el stock total del mueble.");
        disponiblesTxt.putClientProperty("JTextField.placeholderText", "Ingrese el número de muebles disponibles.");

        if (enEdicion) {
            titulo.setText("Editar mueble");
            button.setText("Guardar");

            if (edicionMueble != null) {
                nombreTxt.setText(edicionMueble.getNombre());
                tipoTxt.setText(edicionMueble.getTipo());
                materialTxt.setText(edicionMueble.getMaterial());
                colorTxt.setText(edicionMueble.getColor());
                dimensionesTxt.setText(edicionMueble.getDimenciones());
                pesoTxt.setText(edicionMueble.getPeso());
                precioTxt.setText(edicionMueble.getPrecio());
                stockTxt.setText(edicionMueble.getStock() + "");
                disponiblesTxt.setText(edicionMueble.getDisponibles() + "");
            }
        }
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
        titulo = new javax.swing.JLabel();
        nombreLbl = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        tipoLbl = new javax.swing.JLabel();
        tipoTxt = new javax.swing.JTextField();
        materialLbl = new javax.swing.JLabel();
        materialTxt = new javax.swing.JTextField();
        colorLbl = new javax.swing.JLabel();
        colorTxt = new javax.swing.JTextField();
        dimensionesLbl = new javax.swing.JLabel();
        dimensionesTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pesoLbl = new javax.swing.JLabel();
        pesoTxt = new javax.swing.JTextField();
        precioLbl = new javax.swing.JLabel();
        precioTxt = new javax.swing.JTextField();
        stockLbl = new javax.swing.JLabel();
        stockTxt = new javax.swing.JTextField();
        disponiblesTxt = new javax.swing.JTextField();
        disponiblesLbl = new javax.swing.JLabel();
        button = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setText("Subir nuevo Mueble");

        nombreLbl.setText("Nombre");

        tipoLbl.setText("Tipo");

        materialLbl.setText("Material");

        colorLbl.setText("Color");

        dimensionesLbl.setText("Dimensiones");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        pesoLbl.setText("Peso");

        pesoTxt.setToolTipText("");

        precioLbl.setText("Precio");

        precioTxt.setToolTipText("");

        stockLbl.setText("Stock");
        stockLbl.setToolTipText("");

        stockTxt.setToolTipText("");

        disponiblesTxt.setToolTipText("");

        disponiblesLbl.setText("Disponibles");

        button.setBackground(new java.awt.Color(102, 102, 102));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Subir");
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
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorTxt)
                            .addComponent(materialTxt)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(materialLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(233, 233, 233))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(colorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(213, 213, 213))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(nombreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                .addGap(234, 234, 234))
                            .addComponent(nombreTxt)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(tipoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(161, 161, 161))
                            .addComponent(tipoTxt))
                        .addGap(68, 68, 68)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(dimensionesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dimensionesTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pesoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addComponent(pesoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(228, 228, 228))
                                    .addComponent(precioTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addComponent(precioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(223, 223, 223))
                                    .addComponent(button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(stockTxt)
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(stockLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                                .addGap(94, 94, 94)))
                                        .addGap(20, 20, 20)
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(disponiblesLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                                .addGap(67, 67, 67))
                                            .addComponent(disponiblesTxt))))
                                .addGap(72, 72, 72))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(553, 553, 553))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(nombreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tipoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(materialLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(materialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(colorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(colorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(dimensionesLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dimensionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stockLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(disponiblesLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stockTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disponiblesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
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
        String nombre = nombreTxt.getText();
        String tipo = tipoTxt.getText();
        String material = materialTxt.getText();
        String color = colorTxt.getText();
        String dimensiones = dimensionesTxt.getText();
        String peso = pesoTxt.getText();
        String precio = precioTxt.getText();
        String stock = stockTxt.getText();
        String disponibles = disponiblesTxt.getText();

        // Validaciones para los campos
        if (nombre.isEmpty() || tipo.isEmpty() || material.isEmpty() || color.isEmpty() || dimensiones.isEmpty()
                || peso.isEmpty() || precio.isEmpty() || stock.isEmpty() || disponibles.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            nombreTxt.requestFocus();
            return;
        } else if (!Utilidades.isNumeric(stock) || !Utilidades.isNumeric(disponibles)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Stock y Disponibles deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            nombreTxt.requestFocus();
            return;
        }

        com.mycompany.modelos.Muebles mueble = enEdicion ? edicionMueble : new com.mycompany.modelos.Muebles();
        mueble.setNombre(nombre);
        mueble.setTipo(tipo);
        mueble.setMaterial(material);
        mueble.setColor(color);
        mueble.setDimenciones(dimensiones);
        mueble.setPeso(peso);
        mueble.setPrecio(precio);
        mueble.setStock(Integer.parseInt(stock));
        mueble.setDisponibles(Integer.parseInt(disponibles));

        try {
            DAOMuebles dao = new DAOMueblesImpl();

            if (!enEdicion) {
                dao.registrar(mueble);
            } else {
                dao.modificar(mueble);
            }

            String successMsg = enEdicion ? "modificado" : "registrado";

            javax.swing.JOptionPane.showMessageDialog(this, "Mueble " + successMsg + " exitosamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            if (!enEdicion) {
                nombreTxt.setText("");
                tipoTxt.setText("");
                materialTxt.setText("");
                colorTxt.setText("");
                dimensionesTxt.setText("");
                pesoTxt.setText("");
                precioTxt.setText("");
                stockTxt.setText("");
                disponiblesTxt.setText("");
            }
        } catch (Exception e) {
            String errorMsg = enEdicion ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el mueble. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel colorLbl;
    private javax.swing.JTextField colorTxt;
    private javax.swing.JLabel dimensionesLbl;
    private javax.swing.JTextField dimensionesTxt;
    private javax.swing.JLabel disponiblesLbl;
    private javax.swing.JTextField disponiblesTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel materialLbl;
    private javax.swing.JTextField materialTxt;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JLabel pesoLbl;
    private javax.swing.JTextField pesoTxt;
    private javax.swing.JLabel precioLbl;
    private javax.swing.JTextField precioTxt;
    private javax.swing.JLabel stockLbl;
    private javax.swing.JTextField stockTxt;
    private javax.swing.JLabel tipoLbl;
    private javax.swing.JTextField tipoTxt;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}