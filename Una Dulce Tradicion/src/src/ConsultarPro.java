/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author eliez
 */
public class ConsultarPro extends javax.swing.JDialog {

    static String Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String URL="jdbc:sqlserver://localhost:1433;databaseName=cafeteria";
    static String user="sa";
    static String pass="sa";
    static Connection con=null;
    /**
     * Creates new form ConsultarPro
     */
    public ConsultarPro(javax.swing.JDialog parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtAp = new javax.swing.JTextField();
        txtCasa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtAm = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Consultar Proveedores");

        btnBuscar.setText("Buscar clave");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Clave del proveedor:");

        txtAp.setEditable(false);

        txtCasa.setEditable(false);

        jLabel7.setText("Telefono celular:");

        txtAm.setEditable(false);

        txtCelular.setEditable(false);

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido Paterno:");

        jLabel5.setText("Apellido Materno:");

        txtNombre.setEditable(false);
        txtNombre.setFocusable(false);

        jLabel6.setText("Telefono de casa:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtAp)
                    .addComponent(txtAm)
                    .addComponent(txtCasa)
                    .addComponent(txtCelular)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtId))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Statement st;
        ResultSet rs;
        int cont=0;
        if(txtId.getText().length() == 4){
            for(int x = 1;x<4;x++){
                if(txtId.getText().charAt(x) >= 48 && txtId.getText().charAt(x) <= 57){
                    cont++;
                }
            }
            System.out.println(cont);
            if(txtId.getText().charAt(0) == 'R' && cont == 3){
                try{
                    Class.forName(Driver);
                    con = DriverManager.getConnection(URL,user,pass);
                    System.out.println("Esta lista la conexion");
                    st = con.createStatement();
                    rs = st.executeQuery("execute consultarPv '"+txtId.getText()+"'");
                    rs.next();
                    if(rs.getString(2) != null){
                        txtId.setEditable(false);
                        txtNombre.setText(rs.getString(2));
                        txtAp.setText(rs.getString(3));
                        txtAm.setText(rs.getString(4));
                        txtCasa.setText(rs.getString(5));
                        txtCelular.setText(rs.getString(6));
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El proveedor que intenta consultar ya ha sido borrado", "El proveedor no existe", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch(java.lang.ClassNotFoundException e){
                    System.out.println(e.getMessage());
                    System.out.println("este es el error");
                }
                catch(SQLException ex){
                    System.out.println("Aqui ya valio");
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "El id proporcionado no se encuentra en la base de datos", "Id no encontrado", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                //EL ID NO ES VALIDO
                JOptionPane.showMessageDialog(null, "El ID se debe componer de una letra R MAYUSCULA al inicio y tres numeros del 0 al 9\nEjemplo: R001", "Id no valido", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            //EL LARGO DEBE SER 4
            JOptionPane.showMessageDialog(null, "El total de caracteres del id debe ser de 4", "Id no valido", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAm;
    private javax.swing.JTextField txtAp;
    private javax.swing.JTextField txtCasa;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
