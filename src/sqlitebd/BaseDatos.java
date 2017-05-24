/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitebd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kevin
 */
public class BaseDatos {

    private String url;
    private Connection conn = null;

    public BaseDatos(String url) {
        this.url = "jdbc:sqlite:" + url;
    }
    
    
    public void connect() {
        try {
            conn = DriverManager.getConnection(url);
            if (conn != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos");
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexion");;
        }
    }

    public void insertarProducto(Producto p) {
        try {
            PreparedStatement st = conn.prepareStatement("insert into productos (id,nombre, precio) values (?,?,?)");
            st.setString(1, p.getId());
            st.setString(2, p.getNombre());
            st.setInt(3, p.getPrecio());
            st.execute();
            System.out.println("Insertado correctamente");
        } catch (SQLException ex) {
            System.err.println("Registro no insertado");
        }
    }

    public void crearTablaProductos() throws SQLException {
        Statement st = conn.createStatement();
        try {
            st.execute("CREATE TABLE productos (id String primary key, nombre String, precio int);");
        } catch (SQLException ex) {
            System.err.println("Tabla ya creada");
        }
    }

    public void seleccionarProducto(String id) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "SELECT nombre,precio "
                + "FROM productos WHERE id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("nombre") + "\t"
                    + rs.getInt("precio"));
        }
    }
    public ResultSet getListaId() throws SQLException {
        Statement st = conn.createStatement();
        String sql = "SELECT id FROM productos";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        
        return rs;
    }    
    public void update(String id, int precio, String nombreNuevo) throws SQLException {
        String sql = "UPDATE productos SET nombre = ? , "
                + "precio = ? "
                + "WHERE id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, nombreNuevo);
        pstmt.setInt(2, precio);
        pstmt.setString(3, id);
        pstmt.executeUpdate();
    }
}
