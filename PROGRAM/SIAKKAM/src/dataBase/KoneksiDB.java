/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Win10
 */
public class KoneksiDB {
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Tes koneksi...");
            Connection conn=
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/siakkam", "root", "root");
            System.out.println("Koneksi berhasil");
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public static void main(String args[]){
        Connection koneksi = ConnectDB();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String usr = "umppasa";
        try{
            pst = koneksi.prepareStatement("select * from daftarakun where username='" + usr + "';");
            rs = pst.executeQuery();
            
            while(rs.next()){
                System.out.println("ada");
                System.out.println(rs.getString("password"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
}
