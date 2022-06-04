package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Dbconn {
    public static Connection koneksi;
    public static Connection configDB() throws SQLException{
            try {//koneksi berhasil
                String alamat_url = "jdbc:mysql://localhost/pbo_kel5_laundry";
                String user_database = "root";
                String password_database = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());//inti koneksi
                koneksi = DriverManager.getConnection(alamat_url, user_database,password_database);
//                JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
            } catch (Exception e) {
                //koneksi error
                JOptionPane.showMessageDialog(null,"Konkesi Gagal "+ e.getMessage());
            }
    return koneksi;
    
    
    
}
    public static void main(String[] args) throws SQLException {
        Connection hubung = (Connection)Dbconn.configDB();
    }
    
//    public static void main(String[] args) throws SQLException {
////        System.out.println("Halooo..");
//            Connection hubung = (Connection)koneksi_DB.configDB();
//    }
    
}
