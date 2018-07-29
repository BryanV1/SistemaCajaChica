package FronEnd;

import java.util.ArrayList;
import Conexiones.Procedimientos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InterfazAdministrador extends javax.swing.JFrame {

    ArrayList<Object> usuarios = new ArrayList<>();
    int cont = 0;
    Controlador controller = new Controlador();
    ArrayList<Object> vacio = new ArrayList<>();
    String idSeleccionado = "";

    public InterfazAdministrador() {
        initComponents();
        llenarCombo();
        this.setLocationRelativeTo(null);
        bdes.setEnabled(false);
        bed.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        pc = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bdes = new javax.swing.JButton();
        bed = new javax.swing.JButton();
        bg = new javax.swing.JButton();
        cmbRol = new javax.swing.JComboBox<>();
        trol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        verUsu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbUs = new javax.swing.JComboBox<>();
        tc = new javax.swing.JTextField();
        tnom = new javax.swing.JTextField();
        tapel = new javax.swing.JTextField();
        bCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Sus Datos"));

        jLabel2.setText("Contraseña:");

        jLabel3.setText("CI:");

        jLabel17.setText("Nombres:");

        bdes.setText("Deshabilitar");
        bdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdesActionPerformed(evt);
            }
        });

        bed.setText("Editar");
        bed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedActionPerformed(evt);
            }
        });

        bg.setText("Guardar");
        bg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgActionPerformed(evt);
            }
        });

        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        cmbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRolActionPerformed(evt);
            }
        });

        trol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trolActionPerformed(evt);
            }
        });

        jLabel4.setText("Rol:");

        verUsu.setText("Ver Usuario Registrados");
        verUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verUsuActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellidos:");

        cmbUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsActionPerformed(evt);
            }
        });

        bCerrar.setText("Cerrar Sesion");
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbUs, 0, 210, Short.MAX_VALUE)
                            .addComponent(tnom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(verUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pc, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(tc)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(tapel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)
                        .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trol, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bed, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bdes, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(cmbUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(tnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(verUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(bCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(tapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bdes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro Usuario", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdesActionPerformed
        // TODO add your handling code here:
        bdes.setEnabled(false);
        bed.setEnabled(false);
        bg.setEnabled(true);
        llenarCombo();
        limpiar();
    }//GEN-LAST:event_bdesActionPerformed

    private void bedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedActionPerformed
        String na = "", n = "", a = "", ci = "", pass = "";
        String espacio = " ";
        n = tnom.getText();
        a = tapel.getText();
        na = n + " " + a;
        ci = tc.getText();
        pass = pc.getText();
        if (tnom.getText().isEmpty() || tapel.getText().isEmpty() || tc.getText().isEmpty()
                || pc.getText().isEmpty()/*||trol.getText().isEmpty()*/) {
            //if para validar que los campos no esten vacíos
            JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos");
        } else if (!validarContrasena(tc.getText())) {
            //if para validar que la cédula sea verdadera
            JOptionPane.showMessageDialog(null, "Cédula inválida");
        } else {
            try {
                Procedimientos.ActualizarUsuario(idSeleccionado, na, ci, pass);
                JOptionPane.showMessageDialog(null, "Usuario actualizado con éxito");
                limpiar();
                llenarCombo();
                bdes.setEnabled(false);
                bed.setEnabled(false);
                bg.setEnabled(true);
            } catch (SQLException ex) {
            }
        }

    }//GEN-LAST:event_bedActionPerformed

    private void cmbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolActionPerformed
        
        int seleccionada;
        seleccionada = cmbRol.getSelectedIndex();
        if (seleccionada == 0) {
            trol.setText("Administrador");
        }
        if (seleccionada == 1) {
            trol.setText("Usuario");
        }
    }//GEN-LAST:event_cmbRolActionPerformed

    private void trolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trolActionPerformed

    private void bgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgActionPerformed
        if (tnom.getText().isEmpty() || tapel.getText().isEmpty() || tc.getText().isEmpty()
                || pc.getText().isEmpty()/*||trol.getText().isEmpty()*/) {
            //if para validar que los campos no esten vacíos
            JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos");
        } else if (!validarContrasena(tc.getText())) {
            //if para validar que la cédula sea verdadera
            JOptionPane.showMessageDialog(null, "Cédula inválida");
        } else if (cedulaRepetida(tc.getText())) {
            //Se valida que no se ingrese una cédula repetida tomando datos de SQL
            JOptionPane.showMessageDialog(null, "Existe un usuario registrado con la misma cédula");
        } else {
            String nombreUser = tnom.getText() + " " + tapel.getText();
            String idLastUser = "";
            try {
                //Se consulta la BD para asignar el id del nuevo usuario
                ResultSet res = Conexiones.Conexion.Consulta("select * from USUARIO order by ID_USUARIO");
                while (res.next()) {
                    idLastUser = res.getString("ID_USUARIO");
                }
                //Se transforma de string a número para aumentar el id en uno
                int idNextUser = Integer.parseInt(idLastUser);
                idNextUser++;
                //Se vuelve a transformar a string el id para pasar al método "EntradaUsuario",
                //el cual solo acepta strings
                String id = Integer.toString(idNextUser);
                System.out.println("number" + id);
                Procedimientos.EntradaUsuario(id, nombreUser, tc.getText(), pc.getText());
                JOptionPane.showMessageDialog(null, "Usuario ingresado con éxito");
                limpiar();
                //Se actualiza el combo con el nombre del nuevo Usuario
                llenarCombo();
            } catch (SQLException ex) {
                Logger.getLogger(InterfazAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bgActionPerformed

    private void verUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verUsuActionPerformed

        Administrador2 lista = new Administrador2();
        lista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_verUsuActionPerformed

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed

        Login retorno = new Login();
        retorno.setVisible(true);
        this.setVisible(false);
        JOptionPane.showMessageDialog(rootPane, "Usted ha cerrado sesion correctamente");
    }//GEN-LAST:event_bCerrarActionPerformed

    private void cmbUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsActionPerformed
        bdes.setEnabled(true);
        bed.setEnabled(true);
        bg.setEnabled(false);
        String na = "", n = "", a = "", ci = "", pass = "";
        String espacio = " ";

        String userSelected = (String) cmbUs.getSelectedItem();
        idSeleccionado = userSelected.substring(0, userSelected.indexOf(espacio));
        System.out.println("idseleccionado" + idSeleccionado);
        try {
            ResultSet res = Conexiones.Conexion.Consulta("select * from USUARIO where ID_USUARIO=" + idSeleccionado);
            while (res.next()) {
                na = res.getString("NOMBRE_USUARIO");
                ci = res.getString("NICK_USUARIO");
                pass = res.getString("PASS");
            }
        } catch (SQLException e) {
        }
        n = na.substring(0, na.indexOf(espacio));
        a = na.substring(na.indexOf(espacio) + 1, na.length());

        tnom.setText(n);
        tapel.setText(a);
        tc.setText(ci);
        pc.setText(pass);
        trol.setText("");

    }//GEN-LAST:event_cmbUsActionPerformed

    private boolean validarContrasena(String cedula) {
        boolean validar = false;
        int size = cedula.length();
        if (esNumerico(cedula) && size == 10) {
            int provincia = Integer.parseInt(cedula.substring(0, 2));
            int digito3 = Integer.parseInt(cedula.substring(2, 3));
            int diez = Integer.parseInt(cedula.substring(9, 10));
            int mul, arreglo, res, digver;
            String ced = "212121212";
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                mul = Integer.parseInt(cedula.substring(i, i + 1));
                arreglo = Integer.parseInt(ced.substring(i, i + 1));
                res = mul * arreglo;
                if (res >= 10) {
                    res = res - 9;
                }
                sum = sum + res;
            }
            int suma = sum;
            while (suma % 10 != 0) {
                suma++;
            }
            digver = suma - sum;
            if (provincia >= 1 && provincia <= 24) {
                if (digito3 < 6) {
                    if (digver == diez) {
                        validar = true;
                    }
                }
            }
        }
        return validar;
    }

    private boolean esNumerico(String cedula) {
        try {
            Integer.parseInt(cedula);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean cedulaRepetida(String cedul) {
        String cedula;
        boolean cedulaRep = false;
        ResultSet res = Conexiones.Conexion.Consulta("select * from USUARIO");
        try {
            while (res.next()) {
                cedula = res.getString("NICK_USUARIO");
                if (cedula.equals(cedul)) {
                    cedulaRep = true;
                }
            }

        } catch (SQLException e) {
        }
        return cedulaRep;
    }

    public void limpiar() {
        tnom.setText(null);
        tc.setText(null);
        tapel.setText(null);
        pc.setText(null);
        trol.setText(null);
    }

    public void llenarCombo() {
        String n, i;
        usuarios.clear();
        try {
            ResultSet res = Conexiones.Conexion.Consulta("select * from USUARIO order by ID_USUARIO");
            while (res.next()) {
                n = res.getString("NOMBRE_USUARIO");
                i = res.getString("ID_USUARIO");
                System.out.println(i + " " + n);
                usuarios.add(i + " " + n);
            }
            System.out.println(usuarios);

        } catch (SQLException e) {
        }
        cmbUs.setModel(new javax.swing.DefaultComboBoxModel(usuarios.toArray()));
    }

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
            java.util.logging.Logger.getLogger(InterfazAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdministrador().setVisible(true);
            }
        });
    }/*System.out.println("number"+id);*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bdes;
    private javax.swing.JButton bed;
    private javax.swing.JButton bg;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JComboBox<String> cmbUs;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField pc;
    private javax.swing.JTextField tapel;
    private javax.swing.JTextField tc;
    private javax.swing.JTextField tnom;
    private javax.swing.JTextField trol;
    private javax.swing.JButton verUsu;
    // End of variables declaration//GEN-END:variables
}
