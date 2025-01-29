package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Conn {
    Connection c;
    Statement statement;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/m","root","Sagar@6372");
            statement = c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
