package app.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModelLogic {

    private Connection conn;

    public ModelLogic(Connection conn) {
        this.conn = conn;
    }

    public boolean insertProduct(ProductModel myNewProduct) {

        try {
            String selectSql = "INSERT INTO producto (producto, precio, cateogria) VALUES (?,?,?)";
            PreparedStatement sentencia = null;
            ResultSet result;
            sentencia = conn.prepareStatement(selectSql);
            sentencia.setString(1, myNewProduct.getProductName());
            sentencia.setFloat(2, myNewProduct.getPrice());
            sentencia.setInt(3, myNewProduct.getCategory());
            sentencia.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean removeProduct(ProductModel myExProduct) {
        try {
            String selectSql = "DELETE FROM producto WHERE producto = ?";
            PreparedStatement sentencia = null;
            ResultSet result;
            sentencia = conn.prepareStatement(selectSql);
            sentencia.setString(1, myExProduct.getProductName());
            sentencia.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean updatePrice(ProductModel myExProduct) {
        try {
            String selectSql = "UPDATE producto SET precio = ? WHERE producto = ?";
            PreparedStatement sentencia = null;
            ResultSet result;
            sentencia = conn.prepareStatement(selectSql);
            sentencia.setFloat(1, myExProduct.getPrice());
            sentencia.setString(2, myExProduct.getProductName());
            sentencia.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public ResultSet selectAll() {
        try {
            String selectSql = "SELECT producto.producto, producto.precio, categorias.categoria FROM producto, categorias WHERE producto.cateogria = categorias.id";
            PreparedStatement sentencia = null;
            ResultSet result;
            sentencia = conn.prepareStatement(selectSql);
            result = sentencia.executeQuery();

            return result;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
    public ResultSet selectAllInRange(float min, float max){
        try {
            String selectSql = "SELECT producto.producto, producto.precio, categorias.categoria FROM producto, categorias WHERE producto.cateogria = categorias.id AND producto.precio BETWEEN ? AND ?";
            PreparedStatement sentencia = null;
            ResultSet result;
            sentencia = conn.prepareStatement(selectSql);
            sentencia.setFloat(1, min);
            sentencia.setFloat(2, max);
            result = sentencia.executeQuery();

            return result;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}
