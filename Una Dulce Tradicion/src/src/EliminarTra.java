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
public class EliminarTra extends javax.swing.JDialog {

    static String Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String URL="jdbc:sqlserver://localhost:1433;DatabaseName=cafeteria;";

    static String user="sa";
    static String pass="sa";
	
    static Connection con=null;
    static Statement stmt = null;
    static ResultSet rs = null;
    /**
     * Creates new form EliminarTra
     * @param parent
     * @param modal
     */
    public EliminarTra(javax.swing.JDialog parent, boolean modal) {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Combo = new javax.swing.JComboBox<>();
        txtIdTra = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAMTra = new javax.swing.JTextField();
        txtAPTra = new javax.swing.JTextField();
        btnBuscarEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomTra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar trabajador");

        jLabel5.setText("Apellido Materno:");

        jLabel4.setText("Apellido Paterno:");

        jLabel3.setText("Nombre:");

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "V"}));
        Combo.setEnabled(false);

        txtSueldo.setEditable(false);

        btnEliminar.setText("Eliminar trabajador");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("Clave del trabajador:");

        jLabel7.setText("Turno:");

        txtAMTra.setEditable(false);

        txtAPTra.setEditable(false);

        btnBuscarEliminar.setText("Buscar clave");
        btnBuscarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Eliminar Trabajador");

        jLabel6.setText("Sueldo:");

        txtNomTra.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNomTra)
                            .addComponent(txtAPTra)
                            .addComponent(txtAMTra)
                            .addComponent(txtSueldo)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtIdTra, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Combo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAPTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAMTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int inse;
        int respuesta = JOptionPane.showConfirmDialog(this,
            "¿Está seguro de eliminarla?", "Confirmando eliminación",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if(respuesta == JOptionPane.YES_OPTION){
            try{
                Class.forName(Driver);
                con= DriverManager.getConnection(URL,user,pass);
                Statement st = con.createStatement();
                inse = st.executeUpdate("execute eliminarTra'"+txtIdTra.getText()+"'");
                JOptionPane.showMessageDialog(this, "El trabajador ha sido eliminado",
                    "Trabajador eliminado", JOptionPane.INFORMATION_MESSAGE);
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
            this.dispose();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEliminarActionPerformed
        int cont =0;
        if(txtIdTra.getText().length() > 0){
            for(int x=0; x< txtIdTra.getText().length(); x++){
                if(txtIdTra.getText().charAt(x) >= 48 && txtIdTra.getText().charAt(x) <= 57){
                    cont++;
                }
            }
            if(cont == txtIdTra.getText().length()){
                if(txtIdTra.getText().length()== 2){
                    try{
                        Class.forName(Driver);
                        con= DriverManager.getConnection(URL,user,pass);
                        Statement st = con.createStatement();
                        rs = st.executeQuery("execute consultarTra'"+txtIdTra.getText()+"'");
                        rs.next();
                        if(rs.getString(2) != null ){
                            txtNomTra.setText(rs.getString(2));
                            txtAPTra.setText(rs.getString(3));
                            txtAMTra.setText(rs.getString(4));
                            txtSueldo.setText(String.valueOf(rs.getFloat(5)));
                            Combo.setSelectedItem(rs.getString(6));
                            btnEliminar.setEnabled(true);
                            txtIdTra.setEditable(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "No existe ningun trabajador resgistrado con esta clave",
                                "Clave no existente", JOptionPane.INFORMATION_MESSAGE);
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
                        JOptionPane.showMessageDialog(this, "La clave no se encuntra registrado en la base de datos",
                            "Clave no encontrada", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Solo se admiten 2 caráteres",
                        "Carácteres excedidos", JOptionPane.ERROR_MESSAGE);
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
    }//GEN-LAST:event_btnBuscarEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JButton btnBuscarEliminar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAMTra;
    private javax.swing.JTextField txtAPTra;
    private javax.swing.JTextField txtIdTra;
    private javax.swing.JTextField txtNomTra;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}