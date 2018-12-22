package dao;

import entity.Transaksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lib.ManajerKoneksi;

public class TransaksiDao 
{
    private final Connection koneksi;

    public TransaksiDao() 
    {
        this.koneksi = ManajerKoneksi.getKoneksi();
    }
    
    public ArrayList<Transaksi> ambilSemuaData() throws SQLException
    {
        ArrayList<Transaksi> semuanya = this.selectWhere(null);
        
        return semuanya;
    }
    
    private ArrayList<Transaksi> selectWhere(String where) throws SQLException
    {
        String sql =    "SELECT t.id_transaksi,jl.nama_jenis_laundry,jp.nama_jenis_pakaian,t.nama,t.tgl,t.berat,t.total FROM transaksi t,tarif tr,jenis_laundry jl,jenis_pakaian jp\n" +
                        "WHERE t.id_tarif = tr.id_tarif AND\n" +
                        "tr.id_jenis_pakaian = jp.id_jenis_pakaian AND\n" +
                        "tr.id_jenis_laundry = jl.id_jenis_laundry";
        
        if(where != null)
            sql += ("" + where);
        
        try
        {
            // Menjalankan SQL
            Statement s = this.koneksi.createStatement();
        
            ResultSet hasil = s.executeQuery(sql);
        
            // Siapkan array kosong untuk menyimpan mahasiswa dari ResultSet
            ArrayList<Transaksi> jpTerpilih = new ArrayList<>();

            while(hasil.next())
            {
                Transaksi t = new Transaksi();
                t.setId_transaksi(hasil.getInt("id_transaksi"));
                t.setNama_jenis_laundry(hasil.getString("nama_jenis_laundry"));
                t.setNama_jenis_pakaian(hasil.getString("nama_jenis_pakaian"));
                t.setNama(hasil.getString("nama"));
                t.setTgl(hasil.getDate("tgl"));

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
