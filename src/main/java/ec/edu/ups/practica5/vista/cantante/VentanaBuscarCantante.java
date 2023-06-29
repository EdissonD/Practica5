/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica5.vista.cantante;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author HP
 */
public class VentanaBuscarCantante extends javax.swing.JInternalFrame {
    private ResourceBundle mensajes;
    /**
     * Creates new form VentanaBuscarCantante
     */
    public VentanaBuscarCantante() {
        initComponents();
    }
    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jlCodigo.setText(mensajes.getString("txtCodigoCantanteBuscar"));
        jlNombre.setText(mensajes.getString("txtNombreCantanteBuscar"));
        jlApellido.setText(mensajes.getString("txtApellidoCantanteBuscar"));
        jlEdad.setText(mensajes.getString("txtEdadCantanteBusar"));
        jlNacionalidad.setText(mensajes.getString("txtNacionalidadCantanteBuscar"));
        jlSalario.setText(mensajes.getString("txttxtSalarioCantanteBuscar"));
        jlSalario1.setText(mensajes.getString("txtNombreArtisticoCantanteBuscar"));
        jlSalario2.setText(mensajes.getString("txtGeneroMusicalCantanteBuscar"));
        jlSalario3.setText(mensajes.getString("txtSencillosCantanteBuscar"));
        jlSalario4.setText(mensajes.getString("txtConciertosCantanteBuscar"));
        jlSalario5.setText(mensajes.getString("txtGirasCantanteBuscar"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jlCodigo = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlEdad = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNacionalidad = new javax.swing.JLabel();
        jlSalario = new javax.swing.JLabel();
        jlSalario1 = new javax.swing.JLabel();
        jlSalario2 = new javax.swing.JLabel();
        jlSalario3 = new javax.swing.JLabel();
        jlSalario4 = new javax.swing.JLabel();
        jlSalario5 = new javax.swing.JLabel();
        txtCodigoCantanteBuscar = new javax.swing.JTextField();
        txtNombreCantanteBuscar = new javax.swing.JTextField();
        txtApellidoCantanteBuscar = new javax.swing.JTextField();
        txtEdadCantanteBuscar = new javax.swing.JTextField();
        txtNacionalidadCantanteBuscar = new javax.swing.JTextField();
        txtSalarioCantanteBuscar = new javax.swing.JTextField();
        txtNombreArtisticoCantanteBuscar = new javax.swing.JTextField();
        txtGeneroMusicalCantanteBuscar = new javax.swing.JTextField();
        txtSencillosCantanteBuscar = new javax.swing.JTextField();
        txtConciertosCantanteBuscar = new javax.swing.JTextField();
        txtGirasCantanteBuscar = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cantante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(153, 153, 153));

        btnAceptar.setText("Aceptar");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jlCodigo.setText("Código");

        jlNombre.setText("Nombre");

        jlEdad.setText("Edad");

        jlApellido.setText("Apellido");

        jlNacionalidad.setText("Nacionalidad");

        jlSalario.setText("Salario");

        jlSalario1.setText("Nombre Artístico");

        jlSalario2.setText("Genero Musical");

        jlSalario3.setText("Número de sencillos");

        jlSalario4.setText("Número de conciertos");

        jlSalario5.setText("Número de giras");

        txtCodigoCantanteBuscar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtCodigoCantanteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCantanteBuscarActionPerformed(evt);
            }
        });

        txtNombreCantanteBuscar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtNombreCantanteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCantanteBuscarActionPerformed(evt);
            }
        });

        txtApellidoCantanteBuscar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtApellidoCantanteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoCantanteBuscarActionPerformed(evt);
            }
        });

        txtEdadCantanteBuscar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtEdadCantanteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadCantanteBuscarActionPerformed(evt);
            }
        });

        txtNacionalidadCantanteBuscar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtNacionalidadCantanteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadCantanteBuscarActionPerformed(evt);
            }
        });

        txtSalarioCantanteBuscar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtSalarioCantanteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioCantanteBuscarActionPerformed(evt);
            }
        });

        txtNombreArtisticoCantanteBuscar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtNombreArtisticoCantanteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreArtisticoCantanteBuscarActionPerformed(evt);
            }
        });

        txtGeneroMusicalCantanteBuscar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtGeneroMusicalCantanteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroMusicalCantanteBuscarActionPerformed(evt);
            }
        });

        txtSencillosCantanteBuscar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtSencillosCantanteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSencillosCantanteBuscarActionPerformed(evt);
            }
        });

        txtConciertosCantanteBuscar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtConciertosCantanteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConciertosCantanteBuscarActionPerformed(evt);
            }
        });

        txtGirasCantanteBuscar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtGirasCantanteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGirasCantanteBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigo)
                            .addComponent(jlNombre)
                            .addComponent(jlApellido)
                            .addComponent(jlEdad)
                            .addComponent(jlNacionalidad)
                            .addComponent(jlSalario)
                            .addComponent(jlSalario1)
                            .addComponent(jlSalario2)
                            .addComponent(jlSalario3)
                            .addComponent(jlSalario4)
                            .addComponent(jlSalario5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGirasCantanteBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConciertosCantanteBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSencillosCantanteBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneroMusicalCantanteBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreArtisticoCantanteBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalarioCantanteBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNacionalidadCantanteBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoCantanteBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCantanteBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoCantanteBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdadCantanteBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoCantanteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCantanteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoCantanteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdadCantanteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacionalidadCantanteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalarioCantanteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalario1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreArtisticoCantanteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalario2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneroMusicalCantanteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalario3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSencillosCantanteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalario4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConciertosCantanteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalario5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGirasCantanteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCodigoCantanteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCantanteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCantanteBuscarActionPerformed

    private void txtNombreCantanteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCantanteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCantanteBuscarActionPerformed

    private void txtApellidoCantanteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoCantanteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoCantanteBuscarActionPerformed

    private void txtEdadCantanteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadCantanteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadCantanteBuscarActionPerformed

    private void txtNacionalidadCantanteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadCantanteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadCantanteBuscarActionPerformed

    private void txtSalarioCantanteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioCantanteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioCantanteBuscarActionPerformed

    private void txtNombreArtisticoCantanteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreArtisticoCantanteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreArtisticoCantanteBuscarActionPerformed

    private void txtGeneroMusicalCantanteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroMusicalCantanteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroMusicalCantanteBuscarActionPerformed

    private void txtSencillosCantanteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSencillosCantanteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSencillosCantanteBuscarActionPerformed

    private void txtConciertosCantanteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConciertosCantanteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConciertosCantanteBuscarActionPerformed

    private void txtGirasCantanteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGirasCantanteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGirasCantanteBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEdad;
    private javax.swing.JLabel jlNacionalidad;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlSalario;
    private javax.swing.JLabel jlSalario1;
    private javax.swing.JLabel jlSalario2;
    private javax.swing.JLabel jlSalario3;
    private javax.swing.JLabel jlSalario4;
    private javax.swing.JLabel jlSalario5;
    private javax.swing.JTextField txtApellidoCantanteBuscar;
    private javax.swing.JTextField txtCodigoCantanteBuscar;
    private javax.swing.JTextField txtConciertosCantanteBuscar;
    private javax.swing.JTextField txtEdadCantanteBuscar;
    private javax.swing.JTextField txtGeneroMusicalCantanteBuscar;
    private javax.swing.JTextField txtGirasCantanteBuscar;
    private javax.swing.JTextField txtNacionalidadCantanteBuscar;
    private javax.swing.JTextField txtNombreArtisticoCantanteBuscar;
    private javax.swing.JTextField txtNombreCantanteBuscar;
    private javax.swing.JTextField txtSalarioCantanteBuscar;
    private javax.swing.JTextField txtSencillosCantanteBuscar;
    // End of variables declaration//GEN-END:variables
}
