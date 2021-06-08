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
public class AgregarCli extends javax.swing.JDialog {

    /**
     * Creates new form AgregarCli
     */
    static String Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String URL="jdbc:sqlserver://localhost:1433;databaseName=cafeteria";
    static String user="sa";
    static String pass="sa";
    static Connection con=null;
    int id;
    public AgregarCli(javax.swing.JDialog parent, boolean modal) {
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

        txtAp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtAm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCasa = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarIdTra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar clientes");

        txtAp.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Agregar Clientes");

        txtAm.setEditable(false);

        jLabel2.setText("Clave de cliente:");

        txtCasa.setEditable(false);

        txtId.setEditable(false);

        txtCelular.setEditable(false);

        jLabel3.setText("Nombre:");

        btnBuscarIdTra.setText("Obtener clave");
        btnBuscarIdTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdTraActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido Paterno:");

        jLabel5.setText("Apellido Materno:");

        jLabel6.setText("Telefono de Casa:");

        jLabel7.setText("Telefono celular:");

        btnAgregar.setText("Agregar cliente");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtNombre.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarIdTra, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(btnAgregar)))
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
                    .addComponent(btnBuscarIdTra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarIdTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdTraActionPerformed
        String i;
        Statement st;
        ResultSet rs;
        try{
            Class.forName(Driver);
            con = DriverManager.getConnection(URL,user,pass);
            System.out.println("Esta lista la conexion");
            st = con.createStatement();
            rs = st.executeQuery("select * from identificadores where ps = 1");
            rs.next();
            id = rs.getInt(2);
            i = String.valueOf(id);
            if(id<= 9){txtId.setText("C00"+i);}else if(id<=99){txtId.setText("C0"+i);}else{txtId.setText("C"+i);}
            if(con!=null){con.close();}
            System.out.println("Conexion cerrada");
            txtNombre.setEditable(true);
            txtAp.setEditable(true);
            txtAm.setEditable(true);
            txtCasa.setEditable(true);
            txtCelular.setEditable(true);
            btnAgregar.setEnabled(true);
        }
        catch(java.lang.ClassNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println("este es el error");
            JOptionPane.showMessageDialog(null, e.getMessage(), "En algo la estas cagando", JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex) {
            System.out.println("Aqui ya valio");
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "En algo la estas cagando", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarIdTraActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String s=txtNombre.getText(), ap=txtAp.getText(), am=txtAm.getText();
        int cont1 =0, cont2=0, cont3=0,res,contCasa=0,contCelular=0;
        Statement st;
        ResultSet rs;
        if(s.length() <= 25 && s.length() >= 1){
            for(int x=0;x<s.length();x++){
                if(s.charAt(x) >= 65 && s.charAt(x) <= 90 || s.charAt(x) >= 97 && s.charAt(x) <= 122 || s.charAt(x) == 'Ñ' ||  s.charAt(x) == 'ñ' || s.charAt(x) == 'á' || s.charAt(x) == 'í' || s.charAt(x) == 'ó' || s.charAt(x) == 'ú' || s.charAt(x) == 'é' || s.charAt(x) == 'Á' || s.charAt(x) == 'É' || s.charAt(x) == 'Í' || s.charAt(x) == 'Ó' || s.charAt(x) == 'Ú' || s.charAt(x) == 32 || s.charAt(x) == 46){
                    cont1++;
                }
            }
            if(cont1 == s.length()){
                //Nombre valido
                if(ap.length() <= 20 && ap.length() >= 1){
                    for(int x=0;x<ap.length();x++){
                        if(ap.charAt(x) >= 65 && ap.charAt(x) <= 90 || ap.charAt(x) >= 97 && ap.charAt(x) <= 122 || ap.charAt(x) == 'Ñ' ||  ap.charAt(x) == 'ñ' || ap.charAt(x) == 'á' || ap.charAt(x) == 'í' || ap.charAt(x) == 'ó' || ap.charAt(x) == 'ú' || ap.charAt(x) == 'é' || ap.charAt(x) == 'Á' || ap.charAt(x) == 'É' || ap.charAt(x) == 'Í' || ap.charAt(x) == 'Ó' || ap.charAt(x) == 'Ú' || ap.charAt(x) == 32 || ap.charAt(x) == 46){
                            cont2++;
                        }
                    }
                    if(cont2 == ap.length()){
                        //Apellido paterno valido
                        if(am.length() <= 20 && am.length() >= 1){
                            for(int x=0;x<am.length();x++){
                                if(am.charAt(x) >= 65 && am.charAt(x) <= 90 || am.charAt(x) >= 97 && am.charAt(x) <= 122 || am.charAt(x) == 'Ñ' ||  am.charAt(x) == 'ñ' || am.charAt(x) == 'á' || am.charAt(x) == 'í' || am.charAt(x) == 'ó' || am.charAt(x) == 'ú' || am.charAt(x) == 'é' || am.charAt(x) == 'Á' || am.charAt(x) == 'É' || am.charAt(x) == 'Í' || am.charAt(x) == 'Ó' || am.charAt(x) == 'Ú' || am.charAt(x) == 32 || am.charAt(x) == 46){
                                    cont3++;
                                }
                            }
                            if(cont3 == am.length()){
                                //Apellido materno valido
                                for (int x = 0;x<txtCasa.getText().length();x++){
                                    if(txtCasa.getText().charAt(x) >= 48 && txtCasa.getText().charAt(x) <= 57){
                                        contCasa++;
                                    }
                                }
                                for (int x = 0;x<txtCelular.getText().length();x++){
                                    if(txtCelular.getText().charAt(x) >= 48 && txtCelular.getText().charAt(x) <= 57){
                                        contCelular++;
                                    }
                                }
                                
                                if(contCasa == 10){
                                    //Telefono casa valido
                                    if(contCelular == 10){
                                        //Telefono celular valido
                                        //TODO ES VALIDO
                                        try{
                                            Class.forName(Driver);
                                            con = DriverManager.getConnection(URL,user,pass);
                                            st = con.createStatement();
                                            res = st.executeUpdate("execute agregarCli'"+txtId.getText()+"',"+"'"+txtNombre.getText()+"',"+"'"+txtAp.getText()+"',"+"'"+txtAm.getText()+"',"+"'"+txtCasa.getText()+"',"+"'"+txtCelular.getText()+"'");
                                            res = st.executeUpdate("execute modificarIdentiCli "+ String.valueOf(id+1));
                                            if(con!=null){con.close();}
                                            JOptionPane.showMessageDialog(null, "El cliente se ha dado de alta con exito en la base de datos", "Cliente guardado", JOptionPane.INFORMATION_MESSAGE);
                                            this.dispose();
                                        }
                                        catch(java.lang.ClassNotFoundException | SQLException e){
                                            System.out.println(e.getMessage());
                                        }
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "El numero de celular solo debe contener 10 digitos los cuales deben ser numeros del 0 al 9", "Telefono celular no valido", JOptionPane.ERROR_MESSAGE);
                                        //El numero celular debe ser de 10 digitos
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "El numero de casa solo debe contener 10 digitos los cuales deben ser numeros del 0 al 9", "Telefono de casa no valido", JOptionPane.ERROR_MESSAGE);
                                    //El numero de casa debe ser de 10 digitos
                                }

                            }
                            else{
                                //ELSE DE CARACTERES NO VALIDOS
                                JOptionPane.showMessageDialog(null, "Solo se aceptan caracterez de la A-Z mayusculas y minusculas, acentos, espacios en blanco y puntos", "Caracteres no validos en Apellido materno", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else{
                            //El apellido materno es de mas de 20 caracteres
                            JOptionPane.showMessageDialog(null, "El apellido materno solo debe contener 20 caracteres o menos y no puede estar vacio", "Apellido materno no valido", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        //ELSE DE CARACTERES NO VALIDOS
                        JOptionPane.showMessageDialog(null, "Solo se aceptan caracterez de la A-Z mayusculas y minusculas, acentos, espacios en blanco y puntos", "Caracteres no validos en Apellido paterno", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    //El apellido paterno tiene mas de 20 caracteres
                    JOptionPane.showMessageDialog(null, "El apellido paterno solo debe contener 20 caracteres o menos y no puede estar vacio", "Apellido paterno no valido", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                //ELSE DE CARACTERES NO VALIDOS
                JOptionPane.showMessageDialog(null, "Solo se aceptan caracterez de la A-Z mayusculas y minusculas, acentos, espacios en blanco y puntos", "Caracteres no validos en Nombre", JOptionPane.ERROR_MESSAGE);
            }

        }
        else{
            //El nombre es de mas de 25 caracteres
            JOptionPane.showMessageDialog(null, "El nombre solo debe contener 25 caracteres o menos y no puede estar vacio", "Nombre no valido", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarIdTra;
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
