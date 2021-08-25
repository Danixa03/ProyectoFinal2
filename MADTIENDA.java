
package com.mycompany.proyectofinal2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MADTIENDA extends javax.swing.JFrame {
private ArrayList<ArticulosTienda> listaArticulos;
   
    public MADTIENDA() {
        listaArticulos=new ArrayList<>();
        initComponents();
        this.tabladetalle.setModel(modelo);
        this.modelo.addColumn("Date");
        this.modelo.addColumn("Cliente");
        this.modelo.addColumn("Cedula");
        this.modelo.addColumn("Código");
        this.modelo.addColumn("Nom. Articulo");
        this.modelo.addColumn("Tipo");
        this.modelo.addColumn("Cantidad");
        this.modelo.addColumn("Pre. por unidad");
        this.modelo.addColumn("Subtotal");
        this.modelo.addColumn("IVA");
        this.modelo.addColumn("Total Pagar");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtiva = new javax.swing.JTextField();
        txtdescuento = new javax.swing.JTextField();
        txtsubtotal = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        cboarticulo = new javax.swing.JComboBox<>();
        date = new com.toedter.calendar.JDateChooser();
        txtnombre = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        btingresar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        btlimpiartabla = new javax.swing.JButton();
        btcalcular = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtconsultar = new javax.swing.JTextField();
        btconsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        bteliminar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtneto = new javax.swing.JTextField();
        btneto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bienvenido a MAD Store", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 2, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del Cliente");

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cédula");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Artículo");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("IVA");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Descuento");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Subtotal");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total");

        txtcodigo.setBackground(new java.awt.Color(153, 153, 255));
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txttipo.setBackground(new java.awt.Color(153, 153, 255));

        txtcantidad.setBackground(new java.awt.Color(153, 153, 255));

        txtprecio.setBackground(new java.awt.Color(153, 153, 255));

        txtiva.setBackground(new java.awt.Color(153, 153, 255));
        txtiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtivaActionPerformed(evt);
            }
        });

        txtdescuento.setBackground(new java.awt.Color(153, 153, 255));

        txtsubtotal.setBackground(new java.awt.Color(153, 153, 255));
        txtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalActionPerformed(evt);
            }
        });

        txttotal.setBackground(new java.awt.Color(153, 153, 255));

        cboarticulo.setBackground(new java.awt.Color(153, 153, 255));
        cboarticulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "PC Gamer", "Parlantes", "Teclado", "Laptop" }));

        date.setBackground(new java.awt.Color(153, 153, 255));

        txtnombre.setBackground(new java.awt.Color(153, 153, 255));

        txtcedula.setBackground(new java.awt.Color(153, 153, 255));

        btingresar.setBackground(new java.awt.Color(0, 255, 102));
        btingresar.setText("Ingresar");
        btingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btingresarActionPerformed(evt);
            }
        });

        btmodificar.setBackground(new java.awt.Color(255, 255, 0));
        btmodificar.setText("Modificar");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });

        btlimpiar.setBackground(new java.awt.Color(153, 0, 204));
        btlimpiar.setText("Limpiar");
        btlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarActionPerformed(evt);
            }
        });

        btlimpiartabla.setBackground(new java.awt.Color(255, 255, 153));
        btlimpiartabla.setText("Limpiar tabla");
        btlimpiartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiartablaActionPerformed(evt);
            }
        });

        btcalcular.setBackground(new java.awt.Color(255, 204, 153));
        btcalcular.setText("Calcular");
        btcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcalcularActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Consultar artículo por código");

        txtconsultar.setBackground(new java.awt.Color(153, 153, 255));

        btconsultar.setBackground(new java.awt.Color(51, 255, 153));
        btconsultar.setText("Consultar");
        btconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultarActionPerformed(evt);
            }
        });

        tabladetalle.setBackground(new java.awt.Color(102, 102, 255));
        tabladetalle.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladetalle);

        bteliminar.setBackground(new java.awt.Color(153, 0, 51));
        bteliminar.setText("Eliminar");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        btsalir.setBackground(new java.awt.Color(255, 0, 0));
        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Pago neto");

        txtneto.setBackground(new java.awt.Color(153, 153, 255));

        btneto.setBackground(new java.awt.Color(255, 0, 204));
        btneto.setText("Pago neto");
        btneto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel6)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btsalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtneto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btneto)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(135, 135, 135)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btingresar)
                                .addComponent(bteliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btconsultar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(74, 74, 74)
                                                                .addComponent(jLabel10))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(56, 56, 56)
                                                                .addComponent(cboarticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel11)
                                                                .addGap(66, 66, 66))))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(42, 42, 42)
                                                        .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(36, 36, 36)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jLabel12))
                                                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(29, 29, 29)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(25, 25, 25)
                                                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(btcalcular)))))
                                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(74, 74, 74)))
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btlimpiar)
                                    .addComponent(btlimpiartabla)
                                    .addComponent(btmodificar))))
                        .addContainerGap(75, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btmodificar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btlimpiar)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btlimpiartabla)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboarticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btcalcular)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btconsultar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bteliminar)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtneto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btsalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btingresar)
                .addGap(240, 240, 240))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
