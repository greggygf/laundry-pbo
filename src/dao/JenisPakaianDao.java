package dao;

import entity.JenisPakaian;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lib.ManajerKoneksi;

public class JenisPakaianDao 
{
    private final Connection koneksi;

    public JenisPakaianDao() 
    {
        this.koneksi = ManajerKoneksi.getKoneksi();
    }

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

    public void insert(JenisPakaian jp) throws SQLException 
    {
        int id_jenis_pakaian = this.countID();
        String nama_jenis_pakaian = jp.getNama_jenis_pakaian();

        String sql = "INSERT INTO jenis_pakaian VALUES (" + id_jenis_pakaian + ",'" + nama_jenis_pakaian + "',0)";

        Statement s = this.koneksi.createStatement();

        s.executeUpdate(sql);
    }
}
