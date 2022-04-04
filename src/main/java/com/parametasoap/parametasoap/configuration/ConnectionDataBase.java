/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parametasoap.parametasoap.configuration;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ConnectionDataBase {

    java.sql.Connection con = null;

    public java.sql.Connection connect() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/parametabd?useSSL=false&autoReconnect=true&failOverReadOnly=false", "admin", "admin");
            return con;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(java.sql.Connection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static void main(String[] args) throws SQLException {
        ConnectionDataBase con = new ConnectionDataBase();

        System.out.println("Estás conectado " + con.connect());
    }

}
