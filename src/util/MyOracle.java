/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class MyOracle {

    private String ipAddress;
    private String prev;
    private String sid;
    private String userName;
    private String password;
    private String port;

    public MyOracle() {

    }

    public MyOracle(String ipaddress, String prev, String sid, String username, String password) {
        this.ipAddress = ipAddress;
        this.prev = prev;
        this.sid = sid;
        this.userName = userName;
        this.password = password;
    }

    public Connection getConnection() {
        Connection con = null;
        try {
           
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String connString = "jdbc:oracle:thin:@" + ipAddress + ":" + port + ":" + sid;
            System.out.println(connString);
           
            con = DriverManager.getConnection(connString, userName, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyOracle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyOracle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    /**
     * @return the ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @param ipAddress the ipAddress to set
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * @return the sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
