package interfacee;

import entity.Transaksi;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ITransaksi 
{
    public int countID() throws SQLException;
    public int findBiaya(Transaksi t) throws SQLException;
    public int findTarif(Transaksi t) throws SQLException;
    public void insert(Transaksi t) throws SQLException;
    public ArrayList<Transaksi> ambilSemuaData() throws SQLException;
    public ArrayList<Transaksi> selectWhere(String where) throws SQLException;
}
