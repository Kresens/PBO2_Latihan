/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_HR;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.MyOracle;

/**
 *
 * @author admin
 */
public class Department {

    private int deparment_ID;
    private String department_name;

    private ArrayList<Employee> listEmployees = new ArrayList<Employee>();

    public Department() {
    }

    public Department(int deparment_ID, String department_name) {
        this.deparment_ID = deparment_ID;
        this.department_name = department_name;
    }

    /**
     * Fungsi untuk membaca daftar/table employee lalu dipindahkan ke list
     * daftar employees;
     */
    public void readEmployees() {
         try {
            // buat koneksi
            MyOracle ora = new MyOracle("172.23.9.185", "1521", "orcl", "MHS175314108", "MHS175314108");
            //step2 create  the connection object
            Connection con = ora.getConnection();
            //step3 create the statement object
            Statement stmt = con.createStatement();
            //step4 execute query
            String query = "select E.first_name, E.last_name from MHS175314108.EMPLOYEES E";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }
            //step5 close the connection object
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(World.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    public int getDeparment_ID() {
        return deparment_ID;
    }

    public void setDeparment_ID(int deparment_ID) {
        this.deparment_ID = deparment_ID;
    }

   
    public String getDepartment_name() {
        return department_name;
    }

   
    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

   
    public ArrayList<Employee> getListEmployees() {
        return listEmployees;
    }

   
    public void setListEmployees(ArrayList<Employee> listEmployees) {
        this.listEmployees = listEmployees;
    }
}