DefaultTableModel modelo = new DefaultTableModel();
    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubtotalActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtivaActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btsalirActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        int numeroFila = this.tabladetalle.getSelectedRow();
        modelo.removeRow(numeroFila);
        listaArticulos.remove(numeroFila);
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btingresarActionPerformed
         this.modelo.addRow(new Object[]{this.date.getDate(), this.txtnombre.getText(), this.txtcedula.getText(),
            this.txtcodigo.getText(), this.cboarticulo.getSelectedItem(), this.txttipo.getText(),
            this.txtcantidad.getText(), this.txtprecio.getText(), this.txtsubtotal.getText(), calcularIVA(),
            this.txttotal.getText()});
        listaArticulos.add(new ArticulosTienda(this.date.getDate().toString(), this.txtnombre.getText(), this.txtcedula.getText(),
                this.txtcodigo.getText(), this.cboarticulo.getSelectedItem().toString(), this.txttipo.getText(),
                this.txtcantidad.getText(), this.txtprecio.getText(), this.txtsubtotal.getText(), calcularIVA(),
                this.txttotal.getText()));
    }//GEN-LAST:event_btingresarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        int fila;
        String cliente;
        ArticulosTienda articulo;
        try {
            fila = this.tabladetalle.getSelectedRow();
            articulo = listaArticulos.get(fila);
            cliente = JOptionPane.showInputDialog("Ingrese el nuevo nombre del cliente:");
            articulo.setCliente(cliente);
            actualizarTabla(cliente, fila, 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revise el dato");
        }
    }//GEN-LAST:event_btmodificarActionPerformed

    private void btconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultarActionPerformed
        if (!txtconsultar.getText().isEmpty()){
            ArticulosTienda buscar= null;
            String dato= txtconsultar.getText();
            for (int i=0;i<listaArticulos.size();i++){
                buscar=listaArticulos.get(i);
                if (buscar.getCodigo().equals(dato)){
                    mostrardatos(buscar);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese un código");
        }
    }
          private void mostrardatos(ArticulosTienda buscar){
              String matriz [][]=new String [1][4];
              matriz[0][0] = buscar.getCodigo();
              matriz[0][1] = buscar.getNomArticulo();
              matriz[0][2] = buscar.getTipo();
              matriz[0][3] = buscar.getPrePorUnidad();
              
            tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Código", "Producto", "Tipo", "Precio"
                }
        ));
    }//GEN-LAST:event_btconsultarActionPerformed

    private void btcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcalcularActionPerformed
        double iva;
        double descuento;
        iva = 0.13;
        descuento = 0.2;
        double cantidad;
        double precio;
        double totalpagar;
        double precioconiva;
        double cantdescuento;
        double preciosiniva;
        double totalpago;
        double totaldef;
        double totalneto;
        cantidad = Double.parseDouble(txtcantidad.getText());
        precio = Double.parseDouble(txtprecio.getText());
        iva = Double.parseDouble(txtiva.getText());
        descuento = Double.parseDouble(txtdescuento.getText());
        preciosiniva = precio * cantidad;
        precioconiva = preciosiniva * iva;
        cantdescuento = descuento;
        totalpagar = preciosiniva + precioconiva;
        totalpago=totalpagar*descuento;
        totaldef=preciosiniva-totalpago;
        totalneto=totaldef+precioconiva;
        
        txttotal.setText("" + totalneto);
        txtsubtotal.setText("" + preciosiniva);
    }//GEN-LAST:event_btcalcularActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
         this.txtnombre.setText("");
        this.txtcedula.setText("");
        this.txtcodigo.setText("");
        this.cboarticulo.setSelectedIndex(0);
        this.txttipo.setText("");
        this.txtcantidad.setText("");
        this.txtprecio.setText("");
        this.date.setDate(null);
        this.txtsubtotal.setText("");
        this.txttotal.setText("");
    }//GEN-LAST:event_btlimpiarActionPerformed

    private void btnetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnetoActionPerformed
        double suma;
        double suma1 = 0;
        int totalrow = tabladetalle.getRowCount();
        totalrow-= 1;
        for (int i = 0; i <= (totalrow); i++) {
            suma = Double.parseDouble(String.valueOf(tabladetalle.getValueAt(i, 10)));
            suma1+=suma;
        }
        txtneto.setText("₡" + String.valueOf(suma1));  
    }//GEN-LAST:event_btnetoActionPerformed

    private void btlimpiartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiartablaActionPerformed
        try { 
            this.txtneto.setText("");
            int x=this.modelo.getRowCount();
            for (int y=0; y<=x;y++){
                this.modelo.removeRow(0);
            } 
        } catch (Exception e ) { 
            JOptionPane.showMessageDialog(null,"Se limpio correctamente");
        }
    }//GEN-LAST:event_btlimpiartablaActionPerformed
 public String calcularIVA() {
        DecimalFormat df = new DecimalFormat("###.##");
        return String.valueOf(df.format(Double.parseDouble(this.txtsubtotal.getText()) * Double.parseDouble(this.txtiva.getText())));
    }
 private void actualizarTabla(String valor, int fila, int columna) {
        this.tabladetalle.setValueAt(valor, fila, columna);
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
            java.util.logging.Logger.getLogger(MADTIENDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MADTIENDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MADTIENDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MADTIENDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MADTIENDA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcalcular;
    private javax.swing.JButton btconsultar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btingresar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JButton btlimpiartabla;
    private javax.swing.JButton btmodificar;
    private javax.swing.JButton btneto;
    private javax.swing.JButton btsalir;
    private javax.swing.JComboBox<String> cboarticulo;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtconsultar;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtneto;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttipo;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
