/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Konek");
        }
        catch(ClassNotFoundException ex){
            System.out.println("gagal koneksi"+ex);
        }
        String url="jdbc:mysql://localhost/penjualan";
        try{
            koneksi=DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil koneksi database");
        }
        catch(SQLException ex){
            System.out.println("gagal koneksi database"+ ex);
        }
        return koneksi;
    }
    
}
