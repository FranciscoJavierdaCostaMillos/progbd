package sqlitebd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author kevin
 */
public class Ventana extends javax.swing.JFrame {

    public static BaseDatos bd = new BaseDatos("/home/local/DANIELCASTELAO/klemavilanova/Escritorio/base.db");

    public Ventana() throws SQLException {
        initComponents();
        cargarBase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnewid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnewnombre = new javax.swing.JTextField();
        txtnewPrecio = new javax.swing.JTextField();
        actualizar1 = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nuevo = new javax.swing.JButton();
        save = new javax.swing.JButton();
        list = new javax.swing.JScrollPane();
        modelo=new DefaultListModel();
        jList1 = new javax.swing.JList<>();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Lista Productos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel6.setText("ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        txtnewid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnewidActionPerformed(evt);
            }
        });
        jPanel1.add(txtnewid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 120, 30));

        jLabel7.setText("Nombre");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel8.setText("Precio");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        txtnewnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnewnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnewnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 120, 30));
        jPanel1.add(txtnewPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 120, 30));

        actualizar1.setText("Actualizar");
        actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 120, 30));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 120, 30));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 120, 30));

        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jLabel4.setText("Precio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        save.setText("Guardar");
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        list.setBorder(null);

        jList1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jList1.setModel(modelo);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        list.setViewportView(jList1);

        jPanel1.add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 410));

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        bd.insertarProducto(txtnewid.getText(), txtnewnombre.getText(), Integer.parseInt(txtnewPrecio.getText()));
        try {
            cargarBase();
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nuevoActionPerformed

    private void txtnewidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnewidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnewidActionPerformed

    private void txtnewnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnewnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnewnombreActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        try {
            ResultSet rs = bd.seleccionarProducto(jList1.getSelectedValue());
            while (rs.next()) {
                txtId.setText(jList1.getSelectedValue());
                txtNombre.setText(rs.getString("nombre"));
                txtPrecio.setText(rs.getString("precio"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jList1ValueChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String value = jList1.getSelectedValue();
        try {
            bd.borrar(value);
            cargarBase();
            txtId.setText("");
            txtNombre.setText("");
            txtPrecio.setText("");

        } catch (SQLException ex) {
            System.out.println("Error al borrar");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar1ActionPerformed
        String id = jList1.getSelectedValue();
        String nombre = txtNombre.getText();
        int precio = Integer.parseInt(txtPrecio.getText());
        try {
            bd.update(id, precio, nombre);
        } catch (SQLException ex) {
            System.out.println("Error al actualizar datos");
        }

    }//GEN-LAST:event_actualizar1ActionPerformed

    public static void cargarBase() throws SQLException {
        ResultSet rs = bd.getListaId();
        modelo.removeAllElements();
        while (rs.next()) {
            modelo.addElement(rs.getString("id"));
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                bd.connect();
                try {
                    bd.crearTablaProductos();
                } catch (SQLException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    new Ventana().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private static DefaultListModel modelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane list;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton save;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtnewPrecio;
    private javax.swing.JTextField txtnewid;
    private javax.swing.JTextField txtnewnombre;
    // End of variables declaration//GEN-END:variables
}
