package blood.club.management.system;

import java.sql.*;

public class Conn {
  
    Connection c;
    Statement s;
    
    public Conn()
    {
     try
       {
        c = DriverManager.getConnection("jdbc:mysql:///bloodclubmanagementsystem", "root","sql@220221005");
        s = c.createStatement();
        }
    
     catch (Exception e)
      {
        e.printStackTrace();
      }
    }
}

