package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManajerKoneksi 
{
    private static final String URL = "jdbc:mysql://localhost/tsql_laundry?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static Connection koneksi;
    
    public static Connection getKoneksi() 
    {
        if(ManajerKoneksi.koneksi == null)
            ManajerKoneksi.buatKoneksi();
            
        return ManajerKoneksi.koneksi;   
    }
    
    private static Connection buatKoneksi()
    {
        try 
        {
            ManajerKoneksi.koneksi = DriverManager.getConnection(ManajerKoneksi.URL, ManajerKoneksi.USER, ManajerKoneksi.PASSWORD);
        } 
        catch (SQLException ex) 
        {
            System.out.println("Buat koneksi gagal! Errornya:");
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    private static void cekDriver() 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Cek Driver OK.");
        }
        catch(ClassNotFoundException ex) 
        {
            System.out.println("Cek Driver GAGAL! Errornya:");
            System.out.println(ex.getMessage());
            
            System.exit(1);
        }
    }
}
