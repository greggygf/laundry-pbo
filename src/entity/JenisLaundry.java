package entity;

public class JenisLaundry 
{
    private int id_jenis_laundry;
    private String nama_jenis_laundry;

    public JenisLaundry()
    {
        
    }
    
    public int getId_jenis_laundry() {
        return id_jenis_laundry;
    }

    public void setId_jenis_laundry(int id_jenis_laundry) {
        this.id_jenis_laundry = id_jenis_laundry;
    }

    public String getNama_jenis_laundry() 
    {
        return nama_jenis_laundry;
    }

    public void setNama_jenis_laundry(String nama_jenis_laundry) 
    {
        this.nama_jenis_laundry = nama_jenis_laundry;
    }
}
