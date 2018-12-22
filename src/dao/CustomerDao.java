package dao;

import entity.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
    
    public ArrayList<Customer> ambilSemuaData() throws SQLException
    {
        ArrayList<Customer> semuanya = this.selectWhere(null);
        
        return semuanya;
    }
    
    private ArrayList<Customer> selectWhere(String where) throws SQLException
    {
        String sql = "SELECT * FROM customer";
        
        if(where != null)
            sql += ("" + where);
        
        try
        {
            // Menjalankan SQL
            Statement s = this.koneksi.createStatement();
        
            ResultSet hasil = s.executeQuery(sql);
        
            // Siapkan array kosong untuk menyimpan mahasiswa dari ResultSet
            ArrayList<Customer> customerTerpilih = new ArrayList<>();

            while(hasil.next())
            {
                Customer c = new Customer();
                c.setId_customer(hasil.getInt("id_customer"));
                c.setNama(hasil.getString("nama"));
                c.setAlamat(hasil.getString("alamat"));
                c.setNoTelp(hasil.getString("no_telp"));

                // Memasukkan objek m kedalam array list
                customerTerpilih.add(c);
            }
            
            return customerTerpilih;
        }
        catch(SQLException ex)
        {
            System.out.println("Select where error : " + ex.getMessage());
            return null;
        }
    }
}
