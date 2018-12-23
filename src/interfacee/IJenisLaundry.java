package interfacee;

import entity.JenisLaundry;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IJenisLaundry 
{
    public int countID() throws SQLException;
    public void insert(JenisLaundry jl) throws SQLException;
    public ArrayList<JenisLaundry> ambilSemuaData() throws SQLException;
    public ArrayList<JenisLaundry> selectWhere(String where) throws SQLException;
}
