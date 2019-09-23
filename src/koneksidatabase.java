
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agung707
 */
public class koneksidatabase {
    private static Connection konek;
    public static Connection getKoneksi(){
    if (konek == null ){
        try {
                String url ="jdbc:mysql://localhost:3306/test";
                String user = "root";
                String password="";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                konek = DriverManager.getConnection(url,user,password);
                System.out.println("Koneksi Terhubung");
        }
        catch (SQLException t){
            System.out.println("Error Membuat Koneksi");
        }
    
    }
    return konek;
    }   
}
