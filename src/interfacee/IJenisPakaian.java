package interfacee;

import entity.JenisPakaian;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IJenisPakaian 
{
    public int countID() throws SQLException;
    public void insert(JenisPakaian jl) throws SQLException;
    public ArrayList<JenisPakaian> ambilSemuaData() throws SQLException;
    public ArrayList<JenisPakaian> selectWhere(String where) throws SQLException;
}
