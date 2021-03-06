/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestOracle;

import util.MyOracle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class TestOracle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            MyOracle ora = new MyOracle("172.23.9.185", "1521", "orcl", "MHS175314108", "MHS175314108");
            //step2 create  the connection object
            Connection con = ora.getConnection();
            //step3 create the statement object
            Statement stmt = con.createStatement();
            //step4 execute query
            ResultSet rs = stmt.executeQuery("select E.first_name, E.last_name from MHS175314108.EMPLOYEES E");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }
            //step5 close the connection object
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TestOracle2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
