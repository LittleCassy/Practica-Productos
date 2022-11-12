/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller;

import app.model.JDBCConnection;
import app.model.ProductModel;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lazon
 */
public class MainController {

    public static boolean insertProduct(String productName, float price, int category) {
        ProductModel myProduct = new ProductModel(productName, price, category);

        JDBCConnection myDB = new JDBCConnection();
        if (myDB.myLogic.insertProduct(myProduct)) {
            myDB.closeConnection();
            return true;
        } else {
            myDB.closeConnection();
            return false;
        }
    }

    public static boolean removeProducts(String productName) {
        ProductModel myProduct = new ProductModel(productName, 0, 0);

        JDBCConnection myDB = new JDBCConnection();

        if (myDB.myLogic.removeProduct(myProduct)) {
            myDB.closeConnection();
            return true;
        } else {
            myDB.closeConnection();
            return false;
        }
    }

    public static boolean updatePrice(String productName, float newPrice) {
        ProductModel myProduct = new ProductModel(productName, newPrice, 0);

        JDBCConnection myDB = new JDBCConnection();

        if (myDB.myLogic.updatePrice(myProduct)) {
            myDB.closeConnection();
            return true;
        } else {
            myDB.closeConnection();
            return false;
        }
    }
    
    public static DefaultTableModel listAllProducts(){
        JDBCConnection myDB = new JDBCConnection();
        DefaultTableModel myModel = new DefaultTableModel();
        ResultSet mySet = myDB.myLogic.selectAll();

        myModel.addColumn("Product");
        myModel.addColumn("Price");
        myModel.addColumn("Category");

        try
        {
            while (mySet.next()) {
            Object[] row = new Object[3];

            for (int i = 0; i < 3; i++) {
                if(i==0||i==2){
                    row[i] = mySet.getString(i + 1).toUpperCase();
                }else{
                    row[i] = mySet.getObject(i + 1);
                }
            }
            
            myModel.addRow(row);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        myDB.closeConnection();
        return myModel;
    }
    
    public static DefaultTableModel listAllProductsInRange(float min, float max){
        JDBCConnection myDB = new JDBCConnection();
        DefaultTableModel myModel = new DefaultTableModel();
        ResultSet mySet = myDB.myLogic.selectAllInRange(min, max);

        myModel.addColumn("Product");
        myModel.addColumn("Price");
        myModel.addColumn("Category");

        try
        {
            while (mySet.next()) {
            Object[] row = new Object[3];

            for (int i = 0; i < 3; i++) {
                if(i==0||i==2){
                    row[i] = mySet.getString(i + 1).toUpperCase();
                }else{
                    row[i] = mySet.getObject(i + 1);
                }
            }
            
            myModel.addRow(row);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        myDB.closeConnection();
        return myModel;
    }
}
