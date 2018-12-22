package dao;

import entity.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lib.ManajerKoneksi;

public class CustomerDao 
{
    private final Connection koneksi;

    public CustomerDao() 
    {
        this.koneksi = ManajerKoneksi.getKoneksi();
    }
    
    public int countID() throws SQLException 
    {
        String sql = "select * from customer";

        Statement s = this.koneksi.createStatement();

        ResultSet hasil = s.executeQuery(sql);

        int rowCount = 1;

        while (hasil.next()) {
            rowCount++;
        }

        return rowCount;
    }
    
    public void insert(Customer c) throws SQLException 
    {
        int id_customer = this.countID();
        String nama = c.getNama();
        String alamat = c.getAlamat();
        String noTelp = c.getNoTelp();

        String sql = "INSERT INTO customer VALUES (" + id_customer + ",'" + nama + "','" + alamat + "','" + noTelp + "')";

        Statement s = this.koneksi.createStatement();

        s.executeUpdate(sql);
    }
}
