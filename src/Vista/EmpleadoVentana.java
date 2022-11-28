package Vista;

import Controlador.ControlPersona.ControlPersona;
import Controlador.DAO.AdaptadorDAO;

import Vista.ModeloTabla.TablaEmpleado;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo 117
 */
public class EmpleadoVentana extends javax.swing.JDialog {

    SimpleDateFormat formita = new SimpleDateFormat("dd/MM/yyyy");
    ControlPersona controlP = new ControlPersona();
    private AdaptadorDAO dao;
    
    private TablaEmpleado tabla = new TablaEmpleado();
    private Date fechaNow = new Date();
    Integer fila = -1;
    long dias = 0;
    public long sueldoBasico = 425;

    public EmpleadoVentana(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        txtSueldo.setText("425");
        btonGuardarEmpleado.setEnabled(false);
        lblFechaActual.setText("");
        btonElegirEmpleado.setEnabled(false);
        //btonCalcularTiempo.setEnabled(false);
        lblTotalDias.setText("");
        lblFechaActual.setText("Fecha Actual: " + formita.format(fechaNow));
    }

    private void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        jDateChooser1.setDate(null);
        controlP.setEmpleado(null);

        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btonElegirEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpleado = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblFechaActual = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btonCalcularTiempo = new javax.swing.JButton();
        lblTotalDias = new javax.swing.JLabel();
        btonGuardarEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btonElegirEmpleado.setText("Seleccionar");
        btonElegirEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonElegirEmpleadoActionPerformed(evt);
            }
        });

        TablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEmpleado);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btonElegirEmpleado)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btonElegirEmpleado)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(283, 314));

        jLabel1.setText("Nombre:");

        jLabel3.setText("Apellido");

        jLabel4.setText("Suedo Basico");

        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblFechaActual.setText("jLabel5");

        jLabel5.setText("Elegir Fecha de ingreso de Empleado");

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });

        btonCalcularTiempo.setText("Definir Tiempo");
        btonCalcularTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonCalcularTiempoActionPerformed(evt);
            }
        });

        lblTotalDias.setText("jLabel7");

        btonGuardarEmpleado.setText("Guardar");
        btonGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonGuardarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotalDias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 67, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btonCalcularTiempo)
                        .addGap(110, 110, 110))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btonGuardarEmpleado)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFechaActual)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btonCalcularTiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalDias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btonGuardarEmpleado)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSueldo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(38, 38, 38)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadoMouseClicked
        // TODO add your handling code here:
        
        btonElegirEmpleado.setEnabled(true);
        txtSueldo.setEditable(false);
        txtApellido.setEditable(false);
        txtSueldo.setText("425.00");
        //btonCalcularTiempo.setEnabled(false);
        lblFechaActual.setText("");
        btonGuardarEmpleado.setEnabled(false);
    }//GEN-LAST:event_TablaEmpleadoMouseClicked

    private void cargarTabla() {
        tabla.setLista(controlP.getListaEmpleados());
        //tabla.setLista(controlP.listar());
        TablaEmpleado.setModel(tabla);
        TablaEmpleado.updateUI();
    }
    private void btonElegirEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonElegirEmpleadoActionPerformed
        // TODO add your handling code here:
        
        btonCalcularTiempo.setEnabled(true);    ////////////////
        jDateChooser1.setEnabled(true);
        txtNombre.setEditable(true);
        txtApellido.setEditable(true);
        //lblFechaActual.setText("Fecha Actual: " + formita.format(fechaNow));

        int pos = TablaEmpleado.getSelectedRow();
        if (pos >= 0) {
            controlP.setEmpleado(tabla.getlista().obtenerDato(pos));
            txtNombre.setText(controlP.getEmpleado().getNombre());
            txtApellido.setText(controlP.getEmpleado().getApellido());
            jDateChooser1.setDate(controlP.getEmpleado().getFechaIngreso());
            fila = pos;
        } else {
            JOptionPane.showMessageDialog(null, "Elija un comando de la tabla", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btonElegirEmpleadoActionPerformed

    private void btonCalcularTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonCalcularTiempoActionPerformed

        Date fechaIngreso = jDateChooser1.getDate();

        if (fechaIngreso == null) {
            JOptionPane.showMessageDialog(null, "Seleccionar fecha de Ingreso de Empleado");
        } else {
            calcularTiempoEmpleado(fechaIngreso);
            btonGuardarEmpleado.setEnabled(true);
        }
    }//GEN-LAST:event_btonCalcularTiempoActionPerformed

    protected void calcularTiempoEmpleado(Date Ingreso) {
        String fecha1 = (formita.format(fechaNow)); // fechainicio
        String fecha2 = (formita.format(Ingreso)); // fecha ultima
        System.out.println("1)>> " + formita.format(Ingreso));

        try {
            Date fecha_ingreso = formita.parse(fecha1);
            Date fecha_ultima = formita.parse(fecha2);

            long aniosHechos = fecha_ingreso.getTime() - fecha_ultima.getTime();
            TimeUnit diasEmpleo = TimeUnit.DAYS;
            dias = diasEmpleo.convert(aniosHechos, TimeUnit.MILLISECONDS);
            System.out.println("-> " + dias);

            if (dias == 1) {
                lblTotalDias.setText("Tiempo de Empleado en Trabajo: " + dias + " dia.");
            }
            if (dias < 365 && dias != 1) {
                lblTotalDias.setText("Tiempo de Empleado en Trabajo: " + dias + " dias.");
            }
            if (dias > 365 && dias < 730) {
                long resta = dias / 365;
                System.out.println("division: " + resta);
                long restaR = Math.round(resta * 100) / 100; //division 
                System.out.println("redondeo: " + restaR);

                long anios = restaR * 365;
                System.out.println("producto de anios : " + anios);
                long finalOp = dias - anios;
                System.out.println("R>> anios: " + restaR + " dias: " + finalOp);
                lblTotalDias.setText("Tiempo de Empleado en Trabajo: " + restaR + " anio, " + finalOp + " dias.");
            }
            if (dias > 730) {
                long resta = dias / 365;
                System.out.println("division: " + resta);
                long restaR = Math.round(resta * 100) / 100; //division 
                System.out.println("redondeo: " + restaR);

                long anios = restaR * 365;
                System.out.println("producto de anios : " + anios);
                long finalOp = dias - anios;
                System.out.println("R>> anios: " + restaR + " dias: " + finalOp);
                lblTotalDias.setText("Tiempo de Empleado en Trabajo: " + restaR + " anios, " + finalOp + " dias.");
            }
        } catch (Exception e) {
            System.out.println("Error en calcular la fecha >:c");
        }
    }
    
    
    private void guardarEmpleado() {

        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos correspondientes");
        } else {
            controlP.getEmpleado().setNombre(txtNombre.getText());
            controlP.getEmpleado().setApellido(txtApellido.getText());
            controlP.getEmpleado().setFechaIngreso(jDateChooser1.getDate());
            controlP.getEmpleado().setTiempoEmpleo(dias);
            
            controlP.calculoEmpleado(dias, controlP.getEmpleado());

            if (fila == -1) {
                if (controlP.getListaEmpleados().insertarAlFinal(controlP.getEmpleado())) {
                    System.out.println("Se ha guardardo bien el Empleado (:");
                    
                    if(controlP.guardar()){
                        System.out.println("se guardo json");
                    }else{
                        System.out.println(":)");
                    }                    
                    limpiar();
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No se guardo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (controlP.getListaEmpleados().modificarDatoPosicion(fila, controlP.getEmpleado())) {
                    JOptionPane.showMessageDialog(null, "Se ha modificado correctamente", "OK", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void btonGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonGuardarEmpleadoActionPerformed

        guardarEmpleado();
    }//GEN-LAST:event_btonGuardarEmpleadoActionPerformed

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        // TODO add your handling code here:
        if (jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Seleccionar fecha de Ingreso de Empleado");
        } else {
            btonCalcularTiempo.setEnabled(true);
        }
    }//GEN-LAST:event_jDateChooser1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EmpleadoVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmpleadoVentana dialog = new EmpleadoVentana(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEmpleado;
    private javax.swing.JButton btonCalcularTiempo;
    private javax.swing.JButton btonElegirEmpleado;
    private javax.swing.JButton btonGuardarEmpleado;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblTotalDias;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
