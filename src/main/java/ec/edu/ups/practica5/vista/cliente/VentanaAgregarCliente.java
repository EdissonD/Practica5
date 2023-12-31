/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica5.vista.cliente;

/**
 *
 * @author Usuario
 */
public class VentanaAgregarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaAgregarCliente
     */
    public VentanaAgregarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jlCodigo = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlEdad = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNacionalidad = new javax.swing.JLabel();
        jlSalario = new javax.swing.JLabel();
        txtCodigoCantanteEliminar = new javax.swing.JTextField();
        txtNombreCantanteEliminar = new javax.swing.JTextField();
        txtApellidoCantanteEliminar = new javax.swing.JTextField();
        txtEdadCantanteEliminar = new javax.swing.JTextField();
        txtSalarioCantanteEliminar = new javax.swing.JTextField();
        nacionalidad = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(153, 153, 153));

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

        txtCodigoCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtCodigoCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCantanteEliminarActionPerformed(evt);
            }
        });

        txtNombreCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtNombreCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCantanteEliminarActionPerformed(evt);
            }
        });

        txtApellidoCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtApellidoCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoCantanteEliminarActionPerformed(evt);
            }
        });

        txtEdadCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtEdadCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadCantanteEliminarActionPerformed(evt);
            }
        });

        txtSalarioCantanteEliminar.setToolTipText("Ingrese las cancionesTop100Billboard");
        txtSalarioCantanteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioCantanteEliminarActionPerformed(evt);
            }
        });

        nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Inglesa", "Colombiana", "Cubana ", "Chilena", "Ecuatoriana", "Mexicana", "Peruana", "Americana", "Española" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(0, 278, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigo)
                            .addComponent(jlNombre)
                            .addComponent(jlApellido)
                            .addComponent(jlEdad)
                            .addComponent(jlNacionalidad)
                            .addComponent(jlSalario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEdadCantanteEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtApellidoCantanteEliminar)
                                .addComponent(txtNombreCantanteEliminar)
                                .addComponent(txtCodigoCantanteEliminar)
                                .addComponent(txtSalarioCantanteEliminar))
                            .addComponent(nacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalarioCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtCodigoCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdadCantanteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCodigoCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCantanteEliminarActionPerformed

    private void txtNombreCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCantanteEliminarActionPerformed

    private void txtApellidoCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoCantanteEliminarActionPerformed

    private void txtEdadCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadCantanteEliminarActionPerformed

    private void txtSalarioCantanteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioCantanteEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioCantanteEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEdad;
    private javax.swing.JLabel jlNacionalidad;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlSalario;
    private javax.swing.JComboBox<String> nacionalidad;
    private javax.swing.JTextField txtApellidoCantanteEliminar;
    private javax.swing.JTextField txtCodigoCantanteEliminar;
    private javax.swing.JTextField txtEdadCantanteEliminar;
    private javax.swing.JTextField txtNombreCantanteEliminar;
    private javax.swing.JTextField txtSalarioCantanteEliminar;
    // End of variables declaration//GEN-END:variables
}
