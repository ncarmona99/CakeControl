package Vistas;

import CakeControl.Receta;
import CakeControl.Socio;
import CakeControl.Venta;
import Controladores.controladorVenta;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Nicolás
 */
public class MenuVenta extends javax.swing.JFrame {
    Receta rec = new Receta();
    Socio soc = new Socio();
    Venta vt = new Venta();
    controladorVenta ctrlV= new controladorVenta();
    DefaultTableModel mt = new DefaultTableModel();
    int acum = 0;
    
    public MenuVenta() {
        initComponents();
        
        String ids [] = {"Producto","Precio","Cantidad"};
        mt.setColumnIdentifiers(ids);
        jtbl_listaVenta.setModel(mt);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtn_agregarProducto = new javax.swing.JButton();
        jlbl_guion = new javax.swing.JLabel();
        jtxt_dv = new javax.swing.JTextField();
        jtxt_run = new javax.swing.JTextField();
        jlbl_rutCliente = new javax.swing.JLabel();
        jtxt_codigoProducto = new javax.swing.JTextField();
        jtxt_cantidadProducto = new javax.swing.JTextField();
        jbtn_totalCompra = new javax.swing.JButton();
        jbtn_volver = new javax.swing.JButton();
        jlbl_codProducto = new javax.swing.JLabel();
        jlbl_cantProducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_listaVenta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxt_total = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtn_agregarProducto.setText("Agregar Producto");
        jbtn_agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_agregarProductoActionPerformed(evt);
            }
        });

        jlbl_guion.setText("-");

        jtxt_dv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_dvActionPerformed(evt);
            }
        });

        jtxt_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_runActionPerformed(evt);
            }
        });

        jlbl_rutCliente.setText("RUT Cliente");

        jtxt_codigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_codigoProductoActionPerformed(evt);
            }
        });

        jtxt_cantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_cantidadProductoActionPerformed(evt);
            }
        });

        jbtn_totalCompra.setText("Totalizar compra");
        jbtn_totalCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_totalCompraActionPerformed(evt);
            }
        });

        jbtn_volver.setText("Volver");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });

        jlbl_codProducto.setText("Código Producto");

        jlbl_cantProducto.setText("Cantidad Producto");

        jtbl_listaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbl_listaVenta);

        jtxt_total.setEditable(false);
        jtxt_total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jtxt_total);

        jLabel1.setText("Total de la compra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtn_agregarProducto)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbl_rutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_codProducto)
                            .addComponent(jlbl_cantProducto))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxt_codigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtxt_run, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(jlbl_guion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtxt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jtxt_cantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addComponent(jbtn_totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlbl_rutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxt_run, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbl_guion)
                                    .addComponent(jtxt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jbtn_agregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxt_codigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbl_codProducto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxt_cantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbl_cantProducto)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jbtn_totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(335, 335, 335))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_agregarProductoActionPerformed

        // Rescate de información de los campos
        if (jtxt_cantidadProducto.getText().isBlank() || jtxt_codigoProducto.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Uno o más campos obligatorios están vacíos");
        }else{
            rec.setCodReceta(Integer.parseInt(this.jtxt_codigoProducto.getText()));
            rec.setCantReceta(Integer.parseInt(this.jtxt_cantidadProducto.getText()));
        
            if (rec.getCantReceta() <= 0){
                JOptionPane.showMessageDialog(null, "La cantidad de producto no puede ser menor a 1");
            }else{
                // Llamar información de la base de datos
                ctrlV.buscarPreparacion();
                mt.addRow(new Object[]{rec.getNombreReceta(),rec.getValorReceta(),rec.getCantReceta()});
                rec.getColCompra().add((rec.getValorReceta()*rec.getCantReceta()));
                
                for (Integer suma : rec.getColCompra()) {
                    acum = suma + acum;
            }
                jtxt_total.setText(Integer.toString(acum));
                acum = 0;
                jtxt_codigoProducto.setText(null);
                jtxt_cantidadProducto.setText(null);
            }
        }
    }//GEN-LAST:event_jbtn_agregarProductoActionPerformed

    private void jtxt_dvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_dvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_dvActionPerformed

    private void jtxt_runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_runActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_runActionPerformed

    private void jtxt_codigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_codigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_codigoProductoActionPerformed

    private void jtxt_cantidadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_cantidadProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_cantidadProductoActionPerformed

    private void jbtn_totalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_totalCompraActionPerformed
        if(jtxt_total.getText().equals("0") || jtxt_total.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No ha ingresado ningún producto");
        }else{
            soc.setNumrun(Integer.parseInt(jtxt_run.getText()));
            soc.setDvrun(jtxt_dv.getText().charAt(0));
            
            // Toma información para llevarla a tabla venta
            vt.setTotalVenta(Integer.parseInt(jtxt_total.getText()));
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String fecha = LocalDate.now().format(formato);
            LocalDate fechaFormato = LocalDate.parse(fecha,formato);
            vt.setFecVenta(fechaFormato);
            
            // Hace los cambios en BD
            ctrlV.buscarSocio();
            ctrlV.actualizarCantCompra();
            ctrlV.ingresarVenta();
            
            JOptionPane.showMessageDialog(null, "Venta efectuada con éxito");
            
            // Limpia todos los campos y la colección
            rec.getColCompra().clear();
            jtxt_total.setText(null);
            jtxt_dv.setText(null);
            jtxt_run.setText(null);
            mt.setRowCount(0);
        }
    }//GEN-LAST:event_jbtn_totalCompraActionPerformed

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
        rec.getColCompra().clear();
        this.hide();
        MenuInicial inicial = new MenuInicial();
        inicial.show();
    }//GEN-LAST:event_jbtn_volverActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtn_agregarProducto;
    private javax.swing.JButton jbtn_totalCompra;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JLabel jlbl_cantProducto;
    private javax.swing.JLabel jlbl_codProducto;
    private javax.swing.JLabel jlbl_guion;
    private javax.swing.JLabel jlbl_rutCliente;
    private javax.swing.JTable jtbl_listaVenta;
    private javax.swing.JTextField jtxt_cantidadProducto;
    private javax.swing.JTextField jtxt_codigoProducto;
    private javax.swing.JTextField jtxt_dv;
    private javax.swing.JTextField jtxt_run;
    private javax.swing.JTextPane jtxt_total;
    // End of variables declaration//GEN-END:variables
}
