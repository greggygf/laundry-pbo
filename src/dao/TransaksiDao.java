package dao;

import entity.Transaksi;
import interfacee.ITransaksi;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lib.ManajerKoneksi;

public class TransaksiDao implements ITransaksi
{
    private final Connection koneksi;

    public TransaksiDao() 
    {
        this.koneksi = ManajerKoneksi.getKoneksi();
    }
    
    @Override
    public int countID() throws SQLException 
    {
        String sql = "select * from transaksi";

        Statement s = this.koneksi.createStatement();

        ResultSet hasil = s.executeQuery(sql);

        int rowCount = 1;

        while (hasil.next()) {
            rowCount++;
        }

        return rowCount;
    }
    
    @Override
    public int findTarif(Transaksi t) throws SQLException
    {
        int id_jenis_pakaian = t.getId_jenis_pakaian();
        int id_jenis_laundry = t.getId_jenis_laundry();
        
        String sql = "select * from tarif where id_jenis_pakaian = " + id_jenis_pakaian + " AND id_jenis_laundry = " + id_jenis_laundry;
        
        Statement s = this.koneksi.createStatement();

        ResultSet hasil = s.executeQuery(sql);
        
        int idTarif = 0;
        
        while(hasil.next())
        {            
            t.setId_tarif(hasil.getInt("id_tarif"));
            idTarif = t.getId_tarif();
        }
        
        return idTarif;
    }
    
    @Override
    public int findBiaya(Transaksi t) throws SQLException
    {
        String sql = "SELECT biaya FROM tarif WHERE id_tarif =" + this.findTarif(t);
        
        Statement s = this.koneksi.createStatement();

        ResultSet hasil = s.executeQuery(sql);
        
        int biaya = 0;
        
        while(hasil.next())
        {            
            t.setBiaya(hasil.getInt("biaya"));
            biaya = t.getBiaya();
        }
        
        return biaya;
    }
    
    @Override
    public void insert(Transaksi t) throws SQLException 
    {
        int id_transaksi = this.countID();
        int id_tarif = this.findTarif(t);
        String nama = t.getNama();
        Date tgl = t.getTgl();
        int berat = t.getBerat();
        int biaya = this.findBiaya(t);
        int total = biaya*berat;
        
        String sql = "INSERT INTO transaksi VALUES (" + id_transaksi + "," + id_tarif + ",'" + nama + "',now()," + berat + "," + total + ")";

        Statement s = this.koneksi.createStatement();

        s.executeUpdate(sql);
    }
    
    @Override
    public ArrayList<Transaksi> ambilSemuaData() throws SQLException
    {
        ArrayList<Transaksi> semuanya = this.selectWhere(null);
        
        return semuanya;
    }
    
    /**
     *
     * @param where
     * @return
     * @throws SQLException
     */
    @Override
    public ArrayList<Transaksi> selectWhere(String where) throws SQLException
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
            ArrayList<Transaksi> transaksiTerpilih = new ArrayList<>();

            while(hasil.next())
            {
                Transaksi t = new Transaksi();
                t.setId_transaksi(hasil.getInt("id_transaksi"));
                t.setNama_jenis_laundry(hasil.getString("nama_jenis_laundry"));
                t.setNama_jenis_pakaian(hasil.getString("nama_jenis_pakaian"));
                t.setNama(hasil.getString("nama"));
                t.setTgl(hasil.getDate("tgl"));

                // Memasukkan objek m kedalam array list
                transaksiTerpilih.add(t);
            }
            
            return transaksiTerpilih;
        }
        catch(SQLException ex)
        {
            System.out.println("Select where error : " + ex.getMessage());
            return null;
        }
    }
}