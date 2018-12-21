package interfacee;

import entity.User;
import java.sql.SQLException;

public interface IUser 
{
    public String cekUser(User user) throws SQLException; 
}
