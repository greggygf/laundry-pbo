package entity;

public class Transaksi 
{
    private int id_transaksi, id_tarif, berat,total;
    private String nama, tgl;

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

    public String getTgl() 
    {
        return tgl;
    }

    public void setTgl(String tgl) 
    {
        this.tgl = tgl;
    }
}
