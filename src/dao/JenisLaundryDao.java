package dao;

import entity.JenisLaundry;
import interfacee.IJenisLaundry;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lib.ManajerKoneksi;

public class JenisLaundryDao implements IJenisLaundry
{
    private final Connection koneksi;

    public JenisLaundryDao() 
    {
        this.koneksi = ManajerKoneksi.getKoneksi();
    }

    @Override
    public int countID() throws SQLException 
    {
        String sql = "select * from jenis_laundry";

        Statement s = this.koneksi.createStatement();

        ResultSet hasil = s.executeQuery(sql);

        int rowCount = 1;

        while (hasil.next()) 
        {
            rowCount++;
        }

        return rowCount;
    }

    @Override
    public void insert(JenisLaundry jl) throws SQLException 
    {
        int id_jenis_laundry = this.countID();
        String nama_jenis_laundry = jl.getNama_jenis_laundry();

        String sql = "INSERT INTO jenis_laundry VALUES (" + id_jenis_laundry + ",'" + nama_jenis_laundry + "',0)";

        Statement s = this.koneksi.createStatement();

        s.executeUpdate(sql);
    }
    
    @Override
    public ArrayList<JenisLaundry> ambilSemuaData() throws SQLException
    {
        ArrayList<JenisLaundry> semuanya = this.selectWhere(null);
        
        return semuanya;
    }
    
    /**
     *
     * @param where
     * @return
     * @throws SQLException
     */
    @Override
    public ArrayList<JenisLaundry> selectWhere(String where) throws SQLException
    {
        String sql = "SELECT * FROM jenis_laundry";
        
        if(where != null)
            sql += ("" + where);
        
        try
        {
            // Menjalankan SQL
            Statement s = this.koneksi.createStatement();
        
            ResultSet hasil = s.executeQuery(sql);
        
            // Siapkan array kosong untuk menyimpan mahasiswa dari ResultSet
            ArrayList<JenisLaundry> jlTerpilih = new ArrayList<>();

            while(hasil.next())
            {
                JenisLaundry jl = new JenisLaundry();
                jl.setId_jenis_laundry(hasil.getInt("id_jenis_laundry"));
                jl.setNama_jenis_laundry(hasil.getString("nama_jenis_laundry"));

                // Memasukkan objek m kedalam array list
                jlTerpilih.add(jl);
            }
            
            return jlTerpilih;
        }
        catch(SQLException ex)
        {
            System.out.println("Select where error : " + ex.getMessage());
            return null;
        }
    }
}