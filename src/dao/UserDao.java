package dao;

import entity.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lib.ManajerKoneksi;

public class UserDao 
{
    private final Connection koneksi;
    
    public UserDao() 
    {
        this.koneksi = ManajerKoneksi.getKoneksi();
    }
    
    public boolean cekUser(User user) throws SQLException
    {
        String sql = "SELECT * FROM user WHERE username = '" + user.getUsername() + "' AND password = '" + user.getPassword() + "'";
        
        Statement s = this.koneksi.createStatement();
        
        ResultSet hasil = s.executeQuery(sql);
        
        int rowCount = 0;
        
        while(hasil.next())
        {
            rowCount++;
        }
        
        if(rowCount != 1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
