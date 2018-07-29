package FronEnd;

import Conexiones.Procedimientos;
import java.security.cert.Extension;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.*;
import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.table.DefaultTableModel;
import sun.util.locale.ParseStatus;

public class InterfazUsuario extends javax.swing.JFrame {
    
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("archivo imagen","jpg");
    private FileInputStream fis;
    String rutaimagen;
    static ResultSet res;
    static ResultSet res2;
    String seleccion;
    String seleccion2;
    String seleccion3;
    private int longitudBytes;
    ArrayList<Object> facturas = new ArrayList<>();
    ClsFactura factura;
    double saldo=0;
    double iva=0;
    double subtotal=0;
    double sub0=0;
    double porcentajeiva=0.12;
    boolean retencion=false;
    boolean valecaja=false;
    static String usuario;
    static String id_usuario;
   
    public InterfazUsuario(String user,String iduser) {
        initComponents();        
        rutaimagen = "";
        txtUser.setText(user);
        txtUser1.setText(user);
        id_usuario=iduser;
        ResultSet resul = Conexiones.Conexion.Consulta("select TOP 1 MONTO from caja_chica order by FECHA_MONTO desc");
        try {
            while(resul.next()){
            SaldoCaja.setText(resul.getString("MONTO"));    
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    InterfazUsuario(ClsUsuario usu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelFactura = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        tNumeFact = new javax.swing.JTextField();
        tProveedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bFacDig = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tTotal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tRuta = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tFecha = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        tCateg = new javax.swing.JTextField();
        tCantidad = new javax.swing.JTextField();
        tDescrip = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bIngresarP = new javax.swing.JButton();
        bQuitarP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaFactura = new javax.swing.JTable();
        SUBIVA = new javax.swing.JTextField();
        SUBIVA0 = new javax.swing.JTextField();
        IVA = new javax.swing.JTextField();
        TOTAL = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tPrecio = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        bGuardarFact = new javax.swing.JButton();
        bQuitarP1 = new javax.swing.JButton();
        bBuscarFac = new javax.swing.JButton();
        bNuevoFac = new javax.swing.JButton();
        cIva = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        IdVale = new javax.swing.JTextField();
        Solicitante = new javax.swing.JTextField();
        bAgregarVale = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        IdentificadorCaja = new javax.swing.JTextField();
        PanelSolicitud = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaSolicitud = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bIngrQuipux = new javax.swing.JButton();
        tNumSol = new javax.swing.JTextField();
        tNomSol = new javax.swing.JTextField();
        tFechaSol = new javax.swing.JTextField();
        bNuevo = new javax.swing.JButton();
        bBuscarSol = new javax.swing.JButton();
        bGuardarSol = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cDepar = new javax.swing.JComboBox<>();
        cEstado = new javax.swing.JComboBox<>();
        tRutaQuipux = new javax.swing.JTextField();
        bFactura = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        bAgregar = new javax.swing.JPanel();
        bAgregarRet = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        BImponible = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        PRetencion = new javax.swing.JTextField();
        ValorRet = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        SUBIVA1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        SUBIVA2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        IVA1 = new javax.swing.JTextField();
        TOTAL1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        BImponible1 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        PRetencion1 = new javax.swing.JTextField();
        ValorRet1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        CheckBoxIVA = new javax.swing.JCheckBox();
        CheckBoxIR = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        TotalRet = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        bAgregarRet1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        idRetencion = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        PanelReportes = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        fechaInicial = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        fechaFinal = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaReporte = new javax.swing.JTable();
        GenerarReporte = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        txtTotalRetencion = new javax.swing.JTextField();
        txtTotalFactura = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        PanelReponer = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        SaldoCaja = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        btActualizarMonto = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        txtUser1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        txfReponer = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txfFecha = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txfIdentificadorCaja = new javax.swing.JTextField();
        btReponer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        tProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tProveedorActionPerformed(evt);
            }
        });

        jLabel6.setText("Número de factura");

        jLabel8.setText("Proveedor");

        bFacDig.setText("Agregar factura digital");
        bFacDig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFacDigActionPerformed(evt);
            }
        });

        jLabel12.setText("Total");

        tTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTotalActionPerformed(evt);
            }
        });

        jLabel18.setText("Ruta");

        tRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tRutaActionPerformed(evt);
            }
        });

        jLabel19.setText("Fecha");

        tFecha.setText("2018-01-21");
        tFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFechaActionPerformed(evt);
            }
        });

        jLabel20.setText("Año-Mes-Día");

        jLabel25.setText("Usuario");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(tNumeFact, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(tProveedor)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(76, 76, 76)
                        .addComponent(tTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tRuta)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bFacDig)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tNumeFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel19)
                            .addComponent(tFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(3, 3, 3))
                    .addComponent(bFacDig, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tProveedor))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(tRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        tCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCantidadActionPerformed(evt);
            }
        });

        jLabel9.setText("Categoría:");

        jLabel10.setText("Cantidad:");

        jLabel11.setText("Descripción:");

        bIngresarP.setText("Agregar Producto a Factura");
        bIngresarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngresarPActionPerformed(evt);
            }
        });

        bQuitarP.setText("Quitar Producto");
        bQuitarP.setEnabled(false);
        bQuitarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuitarPActionPerformed(evt);
            }
        });

        TablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número de Factura", "Descripción", "Cantidad", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaFactura);

        SUBIVA.setEditable(false);
        SUBIVA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SUBIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBIVAActionPerformed(evt);
            }
        });

        SUBIVA0.setEditable(false);
        SUBIVA0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SUBIVA0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBIVA0ActionPerformed(evt);
            }
        });

        IVA.setEditable(false);
        IVA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        TOTAL.setEditable(false);
        TOTAL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel13.setText("Subtotal IVA");

        jLabel14.setText("Subtotal IVA 0%");

        jLabel15.setText("IVA");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Total");

        tPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPrecioActionPerformed(evt);
            }
        });

        jLabel17.setText("Precio unitario:");

        bGuardarFact.setText("Ingresar Factura");
        bGuardarFact.setEnabled(false);
        bGuardarFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarFactActionPerformed(evt);
            }
        });

        bQuitarP1.setText("Quitar Producto");

        bBuscarFac.setText("Buscar Factura");
        bBuscarFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarFacActionPerformed(evt);
            }
        });

        bNuevoFac.setText("Nuevo Ingreso");
        bNuevoFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoFacActionPerformed(evt);
            }
        });

        cIva.setText("IVA (12%)");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("IdVale");

        jLabel23.setText("Solicitante");

        bAgregarVale.setText("Agregar Vale de Caja");
        bAgregarVale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarValeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addComponent(IdVale))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(13, 13, 13)
                        .addComponent(Solicitante)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(bAgregarVale)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(IdVale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(Solicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAgregarVale))
        );

        jLabel24.setText("Identificador de caja chica");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(tPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(tDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(cIva)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bQuitarP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bIngresarP, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bBuscarFac)
                                    .addComponent(bNuevoFac))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bGuardarFact, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(27, 27, 27)
                                .addComponent(IdentificadorCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SUBIVA, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                            .addComponent(SUBIVA0)
                                            .addComponent(IVA))))))))
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bQuitarP1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(tPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(bIngresarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(cIva))
                    .addComponent(bQuitarP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SUBIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SUBIVA0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(IVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(bBuscarFac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bNuevoFac))
                                    .addComponent(bGuardarFact, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(IdentificadorCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bQuitarP1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout PanelFacturaLayout = new javax.swing.GroupLayout(PanelFactura);
        PanelFactura.setLayout(PanelFacturaLayout);
        PanelFacturaLayout.setHorizontalGroup(
            PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelFacturaLayout.setVerticalGroup(
            PanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingreso factura", PanelFactura);

        TablaSolicitud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Fecha", "Departamento", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaSolicitud);

        jLabel1.setText("Nro Solicitud");

        jLabel2.setText("Nombre solicitante");

        jLabel3.setText("Fecha");

        bIngrQuipux.setText("Ingresar documento Quipux");
        bIngrQuipux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngrQuipuxActionPerformed(evt);
            }
        });

        tFechaSol.setText("2018-01-21");

        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bBuscarSol.setText("Buscar");
        bBuscarSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarSolActionPerformed(evt);
            }
        });

        bGuardarSol.setText("Guardar");
        bGuardarSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarSolActionPerformed(evt);
            }
        });

        jLabel4.setText("Departamento");

        jLabel5.setText("Estado");

        cDepar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DGIP", "ADMINISTRATIVO" }));
        cDepar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDeparActionPerformed(evt);
            }
        });

        cEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espera", "Aceptado", "No aceptado" }));

        bFactura.setText("Factura");
        bFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFacturaActionPerformed(evt);
            }
        });

        jLabel21.setText("AñoMesDía");

        jLabel22.setText("Ruta");

        javax.swing.GroupLayout PanelSolicitudLayout = new javax.swing.GroupLayout(PanelSolicitud);
        PanelSolicitud.setLayout(PanelSolicitudLayout);
        PanelSolicitudLayout.setHorizontalGroup(
            PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSolicitudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(PanelSolicitudLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSolicitudLayout.createSequentialGroup()
                        .addComponent(bNuevo)
                        .addGap(45, 45, 45)
                        .addComponent(bBuscarSol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bFactura)
                        .addGap(55, 55, 55))
                    .addGroup(PanelSolicitudLayout.createSequentialGroup()
                        .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelSolicitudLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tNomSol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNumSol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tFechaSol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(bIngrQuipux))
                        .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSolicitudLayout.createSequentialGroup()
                                .addGap(0, 167, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelSolicitudLayout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(cDepar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PanelSolicitudLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(27, 27, 27)
                                                .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(PanelSolicitudLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tRutaQuipux, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(90, 90, 90))
                            .addGroup(PanelSolicitudLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(bGuardarSol))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        PanelSolicitudLayout.setVerticalGroup(
            PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSolicitudLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tNumSol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSolicitudLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tNomSol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelSolicitudLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cDepar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSolicitudLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelSolicitudLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tFechaSol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))))
                .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSolicitudLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(bIngrQuipux))
                    .addGroup(PanelSolicitudLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tRutaQuipux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))))
                .addGap(16, 16, 16)
                .addGroup(PanelSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNuevo)
                    .addComponent(bBuscarSol)
                    .addComponent(bGuardarSol)
                    .addComponent(bFactura))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingreso solicitud", PanelSolicitud);

        bAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bAgregarRet.setText("Agregar retención");
        bAgregarRet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarRetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel38.setText("Base imponible");

        jLabel39.setText("Porcentaje de retención");

        ValorRet.setEditable(false);
        ValorRet.setText("0");

        jLabel40.setText("Valor retenido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BImponible, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ValorRet, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(BImponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(PRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorRet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SUBIVA1.setEditable(false);
        SUBIVA1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SUBIVA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBIVA1ActionPerformed(evt);
            }
        });

        jLabel31.setText("Subtotal IVA");

        SUBIVA2.setEditable(false);
        SUBIVA2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SUBIVA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBIVA2ActionPerformed(evt);
            }
        });

        jLabel32.setText("Subtotal IVA 0%");

        jLabel33.setText("IVA");

        IVA1.setEditable(false);
        IVA1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        TOTAL1.setEditable(false);
        TOTAL1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Total");

        jLabel26.setText("Datos para la retención");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(TOTAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel31)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SUBIVA1)
                            .addComponent(SUBIVA2)
                            .addComponent(IVA1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SUBIVA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SUBIVA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(IVA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(TOTAL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel44.setText("Base imponible");

        jLabel45.setText("Porcentaje de retención");

        ValorRet1.setEditable(false);
        ValorRet1.setText("0");

        jLabel46.setText("Valor retenido");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BImponible1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PRetencion1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ValorRet1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(BImponible1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(PRetencion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorRet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CheckBoxIVA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBoxIVA.setSelected(true);
        CheckBoxIVA.setText("IVA");
        CheckBoxIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxIVAActionPerformed(evt);
            }
        });

        CheckBoxIR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBoxIR.setSelected(true);
        CheckBoxIR.setText("IMPUESTO A LA RENTA");
        CheckBoxIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxIRActionPerformed(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TotalRet.setEditable(false);

        jLabel49.setText("Total retenido");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TotalRet, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalRet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bAgregarRet1.setText("Calcular");
        bAgregarRet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarRet1ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Número de retención");

        javax.swing.GroupLayout bAgregarLayout = new javax.swing.GroupLayout(bAgregar);
        bAgregar.setLayout(bAgregarLayout);
        bAgregarLayout.setHorizontalGroup(
            bAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBoxIVA)
                    .addGroup(bAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bAgregarLayout.createSequentialGroup()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(bAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bAgregarLayout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(bAgregarRet1)
                                        .addGap(82, 82, 82)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bAgregarLayout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(bAgregarRet)))
                                .addGroup(bAgregarLayout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(idRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(CheckBoxIR, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        bAgregarLayout.setVerticalGroup(
            bAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bAgregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckBoxIVA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(CheckBoxIR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bAgregarLayout.createSequentialGroup()
                        .addGroup(bAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bAgregarLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(bAgregarRet1)))
                        .addGap(34, 34, 34)
                        .addGroup(bAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(idRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAgregarRet)))
                .addGap(227, 227, 227))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 571, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 23, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Retención", jPanel3);

        jLabel28.setText("Ingrese al menos una fecha");

        jLabel29.setText("Fecha de inicio");

        jLabel30.setText("Fecha final");

        jLabel35.setText("Al omitir este campo se busca hasta la fecha actual");

        TablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Vale", "Fecha", "Solicitante", "Categoría", "Producto", "Retención", "Total Factura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaReporte);

        GenerarReporte.setText("Generar Reporte");
        GenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarReporteActionPerformed(evt);
            }
        });

        jLabel36.setText("Total");

        txtTotalRetencion.setEditable(false);

        txtTotalFactura.setEditable(false);

        javax.swing.GroupLayout PanelReportesLayout = new javax.swing.GroupLayout(PanelReportes);
        PanelReportes.setLayout(PanelReportesLayout);
        PanelReportesLayout.setHorizontalGroup(
            PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReportesLayout.createSequentialGroup()
                .addGroup(PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReportesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
                    .addGroup(PanelReportesLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addGroup(PanelReportesLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelReportesLayout.createSequentialGroup()
                        .addGroup(PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelReportesLayout.createSequentialGroup()
                                .addGap(379, 379, 379)
                                .addComponent(jLabel30))
                            .addGroup(PanelReportesLayout.createSequentialGroup()
                                .addGap(339, 339, 339)
                                .addComponent(GenerarReporte)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReportesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReportesLayout.createSequentialGroup()
                            .addComponent(jLabel36)
                            .addGap(32, 32, 32)
                            .addComponent(txtTotalRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(txtTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReportesLayout.createSequentialGroup()
                            .addComponent(jLabel35)
                            .addGap(92, 92, 92)))))
        );
        PanelReportesLayout.setVerticalGroup(
            PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReportesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel28)
                .addGap(39, 39, 39)
                .addGroup(PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addGap(28, 28, 28)
                .addComponent(GenerarReporte)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtTotalRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reporte", jPanel9);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SaldoCaja.setEditable(false);
        SaldoCaja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaldoCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldoCajaActionPerformed(evt);
            }
        });

        jLabel47.setText("Monto actual de caja chica");

        btActualizarMonto.setText("Actualizar monto");
        btActualizarMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarMontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btActualizarMonto)
                        .addComponent(SaldoCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(26, 26, 26)
                .addComponent(SaldoCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btActualizarMonto)
                .addGap(49, 49, 49))
        );

        jLabel48.setText("Usuario");

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txfReponer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfReponer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfReponerActionPerformed(evt);
            }
        });

        jLabel54.setText("Cantidad a reponer");

        jLabel55.setText("Fecha");

        txfFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfFechaActionPerformed(evt);
            }
        });

        jLabel56.setText("Identificador de caja");

        txfIdentificadorCaja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfIdentificadorCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdentificadorCajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfIdentificadorCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfReponer, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txfReponer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(txfIdentificadorCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        btReponer.setText("Reponer");
        btReponer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReponerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelReponerLayout = new javax.swing.GroupLayout(PanelReponer);
        PanelReponer.setLayout(PanelReponerLayout);
        PanelReponerLayout.setHorizontalGroup(
            PanelReponerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReponerLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(PanelReponerLayout.createSequentialGroup()
                .addGroup(PanelReponerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelReponerLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel48)
                        .addGap(27, 27, 27)
                        .addComponent(txtUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelReponerLayout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btReponer))
                    .addGroup(PanelReponerLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelReponerLayout.setVerticalGroup(
            PanelReponerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReponerLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelReponerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(txtUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btReponer)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelReponer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelReponer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reponer", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCantidadActionPerformed

    private void SUBIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUBIVAActionPerformed

    private void SUBIVA0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBIVA0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUBIVA0ActionPerformed

    private void tProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tProveedorActionPerformed

    private void bAgregarRetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarRetActionPerformed
    retencion=true;
    JOptionPane.showMessageDialog(null, "Retención agregada");
    /*try {
        Procedimientos.IngresarRetencion(idRetencion.getText(), tNumeFact.getText(),TotalRet.getText());
        retencion=true;
    } catch (SQLException ex) {
        Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
    }*/
        
        
    }//GEN-LAST:event_bAgregarRetActionPerformed

    private void bFacDigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFacDigActionPerformed
        // TODO add your handling code here:
        //Agregar factura digital
        JFileChooser dlg = new JFileChooser();
        dlg.setFileFilter(filter);
        int option = dlg.showOpenDialog(this);
        if(option==JFileChooser.APPROVE_OPTION){
            String  fil = dlg.getSelectedFile().getPath();
            String file = dlg.getSelectedFiles().toString();
            
            tRuta.setText(String.valueOf(fil));
            rutaimagen = "";
        }        
    }//GEN-LAST:event_bFacDigActionPerformed

    private void tPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPrecioActionPerformed

    private void bIngrQuipuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngrQuipuxActionPerformed
        // TODO add your handling code here:
        /*JFileChooser dlg = new JFileChooser();
        JFileChooser se = new JFileChooser();
        dlg.setFileFilter(filter);
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = se.showOpenDialog(null);
        
        int option = dlg.showOpenDialog(this);
        if(option==JFileChooser.APPROVE_OPTION){
            try {
                
                fis =  new FileInputStream(se.getSelectedFile());
                this.longitudBytes = (int)se.getSelectedFile().length();
                
            } catch (FileNotFoundException ex) {ex.printStackTrace();}
            catch (IOException ex){ex.printStackTrace();}

        }
        if(option==JFileChooser.APPROVE_OPTION){
            String  fil = dlg.getSelectedFile().getPath();
            String file = dlg.getSelectedFiles().toString();

            tRutaQuipux.setText(String.valueOf(fil));
            rutaimagen = "";
        }*/
        JFileChooser dlg = new JFileChooser();
        dlg.setFileFilter(filter);
        int option = dlg.showOpenDialog(this);
        if(option==JFileChooser.APPROVE_OPTION){
            String  fil = dlg.getSelectedFile().getPath();
            String file = dlg.getSelectedFiles().toString();
            
            tRutaQuipux.setText(String.valueOf(fil));
            rutaimagen = "";
        }   
    }//GEN-LAST:event_bIngrQuipuxActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        limpiarSolicitud();
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bBuscarSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarSolActionPerformed
        // TODO add your handling code here:
        //Buscar la solicitud en la base de datos por medio del id
        String num="";
        String solicitud=JOptionPane.showInputDialog(null, "Ingrese el número de solicitud que busca:");
        if(solicitud.equals("")){
            JOptionPane.showMessageDialog(null, "No se ingresó datos"); 
        }else{        
        String solicitante="";
        String fecha="";
        String departamento="";
        String estado="";
        ResultSet resul = Conexiones.Conexion.Consulta("select * from SOLICITUD where ID_SOLICITUD="+solicitud);
        try {
            while (resul.next()) {
                    num=resul.getString("ID_SOLICITUD");//System.out.println()
            }
                if(num.equals(solicitud)){
                    //NOMBRE_SOLICITANTE,FECHA_SOLICITUD,DEPARTAMENTO,ESTADO
            resul = Conexiones.Conexion.Consulta("select * from SOLICITUD where ID_SOLICITUD="+solicitud);
            while (resul.next()) {
                //solicitud=resul.getString("ID_SOLICITUD");//System.out.println();
                solicitante=resul.getString("NOMBRE_SOLICITANTE");                
                fecha=resul.getString("FECHA_SOLICITUD");
                departamento=resul.getString("DEPARTAMENTO");
                estado=resul.getString("ESTADO");
            }
            DefaultTableModel model = (DefaultTableModel) TablaSolicitud.getModel();           
            //Ya que solo existe una solicitud solo se ingresa y se remueve la primera fila
            model.removeRow(0);
            Object solic[] = {solicitud, solicitante,fecha,departamento,estado};
            model.insertRow(0, solic);   
            /*boolean encontrar = false;
            if(tNumSol.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el codigo de usuario", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
            res = Conexiones.Conexion.Consulta("select SOLICITUD.ID_SOLICITUD,
            SOLICITUD.NOMBRE_SOLICITANTE,SOLICITUD.FECHA_SOLICITUD,SOLICITUD.DEPARTAMENTO,SOLICITUD.ESTADO from SOLICITUD");
            try{
            while(res.next()){
            System.out.println("entra1");
            id_Usu = res.getString("ID_SOLICITUD");
            System.out.println(id_Usu);
            if(numerosolicitud.equals(id_Usu)){
            tNomSol.setText(res.getString("NOMBRE_SOLICITANTE"));
            tFechaSol.setText(res.getString("FECHA_SOLICITUD"));
            cDepar.setSelectedItem(res.getString("DEPARTAMENTO"));
            cEstado.setSelectedItem(res.getString("ESTADO"));
            encontrar = true;
            }
            }
            if(encontrar == false){
            JOptionPane.showMessageDialog(this, "No se encontro el usuario registrado", "Error", JOptionPane.ERROR_MESSAGE);
            tNumSol.setText("");
            }
            }catch (SQLException e){
            }
            }*/   
            }else{
             JOptionPane.showMessageDialog(null, "La solicitud ingresada no se encuentra en la base de datos");  
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }            
        }
        
    }//GEN-LAST:event_bBuscarSolActionPerformed

    private void cDeparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDeparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDeparActionPerformed

    private void bFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFacturaActionPerformed
        // TODO add your handling code here:
        //InterfazUsuario m2= new InterfazUsuario();
        //m2.setVisible(true);
    }//GEN-LAST:event_bFacturaActionPerformed

    private void tTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTotalActionPerformed

    private void bGuardarFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarFactActionPerformed
        //Guardar la factura en la base de datos
        //Primero se comprueba que el total ingresado en la parte del cliente sea igual al total de la factura
        if(saldo!=Double.parseDouble(tTotal.getText())){
            //System.out.println(saldo);            
            JOptionPane.showMessageDialog(null, "El total ingresado no corresponde con el total de la factura");
        }else{
        //Si no se ingresa la retencion, el vale y el identificador de caja chica no se puede ingresar la factura
        if(retencion==false||valecaja==false||IdentificadorCaja.getText().equals("")){
            JOptionPane.showMessageDialog(null, "La retención,el vale de caja y el identificador de caja son campos obligatorios");
        }else{
            String numf="";
            ResultSet resul = Conexiones.Conexion.Consulta
            ("select * from FACTURA where ID_FACTURA="+tNumeFact.getText());
            try {                
            while (resul.next()) {
                numf=resul.getString("ID_FACTURA");//System.out.println()
            }
            //Si existe una factura con el mismo id en la base de datos no se puede guardar la factura
            if(numf.equals(tNumeFact.getText())){
            JOptionPane.showMessageDialog(null, "La factura que se quiere ingresar ya existe");
            }else{
            //Para  guardar la factura se comienza ingresando sin los campos not null
            Procedimientos.IngresarFactura(tNumeFact.getText(), tFecha.getText(),tProveedor.getText(),tTotal.getText());
            //Se ingresa el vale de caja
            Procedimientos.IngresarVale(IdVale.getText(), tNumeFact.getText(),Solicitante.getText());
            String idDetalle;
            //Se ingresa la retención del iva y el impuesto a la renta
            Procedimientos.IngresarRetencion(idRetencion.getText(), tNumeFact.getText(),TotalRet.getText());
            //Se agregra los campos not null que no se ingresaron en el inicio de la tabla factura los cuales
            //son la retencion, el vale de caja y el usuario
            Procedimientos.ActualizarFactura(tNumeFact.getText(),idRetencion.getText(),id_usuario
                ,IdVale.getText());
            //Se reduce el total de la factura del monto de caja chica
            Procedimientos.ActualizarMonto(IdentificadorCaja.getText(), tNumeFact.getText(), 
                    tTotal.getText(), tFecha.getText());
            
            resul = Conexiones.Conexion.Consulta("select TOP 1 MONTO from caja_chica order by FECHA_MONTO desc");        
            while(resul.next()){SaldoCaja.setText(resul.getString("MONTO"));}            
            
            for (int i = 0; i < facturas.size(); i++) {
            ClsFactura ingreso=(ClsFactura) facturas.get(i);
            idDetalle=ingreso.getId()+i;
            System.out.println(idDetalle);
            try {
            //Se agrega el o los productos de la factura a la tabla "DETALLE_FACTURA" de SQL Server
            Procedimientos.IngresarDetalleFactura(idDetalle,ingreso.getId(),ingreso.getCategoria(),
                    ingreso.getDescripcion(),String.valueOf(ingreso.getCantidad())
                    ,String.valueOf(ingreso.getPrecio()));            
            } catch (SQLException ex) {
                Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            //Se cambia la retencion y el vale de caja de nuevo a false para que se pueda ingresar otra factura
            retencion=false;
            valecaja=false;
            JOptionPane.showMessageDialog(null, "Factura ingresada con éxito");
            //Se limpian los campos y se reinician las variables globales
            limpiarRetencionVale();
            limpiarFactura();
            saldo=0;
            subtotal=0;
            sub0=0;
            iva=0;
            limpiarTabla();
            camposCliente(true);
            facturas.clear();
            }
        }catch (SQLException ex) {
            Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }    
        }
        
        }
    }//GEN-LAST:event_bGuardarFactActionPerformed

    private void bIngresarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarPActionPerformed
        //Permite ingresar y quitar productos de tabla de java netbeans y de un arreglo global
        if(!camposFacturaVacios()){     
            //Se revisa que el total, el precio y la cantidad sean números
           if(esNumerico(tTotal.getText())&&esNumerico(tPrecio.getText())&&
            esNumerico(tCantidad.getText())){            
            String num=tNumeFact.getText();
            String fecha=tFecha.getText();
            String prov=tProveedor.getText();
            String doc=tRuta.getText();
            double tot=Double.parseDouble(tTotal.getText());
            String cat=tCateg.getText();
            double pre=Double.parseDouble(tPrecio.getText());
            int can=Integer.parseInt(tCantidad.getText());                        
            String des=tDescrip.getText();
            //Se verifica si el producto tiene o no iva y se agrega al saldo dependiendo del caso
            if(cIva.isSelected()){
                iva=iva+pre*can*porcentajeiva;
                saldo=saldo+pre*can*porcentajeiva;
                IVA.setText(String.valueOf(iva));
                subtotal=subtotal+pre*can;
                SUBIVA.setText(String.valueOf(subtotal));
            }else{
               sub0=sub0+pre*can;
               SUBIVA0.setText(String.valueOf(sub0));
            }
            
            saldo=saldo+pre*can;
            TOTAL.setText(String.valueOf(saldo));
            //Se cambia tambien los campos de la pestaña de retención 
            TOTAL1.setText(TOTAL.getText());
            SUBIVA1.setText(SUBIVA.getText());
            SUBIVA2.setText(SUBIVA0.getText());
            IVA1.setText(IVA.getText());
            //facturas.clear();
            factura=new ClsFactura(num,fecha,doc,prov,tot,cat,can,pre,des);
            //System.out.println(factura);
            DefaultTableModel model = (DefaultTableModel) TablaFactura.getModel();            
            int a =TablaFactura.getRowCount()-1;  //Índices van de 0 a n-1            
            for(int i=a;i>=0;i--){            
            model.removeRow(i);
            }            
            //Se agrega al arreglo "factura" para ser mostrado en la tabla
            facturas.add(factura);            
            //System.out.println("NUEVO LINE");
            ClsFactura fac;
            for (int i = 0; i < facturas.size(); i++) {
                fac = (ClsFactura) facturas.get(i);
                System.out.print(i+"entra");  
                System.out.println(fac);
                Object facs[] = {fac.getId(), fac.getDescripcion(),fac.getCantidad(),fac.getPrecio()};
                model.insertRow(i, facs);                
            }
            
            //actualizarSaldo();
            /*Procedimientos.IngresarFactura(num, nombreUser, tc.getText(), pc.getText());
                JOptionPane.showMessageDialog(null, "Usuario ingresado con éxito");            
            try {
            ResultSet res = Conexiones.Conexion.Consulta("select * from USUARIO order by ID_USUARIO");
                while (res.next()) {
                    n = res.getString("NOMBRE_USUARIO");
                    i = res.getString("ID_USUARIO");
                    System.out.println(i + " " + n);
                    usuarios.add(i + " " + n);
                }
            System.out.println(usuarios);

            } catch (SQLException e) {}*/            
            camposCliente(false);
            limpiarProducto();
           }else{
             JOptionPane.showMessageDialog(null, "Ingrese valores numéricos donde corresponda");  
           }           
        }        
    }//GEN-LAST:event_bIngresarPActionPerformed

    private void bQuitarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuitarPActionPerformed
        //Permite retirar un producto de la factura seleccionando el mismo
        //Primero se pregunta si el producto tiene o no iva y dependiendo de esto, se elimina
        //y se repite el proceso de calculo similar al que que ocurre cuando se inserta un producto
        String productIva=JOptionPane.showInputDialog(null,"¿El producto tiene iva?(si/no)");
        DefaultTableModel tm = (DefaultTableModel) TablaFactura.getModel();
        String descrip=String.valueOf(tm.getValueAt(TablaFactura.getSelectedRow(),1));
        DefaultTableModel model;
        int[] rows;
        switch(productIva){
            case "si":
            for (int i = 0; i < facturas.size(); i++) {
            ClsFactura factur=(ClsFactura) facturas.get(i);
            if(factur.getDescripcion().equals(descrip)){
                iva=iva-factur.getCantidad()*factur.getPrecio()*porcentajeiva;
                saldo=saldo-factur.getCantidad()*factur.getPrecio()-factur.getCantidad()*factur.getPrecio()*porcentajeiva;
                subtotal=subtotal-factur.getCantidad()*factur.getPrecio();
                TOTAL.setText(String.valueOf(saldo));
                SUBIVA.setText(String.valueOf(subtotal));
                IVA.setText(String.valueOf(iva));
                facturas.remove(i);
                break;
            }
            }
            model = (DefaultTableModel) TablaFactura.getModel();
            rows = TablaFactura.getSelectedRows();
            for(int i=0;i<rows.length;i++){
                model.removeRow(rows[i]-i);          
            }
            ;
            break;
            
            case "no":
            for (int i = 0; i < facturas.size(); i++) {
            ClsFactura factur=(ClsFactura) facturas.get(i);
            if(factur.getDescripcion().equals(descrip)){
                saldo=saldo-factur.getCantidad()*factur.getPrecio();
                sub0=sub0-factur.getCantidad()*factur.getPrecio();
                TOTAL.setText(String.valueOf(saldo));
                SUBIVA0.setText(String.valueOf(sub0));
                facturas.remove(i);
                break;
            }
            }
            model = (DefaultTableModel) TablaFactura.getModel();
            rows = TablaFactura.getSelectedRows();
            for(int i=0;i<rows.length;i++){
                model.removeRow(rows[i]-i);          
            }
            ;
            break;
            default:JOptionPane.showMessageDialog(null, "Ingreso incorrecto, vuelva a intentar");
            break;
        
        }
        TOTAL1.setText(TOTAL1.getText());
        SUBIVA1.setText(SUBIVA.getText());
        SUBIVA2.setText(SUBIVA0.getText());
        IVA1.setText(IVA.getText());    
        
    }//GEN-LAST:event_bQuitarPActionPerformed

    private void tRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tRutaActionPerformed

    private void tFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFechaActionPerformed

    private void bGuardarSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarSolActionPerformed
        //Guarda la solicitud de requerimiento de material
        String departamento=(String)cDepar.getSelectedItem();
        String estado=(String) cEstado.getSelectedItem();
                
        if(tNumSol.getText().equals("")||tNomSol.getText().equals("")||tFechaSol.getText().equals("")
            ||estado.equals("")||departamento.equals("")||tRutaQuipux.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos");            
        }else{
            String solicitud=tNumSol.getText();
            String solicitante=tNomSol.getText();
            String fecha=tFechaSol.getText();
            String rutaQuipux=tRutaQuipux.getText();
            String idSol="";
            ResultSet resul = Conexiones.Conexion.Consulta
            ("select * from SOLICITUD where ID_SOLICITUD="+solicitud);
            try {                
            while (resul.next()) {
                idSol=resul.getString("ID_SOLICITUD");//System.out.println()
            }            
            if(solicitud.equals(idSol)){
               JOptionPane.showMessageDialog(null, "La solicitud que se quiere ingresar ya existe"); 
            }else{               
                Procedimientos.IngresarSolicitud(solicitud, solicitante,fecha,departamento,estado);
                JOptionPane.showMessageDialog(null, "Solcitud ingresada con éxito");
                limpiarSolicitud();
            }
            } catch (SQLException ex) {
                Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }//GEN-LAST:event_bGuardarSolActionPerformed

    private void bBuscarFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarFacActionPerformed
        //Busca una factura en la base de datos con el id y despliega la información respectiva
        String idBusca=JOptionPane.showInputDialog(null, "Ingrese el número de factura que busca:");
        if(idBusca.equals("")||!esNumerico(idBusca)){
            JOptionPane.showMessageDialog(null, "No se ingresó datos o el campo ingresado no es númerico"); 
        }else{
        String num=tNumeFact.getText();
        String fecha=tFecha.getText();
        String prov=tProveedor.getText();
        String doc=tRuta.getText();
        String tots="";
        String cat="";
        String des="";
        String can="";
        String pre="";
        
        
        ResultSet resul = Conexiones.Conexion.Consulta("select * from FACTURA where ID_FACTURA="+idBusca);
            try {
                while (resul.next()) {
                    num=resul.getString("ID_FACTURA");//System.out.println();                    
                }
                if(num.equals(idBusca)){
                limpiarTabla();
                resul = Conexiones.Conexion.Consulta("select * from FACTURA where ID_FACTURA="+idBusca);
                
                while (resul.next()) {
                    tots=resul.getString("TOTAL");
                    fecha=resul.getString("FECHA_FACTURA");
                    prov=resul.getString("NOMBRE_PROVEEDOR");
                    doc=resul.getString("DOCUMENTO_FACTURA");                
                }
                DefaultTableModel model = (DefaultTableModel) TablaFactura.getModel();
                int i=0;
                resul = Conexiones.Conexion.Consulta("select * from DETALLE_FACTURA where ID_FACTURA="+idBusca);
                while (resul.next()) {
                    //@categoria,@descripcion,@cant,@precio
                    idBusca=resul.getString("ID_FACTURA");                    
                    des=resul.getString("DESCRIPCION");
                    can=resul.getString("CANTIDAD");
                    pre=resul.getString("PRECIO_UNITARIO");
                    Object facs[] = {idBusca, des,can,pre};
                    model.insertRow(i, facs);
                    i++;
                }
                
                camposVisualizarFactura(false);
                tNumeFact.setText(idBusca);
                tProveedor.setText(prov);
                tTotal.setText(tots);
                tRuta.setText(doc);
                tFecha.setText(fecha);
                TOTAL.setText(tots);
                SUBIVA.setText(tots); 
                  
                }else{
                JOptionPane.showMessageDialog(null, 
                    "La factura ingresada no se encuentra en la base de datos");      
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
        //System.out.println(idBusca);
        
    }//GEN-LAST:event_bBuscarFacActionPerformed

    private void bNuevoFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoFacActionPerformed
        //limpia los campos de la factura
        camposVisualizarFactura(true);
        limpiarProducto();
        limpiarFactura();
        limpiarTabla();
    }//GEN-LAST:event_bNuevoFacActionPerformed

    private void SUBIVA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBIVA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUBIVA1ActionPerformed

    private void SUBIVA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBIVA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUBIVA2ActionPerformed

    private void CheckBoxIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxIVAActionPerformed
        //Habilita y deshabilita los campos del IVA dependiendo y si esta o no seleccionado el checkbox
        boolean habilitarIVA=true;
        if(CheckBoxIVA.isSelected()){
        BImponible.setEnabled(habilitarIVA);
        PRetencion.setEnabled(habilitarIVA);
        ValorRet.setEnabled(habilitarIVA);  
        }else{
        BImponible.setEnabled(!habilitarIVA);
        PRetencion.setEnabled(!habilitarIVA);
        ValorRet.setEnabled(!habilitarIVA);  
        }
        
    }//GEN-LAST:event_CheckBoxIVAActionPerformed

    private void CheckBoxIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxIRActionPerformed
            //Habilita y deshabilita los campos del IR dependiendo y si esta o no seleccionado el checkbox
        boolean habilitarIR=true;
        if(CheckBoxIR.isSelected()){
        BImponible1.setEnabled(habilitarIR);
        PRetencion1.setEnabled(habilitarIR);
        ValorRet1.setEnabled(habilitarIR);  
        }else{
        BImponible1.setEnabled(!habilitarIR);
        PRetencion1.setEnabled(!habilitarIR);
        ValorRet1.setEnabled(!habilitarIR);  
        }
    }//GEN-LAST:event_CheckBoxIRActionPerformed

    private void bAgregarRet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarRet1ActionPerformed
        double base=0,porcentaje=0,base1=0,porcentaje1=0;
        //Calcular la retencion de la factura y muestra la informacion
        if(CheckBoxIVA.isSelected()){        
            base=Double.parseDouble(BImponible.getText());
            porcentaje=Double.parseDouble(PRetencion.getText());
            ValorRet.setText(String.valueOf(base*porcentaje)); 
        }        
        if(CheckBoxIR.isSelected()){        
            base1=Double.parseDouble(BImponible1.getText());
            porcentaje1=Double.parseDouble(PRetencion1.getText());
            ValorRet1.setText(String.valueOf(base1*porcentaje1)); 
        }
        TotalRet.setText(String.valueOf(base*porcentaje+base1*porcentaje1));
    }//GEN-LAST:event_bAgregarRet1ActionPerformed

    private void bAgregarValeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarValeActionPerformed
        //Cambia el booleano del vale de caja a true para poder agregar una factura
        if(IdVale.getText().equals("")||Solicitante.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Uno o más campos del vale están vacíos");
        }else{
            valecaja=true;
            JOptionPane.showMessageDialog(null, "Vale de caja agregado");
        /*try {
        Procedimientos.IngresarVale(IdVale.getText(), tNumeFact.getText(),Solicitante.getText());
        
        } catch (SQLException ex) {
        Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }   */ 
        }
    }//GEN-LAST:event_bAgregarValeActionPerformed

    private void GenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarReporteActionPerformed
        //Se realiza una consulta de la base de datos uniendo varias tablas para mostrar
        //los campos deseados segun la fecha que el usuario ingrese para mostrar los datos
        //en la tabla de reporte de netbeans
        //También se calcula el total de factura del reporte y total de retencion del reporte
        ResultSet resul;
        String fechai=fechaInicial.getText();
        String fechaf=fechaFinal.getText();
        if(fechai.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar al menos la fecha de inicio"); 
        }else{
        if(fechaf.equals("")){
            resul = Conexiones.Conexion.Consulta("select  FACTURA.ID_VALE_CAJA_CHICA,"
            + "FACTURA.ID_FACTURA,FECHA_FACTURA, NOMBRE_ENCARGADA,\n" +
            "CATEGORIA_PARTIDA_PRESUPUESTARIA.CODIGO_CATEGORIA,CONCEPTO_PRODUCTO,VALOR_RETENCION,TOTAL\n" +
            "from VALE_CAJA_CHICA, RETENCION_FACTURA,CATEGORIA_PARTIDA_PRESUPUESTARIA,DETALLE_FACTURA,FACTURA\n" +
            "where \n" +
            "DETALLE_FACTURA.ID_FACTURA=FACTURA.ID_FACTURA  \n" +
            "and VALE_CAJA_CHICA.ID_FACTURA=FACTURA.ID_FACTURA \n" +
            "and RETENCION_FACTURA.ID_FACTURA=FACTURA.ID_FACTURA\n" +
            "and CATEGORIA_PARTIDA_PRESUPUESTARIA.CODIGO_CATEGORIA=DETALLE_FACTURA.CODIGO_CATEGORIA\n" +
            "and FECHA_FACTURA>'"+fechai+"' order by FACTURA.ID_FACTURA");
        }else{
            resul = Conexiones.Conexion.Consulta("select  FACTURA.ID_VALE_CAJA_CHICA,"
            + "FACTURA.ID_FACTURA,FECHA_FACTURA, NOMBRE_ENCARGADA,\n" +
            "CATEGORIA_PARTIDA_PRESUPUESTARIA.CODIGO_CATEGORIA,CONCEPTO_PRODUCTO,VALOR_RETENCION,TOTAL\n" +
            "from VALE_CAJA_CHICA, RETENCION_FACTURA,CATEGORIA_PARTIDA_PRESUPUESTARIA,DETALLE_FACTURA,FACTURA\n" +
            "where \n" +
            "DETALLE_FACTURA.ID_FACTURA=FACTURA.ID_FACTURA  \n" +
            "and VALE_CAJA_CHICA.ID_FACTURA=FACTURA.ID_FACTURA \n" +
            "and RETENCION_FACTURA.ID_FACTURA=FACTURA.ID_FACTURA\n" +
            "and CATEGORIA_PARTIDA_PRESUPUESTARIA.CODIGO_CATEGORIA=DETALLE_FACTURA.CODIGO_CATEGORIA\n" +
            "and FECHA_FACTURA>'"+fechai+"' and FECHA_FACTURA<'"+fechaf+"' order by FACTURA.ID_FACTURA");
        }
        String val="",fech,solicitante="",categoria="",producto="",reten="",total="";
        String idf1="",idf2="",v1="";        
        double totalfactura=0,totalretencion=0;
        int cont=0;
        limpiarTablaReporte();
        DefaultTableModel model = (DefaultTableModel) TablaReporte.getModel();
            try {
                //System.out.println(resul.);
                while (resul.next()) {
                    idf1=resul.getString("ID_FACTURA");
                    //resul.next();
                    
                    //idf2=resul.getString("ID_FACTURA");
                    //resul.previous();
                    if(idf1.equals(idf2)){ 
                      //idf2=idf1;
                      categoria=categoria+resul.getString("CODIGO_CATEGORIA");
                      producto=producto+resul.getString("CONCEPTO_PRODUCTO");  
                    }else{
                      categoria=categoria+resul.getString("CODIGO_CATEGORIA");
                      producto=producto+resul.getString("CONCEPTO_PRODUCTO");
                      val=resul.getString("ID_VALE_CAJA_CHICA");
                      fech=resul.getString("FECHA_FACTURA");
                      solicitante=resul.getString("NOMBRE_ENCARGADA");                      
                      reten=resul.getString("VALOR_RETENCION");
                      total=resul.getString("TOTAL");
                      
                      Object facs[] = {val, fech,solicitante,categoria,producto,reten,total};
                      model.insertRow(cont, facs);
                      categoria="";producto="";
                      cont++;
                      if(!v1.equals(val)){
                          v1=val;
                          totalfactura=totalfactura+Double.parseDouble(total);
                          totalretencion=totalretencion+Double.parseDouble(reten);
                      }
                    }                                     
                }
                txtTotalRetencion.setText(String.valueOf(totalretencion));
                txtTotalFactura.setText(String.valueOf(totalfactura));
                
            } catch (SQLException ex) {
                Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }//GEN-LAST:event_GenerarReporteActionPerformed

    private void SaldoCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaldoCajaActionPerformed

    private void txfReponerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfReponerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfReponerActionPerformed

    private void btReponerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReponerActionPerformed
        //Repone el monto de caja chica
        if(txfReponer.getText().equals("")||txfIdentificadorCaja.getText().equals("")
                ||txfFecha.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos");
        }else{            
                try {  
                    Procedimientos.Reponer(txfIdentificadorCaja.getText(),txfReponer.getText(), txfFecha.getText());
                    ResultSet resul = Conexiones.Conexion.Consulta
                    ("select TOP 1 MONTO from caja_chica order by FECHA_MONTO desc");
                    while(resul.next()){
                      SaldoCaja.setText(resul.getString("MONTO"));  
                    }
                    txfReponer.setText("");
                    txfIdentificadorCaja.setText("");
                    txfFecha.setText("");                    
                } catch (SQLException ex) {
                    Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
    }//GEN-LAST:event_btReponerActionPerformed

    private void txfFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfFechaActionPerformed

    private void txfIdentificadorCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdentificadorCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdentificadorCajaActionPerformed

    private void btActualizarMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarMontoActionPerformed
        //Muestra el monto actual en el campo de texto de "SaldoCaja" de la pestaña "Reponer"
        ResultSet resul = Conexiones.Conexion.Consulta("select TOP 1 MONTO from caja_chica order by FECHA_MONTO desc");
        try {
            while(resul.next()){
                SaldoCaja.setText(resul.getString("MONTO"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btActualizarMontoActionPerformed
    
    private boolean camposFacturaVacios(){
        boolean vacios=true;
        if(tNumeFact.getText().equals("")||tProveedor.getText().equals("")||tTotal.getText().equals("")
            ||tRuta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Uno o más campos del cliente están vacíos");
        }else{
            if(tCateg.getText().equals("")||tCantidad.getText().equals("")||tPrecio.getText().equals("")
            ||tDescrip.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Uno o más campos del producto están vacíos");
            }else{
                vacios=false;
            }            
        }        
        return vacios;
    }
    
    private void limpiarFactura(){
        tNumeFact.setText("");
        tProveedor.setText("");
        tTotal.setText("");
        tRuta.setText("");
        tFecha.setText("2018-01-21");
        TOTAL.setText("");
        SUBIVA.setText("");
        SUBIVA0.setText("");
        IVA.setText("");
        IdentificadorCaja.setText("");
    }
    private void limpiarProducto(){
        tCateg.setText("");
        tCantidad.setText("");
        tPrecio.setText("");
        tDescrip.setText("");        
    }
     private void limpiarSolicitud(){
        tNumSol.setText("");
        tNomSol.setText("");
        tFechaSol.setText("2018-01-21");
        tRutaQuipux.setText("");
        DefaultTableModel model = (DefaultTableModel) TablaSolicitud.getModel();         
        model.removeRow(0);            
    }
    
    
    private void camposCliente(boolean opcion){
        tNumeFact.setEnabled(opcion);
        tProveedor.setEnabled(opcion);
        tTotal.setEnabled(opcion);
        tRuta.setEnabled(opcion);
        tFecha.setEnabled(opcion);
        TablaFactura.setEnabled(!opcion);
        bGuardarFact.setEnabled(!opcion);
        bQuitarP.setEnabled(!opcion);   
    }
    
    private void camposVisualizarFactura(boolean opcion){
        tNumeFact.setEnabled(opcion);
        tProveedor.setEnabled(opcion);
        tTotal.setEnabled(opcion);
        tRuta.setEnabled(opcion);
        tFecha.setEnabled(opcion);        
        if(opcion){
        bGuardarFact.setEnabled(!opcion);
        bQuitarP.setEnabled(!opcion);
        //bAgregarVale.setEnabled(!opcion);
        //bAgregarRet.setEnabled(!opcion);        
        }else{
        bGuardarFact.setEnabled(opcion);
        bQuitarP.setEnabled(opcion);
        /*bAgregarVale.setEnabled(opcion);
        //bAgregarRet.setEnabled(opcion);
        TOTAL1.setText(TOTAL1.getText());
        SUBIVA1.setText(SUBIVA.getText());
        SUBIVA2.setText(SUBIVA0.getText());
        IVA1.setText(IVA.getText());*/
        }        
        bFacDig.setEnabled(opcion);
        bIngresarP.setEnabled(opcion);
    }
    
    private boolean esNumerico(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    public void limpiarTabla(){
        DefaultTableModel tb = (DefaultTableModel) TablaFactura.getModel();
        int a = TablaFactura.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }        
    }
    public void limpiarTablaReporte(){
        DefaultTableModel tb = (DefaultTableModel) TablaReporte.getModel();
        int a = TablaReporte.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }        
    }
    
    private void limpiarRetencionVale(){
        TOTAL1.setText("");
        SUBIVA1.setText("");
        SUBIVA2.setText("");
        IVA1.setText("");
        IdVale.setText("");
        Solicitante.setText("");
        ValorRet.setText("0");
        BImponible.setText("");
        PRetencion.setText("");
        ValorRet1.setText("0");
        BImponible1.setText("");
        PRetencion1.setText("");
        idRetencion.setText("");
        TotalRet.setText("");
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
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazUsuario(usuario,id_usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BImponible;
    private javax.swing.JTextField BImponible1;
    private javax.swing.JCheckBox CheckBoxIR;
    private javax.swing.JCheckBox CheckBoxIVA;
    private javax.swing.JButton GenerarReporte;
    private javax.swing.JTextField IVA;
    private javax.swing.JTextField IVA1;
    private javax.swing.JTextField IdVale;
    private javax.swing.JTextField IdentificadorCaja;
    private javax.swing.JTextField PRetencion;
    private javax.swing.JTextField PRetencion1;
    private javax.swing.JPanel PanelFactura;
    private javax.swing.JPanel PanelReponer;
    private javax.swing.JPanel PanelReportes;
    private javax.swing.JPanel PanelSolicitud;
    private javax.swing.JTextField SUBIVA;
    private javax.swing.JTextField SUBIVA0;
    private javax.swing.JTextField SUBIVA1;
    private javax.swing.JTextField SUBIVA2;
    private javax.swing.JTextField SaldoCaja;
    private javax.swing.JTextField Solicitante;
    private javax.swing.JTextField TOTAL;
    private javax.swing.JTextField TOTAL1;
    private javax.swing.JTable TablaFactura;
    private javax.swing.JTable TablaReporte;
    private javax.swing.JTable TablaSolicitud;
    private javax.swing.JTextField TotalRet;
    private javax.swing.JTextField ValorRet;
    private javax.swing.JTextField ValorRet1;
    private javax.swing.JPanel bAgregar;
    private javax.swing.JButton bAgregarRet;
    private javax.swing.JButton bAgregarRet1;
    private javax.swing.JButton bAgregarVale;
    private javax.swing.JButton bBuscarFac;
    private javax.swing.JButton bBuscarSol;
    private javax.swing.JButton bFacDig;
    private javax.swing.JButton bFactura;
    private javax.swing.JButton bGuardarFact;
    private javax.swing.JButton bGuardarSol;
    private javax.swing.JButton bIngrQuipux;
    private javax.swing.JButton bIngresarP;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bNuevoFac;
    private javax.swing.JButton bQuitarP;
    private javax.swing.JButton bQuitarP1;
    private javax.swing.JButton btActualizarMonto;
    private javax.swing.JButton btReponer;
    private javax.swing.JComboBox<String> cDepar;
    private javax.swing.JComboBox<String> cEstado;
    private javax.swing.JCheckBox cIva;
    private javax.swing.JTextField fechaFinal;
    private javax.swing.JTextField fechaInicial;
    private javax.swing.JTextField idRetencion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tCantidad;
    private javax.swing.JTextField tCateg;
    private javax.swing.JTextField tDescrip;
    private javax.swing.JTextField tFecha;
    private javax.swing.JTextField tFechaSol;
    private javax.swing.JTextField tNomSol;
    private javax.swing.JTextField tNumSol;
    private javax.swing.JTextField tNumeFact;
    private javax.swing.JTextField tPrecio;
    private javax.swing.JTextField tProveedor;
    private javax.swing.JTextField tRuta;
    private javax.swing.JTextField tRutaQuipux;
    private javax.swing.JTextField tTotal;
    private javax.swing.JTextField txfFecha;
    private javax.swing.JTextField txfIdentificadorCaja;
    private javax.swing.JTextField txfReponer;
    private javax.swing.JTextField txtTotalFactura;
    private javax.swing.JTextField txtTotalRetencion;
    private javax.swing.JLabel txtUser;
    private javax.swing.JLabel txtUser1;
    // End of variables declaration//GEN-END:variables
}
