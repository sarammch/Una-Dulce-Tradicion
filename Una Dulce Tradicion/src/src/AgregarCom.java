/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;


import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import static src.AgregarVe.rs;

/**
 * 
 * @author spc_j
 */

public class AgregarCom extends javax.swing.JDialog {

    static ResultSet rs;
    
    /**
     * Creates new form Agregar
     */
    //Este arreglo guarda los IdP
    String IdMateriasPrima[];
    //Este arreglo guarda el subtotal de producto
    float SubCompras[];
    //Este arreglo guarda la cantidad de compra
    int CanCompras[];
    //Array que recibe los costos de cada producto comprado
    float Costos[];
    //Este arreglo guarda la existencia para modificarla
    int ExistenciaCompras[];
    //Para saber cuantos productos van
    int contP=0;
    
    
    String IdCom;
    String IdMP;
    int CantidadCom;
    float SubtotalCom;
    String IdTra;
    String IdPv;
    float TotalCom =0;
    String FechaCompras;
    //envia guardar con esto escrito
    String cadena;
    String consulta;
    //Para validar las claves
    int cont2=0;
    int contArreglo;
    String i;
    int id;
    
    public AgregarCom(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdCom = new javax.swing.JTextField();
        txtIdP = new javax.swing.JTextField();
        txtIdPv = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnFinalizarCompra = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtFechaCom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNomP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotalCom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnBuscarPro = new javax.swing.JButton();
        btnAgregarDatos = new javax.swing.JButton();
        txtNomPv = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCompra = new javax.swing.JTable();
        btnGenerar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Compra");
        setSize(new java.awt.Dimension(1033, 756));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("CLAVE DE COMPRA:");

        jLabel2.setText("CLAVE DE MATERIA PRIMA:");

        jLabel4.setText("CLAVE DEL PROVEEDOR:");

        jLabel5.setText("CANTIDAD (GR): ");

        txtIdCom.setEditable(false);
        txtIdCom.setBackground(new java.awt.Color(255, 255, 204));
        txtIdCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdComActionPerformed(evt);
            }
        });

        txtIdP.setEditable(false);
        txtIdP.setBackground(new java.awt.Color(204, 204, 255));

        txtIdPv.setBackground(new java.awt.Color(187, 187, 187));
        txtIdPv.setSelectionColor(new java.awt.Color(204, 255, 255));
        txtIdPv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPvActionPerformed(evt);
            }
        });

        txtCosto.setEditable(false);
        txtCosto.setBackground(new java.awt.Color(204, 204, 255));
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        btnBuscarProducto.setText("BUSCAR MATERIA PRIMA");
        btnBuscarProducto.setEnabled(false);
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnFinalizarCompra.setText("FINALIZAR COMPRA");
        btnFinalizarCompra.setEnabled(false);
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });

        jLabel7.setText("FECHA DE COMPRA");

        txtFechaCom.setEditable(false);
        txtFechaCom.setBackground(new java.awt.Color(204, 255, 255));

        jLabel8.setText("NOMBRE MATERIA PRIMA:");

        txtNomP.setEditable(false);
        txtNomP.setBackground(new java.awt.Color(204, 204, 255));

        jLabel9.setText("TOTAL:");

        txtTotalCom.setEditable(false);

        jLabel11.setText("NOMBRE DEL PROVEEDOR:");

        btnBuscarPro.setText("BUSCAR");
        btnBuscarPro.setEnabled(false);
        btnBuscarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProActionPerformed(evt);
            }
        });

        btnAgregarDatos.setText("AGREGAR DATOS");
        btnAgregarDatos.setEnabled(false);
        btnAgregarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDatosActionPerformed(evt);
            }
        });

        txtNomPv.setEditable(false);
        txtNomPv.setBackground(new java.awt.Color(204, 255, 255));

        btnCancelar.setText("CANCELAR COMPRA");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tablaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave de la materia prima", "Nombre de la materia prima", "Precio", "Cantidad", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaCompra);
        if (tablaCompra.getColumnModel().getColumnCount() > 0) {
            tablaCompra.getColumnModel().getColumn(0).setResizable(false);
            tablaCompra.getColumnModel().getColumn(0).setPreferredWidth(150);
            tablaCompra.getColumnModel().getColumn(1).setResizable(false);
            tablaCompra.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaCompra.getColumnModel().getColumn(2).setResizable(false);
            tablaCompra.getColumnModel().getColumn(3).setResizable(false);
            tablaCompra.getColumnModel().getColumn(4).setResizable(false);
        }

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel13.setText("COSTO POR KG:");

        txtCantidad.setEditable(false);
        txtCantidad.setBackground(new java.awt.Color(204, 204, 255));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnFinalizarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscarProducto)
                                    .addComponent(txtIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFechaCom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTotalCom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnAgregar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdCom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGenerar)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomP, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnBuscarPro)
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomPv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregarDatos)))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPro)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomPv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdP))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBuscarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaCom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalCom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnFinalizarCompra))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdComActionPerformed
        txtIdCom.setEditable(false);
    }//GEN-LAST:event_txtIdComActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        String auxP = txtIdP.getText();
        if (auxP.length() == 4){
            if(Character.isDigit(auxP.charAt(0))&& Character.isDigit(auxP.charAt(1))&& Character.isDigit(auxP.charAt(2))){
                try{
                    //obtiene el id ingresado y lo busca en la tabla
                    consulta="execute busquedaMP "+"'"+ auxP+"'";
                    rs = Conexion.Consulta(consulta);
                    rs.next();
                    if(rs.getString(1).equals(auxP) && rs.getString(2) != null){
                        txtNomP.setText(rs.getString(2));
                        txtCosto.setEditable(true);
                        txtCantidad.setEditable(true);
                        btnAgregar.setEnabled(true);     
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "La clave no existe", 
                            "Clave no valida", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(this, "La clave no existe", 
                            "Clave no valida", JOptionPane.ERROR_MESSAGE);
                        txtNomP.setText("");
                        txtIdPv.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "La clave de la materia prima debe ser una cadena de 4 digitos 0-9", 
                    "Clave no valida", JOptionPane.ERROR_MESSAGE);
                txtIdP.setText("");
            }     
        }
        else{
            JOptionPane.showMessageDialog(this, "La clave de la materia prima debe ser una cadena de 4 digitos 0-9", 
                    "Clave no valida", JOptionPane.ERROR_MESSAGE);
            txtIdP.setText("");
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        //Inivia el total en 0
        TotalCom=0;
        FechaCompras = txtFechaCom.getText();
        if (FechaCompras.length() == 10){
            //Valida que este en el formato de 00/00/00
            if(Character.isDigit(FechaCompras.charAt(0))&& Character.isDigit(FechaCompras.charAt(1)) && FechaCompras.charAt(2) == '/'
                && Character.isDigit(FechaCompras.charAt(3)) && Character.isDigit(FechaCompras.charAt(4)) && FechaCompras.charAt(5) == '/'
                && Character.isDigit(FechaCompras.charAt(6)) && Character.isDigit(FechaCompras.charAt(7)) 
                && Character.isDigit(FechaCompras.charAt(8)) && Character.isDigit(FechaCompras.charAt(9))){
                //Confirma compra
                int r = JOptionPane.showConfirmDialog(this, "¿Quieres confirmar la compra?",
                        "CONFIRMAR COMPRA",
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null);
                if(r == JOptionPane.YES_OPTION){
                    String cadena1;
                    String cadena2;
                    String cadena3;
                    String cadena4;
                    IdCom = txtIdCom.getText();
                    IdPv= txtIdPv.getText();
                    for(int x=0; x<contP; x++){
                        //Agrega cada uno de los productos del arreglo a la tabla
                        cadena1 = "execute agregarCompra '"+IdCom+"','"+IdMateriasPrima[x]+"', "+CanCompras[x]+" ,"+Costos[x]+","+SubCompras[x];
                        Conexion.Enviar(cadena1);
                        //Modifica la existencia de los productos
                        cadena2 = "execute modificarExMP "+ExistenciaCompras[x]+" , '"+IdMateriasPrima[x]+"'";
                        Conexion.Enviar(cadena2);
                        //Suma los subtotales para sacar el total
                        TotalCom += SubCompras[x];
                    }
                    //Agrega datos a la tabla encabezado Ventas
                    cadena4 = "execute agregarCompra2'"+IdCom+"','"+IdPv+"','"+FechaCompras+"',"+TotalCom;
                    Conexion.Enviar(cadena4);
                    //Se aumenta el numero de registros de compras
                    id++;
                    cadena3 = "execute modificarIdentiCom "+id;
                    Conexion.Enviar(cadena3);
                    //Al finalizar la compra el puntero del arreglo se manda al 0
                    contP=0;
                    TotalCom=0;
                    txtFechaCom.setText("");
                    this.dispose();
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "La Fecha debe estar en el formato 00/00/0000 con BARRAS", 
                    "FORMATO NO VALIDO", JOptionPane.ERROR_MESSAGE);
                txtFechaCom.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "La Fecha debe estar en el formato 00/00/0000 con BARRAS", 
                "FORMATO NO VALIDO", JOptionPane.ERROR_MESSAGE);
            txtFechaCom.setText(""); 
        }
        
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void btnBuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProActionPerformed
        String auxProveedor = txtIdPv.getText();
        int cont1=0;
        for (int x=1; x<auxProveedor.length(); x++){
            if (Character.isDigit(auxProveedor.charAt(x))){
                cont1 ++;  
            }
        }
        if (auxProveedor.length() == 4){
            if(auxProveedor.charAt(0) == 'R' && cont1 == 3){
                try{
                    //busca la clave del proveedor
                    cadena="execute consultarPv '"+ txtIdPv.getText()+"'";
                    rs = Conexion.Consulta(cadena);
                    rs.next();
                    if(rs.getString(1).equals(auxProveedor)&& rs.getString(2) != null){
                        txtNomPv.setText(rs.getString(2));
                        txtIdPv.setEditable(false);
                        //esto es para saber que ya ingreso las 2 claves
                        cont2 ++;
                        btnBuscarPro.setEnabled(true);
                        btnAgregarDatos.setEnabled(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "EL proveedor no existe", 
                        "Proveedor no existente", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(this, "La clave no existe", 
                        "Clave no valida", JOptionPane.ERROR_MESSAGE);
                    txtIdPv.setText("");
                }
                catch(NullPointerException e){
                    System.out.println(e.getMessage());
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "La clave del proveedor debe contener R y 3 numeros enteros del 0-9", 
                    "Clave no valida", JOptionPane.ERROR_MESSAGE);
                txtIdPv.setText("");
            }     
        }
        else{
            JOptionPane.showMessageDialog(this, "La clave del proveedor debe contener R y 3 numeros enteros del 0-9", 
                    "Clave no valida", JOptionPane.ERROR_MESSAGE);
            txtIdPv.setText("");
        }
    }//GEN-LAST:event_btnBuscarProActionPerformed

    private void btnAgregarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDatosActionPerformed
        //valida que se hayan ingresado las claves del trabajador y del cliente
        if(cont2 >= 1){
            int res = JOptionPane.showConfirmDialog(this, "¿Esta seguro de Agregar los datos?",
                "GUARDAR CLAVES",
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null);
            if(res == JOptionPane.YES_OPTION){
                IdCom = txtIdPv.getText();
                txtIdPv.setEditable(false);         
                btnBuscarPro.setEnabled(false);
                btnAgregarDatos.setEnabled(false);
                btnBuscarProducto.setEnabled(true);
                txtIdP.setEditable(true);
             }
            else{
                //si no lo agrega borra los datos de cliente y trabajador
        
                txtIdPv.setText("");

                txtNomPv.setText("");
                txtIdPv.setEditable(true);
                btnBuscarPro.setEnabled(true);
            }   
        }
        else{
            JOptionPane.showMessageDialog(this, "INGRESA LA CLAVE DEL PROVEEDOR PARA CONTINUAR CON LA COMPRA", 
                "INCORRECTO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarDatosActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try{
            //se creó una tabla para guardar el numero de datos que hay para asi generar lo Id
            consulta = "buscarIdentificador 1";
            rs = Conexion.Consulta(consulta);
            rs.next();
            id = rs.getInt(7);
            i = String.valueOf(id);
            if(id<= 9){
                txtIdCom.setText("O"+"0000"+i);
            }
            else if(id<=99){
                txtIdCom.setText("O"+"000"+i);
            }
            else if(id<=999){
                txtIdCom.setText("O"+"00"+i);
            }
            else if(id<=9999){
                txtIdCom.setText("O"+"0"+i);
            }
            else{
                txtIdCom.setText("O"+i);
            }
            txtIdPv.setEditable(true);
            btnBuscarPro.setEnabled(true);
            btnGenerar.setEnabled(false);
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
            if(!Character.isDigit(c) && c != '.'){
                evt.consume();
            }
    }//GEN-LAST:event_txtCostoKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        //Crea el modelo para la tabla
        DefaultTableModel modelo =(DefaultTableModel) tablaCompra.getModel();
        String auxCant = txtCantidad.getText();
        int contB = 0;
        int aCant ;
        int cont1=0;
        //validaciones
        for (int x=0; x<auxCant.length(); x++){
            if (Character.isDigit(auxCant.charAt(x))){
                cont1 ++;  
            }
        }
        if(cont1 == auxCant.length() && cont1!=0){
            aCant = Integer.parseInt(auxCant);
            //valida que la cantidad sea mayor que 0
            if(aCant > 0 && aCant < 99999){
                try{
                    //con esto se valida que haya en existencia para esa cantidad
                    consulta="execute busquedaMP '"+ txtIdP.getText()+"'";
                    rs = Conexion.Consulta(consulta);
                    rs.next();
                    if(true){
                        //itera entre el arreglo para buscar si el producto agregado ya fue agregado con anterioridad
                        if(contP != 0){
                            for(int y=0; y<contP; y++){
                                if(IdMateriasPrima[y].equals(txtIdP.getText())){ 
                                    contB++;
                                } 
                            }
                        }
                        if(contB==0){
                            int r = JOptionPane.showConfirmDialog(this, "¿Esta seguro de Agregar Materia Prima?",
                                "CONFIRMAR MATERIA PRIMA",
                                JOptionPane.YES_NO_OPTION, 
                                JOptionPane.QUESTION_MESSAGE, null);
                            if(r == JOptionPane.YES_OPTION){
                                //aqui guarda en los arreglos los idP, Cantidad y el subtotal ademas la existencia
                                float costoA= Float.parseFloat(txtCosto.getText());
                                Costos[contP]= costoA;
                                IdMateriasPrima[contP]=txtIdP.getText();
                                CanCompras[contP]=aCant;
                                ExistenciaCompras[contP]=(rs.getInt(3)+aCant);
                                //multiplica la cantidad DIVIDIDA ENTRE 1000 GR por el costo POR KG para sacar el subtotal
                                SubtotalCom = (float)(aCant/1000)*costoA;
                                SubCompras[contP]=SubtotalCom;
                                //al agregar en el arreglo se aumenta la posicion
                                contP++;
                                txtCosto.setText(null);
                                txtCantidad.setText(null);
                                //Se van sumando los subtotales para sacar el total de la compra
                                TotalCom=TotalCom+SubtotalCom;                           
                                //crea un vector y lo agrega a la tabla
                                Vector v = new Vector();
                                v.add(rs.getString(1));
                                v.add(rs.getString(2));
                                v.add(String.valueOf(costoA));
                                v.add(String.valueOf(aCant));
                                v.add(String.valueOf(SubtotalCom));
                                modelo.addRow(v);
                                tablaCompra.setModel(modelo);
                                txtTotalCom.setText(String.valueOf(TotalCom));
                                //habilita y deshabilita cosas
                                txtCosto.setEditable(false);
                                txtIdP.setText("");
                                txtNomP.setText("");
                                btnAgregar.setEnabled(false);
                                btnFinalizarCompra.setEnabled(true);
                                txtFechaCom.setEditable(true);
                                
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Esta materia prima ya fue agregada", 
                                "MATERIA PRIMA REPETIDA", JOptionPane.ERROR_MESSAGE);
                            txtIdP.setText("");
                            txtNomP.setText("");
                            txtCosto.setText("");
                        }
                    }
                }
                catch(SQLException e){}
                

            }
            else{
                JOptionPane.showMessageDialog(this, "La cantidad debe ser un numero entero de 0-99999", 
                    "Cantidad no valida", JOptionPane.ERROR_MESSAGE);
                txtCosto.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un numero entero", 
                "Cantidad no valida", JOptionPane.ERROR_MESSAGE);
            txtCosto.setText("");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtIdPvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPvActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
             //cuenta la cantidad de productos par saber cuando se pueden agregar a la venta       
            consulta="execute cuentaMPS";
            rs = Conexion.Consulta(consulta);
            rs.next();
            contArreglo = rs.getInt(1);
            if(contArreglo!=0){
                //Esta inicializando los arreglos con el tamaño de la cantidad de productos que tenemos
                //para mandarlo a la tabla
                IdMateriasPrima = new String[contArreglo];
                SubCompras = new float[contArreglo];
                CanCompras = new int[contArreglo];
                ExistenciaCompras = new int[contArreglo];
                Costos = new float[contArreglo];
            }
            else{
                JOptionPane.showMessageDialog(this, "NO SE PUEDE REALIZAR UNA COMPRA SI NO HAY MATERIA PRIMA REGISTRADA", 
                            "COMPRAS", JOptionPane.ERROR_MESSAGE);
                this.dispose();
            }
        }
        catch(SQLException e){}
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarDatos;
    private javax.swing.JButton btnBuscarPro;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCompra;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtFechaCom;
    private javax.swing.JTextField txtIdCom;
    private javax.swing.JTextField txtIdP;
    private javax.swing.JTextField txtIdPv;
    private javax.swing.JTextField txtNomP;
    private javax.swing.JTextField txtNomPv;
    private javax.swing.JTextField txtTotalCom;
    // End of variables declaration//GEN-END:variables
}
