/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Casandra McJack
 */

public class JDBCConnection  {

  public ModelLogic myLogic;
  Connection conn;
  static final String DB_URL = "jdbc:mysql://localhost/productos";
  static final String USER = "root";
  static final String PASS = "";
  
  public JDBCConnection(){
	    
	try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            myLogic = new ModelLogic(conn);
	} catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
	}
  }
  
  public void closeConnection(){
      try {
          conn.close();
      } catch (SQLException ex) {
          Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
}
