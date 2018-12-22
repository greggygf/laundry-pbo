package entity;

public class User 
{
    private String username;
    private String password;
    private String jenis_user;

    public User()
    {
        
    }
    
    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getJenis_user() 
    {
        return jenis_user;
    }

    public void setJenis_user(String jenis_user) 
    {
        this.jenis_user = jenis_user;
    }
}
