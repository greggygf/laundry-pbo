package entity;

public class Customer 
{
    private int id_customer;
    private String nama, alamat, noTelp;

    public int getId_customer() 
    {
        return id_customer;
    }

    public void setId_customer(int id_customer) 
    {
        this.id_customer = id_customer;
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public String getAlamat() 
    {
        return alamat;
    }

    public void setAlamat(String alamat) 
    {
        this.alamat = alamat;
    }

    public String getNoTelp()
    {
        return noTelp;
    }

    public void setNoTelp(String noTelp) 
    {
        this.noTelp = noTelp;
    }
}
