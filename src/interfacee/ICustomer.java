package interfacee;

import entity.Customer;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ICustomer 
{
    public int countID() throws SQLException;
    public void insert(Customer c) throws SQLException;
    public ArrayList<Customer> ambilSemuaData() throws SQLException;
    public ArrayList<Customer> selectWhere(String where) throws SQLException;
}
