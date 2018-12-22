package entity;

import java.sql.Date;

public class Transaksi 
{
    private int id_transaksi, id_tarif, berat,total;
    private String nama, nama_jenis_laundry, nama_jenis_pakaian;
    private Date tgl;

    public int getId_transaksi() 
    {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) 
    {
        this.id_transaksi = id_transaksi;
    }

    public int getId_tarif() 
    {
        return id_tarif;
    }

    public void setId_tarif(int id_tarif)
    {
        this.id_tarif = id_tarif;
    }

    public int getBerat() 
    {
        return berat;
    }

    public void setBerat(int berat) 
    {
        this.berat = berat;
    }

    public int getTotal() 
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public String getNama_jenis_laundry() 
    {
        return nama_jenis_laundry;
    }

    public void setNama_jenis_laundry(String nama_jenis_laundry) 
    {
        this.nama_jenis_laundry = nama_jenis_laundry;
    }

    public String getNama_jenis_pakaian()
    {
        return nama_jenis_pakaian;
    }

    public void setNama_jenis_pakaian(String nama_jenis_pakaian) 
    {
        this.nama_jenis_pakaian = nama_jenis_pakaian;
    }

    public Date getTgl() 
    {
        return tgl;
    }

    public void setTgl(Date tgl) 
    {
        this.tgl = tgl;
    }
}
