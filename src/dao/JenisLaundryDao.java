package dao;

import entity.JenisLaundry;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lib.ManajerKoneksi;

public class JenisLaundryDao 
{
    private final Connection koneksi;

    public JenisLaundryDao() 
    {
        this.koneksi = ManajerKoneksi.getKoneksi();
    }

    public int countID() throws SQLException 
    {
        String sql = "select * from jenis_laundry";

        Statement s = this.koneksi.createStatement();

        ResultSet hasil = s.executeQuery(sql);

        int rowCount = 1;

        while (hasil.next()) {
            rowCount++;
        }

        return rowCount;
    }

    public void insert(JenisLaundry jl) throws SQLException 
    {
        int id_jenis_laundry = this.countID();
        String nama_jenis_laundry = jl.getNama_jenis_laundry();

        String sql = "INSERT INTO jenis_laundry VALUES (" + id_jenis_laundry + ",'" + nama_jenis_laundry + "',0)";

        Statement s = this.koneksi.createStatement();

        s.executeUpdate(sql);
    }
}
