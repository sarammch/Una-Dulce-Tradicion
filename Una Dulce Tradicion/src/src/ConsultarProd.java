/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author saram
 */
public class ConsultarProd extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    String consulta;
    static ResultSet rs;

    /**
     * Creates new form ConsultaProd
     */
    public ConsultarProd(javax.swing.JDialog parent, boolean modal) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta general productos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Clave", "Nombre del producto", "Tipo de producto", "Precio del producto" , "Tamaño del producto" , "Existencia"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel modelo = (DefaultTableModel) tabla1.getModel();
        try {
            //cuenta la cantidad de productos par saber cuando se pueden agregar a la venta       
            consulta = "execute consultaProd";
            rs = Conexion.Consulta(consulta);
            rs.next();
            int contArreglo = rs.getInt(1);
            consulta = "execute consultaProd";
            rs = Conexion.Consulta(consulta);
            if (contArreglo != 0) {
                while (rs.next()) {
                    //como se crea una tabla vamos iterar para agregarlo a un JTable
                    if (rs.getString(2) != null) {
                        Vector v = new Vector();
                        v.add(rs.getString(1));
                        v.add(rs.getString(2));
                        v.add(rs.getString(3));
                        v.add(String.valueOf(rs.getFloat(4)));
                        v.add(rs.getString(5));
                        v.add(String.valueOf(rs.getInt(6)));
                        tabla1.setModel(modelo);
                        modelo.addRow(v);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "NO SE PUEDE REALIZAR UNA CONSULTA DE PRODUCTOS YA QUE NO HAY PRODUCTOS REGISTRADOS",
                        "CONSULTA GENERAL PRODUCTOS", JOptionPane.ERROR_MESSAGE);
                this.dispose();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
