/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author saram
 */
public class AgregarMP extends javax.swing.JDialog {

    static ResultSet rs;
    //envia guardar con esto escrito
    String cadena;
    String consulta;
    String i;
    int id;
    /**
     * Creates new form AgregarProd
     */
    public AgregarMP(javax.swing.JDialog parent, boolean modal) {
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
        btnObetener = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadMP = new javax.swing.JTextField();
        txtIdMP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtNombreMP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Materia Prima");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Agregar materia prima");

        btnObetener.setText("Obtener clave");
        btnObetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObetenerActionPerformed(evt);
            }
        });

        jLabel2.setText("Clave de materia prima:");

        txtCantidadMP.setEditable(false);

        txtIdMP.setEditable(false);

        jLabel3.setText("Nombre de materia prima:");

        jLabel7.setText("Cantidad existente (gr):");

        btnAgregar.setText("Agregar Materia Prima");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtNombreMP.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreMP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdMP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnObetener, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCantidadMP)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(124, 124, 124)))
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
                    .addComponent(txtIdMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObetener, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCantidadMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnAgregar)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnObetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObetenerActionPerformed
        String i;
        try{
            consulta="execute buscarIdentificador 1";
            rs = Conexion.Consulta(consulta);
            rs.next();
            id = rs.getInt(8);
            i = String.valueOf(id);
            if(id<= 9){
                txtIdMP.setText("000"+i);
            }
            else{
                if(id<=99){
                    txtIdMP.setText("00"+i);
                }
                else{
                    if(id<=999){
                        txtIdMP.setText("0"+i);
                    }
                    else{
                        txtIdMP.setText(i);
                    }
                }
            }
            txtIdMP.setEditable(false);
            txtNombreMP.setEditable(true);
            txtCantidadMP.setEditable(true);
            btnObetener.setEnabled(false);
            btnAgregar.setEnabled(true);
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnObetenerActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int cont =0, cont2 = 0;
        String cantidad1 = txtCantidadMP.getText();
        if(txtNombreMP.getText().length() > 0 && txtCantidadMP.getText().length() > 0){
            for(int x=0; x<txtNombreMP.getText().length(); x++){
                if(txtNombreMP.getText().charAt(x) >= 65 && txtNombreMP.getText().charAt(x) <= 90 || txtNombreMP.getText().charAt(x) >= 97 && txtNombreMP.getText().charAt(x) <= 122 || txtNombreMP.getText().charAt(x) == '??' ||  txtNombreMP.getText().charAt(x) == '??' || txtNombreMP.getText().charAt(x) == '??' || txtNombreMP.getText().charAt(x) == '??' || txtNombreMP.getText().charAt(x) == '??' || txtNombreMP.getText().charAt(x) == '??' || txtNombreMP.getText().charAt(x) == '??' || txtNombreMP.getText().charAt(x) == '??' || txtNombreMP.getText().charAt(x) == '??' || txtNombreMP.getText().charAt(x) == '??' || txtNombreMP.getText().charAt(x) == '??' || txtNombreMP.getText().charAt(x) == '??' || txtNombreMP.getText().charAt(x) == 32 || txtNombreMP.getText().charAt(x) == 46){
                    cont++;
                }
            }
            if(cont == txtNombreMP.getText().length()){
                if(txtNombreMP.getText().length()<= 50){
                    for(int x=0; x<cantidad1.length(); x++){
                        if(cantidad1.charAt(x) >= 48 && cantidad1.charAt(x) <= 57){
                            cont2++;
                        }
                    }
                    if(cont2 == cantidad1.length()){
                        int cantidad = Integer.parseInt(cantidad1);
                        if(cantidad >= 1 && cantidad < 100000){
                            //todo esta bien
                            cadena = "execute agregarMP '"+txtIdMP.getText()+"', '"+txtNombreMP.getText()+"', "+txtCantidadMP.getText();
                            Conexion.Enviar(cadena);
                            cadena = "execute modificarIdentiMP "+String.valueOf(id+1);
                            Conexion.Enviar(cadena);
                            JOptionPane.showMessageDialog(this, "La materia prima ha sido registrado",
                            "Materia prima registrada", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Caracteres excedidos, solo de aceptan n??meros 1 - 99999",
                                "Cantidad incorrecta", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "La cantidad solo admite numeros de 0-9 ",
                            "Datos no validos", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Solo se aceptan hasta 50 car??cteres",
                        "N??mero de car??cteres excedido", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "El nombre solo pueder ser compuesto solo por car??cteres de A-Z y de a-z puntos, comas y espacios",
                    "Datos no v??lidos", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Revise que todos los campos hayan sido llenados",
                "Datos no llenados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnObetener;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCantidadMP;
    private javax.swing.JTextField txtIdMP;
    private javax.swing.JTextField txtNombreMP;
    // End of variables declaration//GEN-END:variables
}
