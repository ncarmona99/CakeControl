package Vistas;

import CakeControl.Socio;
import Controladores.controladorSocio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author c4dtu
 */
public class MenuSocios extends javax.swing.JFrame {

    /**
     * Creates new form MenuRegistrarSocio
     */
    public MenuSocios() {
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

        jlbl_numrunSocio = new javax.swing.JLabel();
        jlbl_guion = new javax.swing.JLabel();
        jlbl_nombreSocio = new javax.swing.JLabel();
        jlbl_direccionSocio = new javax.swing.JLabel();
        jlbl_celularSocio = new javax.swing.JLabel();
        jlbl_correoSocio = new javax.swing.JLabel();
        jlbl_fecnacSocio = new javax.swing.JLabel();
        jtxt_numrun = new javax.swing.JTextField();
        jtxt_dvrun = new javax.swing.JTextField();
        jtxt_nombreSocio = new javax.swing.JTextField();
        jtxt_direccion = new javax.swing.JTextField();
        jtxt_celular = new javax.swing.JTextField();
        jtxt_correo = new javax.swing.JTextField();
        jtxt_fecnac = new javax.swing.JTextField();
        jbtn_DesvincularSocio = new javax.swing.JButton();
        jbtn_modDatosSocio = new javax.swing.JButton();
        jbtn_registrarSocio = new javax.swing.JButton();
        jbtn_volver1 = new javax.swing.JButton();
        jbtn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbl_numrunSocio.setText("RUT");

        jlbl_guion.setText("-");

        jlbl_nombreSocio.setText("Nombre completo");

        jlbl_direccionSocio.setText("Dirección");

        jlbl_celularSocio.setText("Número de celular");

        jlbl_correoSocio.setText("Correo electrónico");

        jlbl_fecnacSocio.setText("Fecha de nacimiento");

        jtxt_numrun.setToolTipText("");
        jtxt_numrun.setActionCommand("<Not Set>");
        jtxt_numrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_numrunActionPerformed(evt);
            }
        });

        jtxt_dvrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_dvrunActionPerformed(evt);
            }
        });

        jtxt_nombreSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombreSocioActionPerformed(evt);
            }
        });

        jtxt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_direccionActionPerformed(evt);
            }
        });

        jtxt_fecnac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_fecnacActionPerformed(evt);
            }
        });

        jbtn_DesvincularSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Borrar.png"))); // NOI18N
        jbtn_DesvincularSocio.setText("Desvincular Socio");
        jbtn_DesvincularSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_DesvincularSocioActionPerformed(evt);
            }
        });

        jbtn_modDatosSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Modificar.png"))); // NOI18N
        jbtn_modDatosSocio.setText("Modificar Datos del Socio");
        jbtn_modDatosSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_modDatosSocioActionPerformed(evt);
            }
        });

        jbtn_registrarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crear.png"))); // NOI18N
        jbtn_registrarSocio.setText("Registrar Socio");
        jbtn_registrarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_registrarSocioActionPerformed(evt);
            }
        });

        jbtn_volver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Volver.png"))); // NOI18N
        jbtn_volver1.setText("Volver");
        jbtn_volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volver1ActionPerformed(evt);
            }
        });

        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtn_modDatosSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtn_registrarSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtn_DesvincularSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jbtn_volver1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbl_correoSocio)
                            .addComponent(jlbl_celularSocio)
                            .addComponent(jlbl_direccionSocio)
                            .addComponent(jlbl_nombreSocio)
                            .addComponent(jlbl_numrunSocio)
                            .addComponent(jlbl_fecnacSocio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_fecnac, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtxt_correo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxt_direccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxt_nombreSocio, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jtxt_numrun, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jlbl_guion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtxt_dvrun, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_numrunSocio)
                    .addComponent(jtxt_numrun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_buscar)
                    .addComponent(jlbl_guion)
                    .addComponent(jtxt_dvrun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_nombreSocio)
                    .addComponent(jtxt_nombreSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_direccionSocio)
                    .addComponent(jtxt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_celularSocio)
                    .addComponent(jtxt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_correoSocio)
                    .addComponent(jtxt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_fecnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_fecnacSocio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_DesvincularSocio)
                    .addComponent(jbtn_registrarSocio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_modDatosSocio))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_fecnacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_fecnacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_fecnacActionPerformed

    private void jtxt_nombreSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombreSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombreSocioActionPerformed

    private void jtxt_numrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_numrunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_numrunActionPerformed

    private void jbtn_DesvincularSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_DesvincularSocioActionPerformed
        //Crea objetos de clases
        controladorSocio contSocio = new controladorSocio();
        Socio socio = new Socio();
        
        //Captura la información del formulario y la lleva al controlador
        socio.setNumrun(Integer.parseInt(this.jtxt_numrun.getText()));
        
        //Conexión bd y query
        contSocio.borrarSocio();
        
        //Limpia campos
        jtxt_celular.setText(null);
        jtxt_correo.setText(null);
        jtxt_direccion.setText(null);
        jtxt_direccion.setText(null);
        jtxt_dvrun.setText(null);
        jtxt_fecnac.setText(null);
        jtxt_nombreSocio.setText(null);
        jtxt_numrun.setText(null);
    }//GEN-LAST:event_jbtn_DesvincularSocioActionPerformed

    private void jbtn_modDatosSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_modDatosSocioActionPerformed
        //Crea objetos de clases
        controladorSocio contSocio = new controladorSocio();
        Socio socio = new Socio();
        
        //Captura la información del formulario y la lleva al modelo
        socio.setNumrun(Integer.parseInt(this.jtxt_numrun.getText()));
        socio.setDvrun(this.jtxt_dvrun.getText().charAt(0));
        socio.setNombre(this.jtxt_nombreSocio.getText());
        socio.setDireccion(this.jtxt_direccion.getText());
        socio.setCelular(this.jtxt_celular.getText());
        socio.setCorreo(this.jtxt_correo.getText());
        socio.setCantCompra(0);
        
        //Conexión bd y query
        contSocio.modificarSocio();
        
        //Limpia campos
        jtxt_celular.setText(null);
        jtxt_correo.setText(null);
        jtxt_direccion.setText(null);
        jtxt_direccion.setText(null);
        jtxt_dvrun.setText(null);
        jtxt_fecnac.setText(null);
        jtxt_nombreSocio.setText(null);
        jtxt_numrun.setText(null);
    }//GEN-LAST:event_jbtn_modDatosSocioActionPerformed

    private void jbtn_registrarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_registrarSocioActionPerformed
        //Verifica que los campos no estén en blanco
        
        while(jtxt_dvrun.getText().isBlank() || jtxt_numrun.getText().isBlank() || jtxt_nombreSocio.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Error: Algún campo obligatorio está en blanco");
            break;
        }
        
        //Crea objetos de clases
        controladorSocio contSocio = new controladorSocio();
        Socio socio = new Socio();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        //Captura la información del formulario y la lleva al controlador
        socio.setNumrun(Integer.parseInt(this.jtxt_numrun.getText()));
        socio.setDvrun(this.jtxt_dvrun.getText().charAt(0));
        socio.setNombre(this.jtxt_nombreSocio.getText());
        socio.setDireccion(this.jtxt_direccion.getText());
        socio.setCelular(this.jtxt_celular.getText());
        socio.setCorreo(this.jtxt_correo.getText());
        LocalDate fecha = LocalDate.parse(this.jtxt_fecnac.getText(),formato);
        socio.setFecNac(fecha);
        socio.setCantCompra(0);
        
        //Conexión bd y query
        contSocio.ingresarSocio();
        
        //Limpia campos
        jtxt_celular.setText(null);
        jtxt_correo.setText(null);
        jtxt_direccion.setText(null);
        jtxt_direccion.setText(null);
        jtxt_dvrun.setText(null);
        jtxt_fecnac.setText(null);
        jtxt_nombreSocio.setText(null);
        jtxt_numrun.setText(null);
    }//GEN-LAST:event_jbtn_registrarSocioActionPerformed

    private void jbtn_volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volver1ActionPerformed
        this.hide();
        MenuInicial inicial = new MenuInicial();
        inicial.show();
    }//GEN-LAST:event_jbtn_volver1ActionPerformed

    private void jtxt_dvrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_dvrunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_dvrunActionPerformed

    private void jtxt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_direccionActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        //Crea objetos de clases
        controladorSocio contSocio = new controladorSocio();
        Socio socio = new Socio();
        
        //Captura la información del formulario y la lleva al controlador
        socio.setNumrun(Integer.parseInt(this.jtxt_numrun.getText()));
        socio.setDvrun(this.jtxt_dvrun.getText().charAt(0));
        
        
        //Conexión bd y query
        contSocio.buscarSocio();
        
        //Llena campos
        jtxt_celular.setText(socio.getCelular());
        jtxt_correo.setText(socio.getCorreo());
        jtxt_direccion.setText(socio.getDireccion());
        jtxt_fecnac.setText(socio.getFecNac().toString());
        jtxt_nombreSocio.setText(socio.getNombre());
    }//GEN-LAST:event_jbtn_buscarActionPerformed

    /**
     * @param args the command line arguments
     */
/*    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSocios().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_DesvincularSocio;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_modDatosSocio;
    private javax.swing.JButton jbtn_registrarSocio;
    private javax.swing.JButton jbtn_volver1;
    private javax.swing.JLabel jlbl_celularSocio;
    private javax.swing.JLabel jlbl_correoSocio;
    private javax.swing.JLabel jlbl_direccionSocio;
    private javax.swing.JLabel jlbl_fecnacSocio;
    private javax.swing.JLabel jlbl_guion;
    private javax.swing.JLabel jlbl_nombreSocio;
    private javax.swing.JLabel jlbl_numrunSocio;
    private javax.swing.JTextField jtxt_celular;
    private javax.swing.JTextField jtxt_correo;
    private javax.swing.JTextField jtxt_direccion;
    private javax.swing.JTextField jtxt_dvrun;
    private javax.swing.JTextField jtxt_fecnac;
    private javax.swing.JTextField jtxt_nombreSocio;
    private javax.swing.JTextField jtxt_numrun;
    // End of variables declaration//GEN-END:variables


}
