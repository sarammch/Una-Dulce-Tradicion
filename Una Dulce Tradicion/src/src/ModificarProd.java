/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet; 
import javax.swing.JOptionPane;
/**
 *
 * @author eliez
 */
public class ModificarProd extends javax.swing.JDialog {

    static String Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String URL="jdbc:sqlserver://localhost:1433;DatabaseName=cafeteria;";

    static String user="sa";
    static String pass="sa";
	
    static Connection con=null;
    static Statement stmt = null;
    static ResultSet rs = null;
    int id; 
    /**
     * Creates new form ModificarProd
     */
    public ModificarProd(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
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

        jLabel4 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnmodificarIdP = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCantidadEx = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        ComboTam = new javax.swing.JComboBox<>();
        ComboTipoP = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar producto");

        jLabel4.setText("Tipo de producto:");

        txtNombreP.setEditable(false);

        jLabel5.setText("Precio del producto:");

        txtPrecio.setEditable(false);

        jLabel6.setText("Tamaño del producto");

        btnmodificarIdP.setText("Buscar clave");
        btnmodificarIdP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarIdPActionPerformed(evt);
            }
        });

        jLabel7.setText("Cantidad existente:");

        txtCantidadEx.setEditable(false);

        btnGuardar.setText("Guardar cambios");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        ComboTam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chico", "Mediano", "Grande"}));

        ComboTipoP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebida", "Postre"}));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Modificar productos");

        jLabel2.setText("Clave del producto:");

        jLabel3.setText("Nombre del producto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtIdP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnmodificarIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtCantidadEx)
                        .addComponent(ComboTam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboTipoP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificarIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboTipoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCantidadEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnmodificarIdPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarIdPActionPerformed
        int cont =0,to, te;
        if(txtIdP.getText().length() > 0){
            for(int x=0; x< txtIdP.getText().length(); x++){
                if(txtIdP.getText().charAt(x) >= 48 && txtIdP.getText().charAt(x) <= 57){
                    cont++;
                }
            }
            if(cont == txtIdP.getText().length()){
                if(txtIdP.getText().length()== 3){
                    try{
                        Class.forName(Driver);
                        con= DriverManager.getConnection(URL,user,pass);
                        Statement st = con.createStatement();
                        rs = st.executeQuery("execute consultarProd '"+txtIdP.getText()+"'");
                        rs.next();
                        if(rs.getString(2) != null ){
                            txtNombreP.setText(rs.getString(2));
                            //ComboTipoP.setSelectedItem(rs.getString(3));
                            if(rs.getString(3).equals('B')){to=0;}else{to=1;}
                            if(rs.getString(5).equals("CH")){te=0;}else if(rs.getString(5).equals("ME")){te=1;}else{te=2;}
                            txtPrecio.setText(rs.getString(4));
                            ComboTam.setSelectedIndex(te);
                            txtCantidadEx.setText(rs.getString(6));
                            ComboTipoP.setSelectedIndex(to);
                            txtNombreP.setEditable(true);
                            ComboTipoP.setEditable(true);
                            txtPrecio.setEditable(true);
                            ComboTam.setEditable(true);
                            txtCantidadEx.setEditable(true);
                            btnGuardar.setEnabled(true);
                            txtIdP.setEditable(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "No hay datos registrados con esta clave",
                                "Clave no encontrada", JOptionPane.INFORMATION_MESSAGE);
                        }
                        if(con != null){
                            con.close();
                        }

                    }
                    catch(java.lang.ClassNotFoundException e){
                        System.out.println(e.getMessage());
                        System.out.println("Problemas al cargar el driver ");
                    }
                    catch(SQLException ex){
                        System.out.println("No se ha realizado la conexion");
                        System.out.println(ex.getMessage());
                        JOptionPane.showMessageDialog(this, "No hay datos registrados con esta clave",
                            "Clave no encontrada", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "La clave debe estar compuestapor 3 caracteres de 0-9",
                        "Clave incorrecta", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Solo se aceptan numeros enteros de 0-9 ",
                    "Datos no validos", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "El campo no ha sido llenado",
                "Datos no llenados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnmodificarIdPActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String b, c;
        int cont =0, cont1 = 0, cont2 = 0;
        int inse;
        String cantidad1 = txtCantidadEx.getText();
        String precio1 = txtPrecio.getText();
        if(txtNombreP.getText().length() > 0 && txtPrecio.getText().length() > 0 && txtCantidadEx.getText().length() > 0){
            for(int x=0; x<txtNombreP.getText().length(); x++){
                if(txtNombreP.getText().charAt(x) >= 65 && txtNombreP.getText().charAt(x) <= 90 || txtNombreP.getText().charAt(x) >= 97 && txtNombreP.getText().charAt(x) <= 122 || txtNombreP.getText().charAt(x) == 'Ñ' ||  txtNombreP.getText().charAt(x) == 'ñ' || txtNombreP.getText().charAt(x) == 'á' || txtNombreP.getText().charAt(x) == 'í' || txtNombreP.getText().charAt(x) == 'ó' || txtNombreP.getText().charAt(x) == 'ú' || txtNombreP.getText().charAt(x) == 'é' || txtNombreP.getText().charAt(x) == 'Á' || txtNombreP.getText().charAt(x) == 'É' || txtNombreP.getText().charAt(x) == 'Í' || txtNombreP.getText().charAt(x) == 'Ó' || txtNombreP.getText().charAt(x) == 'Ú' || txtNombreP.getText().charAt(x) == 32 || txtNombreP.getText().charAt(x) == 46){
                    cont++;
                }
            }
            if(cont == txtNombreP.getText().length()){
                if(txtNombreP.getText().length()<= 50){
                    if(ComboTipoP.getSelectedItem().equals("Postre")){
                        b="P";
                    }
                    else{
                        b="B";
                    }
                    //Validacion del precio
                    for(int x=0; x<precio1.length(); x++){
                        if(precio1.charAt(x) >= 48 && precio1.charAt(x) <= 57 || precio1.charAt(x) == 46){
                            cont1++;
                        }
                    }
                    if(cont1 == precio1.length()){
                        float precio = Float.parseFloat(precio1);
                        if(precio >= 1 && precio < 1000){
                            if(ComboTam.getSelectedItem().equals("Chico")){
                                c="CH";
                            }
                            else{
                                if(ComboTam.getSelectedItem().equals("Mediano")){
                                    c="ME";
                                }
                                else{
                                    c="GR";
                                }
                            }
                            for(int x=0; x<cantidad1.length(); x++){
                                if(cantidad1.charAt(x) >= 48 && cantidad1.charAt(x) <= 57){
                                    cont2++;
                                }
                            }
                            if(cont2 == cantidad1.length()){
                                int cantidad = Integer.parseInt(cantidad1);
                                if(cantidad >= 1 && cantidad < 1000){
                                    //todo esta bien
                                    try{
                                        Class.forName(Driver);
                                        con= DriverManager.getConnection(URL,user,pass);
                                        Statement st = con.createStatement();
                                        inse = st.executeUpdate("execute modificarProductos '"+txtNombreP.getText()+"','"+b+"','"+txtPrecio.getText()+"','"+c+"','"+txtCantidadEx.getText()+"','"+txtIdP.getText()+"'");
                                        JOptionPane.showMessageDialog(this, "El producto ha sido modificado",
                                            "Producto modificado y guardado", JOptionPane.INFORMATION_MESSAGE);
                                        this.dispose();
                                        if(con != null){
                                            con.close();
                                        }
                                    }
                                    catch(java.lang.ClassNotFoundException e){
                                        System.out.println(e.getMessage());
                                        System.out.println("Problemas al cargar el driver ");
                                    }
                                    catch(SQLException ex){
                                        System.out.println("No se ha realizado la conexion");
                                        System.out.println(ex.getMessage());
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(this, "Caracteres excedidos, solo de aceptan números 1 - 999",
                                        "Cantidad incorrecta", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "La cantidad solo admite numeros de 0-9 ",
                                    "Datos no validos", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Caracteres excedidos, solo de aceptan números 1- 999.99",
                                "Precio incorrecto", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "El precio solo admite numeros de 0-9 y punto",
                            "Datos no validos", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Solo se aceptan hasta 50 carácteres",
                        "Número de carácteres excedido", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "El nombre solo pueder ser compuesto solo por carácteres de A-Z y de a-z puntos, comas y espacios",
                    "Datos no validos", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Revise que todos los campos hayan sido llenados",
                "Datos no llenados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboTam;
    private javax.swing.JComboBox<String> ComboTipoP;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnmodificarIdP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCantidadEx;
    private javax.swing.JTextField txtIdP;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}