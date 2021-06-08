/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author eliez
 */
public class ConsultarCom extends javax.swing.JDialog {

    String consulta;
    static ResultSet res;
    /**
     * Creates new form ConsultarCom
     */
    public ConsultarCom(javax.swing.JDialog parent, boolean modal) {
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

        txtIdCom = new javax.swing.JTextField();
        btnBuscarIdC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNomProv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFechaCom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotalCom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Compra");

        txtIdCom.setBackground(new java.awt.Color(255, 255, 204));

        btnBuscarIdC.setText("Buscar");
        btnBuscarIdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdCActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE PROVEEDOR:");

        txtNomProv.setEditable(false);
        txtNomProv.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setText("FECHA: ");

        txtFechaCom.setEditable(false);
        txtFechaCom.setBackground(new java.awt.Color(204, 255, 255));

        jLabel4.setText("TOTAL: ");

        txtTotalCom.setEditable(false);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave de Materia Prima", "Nombre de Materia Prima", "Costo", "Cantidad", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setText("CLAVE COMPRA:");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdCom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(btnBuscarIdC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaCom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomProv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalCom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIdC)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalCom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarIdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdCActionPerformed
        DefaultTableModel modelo =(DefaultTableModel) tabla.getModel();
        String auxCom = txtIdCom.getText();
        int cont=0;
        if (auxCom.length() == 6){
            for(int x = 1;x<6;x++){
                if(auxCom.charAt(x) >= 48 && auxCom.charAt(x) <= 57){
                    cont++;
                }
            }
            //System.out.println(cont);
            if(auxCom.charAt(0) == 'O' && cont == 5){
                try{
                    //se consulta la clave del producto,  el nombre del producto, el nombre del trabajador, la fecha y el total
                    //que es lo que no se repite
                    consulta="execute consultarCompras '"+ txtIdCom.getText()+"'";
                    res = Conexion.Consulta(consulta);
                    res.next();
                    if(res.getString(1).equals(auxCom)){
                        //System.out.println("Si funciona el if");
                        btnBuscarIdC.setEnabled(false);
                        txtIdCom.setEditable(false);
                        txtNomProv.setText(res.getString(2));
                        txtFechaCom.setText(res.getString(3));
                        txtTotalCom.setText(String.valueOf(res.getFloat(4)));

                    }
                    //System.out.println("Error if");
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(this, "La clave no existe",
                            "Clave no valida", JOptionPane.ERROR_MESSAGE);
                    txtIdCom.setText("");
                    txtIdCom.setText("");
                    btnBuscarIdC.setEnabled(true);

                }
                catch(NullPointerException e){
                    System.out.println("Error consulta 1");
                }
                try{
                    //selecciona la clave del producto, el nombre, de Ventas la cantidad y el subtotal
                    consulta="execute consultarCompras2 '"+ txtIdCom.getText()+"'";
                    res = Conexion.Consulta(consulta);
                    while(res.next()){
                        //como se crea una tabla vamos iterar para agregarlo a un JTable
                       Vector v = new Vector();
                        v.add(res.getString(1));
                        v.add(res.getString(2));
                        v.add(res.getFloat(3));
                        v.add(String.valueOf(res.getInt(4)));
                        v.add(res.getFloat(5));
                        modelo.addRow(v);
                        tabla.setModel(modelo);
                    }
                }
                catch(SQLException e){}

                catch(NullPointerException e){
                    System.out.println("consulta 2");
                }
            }else{
                JOptionPane.showMessageDialog(this, "La clave de Compra debe de tener una O y 5 digitos del 0-9",
                    "CLAVE NO VALIDA", JOptionPane.ERROR_MESSAGE);
                txtIdCom.setText("");
                btnBuscarIdC.setEnabled(true);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La clave de Compra debe de tener una O y 5 digitos del 0-9",
                "CLAVE NO VALIDA", JOptionPane.ERROR_MESSAGE);
            txtIdCom.setText("");
            btnBuscarIdC.setEnabled(true);

        }
    }//GEN-LAST:event_btnBuscarIdCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarIdC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtFechaCom;
    private javax.swing.JTextField txtIdCom;
    private javax.swing.JTextField txtNomProv;
    private javax.swing.JTextField txtTotalCom;
    // End of variables declaration//GEN-END:variables
}