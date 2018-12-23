package dao;

import entity.JenisPakaian;
import interfacee.IJenisPakaian;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lib.ManajerKoneksi;

public class JenisPakaianDao implements IJenisPakaian
{
    private final Connection koneksi;

    public JenisPakaianDao() 
    {
        this.koneksi = ManajerKoneksi.getKoneksi();
    }

    @Override
    public int countID() throws SQLException 
    {
        String sql = "select * from jenis_pakaian";

        Statement s = this.koneksi.createStatement();

        ResultSet hasil = s.executeQuery(sql);

        int rowCount = 1;

        while (hasil.next()) {
            rowCount++;
        }

        return rowCount;
    }

    @Override
    public void insert(JenisPakaian jp) throws SQLException 
    {
        int id_jenis_pakaian = this.countID();
        String nama_jenis_pakaian = jp.getNama_jenis_pakaian();

        String sql = "INSERT INTO jenis_pakaian VALUES (" + id_jenis_pakaian + ",'" + nama_jenis_pakaian + "',0)";

        Statement s = this.koneksi.createStatement();

        s.executeUpdate(sql);
    }
    
    @Override
    public ArrayList<JenisPakaian> ambilSemuaData() throws SQLException
    {
        ArrayList<JenisPakaian> semuanya = this.selectWhere(null);
        
        return semuanya;
    }
    
    /**
     *
     * @param where
     * @return
     * @throws SQLException
     */
    @Override
    public ArrayList<JenisPakaian> selectWhere(String where) throws SQLException
    {
        String sql = "SELECT * FROM jenis_pakaian";
        
        if(where != null)
            sql += ("" + where);
        
        try
        {
            // Menjalankan SQL
            Statement s = this.koneksi.createStatement();
        
            ResultSet hasil = s.executeQuery(sql);
        
            // Siapkan array kosong untuk menyimpan mahasiswa dari ResultSet
            ArrayList<JenisPakaian> jpTerpilih = new ArrayList<>();

            while(hasil.next())
            {
                JenisPakaian jp = new JenisPakaian();
                jp.setId_jenis_pakaian(hasil.getInt("id_jenis_pakaian"));
                jp.setNama_jenis_pakaian(hasil.getString("nama_jenis_pakaian"));

                // Memasukkan objek m kedalam array list
                jpTerpilih.add(jp);
            }
            
            return jpTerpilih;
        }
        catch(SQLException ex)
        {
            System.out.println("Select where error : " + ex.getMessage());
            return null;
        }
    }
}